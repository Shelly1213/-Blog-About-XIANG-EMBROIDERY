<!-- 文章列表 -->
<template>

</template>

<script>
import {ShowArticleAll,ArtClassData,initDate} from '../utils/server.js'
    export default {
        name:'Share',
        data() { //选项 / 数据
            return {
                artId:0,
                classId:0,
                sendId:'',
                className:'',
                sonclassList:'',//二级分类
                classtwoId:5,
                keywords:'',
                hasMore:true,
                level:1,
                shareClass:[
                    {classId:1,name:'技术分享',detshare:[
                        {classId:5,name:'移动端H5',pid:1},
                        {classId:6,name:'pc端web',pid:1},
                        {classId:7,name:'小程序',pid:1},
                        {classId:8,name:'php',pid:1},
                        {classId:9,name:'nodejs',pid:1},
                        {classId:10,name:'软件',pid:1},
                        {classId:11,name:'其他',pid:1}
                    ]},
                    {classId:2,name:'闲言碎语'},
                    {classId:3,name:'事件簿'},
                    {classId:4,name:'创作集'}
                ],
                queryClass:1,
                articleList:'',
            }
        },

        methods: { //事件处理器
            showInitDate: function(oldDate,full){
                // console.log(oldDate,full);
                return initDate(oldDate,full)
            },
            showSearchShowList:function(initpage){//展示数据
                var that = this;
                that.classId = (that.$route.query.classId==undefined?0:parseInt(that.$route.query.classId));//获取传参的classId
                that.keywords = that.$store.state.keywords;//获取传参的keywords
                that.classtwoId = that.$route.query.classtwoId==undefined?'':parseInt(that.$route.query.classtwoId);//获取传参的classtwoId,若无则classtwoId为''
                that.sendId = that.classtwoId?that.classtwoId:that.classId;
                //keywords和classtwoId都是假则level为1
                that.level = that.keywords ? 0 : that.classtwoId?0:1;
                // console.log(that.classId);
                ArtClassData(function(msg){
                    // console.log(msg);
                    that.shareClass = msg;
                })
                //判断当前显示的分类名称 以及子分类
                for(var i=0;i<that.shareClass.length;i++){
                    if(that.classId==that.shareClass[i].class_id){
                        that.className = that.shareClass[i].cate_name;
                        if(that.shareClass[i].ChildsSon&&that.shareClass[i].ChildsSon.length>0){
                            that.sonclassList = that.shareClass[i].ChildsSon;
                        }else{
                            that.sonclassList = '';
                        }
                    }
                }
                //初始化 文章id为0开始
                that.artId = initpage ? 0 : that.artId;
                ShowArticleAll(that.artId,that.sendId,that.keywords,that.level,(result)=>{
                    // console.log(result);
                    if(result.code==1001){
                        var msg = result.data;
                        if(msg.length>0&&msg.length<10){
                            that.hasMore = false
                        }else{
                            that.hasMore = true;
                        }
                        that.articleList = initpage ? msg : that.articleList.concat(msg);
                        that.artId = msg[msg.length-1].id;
                        // console.log(that.artId);
                    }else{
                        that.hasMore = false;
                        that.articleList = initpage ? [] : that.articleList;
                    }
                })
            },
            addMoreFun:function(){//查看更多
                this.showSearchShowList(false);
            },
          //路由改变则调用showSearchShowList
            routeChange:function(){
                var that = this;
                this.showSearchShowList(true);
            }
        },
        components: { //定义组件

        },
        watch: {
           // 如果路由有变化，会再次执行该方法
           '$route':'routeChange',
           '$store.state.keywords':'routeChange'
         },
        created() { //生命周期函数
            // console.log(this.$route);
            var that = this;
            that.routeChange();
        }
    }
</script>

<style>
/*分享标题*/
.shareTitle{
    margin-bottom: 40px;
    position: relative;
    border-radius: 5px;
    background: #fff;
    padding:15px;
}
.shareclassTwo{
    width:100%;
}
.shareclassTwo li{
    display: inline-block;
}
.shareclassTwo li a{
    display: inline-block;
    padding:3px 7px;
    margin:5px 10px;
    color:#fff;
    border-radius: 4px;
    background: #64609E;
    border: 1px solid #64609E;
    transition: transform 0.2s linear;
    -webkit-transition: transform 0.2s linear;
}
.shareclassTwo li a:hover{
    transform: translate(0,-3px);
    -webkit-transform: translate(0,-3px);
}
.shareclassTwo li a.active{
    background: #fff;
    color:#64609E;

}
/*文章列表*/
    .sharelistBox{
        transition: all 0.5s ease-out;
        font-size: 15px;
    }


    /*.sharelistBox .viewmore a:hover,.s-item .viewdetail a:hover{
        background: #48456C;
    }*/
</style>

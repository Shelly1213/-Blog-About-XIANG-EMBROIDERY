<!-- 赞赏模块 -->
<template>
    <div class="tRewardBox tcommonBox">
        <header>
            <h1>
                <a href="#/DetailShare" target="_blank">
                  {{$t("Reward.6")}}
                </a>
            </h1>
        </header>
        <section>
            <div class="">
                <img src="static/img/timg.jpg" alt="" class="maxW" >
            </div>
            <h1>{{$t("Reward.1")}}</h1>
            <p>{{$t("Reward.2")}}</p>
            <hr>
            <h1>{{$t("Reward.3")}}</h1>
            <el-row   :gutter="30">
                <el-col  :span="12"   class="donate-item">
                    <div class="donate-tip">
                        <img :src="rewardData.wechat_image?rewardData.wechat_image:'static/img/wx.jpg'" :onerror="$store.state.errorImg">
                        <span>{{$t("Reward.4")}}</span>
                    </div>
                </el-col>
                <el-col :span="12"  class="donate-item">
                    <div class="donate-tip">
                        <img :src="rewardData.alipay_image?rewardData.alipay_image:'static/img/zfb.jpg'" :onerror="$store.state.errorImg">
                        <span>{{$t("Reward.5")}}</span>
                    </div>
                </el-col>
            </el-row>

        </section>
    </div>
</template>

<script>
    import {AdmireData,initDate} from '../utils/server.js'
    export default {
        data() { //选项 / 数据
            return {
                rewardData:'',//赞赏二维码
                tableData: [{//赞赏数据
                     date: '2016-05-02',
                     name: '王小虎',
                     address: '555'
                   }]
            }
        },
        methods: { //事件处理器
            showInitDate:function(date,full){//时间处理
                return initDate(date,full)
            }
        },
        components: { //定义组件

        },
        created() { //生命周期函数
            var that = this;
            // AdmireData(function(msg){//获取用户赞赏数据
            //     // console.log(msg);
            //     that.tableData = msg.data;
            //     that.rewardData = msg.admire_code;
            // })
        }
    }
</script>

<style>
.tRewardBox section{
    padding-bottom:20px;
}
.tRewardBox section h1{
    margin: 10px 0;
    font-size: 25px;
    font-weight: 700;
    /*text-align: center;*/
    line-height: 30px;
}
.tRewardBox section p{
    margin:10px 0;
    line-height:24px;
}
.tRewardBox section hr{
    background: #ccc;
    margin-bottom: 30px;
}

.tRewardBox .donate-item{
    text-align: right;
    color:#44b549;

}
.tRewardBox .donate-item:last-child{
    text-align: left;
    color:#00a0e9;
}
.tRewardBox .donate-item img{
    width:100%;
    display: block;
    height:auto;
}
.tRewardBox .donate-item div{
    display: inline-block;
    width:150px;
    padding:0 6px;
    text-align: center;
    box-sizing: border-box;
}
.tRewardBox .donate-item div span{
    display: inline-block;
    width:100%;
    margin: 10px 0;
    text-align: center;
}
.tRewardBox .el-table__body-wrapper{
    overflow: hidden;
}
.el-table--enable-row-hover .el-table__body tr:hover>td{
    background: transparent;
}
</style>

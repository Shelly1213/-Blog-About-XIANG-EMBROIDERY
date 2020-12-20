import Vue from 'vue'
import axios from 'axios'
//公共路径
// let portUrl = "http://www.mangoya.cn/port/";
let portUrl = "http://8.208.103.52:8081/";


//文章分类查询
const ArtClassData = (callback) => {
  //若sessionStorage有classList，则返回，否则请求后端并存储返回的数据，起到缓存作用
    if(sessionStorage.getItem('classList')){
        var data = JSON.parse(sessionStorage.getItem('classList'));
        callback && callback(data)
    }else{
        let url = portUrl + 'article/ArtClassData';
        axios.get(url).then(num => {
            // console.log(num);
            if(num.data.code==1001){
                sessionStorage.setItem('classList',JSON.stringify(num.data.data));
                callback && callback(num.data.data)
            }else{
                alert("查询失败")
            }
        })
    }
}

//实验室 列表项目
const navMenList  = (callback) => {
    if(sessionStorage.getItem('navMenList')){
        var data = JSON.parse(sessionStorage.getItem('navMenList'));
        callback && callback(data)
    }else{
        let url = portUrl + 'nav/navMenList';
        axios.get(url).then(num => {
            // console.log(num);
            if(num.data.code==1001){
                sessionStorage.setItem('navMenList',JSON.stringify(num.data.data));
                callback && callback(num.data.data)
            }else{
                alert("查询失败")
            }
        })
    }
}

//查询文章列表


//查询文章详情


//查询浏览量最多的10篇文章数据


//查询文章评论量最大的10篇文章
//查询文章评论数据


//查询其他评论数据


//文章评论

//其他评论

//查询网址点赞总数
const showLikeData = (callback) =>{
    let url = portUrl + 'outh/showLikeData';
    axios.get(url).then(num => {
        if(num.data.code==1001){
            // console.log(num.data,parseInt(num.data));
            callback && callback(num.data.data);
        }else{
            alert("查询失败");
        }
    })
}

//点赞功能修改
const GetLike = (like_num,callback) =>{
    let url = portUrl + 'outh/GetLike?like_num='+like_num;
    axios.get(url).then(num => {
        if(num.data.code==1001){
            callback && callback(num.data.msg);
        }else{
            alert("点赞失败");
        }
    })
}

//查询友情链接数据

//查询关于我

//文章点击收藏 点击喜欢

//查询赞赏数据

//查询用户喜欢列表,查询用户收藏列表

//查询用户信息

//修改用户信息


//初始化时间
const initDate = (oldDate,full) => {
    var odate = new Date(oldDate);
    var year =  odate.getFullYear();
    var month = odate.getMonth()<9? '0' + (odate.getMonth()+1) : odate.getMonth()+1;
    var date = odate.getDate()<10? '0'+odate.getDate() : odate.getDate();
    if(full=='all'){
        var t = oldDate.split(" ")[0];
        // console.log(oldDate,t.split('-')[0],t.split('-')[1],t.split('-')[2]);
        return t.split('-')[0]+'年'+t.split('-')[1]+'月'+t.split('-')[2]+'日';
    }else if(full=='year'){
        return year
    }else if(full== 'month'){
        return odate.getMonth()+1
    }else if(full == 'date'){
        return date
    }else if(full== 'newDate'){
        return year+'年'+month+'月'+date+'日';
    }
}



export {
        // getRegister,//注册
        // UserLogin,//登录
        // LoginOut,//退出登录
        ArtClassData,//分类
        navMenList,//导航信息

        showLikeData,//do you like me
        GetLike,//设置 do you like me

        initDate,//设置时间
    }

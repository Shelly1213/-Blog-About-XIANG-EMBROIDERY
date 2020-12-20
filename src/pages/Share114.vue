<!-- 文章列表 -->
<template>
  <div>
    <wbc-nav></wbc-nav>
    <div class="container">
      <el-row :gutter="30">
        <el-col :sm="24" :md="16" style="transition:all .5s ease-out;margin-bottom:30px;">
          <el-row class="sharelistBox">
            <div  class="shareTitle">

              <div class="ui label" >
                <a  href="#/Share11" style="color: #d55f6f">{{$t("share.1")}}</a>
              </div>

              <ul class="shareclassTwo" >
                <li >
                  <a href="#/Share11" style="background-color: #d5c0cf" >{{$t("share.2")}}</a>
                </li>
                <li >
                  <a href="#/Share112"  style="background-color: #bedeed ">{{$t("share.3")}}</a>
                </li>
                <li >
                  <a href="#/Share113"  style="background-color: #f2c987">{{$t("share.4")}}</a>
                </li>
                <li >
                  <a href="#/Share114" style="background-color: #b1d097" >{{$t("share.5")}}</a>
                </li>
                <!--              index.html?_ijt=shuealo9eig2q0s57b1l0qnmuf#/Share14-->
              </ul>
            </div>
            <el-col :span="24" class="s-item tcommonBox" >
            <span class="s-round-date">
               <span class="month" v-show="this.$i18n.locale==='zh'" v-html=" 9 +'月'"></span>
                <span class="month" v-show="this.$i18n.locale==='en'" v-html=" 9 +' Month'"></span>
                <span class="day" v-html="10"></span>
            </span>
              <header>
                <h1> {{$t("share114.1")}}</h1>
                <h2>
                  <i class="fa fa-fw fa-user"></i>{{$t("share.8")}}
                  <i class="fa fa-fw fa-clock-o"></i><span>2020/9/10</span> •

                </h2>
                <!--              <div class="ui label">-->
                <!--                <a :href="'#/Share?classId='+item.class_id">{{item.cate_name}}</a>-->
                <!--              </div>-->
              </header>
              <div class="article-content">
                <p style="text-indent:2em;">
                  {{$t("share114.2")}}
                <p  style="max-height:700px;overflow:hidden;text-align:center;">
                  <img src="../../static/img/P22.jpg" alt="" class="maxW">
                </p>
                <p  style="max-height:700px;overflow:hidden;text-align:center;">
                  <img src="../../static/img/P23.jpg" alt="" class="maxW">
                </p>
                <p  style="max-height:700px;overflow:hidden;text-align:center;">
                  <img src="../../static/img/P24.jpg" alt="" class="maxW">
                </p>
                <p  style="max-height:700px;overflow:hidden;text-align:center;">
                  <img src="../../static/img/P25.jpg" alt="" class="maxW">
                </p>
                <p  style="max-height:700px;overflow:hidden;text-align:center;">
                  <img src="../../static/img/P26.jpg" alt="" class="maxW">
                </p>
                <p  style="max-height:700px;overflow:hidden;text-align:center;">
                  <img src="../../static/img/P27.jpg" alt="" class="maxW">
                </p>
                <h1 style="text-align:right;font-weight: bold">
                  {{$t("common.tuyuan")}}
                </h1>

              </div>

            </el-col>

          </el-row>
        </el-col>
        <el-col :sm="24" :md="8">
          <wbc-rightlist></wbc-rightlist>
        </el-col>
      </el-row>
    </div>
    <wbc-footer></wbc-footer>
  </div>
</template>

<script>
  import header from '../components/header.vue'
  import footer from '../components/footer.vue'
  import temSharelist from '../components/temSharelist.vue'
  import temRightlist from '../components/temRightlist.vue'
  export default {
    name: "Share114",
    data() { //选项 / 数据
      return {

      }
    },
    methods: { //事件处理器

    },
    components: { //定义组件
      'wbc-nav': header,
      'wbc-sharelist': temSharelist,
      'wbc-rightlist': temRightlist,
      'wbc-footer': footer
    },

    created() { //生命周期函数

    }
  }
</script>

<style>
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

</style>

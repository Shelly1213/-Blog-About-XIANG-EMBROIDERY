<!-- 首页 -->
<template>
    <div>
        <wbc-nav></wbc-nav>
        <div class="container">
            <el-row  :gutter="30">
                <el-col :sm="24" :md="16" style="transition:all .5s ease-out;margin-bottom:30px;">


                  <el-row class="sharelistBox">
<!--                    <el-col :span="24" class="s-item tcommonBox"  :key="'article'+index">-->
<!--                    <span class="s-round-date">-->
<!--                    <span class="month" >9</span>-->
<!--                    <span class="day" >8</span>-->
<!--                    </span>-->
<!--                      <header>-->
<!--                        <h1>-->
<!--                          <a  target="_blank">-->
<!--                            HI-->
<!--                          </a>-->
<!--                        </h1>-->
<!--                        <h2>-->
<!--                          <i class="fa fa-fw fa-user"></i>发表于-->
<!--                          <i class="fa fa-fw fa-clock-o"></i><span >2020年12月6日</span>-->

<!--                        </h2>-->
<!--                      </header>-->
                      <div class="article-content">


                        <div class="box" >
                          <div class="in">
                            <div class="n1">
                              <div class="k1"><img src="../../static/img/a1.jpg" alt=""></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                            </div>
                            <div class="n2">
                              <div class="k1"><img  src="../../static/img/a5.png"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                            </div>
                            <div class="n3">
                              <div class="k1"><img src="../../static/img/a4.png" alt=""></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                            </div>
                            <div class="n4">
                              <div class="k1"><img src="../../static/img/a2.jpg" alt=""></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                            </div>
                            <div class="n5">
                              <div class="k1"><img src="../../static/img/a3.png" alt=""></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                            </div>
                            <div class="n6">
                              <div class="k1"><img src="../../static/img/a5.png" alt=""></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                              <div class="k1"></div>
                            </div>
                          </div>
                          <div class="out">
                            <div class="t1"><img src="../../static/img/b5.png" alt=""></div>
                            <div class="t2"><img src="../../static/img/b1.png" alt=""></div>
                            <div class="t3"><img src="../../static/img/b3.jpg" alt=""></div>
                            <div class="t4"><img src="../../static/img/b2.jpg" alt=""></div>
                            <div class="t5"><img src="../../static/img/a5.jpg" alt=""></div>
                            <div class="t6"><img src="../../static/img/b4.jpg" alt=""></div>
                          </div>
                        </div>


                      </div>
<!--                    </el-col>-->

                  </el-row>
                </el-col>
                <el-col :sm="24"  :md="8" >
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
        name:'Home',
        data() { //选项 / 数据
            return {

            }
        },
        methods: { //事件处理器

        },
        components: { //定义组件
            'wbc-nav':header,
            'wbc-sharelist':temSharelist,
            'wbc-rightlist':temRightlist,
            'wbc-footer':footer
        },
        created() { //生命周期函数

        }
    }
</script>

<style>
  html,body{
    width: 100%;
    height: 100%;
    margin:0;
    background-repeat:repeat;
  }
  .box{
    width: 50%;
    height: 400px;
    position: absolute;
    top: 19%;
    transform: rotateY(45deg) rotateX(-20deg);
    transform-style: preserve-3d;
  }
  .box:first-child{
    left:24%;
  }
  .box:last-child{
    right:24%;
  }
  /*里面的盒子*/
  .box> .in{
    width: 100px;
    height: 100px;
    display: flex;
    justify-content: center;
    align-items: center;
    position: absolute;
    left: 50%;
    top: 50%;
    /*开启3d*/
    transform-style: preserve-3d;
    transform: translate(-50%,-50%) rotateY(45deg) rotateX(-20deg);
    /*调用动画*/
    animation: mofan 5s linear 0s infinite normal;
    z-index: 100;

  }

  /*里面盒子六个面的共同值*/
  .box> .in>div{
    width: 100px;
    height: 100px;
    position: absolute;
    opacity: 0.7;
    border: 1px solid white;
  }

  /*里面盒子的六个面*/
  /*前*/
  .n1{
    background-color: #00ffff;
    transform:translateZ(51px);
  }
  /*后*/
  .n2{
    background-color: black;
    transform: translateZ(-51px);


  }
  /*左*/
  .n3{
    background-color: black;
    transform: translateX(-51px) rotateY(90deg);
  }
  /*右*/
  .n4{
    background-color: #00ffff;
    transform: translateX(51px) rotateY(90deg);
  }
  /*上*/
  .n5{
    background-color: #00ffff;
    transform: translateY(-51px) rotateX(90deg);
  }
  /*下*/
  .n6{
    background-color: black;
    transform: translateY(51px) rotateX(90deg);
  }
  /*里面盒子的六个面结束*/
  /*动画*/
  @keyframes mofan{
    from{
      transform: translate(-50%,-50%) rotateY(0deg) rotateX(0deg) ;
    }
    to{
      transform: translate(-50%,-50%) rotateY(360deg) rotateX(0deg);
    }
  }

  @keyframes nixuan{
    from{
      transform: translate(-50%,-50%) rotateY(0deg) rotateX(0deg) ;
    }
    to{
      transform: translate(-50%,-50%) rotateY(-360deg) rotateX(0deg);
    }
  }



  /*外面的盒子*/

  .box>.out{
    width: 200px;
    height: 200px;
    display: flex;
    justify-content: center;
    align-items: center;
    position: absolute;
    left: 50%;
    top: 50%;
    transform-style: preserve-3d;
    transform: translate(-50%,-50%) ;
    /*调用动画*/
    animation: mofan 5s linear 0s infinite normal;
    color: white;

  }



  .box>.out>.t1,.t2,.t3,.t4,.t5,.t6{
    width: 200px;
    height: 200px;
    position: absolute;
    opacity: 0.5;
    border: 1px solid white;
    transition: all .3s;
  }
  /*前*/
  .t1{
    background-color: #92C7DC;
    transform:translateZ(100px);
  }
  .t1>img{height:100%}
  /*后*/
  .t2{
    background-color: #92C7DC;
    transform: translateZ(-100px);


  }
  /*左*/
  .t3{
    background-color: #92C7DC;
    transform: translateX(-100px) rotateY(90deg);
  }
  /*右*/
  .t4{
    background-color: #92C7DC;
    transform: translateX(100px) rotateY(90deg);
  }
  /*上*/
  .t5{
    background-color: #92C7DC;
    transform: translateY(-100px) rotateX(90deg);
  }
  /*下*/
  .t6{
    background-color: #92C7DC;
    transform: translateY(100px) rotateX(90deg);
  }

  .box:hover>.out>.t1{
    transform: translateZ(300px);
  }

  .box:hover>.out>.t2{
    transform: translateZ(-300px);
  }
  .box:hover>.out>.t3{
    transform: translateX(-300px) rotateY(90deg);
  }

  .box:hover>.out>.t4{
    transform: translateX(300px) rotateY(90deg);
  }

  .box:hover>.out>.t5{
    transform: translateY(-300px) rotateX(90deg);
  }
  .box:hover>.out>.t6{
    transform: translateY(300px) rotateX(90deg);
  }

  /*鼠标悬浮时外盒子逆转*/
  .box:hover>.out{
    animation: nixuan 5s linear 0s infinite normal;
  }


  .n1,.n4,.n5{
    background-image: linear-gradient(to right,#00ffff,black)
  }

  .k1{
    width: 29.3px;
    height: 29.3px;
    border: 2px solid white;
    float: left;
    border-radius: 2px;
  }
</style>

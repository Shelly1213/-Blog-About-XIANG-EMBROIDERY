<!-- 关于我 -->
<template>
    <div class="tcommonBox">
        <header>
            <h1>
                <a href="#/DetailShare" target="_blank">
                  {{$t("aboutme.1")}}
                </a>
            </h1>
        </header>
        <section>
            <p class="">
                <img :src="this.$store.state.aboutmeObj.image?this.$store.state.aboutmeObj.image:'static/img/aboutus.jpg'" alt="" onerror="this.onerror=null;this.src= 'static/img/maoto.png'" class="aboutmeImg">
            </p>
            <p v-html="this.$store.state.aboutmeObj.brief">{{this.$store.state.aboutmeObj.brief}}</p>
           <p style="text-indent:2em;">
           {{$t("aboutme.2")}}
           </p>
            <p style="text-indent:2em;">
              {{$t("aboutme.3")}}
            </p>

            <p style="text-indent:2em;">
              {{$t("aboutme.4")}}
            </p>
            <p style="text-indent:2em;">
          <p style="text-indent:2em;text-align: center">
          {{$t("aboutme.5")}}
            </p>
          <p style="text-indent:2em;text-align: center">
            {{$t("aboutme.6")}}
          </p>
        </section>
    </div>
</template>

<script>
    export default {
        data() { //选项 / 数据
            return {

            }
        },
        methods: { //事件处理器

        },
        components: { //定义组件

        },
        created() { //生命周期函数

        }
    }
</script>

<style>
.aboutmeImg{
    max-width:100%;
    /*height:300px;*/
}
.tcommonBox p a{
    color:#01AAED!important;
}
.tcommonBox p a:hover{
    color:#48456d!important;
}
.tcommonBox p i{
    font-style: italic;
}
.tcommonBox p b{
    font-weight: bold;
}
</style>

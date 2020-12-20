import Vue from 'vue'
import Router from 'vue-router'
Vue.use(Router)

export default new Router({
	scrollBehavior(to, from, savePosition) { // 在点击浏览器的“前进/后退”，或者切换导航的时候触发。
		if (savePosition) {
			return savePosition;
		} else {
            var top;
            if (window.innerWidth >= 700) {
                 top = 676
            } else {
                 top = 267
            }
			return {
				x: 0,
				y: top
			}
		}
	},
	routes: [{
			path: '/',
			component: resolve => require(['../pages/Home.vue'], resolve),
			meta: {
				auth: true
			},
			name: 'Home'
		}, //首页

		{
			path: '/Share11',
			component: resolve => require(['../pages/Share.vue'], resolve),
			meta: {
				auth: true
			},
			name: 'Share'
		}, //分类
    {
      path: '/Share112',
      component: resolve => require(['../pages/Share112.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
    {
      path: '/Share113',
      component: resolve => require(['../pages/Share113.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
    {
      path: '/Share114',
      component: resolve => require(['../pages/Share114.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
    {
      path: '/Share12',
      component: resolve => require(['../pages/Share12.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
    {
      path: '/Share122',
      component: resolve => require(['../pages/Share122.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
    {
      path: '/Share123',
      component: resolve => require(['../pages/Share123.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
    {
      path: '/Share124',
      component: resolve => require(['../pages/Share124.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
    {
      path: '/Share125',
      component: resolve => require(['../pages/Share125.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
    {
      path: '/Share21',
      component: resolve => require(['../pages/Share21.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
    {
      path: '/Share22',
      component: resolve => require(['../pages/Share22.vue'], resolve),
      meta: {
        auth: true
      },
      name: 'Share'
    },
		{
			path: '/Reward',
			component: resolve => require(['../pages/Reward.vue'], resolve),
			meta: {
				auth: true
			},
			name: 'Reward'
		}, //赞赏
		{
			path: '/FriendsLink',
			component: resolve => require(['../pages/FriendsLink.vue'], resolve),
			meta: {
				auth: true
			},
			name: 'FriendsLink'
		}, //伙伴
		{
			path: '/Message',
			component: resolve => require(['../pages/Message.vue'], resolve),
			meta: {
				auth: true
			},
			name: 'Message'
		}, //留言板
		{
			path: '/Aboutus',
			component: resolve => require(['../pages/Aboutme.vue'], resolve),
			meta: {
				auth: true
			},
			name: 'Aboutme'
		} //关于

	]
})

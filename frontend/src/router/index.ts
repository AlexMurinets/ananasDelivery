import Vue from 'vue'
import VueRouter, { RouteConfig } from 'vue-router'
import TestAxiosConnection from "@/views/TestAxiosConnection.vue";
import About from "@/views/About.vue";
import Main from "@/views/Main.vue";
import Bucket from "@/views/Bucket.vue";
import MobileAccount from "@/components/MobileAccount.vue";
import MobileSearch from "@/components/MobileSearch.vue";
import MobileBucket from "@/components/MobileBucket.vue";


Vue.use(VueRouter)

  const routes: Array<RouteConfig> = [
  {
    path: '/test',
    name: 'Test',
    component: TestAxiosConnection
  },

    {
      path: '/search',
      name: 'Search',
      component: MobileSearch
    },
    {
      path: '/account',
      name: 'Account',
      component: MobileAccount
    },
    {
      path: '/bucket',
      name: 'Bucket',
      component: MobileBucket
    },
    {
      path: '/main',
      name: 'Main',
      component: Main
    },
  {
    path: '/',
    name: 'About',
    component: About
  }
]

const router = new VueRouter({
  routes
})

export default router

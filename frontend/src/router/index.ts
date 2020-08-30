import Vue from 'vue'
import VueRouter, { RouteConfig } from 'vue-router'
import TestAxiosConnection from "@/views/TestAxiosConnection.vue";
import About from "@/views/About.vue";
import Main from "@/views/Main.vue";
import Bucket from "@/views/Bucket.vue";


Vue.use(VueRouter)

  const routes: Array<RouteConfig> = [
  {
    path: '/test',
    name: 'Test',
    component: TestAxiosConnection
  },
    {
      path: '/bucket',
      name: 'Bucket',
      component: Bucket
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

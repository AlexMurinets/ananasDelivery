import Vue from 'vue'
import VueRouter, { RouteConfig } from 'vue-router'
import TestAxiosConnection from "@/views/TestAxiosConnection.vue";
import About from "@/views/About.vue";
import Main from "@/views/Main.vue";

Vue.use(VueRouter)

  const routes: Array<RouteConfig> = [
  {
    path: '/test',
    name: 'Test',
    component: TestAxiosConnection
  },
    {
      path: '/main',
      name: 'Main',
      component: Main
    },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: About
  }
]

const router = new VueRouter({
  routes
})

export default router

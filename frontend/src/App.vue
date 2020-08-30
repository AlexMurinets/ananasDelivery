<template>
  <v-app>
    <mobile-top-menu/>
    <router-view class="mt-15"/>
    <mobile-nav-bar/>
  </v-app>
</template>

<script lang="ts">
import Vue from 'vue';
import MobileNavBar from "@/components/MobileNavBar.vue";
import MobileTopMenu from "@/components/MobileTopMenu.vue";

export default Vue.extend({
  name: 'App',
  components: {MobileNavBar, MobileTopMenu},
  data: () => ({
    //
  }),
});
</script>

<style>
body{
  font-family: 'Montserrat', sans-serif;
}
</style>

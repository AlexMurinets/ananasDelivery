<template>
  <div class="home">
    <super-visor-nav-bar/>
  </div>
</template>

<script lang="ts">
import Vue from 'vue';
import SuperVisorNavBar from "@/components/SuperVisorNavBar.vue";

export default Vue.extend({
  name: 'Home',
  components: {SuperVisorNavBar},
});
</script>

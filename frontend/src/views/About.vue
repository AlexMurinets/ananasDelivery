<template>
 <v-container class="container--fluid d-flex justify-center">
 </v-container>
</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";
import MobileNavBar from "@/components/MobileNavBar.vue";
import MobileTopMenu from "@/components/MobileTopMenu.vue";

@Component({
  components: {MobileTopMenu, MobileNavBar},
})
export default class About extends Vue{


}
</script>

<template>
  <div class="row mx-2">
      <mobile-product v-for="p of products" :key="p" :product="p" />
  </div>

</template>

<script lang = "ts">

import {Component, Vue,Prop} from "vue-property-decorator";
import MobileProduct from "@/components/MobileProduct.vue";

@Component({
  components: {MobileProduct}
})
export default class MobileProducts extends Vue{
  private products: Array<object> = [
    {name: "name",price: 10, sale: 0, kg: 1, img:require("../img/products/Banana.png"),desc: "desc"},
    {name: "name",price: 80, sale: 40, kg: 1, img:require("../img/searchIcons/milk.svg"),desc: "desc"},
    {name: "name",price: 110, sale: 0, kg: 1, img:require("../img/products/Banana.png"),desc: "desc"},
    {name: "name",price: 140, sale: 100, kg: 5, img:require("../img/searchIcons/milk.svg"),desc: "desc"},


  ]
}
</script>

<style scoped>

</style>
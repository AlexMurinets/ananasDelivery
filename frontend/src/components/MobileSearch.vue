<template>
  <div class="container">
    <div class="row d-flex justify-center">
      <mobile-category  v-for="c of category" :key="c.text" :category = "c"/>
    </div>
  </div>
</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";
import MobileCategory from "@/components/MobileCategory.vue";
@Component({
  components: {MobileCategory}
})
export default class MobileNavBar extends Vue{

  private category: Array<object> = [
    {text:"Молочная продукция",img:require("../img/searchIcons/milk.svg"),route:"/"},
    {text:"Мясо",img:require("../img/searchIcons/meat.svg"),route:"/"},
    {text:"Овощи",img:require("../img/searchIcons/salad.svg"),route:"/"},
    {text:"Фрукты",img:require("../img/searchIcons/fruit.svg"),route:"/"},
    {text:"Рыба",img:require("../img/searchIcons/sea.svg"),route:"/"},
    {text:"Хлеб и Выпечка",img:require("../img/searchIcons/bread.svg"),route:"/"},
    {text:"Торты",img:require("../img/searchIcons/cake-pop.svg"),route:"/"},
    {text:"Шоколад",img:require("../img/searchIcons/chocolate.svg"),route:"/"},
    {text:"Конфеты",img:require("../img/searchIcons/candy.svg"),route:"/"},
    {text:"Алкоголь",img:require("../img/searchIcons/wine.svg"),route:"/"},
    {text:"Без алкогольные напитки",img:require("../img/searchIcons/drinknoalc.svg"),route:"/"},
    {text:"Бытовая химия",img:require("../img/searchIcons/hand-sanitizer.svg"),route:"/"},
    {text:"Детские товары",img:require("../img/searchIcons/baby.svg"),route:"/"},
    {text:"Корм для животных",img:require("../img/searchIcons/dog-food.svg"),route:"/"},
    {text:"Замороженные продукты",img:require("../img/searchIcons/refrigerator.svg"),route:"/"},
  ]
}
</script>

<style scoped>

</style>
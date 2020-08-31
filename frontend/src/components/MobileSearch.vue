<template>
<v-container >
  <div class="products">
  <v-row style="z-index: 1" class="d-flex justify-center">
    <div v-for="object of category" :key="object.text" class="col-5 col-sm-2 mt-3 mx-3 elevation-1 item" >
      <div class="d-flex justify-center mt-4">
        <v-img :src="object.img" class="img-category" alt=""></v-img>
      </div>
      <div class="text-center mt-4 mb-3 category-title">
        {{object.text}}
      </div>
    </div>
  </v-row>
  </div>

</v-container>
</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";
@Component
export default class MobileNavBar extends Vue{
  private category: Array<object> = [
    {text:"Молочная продукция",img:require("../img/searchIcons/milk.svg"),route:"/"},
    {text:"Мясо",img:require("../img/searchIcons/meat.svg"),route:"/"},
    {text:"Овощи",img:require("../img/searchIcons/salad.svg"),route:"/"},
    {text:"Фрукты",img:require("../img/searchIcons/fruit.svg"),route:"/"},
    {text:"Рыба",img:require("../img/searchIcons/sea.svg"),route:"/"},
    {text:"Хлеб и Выпечка",img:require("../img/searchIcons/bread.svg"),route:"/"},
    {text:"Торты",img:require("../img/searchIcons/cake-pop.svg"),route:"/"},
    {text:"Сладости",img:require("../img/searchIcons/candy.svg"),route:"/"},
    {text:"Алкоголь",img:require("../img/searchIcons/wine.svg"),route:"/"},
    {text:"Без алкогольные напитки",img:require("../img/searchIcons/drinknoalc.svg"),route:"/"},
    {text:"Бытовая химия",img:require("../img/searchIcons/hand-sanitizer.svg"),route:"/"},
    {text:"Детские товары",img:require("../img/searchIcons/baby.svg"),route:"/"},






  ]

}
</script>

<style scoped>
.item{
  border-radius: 5px;
}

.products{
  display: none;
}
.category-title{
  width: 100%;
  font-size: 12px;
}
@media (max-width: 1100px) {
  .products{
    margin-top: 10%;
    display: block;
  }
}

@media (max-width: 425px) {
  .img-category{
    height: 10% !important;
  }
  .products{
    margin-top: 0;
    display: block;
  }
}
</style>
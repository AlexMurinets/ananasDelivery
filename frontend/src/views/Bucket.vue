<template>
  <v-container>
    <div v-if="true" class="d-flex justify-center">
      <span class="svg-text">Здесь появятся товары, добавленные в корзину</span>
      <img src="../img/shoping-svg.svg" class="shopping-svg" alt="">
    </div>
    <div v-else>

    </div>
  </v-container>

</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";
@Component
export default class Bucket extends Vue{

}
</script>

<style scoped>

.shopping-svg{
  display: none;

}
.svg-text{
  display: none;
}

@media (max-width: 1000px) {
  .shopping-svg{
    display: block;
    position: absolute;
    height: 65%;
    top: 10%;


  }
  .svg-text{
    display: block;
    position: absolute;
    font-size: 14px;
    font-weight: 400;
    bottom: 25%;
  }

}

@media (max-width: 425px) {
  .shopping-svg{
    position: absolute;
    height: 40%;
    top: 25%;
  }
  .svg-text{
    position: absolute;
    font-size: 12px;
    font-weight: 400;
    bottom: 35%;
  }
}

</style>
<template>

  <div class="col-5 col-sm-3 col-md-2 img-category" @click="route(category.route + category.text)">
    <div class="d-flex justify-center">
      <v-img :src="category.img" width="80%" class=""></v-img>
    </div>
    <div class="text-center mt-4 mb-3 category-title">
              {{category.text}}
    </div>
  </div>
<!--  <div class="col-6 col-sm-3 col-md-2">-->
<!--    <div class="elevation-1 item" style="padding: 10px 0px" @click="route(category.route + category.text)" >-->
<!--      <div class="d-flex justify-center mt-4">-->
<!--        <v-img :src="category.img" class="img-category"></v-img>-->
<!--      </div>-->
<!--      <div class="text-center mt-4 mb-3 category-title">-->
<!--        {{category.text}}-->
<!--      </div>-->
<!--    </div>-->
<!--  </div>-->

</template>

<script lang = "ts">
import {Component, Prop, Vue} from "vue-property-decorator";

@Component
export default class MobileCategory extends Vue{
  @Prop() category: any;
  public route(path: string){
    this.$router.push(path);
  }
}
</script>

<style scoped>
.img-category{
  border: 1px solid #f1f1f1;
  border-radius: 3px;
  margin: 10px;
}
</style>
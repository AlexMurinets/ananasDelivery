<template>
  <div class="col-6 col-sm-4 col-md-4 my-1" style="border: 1px solid #f1f1f1; border-radius: 5px; padding: 4px">
    <div class="d-flex justify-center my-3">
      <img :src="getProduct.img" class="img-product"/>
    </div>
    <div class="mx-2 my-4">
      <div v-if = "getProduct.sale > 0" class="d-flex justify-space-between ">
        <div class="new-price"><span style="font-size: 21px">{{product.sale}}</span><span style="font-weight: 300"> md</span></div> <div class="sale-price mt-2"><span>{{product.price}}</span> md </div>
      </div>

      <div v-else class="d-flex justify-space-between ">
        <div><span style="font-size: 21px">{{product.price}}</span> md</div>
      </div>

      <div class="my-3" style="font-size: 13px; font-weight: 400">
        {{ getProduct.desc }}
      </div>
      <div class="d-flex justify-space-between">
        <div class="mt-2" style="color: grey; font-weight:200;font-size: 13px;">{{ getProduct.kg }} kg</div> <div class="add-product-button"><v-icon class="icon-add">mdi-plus</v-icon><v-icon class="icon-add">mdi-cart</v-icon></div>
      </div>
    </div>
  </div>
</template>

<script lang = "ts">
import {Component, Prop, Vue} from "vue-property-decorator";

@Component
export default class MobileProduct extends Vue{
  @Prop() private product: any;


  get getProduct(): any {
    return this.product;
  }
}
</script>

<style scoped>
*{
  padding: 0;
  margin: 0;
}
.provider{
  position: relative;
  padding: 10px 20px;
  border-radius: 90px;
  background: #ca1616;
  color: white;
  font-weight: 800;
}
.new-price{
  color: #ff5252;
}
.add-product-button{
  background: #e30e0e;border-radius: 3px;padding: 5px 10px;cursor:pointer;
  opacity: 50%;
}
.add-product-button{
  opacity: 100%;
}
.sale-price{
  color: black;
 text-decoration: line-through;
  font-weight: 300;
  font-size: 14px;
  opacity: 40%;

}
.img-product{
  width: 100px;height: 100px
}
.icon-add{
  color: white;
  font-size: 19px;
}
@media (min-width: 570px) {
  .img-product{
    width: 140px;height: 140px
  }
}
@media (max-width: 370px) {
  .icon-add{
    font-size: 15px;
  }
  .img-product{
    width: 100px;height: 100px
  }
  .sale-price{
    font-size: 12px;
  }
}
</style>
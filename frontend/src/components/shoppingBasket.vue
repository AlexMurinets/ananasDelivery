<template>
  <v-list>
    <v-list-item>
      <v-list-item-content>
        <v-list-item-title v-if="product"  class="d-flex justify-space-between">
          <div>
            <router-link :to = "link" class="text-decoration-none">{{message}}</router-link>
            <br>
            <span style="font-size: 12px">Цена: {{price}}</span>
          </div>
          <div>
            <v-icon class="mt-2 delete-btn">mdi-close-circle</v-icon>
          </div>
        </v-list-item-title>
        <v-list-item-title v-else>
          <h5>{{message}}</h5>
        </v-list-item-title>
      </v-list-item-content>
    </v-list-item>
  </v-list>
</template>

<script lang = "ts">
import {Component, Vue,Prop} from "vue-property-decorator";

@Component
export default class ShoppingBasket extends Vue{
  @Prop() private product: any;
  @Prop() private message: any;
  @Prop() private link: any;
  @Prop() private price: any;
  @Prop() private shop: any;


}
</script>

<style scoped>
.delete-btn:hover{
  color: #ca1616;
  cursor: pointer;
}
</style>
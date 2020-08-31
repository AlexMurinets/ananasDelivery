<template>
  <v-container class="border">
    <v-row>
      <v-col cols = "4" md = "4">
        <v-row>
          <v-col>
            <img src="../img/logo (1).webp" class="img hidden-sm-and-down" alt="img" height="80"/>
            <v-app-bar-nav-icon class="hidden-md-and-up" @click="drawer = !drawer" style="margin-top: 5.5px"></v-app-bar-nav-icon>
          </v-col>
          <v-col cols = "7" class="hidden-md-and-down">
            <div class="mt-1">
              <p style="font-weight: 300;font-size: 13px">
                Доставка продуктов<br>
                по всему Кишиневу
              </p>
            </div>
          </v-col>
        </v-row>
      </v-col>

      <v-col cols="6" class="hidden-sm-and-down mt-6">
        <div class="d-flex justify-space-around align-self-center">
          <a class="a-link" v-for="link of links" :key="link.text" v-text="link.text"/>
        </div>
      </v-col>

      <v-col  v-if="true" class="d-flex justify-end mt-5" >
        <div>

          <!--Bucket-->
          <v-menu
              :close-on-content-click="false"
              :nudge-width="360"
              offset-x
              offset-y
              left
          >
            <template v-slot:activator="{ on, attrs }">
                <a v-bind="attrs" class="mr-3" v-on="on"><v-icon>mdi-shopping</v-icon></a>
            </template>
            <v-card>
              <shopping-basket message = "Корзина:" :product = "false"/>
              <v-divider></v-divider>
              <div v-if="defaultProducts.length !== 0">
                <div class="scroll" style="height: 200px" >
                  <shopping-basket v-for="product of defaultProducts" :key="product.message + product.price + product" :message = "product.message" :link="product.route"  :price = "product.price" :product = "true"/>
                </div>
                <div>
                  <v-card-actions>
                    <v-btn block color="primary">Полный список</v-btn>
                  </v-card-actions>
                  <v-card-actions>
                    <v-btn block color="warning">Заказать</v-btn>
                  </v-card-actions>
                </div>
              </div>
              <div v-else class="text-center">
                <h4 class="py-5" style="color: grey">Список пуст</h4>
              </div>
            </v-card>
          </v-menu>

          <!--LeftNavBar-->
          <v-navigation-drawer
              v-model="drawer"
              app
              left
              temporary
              floating
          >
            <v-list >
              <v-list-item-action class="mx-4 my-6">
                <img src="../img/logo (1).webp" class="img" height="80" alt = "img"/>
              </v-list-item-action>

              <v-list-item class="pl-4" link v-for="link of links" :key="link + link.text">
                <v-list-item-action>
                  <v-icon >{{link.icon}}</v-icon>
                </v-list-item-action>

                <v-list-item-content>
                  <v-list-item-title >{{link.text}}</v-list-item-title>
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </v-navigation-drawer>

          <!--Login = false-->
          <v-dialog v-if="!login" width="500">
            <template v-slot:activator="{ on, attrs }">
              <span class="btn-main"
                 v-bind="attrs"
                 v-on="on"
                 style="cursor: pointer"><v-icon style="color: white">mdi-account</v-icon>
              </span>
            </template>
            <v-card>
              <v-card-title class="headline orange lighten-2">
                <span style="color: white">
                  Вход
                </span>
              </v-card-title>

              <v-card-text class="my-3 mt-10">
                <v-text-field label="Email" required></v-text-field>
                <v-text-field label="Password" type="password" required></v-text-field>
              </v-card-text>


              <v-card-actions>
                <v-spacer></v-spacer>
                <v-btn color="success">Регистрация</v-btn>
                <v-btn color="warning">Вход</v-btn>
              </v-card-actions>
            </v-card>
          </v-dialog>
          <!--Login = true-->
          <span v-else>
            <span  class="btn-main" style="cursor: pointer"><v-icon style="color: white">mdi-account</v-icon></span>
          </span>

        </div>
      </v-col>
    </v-row>
  </v-container>

</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";
import ShoppingBasket from "@/components/shoppingBasket.vue";

@Component({
  components: {ShoppingBasket}
})
export default class NavBar extends Vue{
private links: Array<object> = [
  {text:"Список магазинов",route:"#",icon: "mdi-format-line-spacing"},
  {text:"Как мы работаем",route:"#",icon: "mdi-car"},
  {text:"Отзывы",route:"#",icon: "mdi-comment-account" },

];
private login = false;
private defaultProducts: Array<object> = [
  {message: "Ананас", price: 10,route:"/"},
  {message: "Lays chess", price: 20,route:"/"},
  {message: "Пельмени", price: 50,route:"/"},
  {message: "Чет там", price: 30,route:"/"},
  {message: "Филе куриное", price: 70,route:"/"},
  {message: "Шашлик-машлик", price: 100,route:"/"},





]
private drawer = false;

}
</script>

<style scoped>
.scroll{
  overflow: scroll;

}
*{
  margin: 0;
  padding: 0;
}
a{
  color: black !important;
  font-size: 15px;
  text-decoration: none !important;
  font-family: 'Montserrat', sans-serif;
  font-weight: 400;

}
.a-link{
  text-decoration: none;
  position: relative;
}
.a-link:hover:after{



}
.a-link:after {
  position: absolute;
  content: '';
  height: 2px;
  bottom: -4px;
  margin: -5px auto;
  left: 0;
  right: 0;
  width: 0%;
  background: green;
  -o-transition:.5s;
  -ms-transition:.5s;
  -moz-transition:.5s;
  -webkit-transition:.5s;
  transition:.5s;
}
.a-link:hover:after {
  width: 80%;
  background: orange;
}
.btn-main{
  border-radius: 100px;
  cursor: pointer;
  padding: 19px 17px;
  color: white !important;
  background: orange;
  transition: 0.3s;
  opacity: 80%;

}
.img{
  position: relative;
  margin-top: -30px;
}
.btn-main:hover{
  opacity: 100%;
}

@media (max-width: 600px) {
  a{
    font-size: 10px;
  }

}
</style>
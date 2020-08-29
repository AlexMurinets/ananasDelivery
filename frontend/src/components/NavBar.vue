<template>
  <v-container class="border">
    <v-row>
      <v-col cols = "4" md = "4">
        <v-row>
          <v-col>
            <img src="../img/logo (1).webp" class="img hidden-sm-and-down" alt="img" height="80"/>
            <v-app-bar-nav-icon class="hidden-md-and-up" @click="drawer = !drawer" style="margin-top: 1px"></v-app-bar-nav-icon>
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

      <v-col cols="6" class="hidden-sm-and-down mt-5">
        <div class="d-flex justify-space-around align-self-center">
          <a v-for="link of links" :key="link.text" v-text="link.text"/>
        </div>
      </v-col>

      <v-col  v-if="true" class="d-flex justify-end mt-4" >
        <div>
          <a class="mr-4" href=""><v-icon>mdi-shopping</v-icon></a>
              <span class="btn-main" style="cursor: pointer"><v-icon style="color: white" >mdi-account</v-icon></span>
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

              <v-list-item link v-for="link of links" :key="link + link.text">
                <v-list-item-action>
                  <v-icon >{{link.icon}}</v-icon>
                </v-list-item-action>

                <v-list-item-content>
                  <v-list-item-title >{{link.text}}</v-list-item-title>
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </v-navigation-drawer>
        </div>
      </v-col>
    </v-row>
  </v-container>

</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";

@Component({})
export default class NavBar extends Vue{
private links: Array<object> = [
  {text:"Список магазинов",route:"#",icon: "mdi-format-line-spacing"},
  {text:"Как мы работаем",route:"#",icon: "mdi-car"},
  {text:"Отзывы",route:"#",icon: "mdi-comment-account" },

];
private drawer = false;

}
</script>

<style scoped>
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
.btn-main{
  border-radius: 100px;
  cursor: pointer;
  padding: 21px 19px;
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
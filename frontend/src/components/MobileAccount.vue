<template>
<v-container>
  <div v-if="true" class="margin-container">
    <div class="d-flex justify-center">
      <img class="logo-img-login" src="../img/Vector.svg" alt="">
    </div>

    <div class="text-center pt-2" >
      <span class="header-title-login">Добро пожаловать</span>
    </div>


      <div class="mx-auto input-group-login" >
        <v-text-field type="email" label="Email"></v-text-field>
        <v-text-field type="password" label="Password"></v-text-field>
        <v-btn color="warning" block class="mt-5">
          Вход
        </v-btn>
        <div class="text-center mt-5">
          <span>Нет еще аккаунта? <router-link :to = "'/'">Присоединяйся</router-link> </span>
        </div>
      </div>


  </div>

  <div v-else>

  </div>
</v-container>
</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";

@Component
export default class MobileAccount extends Vue{
}
</script>

<style scoped>
.header-title-login{
 display: none;
}
.logo-img-login{
  display: none;
}
.input-group-login{
  display: none;
}
@media (max-width: 1000px) {
  .logo-img-login{
    display: block;
    height: 90px;
  }
  .header-title-login{
    display: block;
    font-size: 20px;
    font-weight: 300;
  }
  .input-group-login{
    display: block;
    width: 55%;
  }
}

@media (max-width: 600px) {
  .input-group-login{
    width: 65%;
  }
  .margin-container{
    margin-top: 5vh;
  }
}
@media (max-width: 425px) {
  .input-group-login{
    width: 85%;
  }
}
</style>
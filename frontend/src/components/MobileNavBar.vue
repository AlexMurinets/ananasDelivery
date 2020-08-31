<template>
  <div class="footer-display">
    <v-bottom-navigation class="footer d-flex justify-space-around">

      <button class="nav-button" @click = "route('/main')">
        <v-icon>mdi-home</v-icon>
      </button>

      <button class="nav-button" @click = "route('/search')">
        <v-icon>mdi-magnify</v-icon>
      </button>

      <button class="nav-button" @click = "route('/bucket')">
        <v-icon>mdi-cart-outline</v-icon>
      </button>

      <button class="nav-button" @click = "route('/account')">
        <v-icon>mdi-account</v-icon>
      </button>
    </v-bottom-navigation>
  </div>
</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";
@Component
export default class MobileNavBar extends Vue{
  private activeBtn = 1;
  public route(path: string){
    this.$router.push(path);
  }
}
</script>

<style scoped>
button{
  outline: none !important;
  border: none !important;
}
.nav-button{
  border-radius: 10px;
  transition: .3s;
  border: 0 !important;

}
.nav-button:hover{
  background-color: #d6d6d6;
  border-radius: 1px;
  outline: none !important;
}
.nav-button:active{
  background: none;
}
.footer-display{
  display: none;
}
.footer{
  position: fixed;
  bottom: 0;
}

@media (max-width: 1000px) {
  .footer-display{
    display: block;
  }
  .nav-button{
    font-size: 25px !important;
    padding: 0 35px !important;
  }
}

@media (max-width: 425px) {
  .nav-button{
    font-size: 20px !important;
    padding: 0 20px !important;
  }
}

</style>
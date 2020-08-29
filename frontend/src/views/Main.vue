<template>
  <div>
      <nav-bar/>
      <hr class="line">
    <v-container>
      <v-row>
        <v-col  sm="12" md="6" class="mt-10" style="z-index: 2" >
          <div class="text-sm-center text-md-left"  style="font-size: 43px; font-weight: 700;line-height: 1.30; ">
            <span class="text-intro">
              Доставка продуктов на дом по всему Кишиневу
            </span>
          </div>
          <br>
          <div class="mt-5 text-sm-center" style="font-size: 20px; font-weight: 300">
            <span class="text-intro-small">
              Быстрая доставка продуктов из супермаркетов прямо к вам домой ко всему городу Кишинев
            </span>
          </div>
          <div class="mt-15 d-flex justify-sm-center justify-md-start">
            <div class="text-center btn-logo ">
             <span>Заказать</span>
            </div>
          </div>
        </v-col>

        <v-col   md="6"  class="absolute-img  ">
          <v-img  src="../img/AnanasIntro.png" width="558" height="462"></v-img>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";
import NavBar from "@/components/NavBar.vue"
@Component({
  components: { NavBar},
})
export default class Main extends Vue{


}
</script>
<style>

.btn-logo{
  border-radius: 5px;
  background-color: #ffbc21;
  color: white;
  font-size: 25px;
  padding: 20px 0px;
  width: 80%;
}
hr.line{
  height: .5px;
  background: grey;
  opacity: 20%;
}
@media (max-width: 655px) {
  .btn-logo{
    width: 100%;
  }
}

@media (max-width: 955px) {
  .text-intro{
     font-size: 35px;
   }
  .text-intro-small{
    font-size: 16px;
  }
  .absolute-img{
    display: none;
  }
  .btn-logo{
    width: 50%;
  }
}

</style>
<template>
  <div>

      <nav-bar/>

    <v-container>
      <v-row>
        <v-col cols = "6" class="mt-10" style="z-index: 2">
          <div  style="font-size: 43px; font-weight: 700;line-height: 1.45;">
            Доставка продуктов на дом по всему Кишиневу
          </div>
          <br>
          <div class="mt-12" sm="12" style="font-size: 20px; font-weight: 300">
            Быстрая доставка продуктов из супермаркетов прямо к вам домой ко всему городу Кишинев
          </div>
        </v-col>
        <v-col sm ="6" >
          <v-img class="absolute-img" src="../img/AnanasIntro.png" width="558 " height="462"></v-img>
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

@media (max-width: 910px) {

.absolute-img{
  position: absolute;

}
}

</style>
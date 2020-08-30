<template>
  <div class="header-display">
    <div class="header-up d-flex justify-space-between py-2">
      <div class="mx-auto search-bar s-w" style="border-radius: 5px">
          <v-icon class="search-btn">mdi-magnify</v-icon>
        <input class="search-bar" type="text" placeholder="Поиск на Ananas">
      </div>
      <div class="mx-auto mt-1">
        <v-app-bar-nav-icon/>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import {Component, Vue} from "vue-property-decorator";

@Component
export default class MobileTopMenu extends Vue{
}
</script>

<style scoped>
.s-w{

}
.header-up{
  box-shadow: 0 0 5px rgba(0,0,0,0.2); /* Параметры тени */
  position: fixed;
  width: 100%;
  background: white;
}
.header-display{
  display: none;
}
.search-bar{
  background: #efefef;
  outline: none !important;
  width: 80%;
  font-size: 15px;
  padding: 1px 0;
  color: #3b3a3a;
}

.links{
  font-size: 15px;
  color: #5d5d5d;
  font-weight: 400;

}
.search-btn{
  font-size: 20px;
  padding: 6px 6px;
  margin: 4px 4px;
  border-radius: 80px;
}
.search-btn:hover{
  background-color: #e3e3e3;
  border-radius: 100px;
}
.search-btn:focus{
  font-size: 20px;
  padding: 10px 10px
}


@media (max-width: 770px) {
  .header-display{
    display: block;
  }
  .s-w{
    width: 90% !important;
  }
}

@media (max-width: 425px) {
  .s-w{
    width: 82% !important;
  }
}

</style>
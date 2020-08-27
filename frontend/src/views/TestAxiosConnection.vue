<template>
  <div class="home">
    <!--Синтаксис такой же-->
    <h1>Text :{{message}}</h1>
  </div>
</template>

<!--Если хочешь использовать typeScript нужно обязательно указать lang="ts"-->
<script lang="ts">

//Можно импортировать сразу несколько компонентов
import {Component,Vue} from "vue-property-decorator";
import TestService from "@/backend/TestService"

//Если мы хотим получать какие-то данные, мы должны пометить класс как компонент
@Component
export default class TestAxiosConnection extends Vue{
  private message = "";

  //Вместо beforeCreated можно использовать конструктор
    constructor(options: ComponentOptions<Vue>) {
    super(options);
    this.getHello();
  }

  //Обязательно нужен метод, если просто вызвать TestService.getAll() ничего работать не будет
  public getHello(){
    TestService.getAll().then((response)=> {this.message = response.data,console.log(response.data)});
  }

}

</script>

<template>
  <div class="home">
    <!--Синтаксис такой же-->
    <p>Simple message : {{message}}</p>
    <p>Array : {{list}}</p>
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
  //Взамен Data : () => {....}
  private list: Array<object> = [];
  //Вместо beforeCreated можно использовать конструктор
    constructor(options: ComponentOptions<Vue>) {
    super(options);
    this.getMessage();
    this.getArray();
  }

  //Обязательно нужен метод, если просто вызвать TestService.getAll() ничего работать не будет
  public getMessage(){
    TestService.getMessage().then((response)=> {this.message = response.data,console.log(this.message)});
  }
  public getArray(){
    TestService.getArray().then((response)=> {this.list = response.data, console.log(this.list)})
  }

}

</script>

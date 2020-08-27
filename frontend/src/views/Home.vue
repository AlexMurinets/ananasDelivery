<template>
  <div class="home">
    {{this.get()}}
    {{this.message}}
  </div>
</template>

<script lang="ts">
import {Component,Vue} from "vue-property-decorator";
import DataService from "@/backend/DataService"

@Component
export default class Home extends Vue{
  private message: string;

  public get(): any{
    DataService.getAll().then(data => {this.message = data.data, console.log(data.data)});
  }
}

</script>

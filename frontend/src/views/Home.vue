<template>
  <div class="home">
    {{component.name}}
  </div>
</template>

<script lang="ts">
import {Component,Vue} from "vue-property-decorator";

@Component
export default class Home extends Vue{

}

</script>

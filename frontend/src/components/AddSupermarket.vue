<template>
    <v-row justify="center">
        <v-col cols="12" sm="10" md="8" lg="6">
    <v-card class="border-left-warning">
        <form>
            <v-text-field
                    v-model="name"
                    :error-messages="nameErrors"
                    :counter="20"
                    label="Название магазина"
                    required
                    @input="$v.name.$touch()"
                    @blur="$v.name.$touch()"
            ></v-text-field>
            <v-text-field
                    v-model="address"
                    :error-messages="addressErrors"
                    label="Адресс"
                    required
                    @input="$v.address.$touch()"
                    @blur="$v.address.$touch()"
            ></v-text-field>

            <v-textarea    v-model="description"
                           label="Описание">

            </v-textarea>
            <br><br>

            <v-btn color="warning" class="mr-4" @click="submit">Создать</v-btn>
            <v-btn color="primary" @click="clear">Очистить</v-btn>
        </form>
    </v-card>
        </v-col>
    </v-row>
</template>

<script>
    import { validationMixin } from 'vuelidate'
    import { required, maxLength, email } from 'vuelidate/lib/validators'
    import SupermarketCRUD from "@/backend/SupermarketCRUD";

    export default {
        mixins: [validationMixin],

        validations: {
            name: { required, maxLength: maxLength(20) },
            address: { required },
        },

        data: () => ({
            name: '',
            address: '',
            select: null,
            checkbox: false,
            description: '',
        }),

        computed: {

            nameErrors () {
                const errors = []
                if (!this.$v.name.$dirty) return errors
                !this.$v.name.maxLength && errors.push('Name must be at most 20 characters long')
                !this.$v.name.required && errors.push('Name is required.')
                return errors
            },

            addressErrors () {
                const errors = []
                if (!this.$v.address.$dirty) return errors
                !this.$v.address.required && errors.push('Address')
                return errors
            },
        },

        methods: {
            callHello(){
                this.name = SupermarketCRUD.createSupermarket({
                    name: this.name,
                    address: this.address,
                    description: this.description
                });
            },
            submit () {
                this.$v.$touch()
                this.callHello()
            },
            clear () {
                this.$v.$reset()
                this.name = ''
                this.description = ''
            },
        },
    }
</script>

<style scoped>

</style>
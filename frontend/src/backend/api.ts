import axios from "axios";

const url = "http://localhost:9090/api"

const api = axios.create({
    baseURL: url,
    timeout: 10000
})


export default {
    get(){
        return axios.get("/getHello");
    }
}
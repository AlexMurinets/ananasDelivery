import api from "@/backend/Api";



class DataService {
    public getAll(){
        return api.get("/getHello")
    }
}
export default new DataService();

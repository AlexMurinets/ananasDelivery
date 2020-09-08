
import api from "@/backend/api";

class SupermarketCRUD {
    public createSupermarket(supermarket: object){
        return api.post("/supermarket", supermarket);
    }
}

export default new SupermarketCRUD();

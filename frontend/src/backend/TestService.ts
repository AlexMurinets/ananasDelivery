
//Импорт api
import api from "@/backend/api";


//Сервис создается как "класс"
class TestService {
    public getMessage(){
        return api.get("/getMessage");
    }
    public getArray(){
        return api.get("/getArray");
    }
}

//Его нужно обязательно создать и экспортировать
export default new TestService();


//Импорт api
import api from "@/backend/Api";


//Сервис создается как класс
class TestService {
    public getAll(){
        return api.get("/getHello");
    }
}

//Его нужно обязательно создать и экспортировать
export default new TestService();

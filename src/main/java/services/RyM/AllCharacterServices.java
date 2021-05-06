package services.RyM;

import api.model.RyM.AllCharactersModel;
import api.model.RyM.CharacterModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class AllCharacterServices extends MethodsService {
    public static Response get(String jsonName, Map<String,String> parameter) {
        return get(jsonName, AllCharactersModel.class,parameter);
    }

}

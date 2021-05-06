package services.RyM;

import api.model.RyM.CharacterModel;
import api.model.RyM.LocationModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class LocationServices extends MethodsService {
    public static Response get(String jsonName, Map<String,String> parameter) {
        return get(jsonName, LocationModel.class,parameter);
    }

}

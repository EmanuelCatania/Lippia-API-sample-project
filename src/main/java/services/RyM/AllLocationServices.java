package services.RyM;

import api.model.RyM.AllLocationModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class AllLocationServices extends MethodsService {
    public static Response get(String jsonName, Map<String,String> parameter) {
        return get(jsonName, AllLocationModel.class,parameter);
    }

}

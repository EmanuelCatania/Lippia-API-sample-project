package services.RyM;

import api.model.RyM.CharacterModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import org.apache.pdfbox.contentstream.operator.text.SetTextRise;

import java.lang.annotation.Repeatable;
import java.util.HashMap;
import java.util.Map;

public class CharacterServices extends MethodsService {
    public static final ThreadLocal<String> ID = new ThreadLocal<String>();

    public static Response get(String jsonName, Map<String,String> parameter) {
        return get(jsonName, CharacterModel.class,parameter);
    }
   public static Response getwithparams(String jsonName){
        return get(jsonName, CharacterModel.class,setParams());
    }
    private static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("character", CharacterServices.ID.get());
        return params;
    }
}

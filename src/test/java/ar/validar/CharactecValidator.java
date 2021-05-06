package ar.validar;

import api.model.RyM.CharacterModel;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class CharactecValidator {
    public static void validate(){
        CharacterModel response = (CharacterModel) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getName(), "Morty Smith");
        Assert.assertTrue(response.getId()>0);
    }
}

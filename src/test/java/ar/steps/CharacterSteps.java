package ar.steps;

import api.model.RyM.AllCharactersModel;
import api.model.RyM.CharacterModel;
import ar.validar.CharactecValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.RyM.AllCharacterServices;
import services.RyM.AllEpisodesServices;
import services.RyM.CharacterServices;


public class CharacterSteps extends PageSteps {

    @Then("le respuesta es correcta")
    public void leRespuestaEsCorrecta() {
        CharactecValidator.validate();
    }

    @And("obtengo el ID de un personaje")
    public void obtengoElIDDeUnPersonaje() {
        AllCharactersModel response;
        response = (AllCharactersModel) APIManager.getLastResponse().getResponse();
        String ID = response.getResults().get(1).getId().toString();
        CharacterServices.ID.set(ID);
    }
}

package ar.steps;

import ar.validar.CharactecValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;


public class CharacterSteps extends PageSteps {

    @Then("le respuesta es correcta")
    public void leRespuestaEsCorrecta() {
        CharactecValidator.validate();
    }
}

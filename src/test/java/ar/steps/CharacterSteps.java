package ar.steps;

import api.config.EntityConfiguration;
import ar.validar.CharactecValidator;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Then;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class CharacterSteps extends PageSteps {

    @Then("le respuesta es correcta")
    public void leRespuestaEsCorrecta() {
        CharactecValidator.validate();
    }
}

package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnFdL;
import userInterface.FdLUserInterface;

public class BuscadorFdLStepDefinition {

	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que me encuentro en la pagina de Flores de lujo con la url (.*)$")
	public void queMeEncuentroEnLaPaginaDeFloresDeLujoConLaUrlHttpsFloresdelujoComCo(String url) {
	   OnStage.theActorCalled("Cristian").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
	}


	@When("^busco el arreglo (.*) en el buscador$")
	public void buscoElArregloEnElBuscador(String arreglo) {
	    OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnFdL.on(arreglo));
	}

	@Then("^podre ver el arreglo (.*) en la página$")
	public void podreVerElArregloEnLaPagina(String arreglo) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(FdLUserInterface.LBL_PRODUCTO_FDL.of(arreglo)), WebElementStateMatchers.containsText(arreglo)));
	}
}

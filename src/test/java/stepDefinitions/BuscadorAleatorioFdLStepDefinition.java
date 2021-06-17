package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoAleatorioEnFdL;
import userInterface.FdLUserInterface;
import variablesGlobales.VariablesGlobales;

public class BuscadorAleatorioFdLStepDefinition {


	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("^busco un arreglo aleatorio en la pagina$")
	public void buscoUnArregloAleatorioEnLaPagina() {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoAleatorioEnFdL.on());
	}
	
	@Then("^podre ver un arreglo aleatorio en pantalla$")
	public void podreVerUnArregloAleatorioEnLaPagina() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(FdLUserInterface.LBL_PRODUCTO_FDL.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
	}
}

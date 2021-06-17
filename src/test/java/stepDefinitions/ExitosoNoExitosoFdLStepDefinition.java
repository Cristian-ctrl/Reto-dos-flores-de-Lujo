package stepDefinitions;

import java.io.IOException;
import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import models.Producto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnFdL;
import userInterface.FdLUserInterface;
import variablesGlobales.VariablesGlobales;

public class ExitosoNoExitosoFdLStepDefinition {

	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("^busco ciertos arreglos florales en el buscador$")
	public void buscoCiertosArreglosFloralesEnElBuscador(List<Producto> arreglos) {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnFdL.on(arreglos.get(0).getArreglo()));
	}


	@Then("^podre ver modelos buscados con su precio respectivo$")
	public void podreVerModelosBuscadosConSuPrecioRespectivo() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(FdLUserInterface.LBL_PRODUCTO_FDL.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
	}
}

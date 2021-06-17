package iteractions;

import java.util.List;
import java.util.Random;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import userInterface.FdLUserInterface;
import variablesGlobales.VariablesGlobales;

public class ClicProductoAleatorio implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		Esperar.tiempoEspera(5);
		Random random = new Random();
		List<WebElementFacade> listaBotonesProductos = FdLUserInterface.BTN_PRODUCTO_ALEATORIO_FDL.resolveAllFor(actor);
		List<WebElementFacade> listaNombresProductos = FdLUserInterface.LBL_NOMBRE_PRODUCTO_ALEATORIO_FDL.resolveAllFor(actor);
		int numeroAleatorio = random.nextInt(listaBotonesProductos.size());
		VariablesGlobales.nombreProductoAleatorio = listaNombresProductos.get(numeroAleatorio).getText();
		listaBotonesProductos.get(numeroAleatorio).click();
		Esperar.tiempoEspera(5);
	}

	public static Performable on() {
		return Instrumented.instanceOf(ClicProductoAleatorio.class).withProperties();
	}
}

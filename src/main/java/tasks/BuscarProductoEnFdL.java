package tasks;

import iteractions.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.FdLUserInterface;
import variablesGlobales.VariablesGlobales;

public class BuscarProductoEnFdL implements Task{
	
	private String producto;

	public BuscarProductoEnFdL(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Esperar.tiempoEspera(5),
				Enter.theValue(producto).into(FdLUserInterface.TXT_BUSCADOR_FDL),
				Esperar.tiempoEspera(5),
				Click.on(FdLUserInterface.BTN_BUSCADOR_FDL),
				Esperar.tiempoEspera(5),
				Click.on(FdLUserInterface.BTN_PRODUCTO_FDL.of(producto)),
				Esperar.tiempoEspera(5),
				Click.on(FdLUserInterface.BTN_VOLVER_FDL.of(producto)),
				Esperar.tiempoEspera(5)
				);
		VariablesGlobales.nombreProductoAleatorio = FdLUserInterface.LBL_PRODUCTO_FDL.of(producto).resolveFor(actor).getText();
	}

	public static BuscarProductoEnFdL on(String producto) {
		return Instrumented.instanceOf(BuscarProductoEnFdL.class).withProperties(producto);
	}
}

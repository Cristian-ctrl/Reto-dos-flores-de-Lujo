package tasks;

import iteractions.ClicProductoAleatorio;
import iteractions.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.FdLUserInterface;

public class BuscarProductoAleatorioEnFdL implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Esperar.tiempoEspera(5),
				Click.on(FdLUserInterface.BTN_CATEGORIA_FLORES_FDL),
				Esperar.tiempoEspera(2),
				ClicProductoAleatorio.on()
				);		
	}

	
	public static BuscarProductoAleatorioEnFdL on() {
		return Instrumented.instanceOf(BuscarProductoAleatorioEnFdL.class).withProperties();
	}
}

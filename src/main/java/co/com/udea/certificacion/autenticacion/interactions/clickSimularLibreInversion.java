package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.BOTON_SIMULAR_LIBRE_INVERSION;

public class clickSimularLibreInversion implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_SIMULAR_LIBRE_INVERSION));
    }

    public static clickSimularLibreInversion inPage(){
        return Tasks.instrumented(clickSimularLibreInversion.class);
    }
}

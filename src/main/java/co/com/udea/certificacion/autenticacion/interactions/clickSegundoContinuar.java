package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.BOTON_SEGUNDO_CONTINUAR;

public class clickSegundoContinuar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_SEGUNDO_CONTINUAR));
    }

    public static clickSegundoContinuar button(){
        return Tasks.instrumented(clickSegundoContinuar.class);
    }
}

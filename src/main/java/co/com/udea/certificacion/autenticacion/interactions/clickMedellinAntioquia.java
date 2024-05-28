package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TEXT_AREA_MEDELLIN_ANTIOQUIA;

public class clickMedellinAntioquia implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TEXT_AREA_MEDELLIN_ANTIOQUIA));
    }

    public static clickMedellinAntioquia button(){
        return Tasks.instrumented(clickMedellinAntioquia.class);
    }
}

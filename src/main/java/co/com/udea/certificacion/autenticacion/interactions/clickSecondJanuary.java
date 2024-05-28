package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.BOTON_SEGUNDO_ENERO;

public class clickSecondJanuary implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(BOTON_SEGUNDO_ENERO));
    }

    public static clickSecondJanuary button(){
        return Tasks.instrumented(clickSecondJanuary.class);
    }
}

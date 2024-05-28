package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.BOTON_IZQUIERDA;

public class clickLeft implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(BOTON_IZQUIERDA));
    }

    public static clickLeft button(){
        return Tasks.instrumented(clickLeft.class);
    }
}

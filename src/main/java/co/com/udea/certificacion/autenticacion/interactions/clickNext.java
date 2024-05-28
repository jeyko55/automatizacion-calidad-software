package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.BOTON_SIGUIENTE;

public class clickNext implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_SIGUIENTE));
    }

    public static clickNext button(){
        return Tasks.instrumented(clickNext.class);
    }
}
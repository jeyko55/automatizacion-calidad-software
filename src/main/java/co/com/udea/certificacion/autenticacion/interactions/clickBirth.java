package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.BOTON_NACIMIENTO;

public class clickBirth implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_NACIMIENTO));
    }

    public static clickBirth button(){
        return Tasks.instrumented(clickBirth.class);
    }
}

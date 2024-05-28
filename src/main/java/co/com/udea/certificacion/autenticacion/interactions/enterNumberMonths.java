package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TEXT_AREA_MESES;

public class enterNumberMonths implements Interaction{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("60").into(TEXT_AREA_MESES));
    }

    public static enterNumberMonths inTextArea(){
        return Tasks.instrumented(enterNumberMonths.class);
    }
}

package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TEXT_AREA_NUMERO_CELULAR;

public class enterCellNumber implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("3205329853").into(TEXT_AREA_NUMERO_CELULAR));
    }

    public static enterCellNumber inTextArea(){
        return Tasks.instrumented(enterCellNumber.class);
    }
}

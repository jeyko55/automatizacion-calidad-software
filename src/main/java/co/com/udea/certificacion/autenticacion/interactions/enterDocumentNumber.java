package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TEXT_AREA_NUMERO_DOCUMENTO;

public class enterDocumentNumber implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("1023015310").into(TEXT_AREA_NUMERO_DOCUMENTO));
    }

    public static enterDocumentNumber inTextArea(){
        return Tasks.instrumented(enterDocumentNumber.class);
    }
}

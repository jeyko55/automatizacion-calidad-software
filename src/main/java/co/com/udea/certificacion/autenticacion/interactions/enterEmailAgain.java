package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TEXT_AREA_EMAIL;

public class enterEmailAgain implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("pruebafabrica@udea.edu.co").into(TEXT_AREA_EMAIL));
    }

    public static enterEmailAgain inTextArea(){
        return Tasks.instrumented(enterEmailAgain.class);
    }
}

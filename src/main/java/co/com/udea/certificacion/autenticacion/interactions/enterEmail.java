package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TEXT_AREA_CORREO_ELECTRONICO;

public class enterEmail implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("pruebafabrica@udea.edu.co").into(TEXT_AREA_CORREO_ELECTRONICO));
    }

    public static enterEmail inTextArea(){
        return Tasks.instrumented(enterEmail.class);
    }
}

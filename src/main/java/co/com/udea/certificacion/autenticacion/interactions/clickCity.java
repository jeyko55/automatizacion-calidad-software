package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TEXT_AREA_CIUDAD;


public class clickCity implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(TEXT_AREA_CIUDAD));
    }

    public static clickCity inTextArea(){
        return Tasks.instrumented(clickCity.class);
    }
}

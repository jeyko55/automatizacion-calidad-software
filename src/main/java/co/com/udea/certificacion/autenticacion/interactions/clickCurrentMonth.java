package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.BOTON_MES_ACTUAL;

public class clickCurrentMonth implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(BOTON_MES_ACTUAL));
    }

    public static clickCurrentMonth button(){
        return Tasks.instrumented(clickCurrentMonth.class);
    }
}

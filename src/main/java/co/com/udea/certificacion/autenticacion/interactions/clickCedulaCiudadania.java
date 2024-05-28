package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.BOTON_CEDULA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class clickCedulaCiudadania implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_CEDULA, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(BOTON_CEDULA, isEnabled()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_CEDULA),
                JavaScriptClick.on(BOTON_CEDULA)
        );
    }

    public static clickCedulaCiudadania button(){
        return Tasks.instrumented(clickCedulaCiudadania.class);
    }
}

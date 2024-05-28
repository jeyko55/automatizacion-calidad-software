package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.OPCIONES_MENU;
import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TIPO_DOCUMENTO_TEXT_AREA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class clickTipoDocumento implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TIPO_DOCUMENTO_TEXT_AREA),
                WaitUntil.the(TIPO_DOCUMENTO_TEXT_AREA, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(TIPO_DOCUMENTO_TEXT_AREA, isEnabled()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(TIPO_DOCUMENTO_TEXT_AREA),
                WaitUntil.the(OPCIONES_MENU, isVisible()).forNoMoreThan(10).seconds()
        );
    }
    public static clickTipoDocumento inTextArea(){
        return Tasks.instrumented(clickTipoDocumento.class);
    }
}

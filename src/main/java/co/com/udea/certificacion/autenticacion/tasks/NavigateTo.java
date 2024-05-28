package co.com.udea.certificacion.autenticacion.tasks;

import co.com.udea.certificacion.autenticacion.interactions.clickContinuarButton;
import co.com.udea.certificacion.autenticacion.interactions.clickInSi;
import co.com.udea.certificacion.autenticacion.interactions.clickSaberMasButton;
import co.com.udea.certificacion.autenticacion.interactions.clickSimularLibreInversion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class NavigateTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(clickSaberMasButton.inPage());
        actor.attemptsTo(clickSimularLibreInversion.inPage());
        actor.attemptsTo(clickContinuarButton.inPage());
    }

    public static NavigateTo credits(){
        return Tasks.instrumented(NavigateTo.class);
    }
}

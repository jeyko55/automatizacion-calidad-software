package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TEXT_AREA_INGRESOS_MENSUALES;


public class enterMonthlyIncome implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("4000000").into(TEXT_AREA_INGRESOS_MENSUALES));
    }

    public static enterMonthlyIncome inTextArea(){
        return Tasks.instrumented(enterMonthlyIncome.class);
    }
}

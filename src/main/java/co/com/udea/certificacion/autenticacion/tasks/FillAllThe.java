package co.com.udea.certificacion.autenticacion.tasks;

import co.com.udea.certificacion.autenticacion.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillAllThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(clickInSi.button());
        actor.attemptsTo(enterAmount.inTextArea());
        actor.attemptsTo(enterNumberMonths.inTextArea());
        actor.attemptsTo(clickDate.inTextArea());
        actor.attemptsTo(clickSiglo.button());
        actor.attemptsTo(clickEnero.button());
        actor.attemptsTo(clickDia.button());
        actor.attemptsTo(clickSimular.button());
        actor.attemptsTo(clickSolicitarCredito.button());
        actor.attemptsTo(clickTipoDocumento.inTextArea());
        actor.attemptsTo(clickCedulaCiudadania.button());
        actor.attemptsTo(enterDocumentNumber.inTextArea());
        actor.attemptsTo(enterCellNumber.inTextArea());
        actor.attemptsTo(enterEmail.inTextArea());
        actor.attemptsTo(clickCheckbox.button());
        actor.attemptsTo(clickSegundoContinuar.button());
        actor.attemptsTo(enterName.inTextArea());
        actor.attemptsTo(enterLastName.inTextArea());
        actor.attemptsTo(clickRequestDate.inTextArea());
        actor.attemptsTo(clickCurrentMonth.button());
        actor.attemptsTo(clickBirth.button());
        actor.attemptsTo(clickLeft.button());
        actor.attemptsTo(clickLeft.button());
        actor.attemptsTo(clickSecondCentury.button());
        actor.attemptsTo(clickSecondJanuary.button());
        actor.attemptsTo(clickSecondDay.button());
        actor.attemptsTo(clickCity.inTextArea());
        actor.attemptsTo(clickMedellinAntioquia.button());
        actor.attemptsTo(enterEmailAgain.inTextArea());
        actor.attemptsTo(enterConfirmationEmail.inTextArea());
        actor.attemptsTo(enterCellNumberAgain.inTextArea());
        actor.attemptsTo(enterMonthlyIncome.inTextArea());
        actor.attemptsTo(clickNext.button());
    }

    public static FillAllThe data(){
        return Tasks.instrumented(FillAllThe.class);
    }
}

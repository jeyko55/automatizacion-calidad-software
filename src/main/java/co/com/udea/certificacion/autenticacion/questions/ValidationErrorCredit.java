package co.com.udea.certificacion.autenticacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.MENSAJE_ERROR;

public class ValidationErrorCredit implements Question<String> {

    public ValidationErrorCredit(){}

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(MENSAJE_ERROR).getText();
        return msg;
    }

    public static ValidationErrorCredit verificacion(){
        return new ValidationErrorCredit();
    }
}

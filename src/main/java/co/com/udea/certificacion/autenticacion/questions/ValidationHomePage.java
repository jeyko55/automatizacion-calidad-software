package co.com.udea.certificacion.autenticacion.questions;

import co.com.udea.certificacion.autenticacion.utils.Util;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.TEXTO_VERIFICACION;

public class ValidationHomePage implements Question<String> {

    public ValidationHomePage(){}
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TEXTO_VERIFICACION).getText();
        msg = Util.normalize(msg);
        return msg;
    }

    public static ValidationHomePage verificacion(){
        return new ValidationHomePage();
    }
}

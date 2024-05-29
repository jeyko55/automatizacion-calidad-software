package co.com.udea.certificacion.autenticacion.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBancolombia implements Task {

    private PageObject bancolombiaPage;

    public OpenBancolombia(PageObject bancolombiaPage){
        this.bancolombiaPage = bancolombiaPage;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(this.bancolombiaPage));
    }

    public static OpenBancolombia browser(PageObject bancolombiaPage){
        return Tasks.instrumented(OpenBancolombia.class,bancolombiaPage);
    }
}

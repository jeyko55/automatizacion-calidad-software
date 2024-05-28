package co.com.udea.certificacion.autenticacion.tasks;

import co.com.udea.certificacion.autenticacion.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillAllThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(fillBancolombia.data());
    }

    public static FillAllThe data(){
        return Tasks.instrumented(FillAllThe.class);
    }
}

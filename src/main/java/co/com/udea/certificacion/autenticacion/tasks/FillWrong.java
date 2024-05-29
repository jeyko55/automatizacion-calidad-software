package co.com.udea.certificacion.autenticacion.tasks;

import co.com.udea.certificacion.autenticacion.interactions.fillWrongBancolombia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillWrong implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(fillWrongBancolombia.data());
    }

    public static FillWrong data(){
        return Tasks.instrumented(FillWrong.class);
    }
}

package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class fillBancolombia implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(BOTON_SI));
        actor.attemptsTo(Enter.theValue("5000000").into(TEXT_AREA_MONTO));
        actor.attemptsTo(Enter.theValue("60").into(TEXT_AREA_MESES));
        actor.attemptsTo(Click.on(CAMPO_FECHA));
        actor.attemptsTo(Click.on(BOTON_SIGLO));
        actor.attemptsTo(Click.on(BOTON_ENERO));
        actor.attemptsTo(Click.on(BOTON_DIA));
        actor.attemptsTo(Click.on(BOTON_SIMULAR));
        actor.attemptsTo(Click.on(BOTON_SOLICITAR_CREDITO));
        actor.attemptsTo(
                Scroll.to(TIPO_DOCUMENTO_TEXT_AREA),
                WaitUntil.the(TIPO_DOCUMENTO_TEXT_AREA, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(TIPO_DOCUMENTO_TEXT_AREA, isEnabled()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(TIPO_DOCUMENTO_TEXT_AREA),
                WaitUntil.the(OPCIONES_MENU, isVisible()).forNoMoreThan(10).seconds()
        );

        actor.attemptsTo(
                WaitUntil.the(BOTON_CEDULA, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(BOTON_CEDULA, isEnabled()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_CEDULA),
                JavaScriptClick.on(BOTON_CEDULA)
        );

        actor.attemptsTo(Enter.theValue("1023015310").into(TEXT_AREA_NUMERO_DOCUMENTO));
        actor.attemptsTo(Enter.theValue("3205329853").into(TEXT_AREA_NUMERO_CELULAR));
        actor.attemptsTo(Enter.theValue("pruebafabrica@udea.edu.co").into(TEXT_AREA_CORREO_ELECTRONICO));
        actor.attemptsTo(Click.on(CHECKBOX));
        actor.attemptsTo(Click.on(BOTON_SEGUNDO_CONTINUAR));
        actor.attemptsTo(Enter.theValue("Juan Fernando").into(TEXT_AREA_NOMBRE));
        actor.attemptsTo(Enter.theValue("Velasco Torres").into(TEXT_AREA_APELLIDOS));
        actor.attemptsTo(JavaScriptClick.on(TEXT_AREA_SOLICITUD_FECHA_NACIMIENTO));
        actor.attemptsTo(JavaScriptClick.on(BOTON_MES_ACTUAL));
        actor.attemptsTo(JavaScriptClick.on(BOTON_NACIMIENTO));
        actor.attemptsTo(JavaScriptClick.on(BOTON_IZQUIERDA));
        actor.attemptsTo(JavaScriptClick.on(BOTON_IZQUIERDA));
        actor.attemptsTo(JavaScriptClick.on(BOTON_SEGUNDO_SIGLO));
        actor.attemptsTo(JavaScriptClick.on(BOTON_SEGUNDO_ENERO));
        actor.attemptsTo(JavaScriptClick.on(BOTON_SEGUNDO_DIA));
        actor.attemptsTo(JavaScriptClick.on(TEXT_AREA_CIUDAD));
        actor.attemptsTo(JavaScriptClick.on(TEXT_AREA_MEDELLIN_ANTIOQUIA));
        actor.attemptsTo(Enter.theValue("pruebafabrica@udea.edu.co").into(TEXT_AREA_EMAIL));
        actor.attemptsTo(Enter.theValue("pruebafabrica@udea.edu.co").into(TEXT_AREA_CONFIRMACION_EMAIL));
        actor.attemptsTo(Enter.theValue("3205329853").into(TEXT_AREA_CELULAR_DE_NUEVO));
        actor.attemptsTo(Enter.theValue("4000000").into(TEXT_AREA_INGRESOS_MENSUALES));
        actor.attemptsTo(Click.on(BOTON_SIGUIENTE));
    }

    public static fillBancolombia data(){
        return Tasks.instrumented(fillBancolombia.class);
    }
}

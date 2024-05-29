package co.com.udea.certificacion.autenticacion.stepdefinitions;

import co.com.udea.certificacion.autenticacion.questions.ValidationHomePage;
import co.com.udea.certificacion.autenticacion.tasks.FillAllThe;
import co.com.udea.certificacion.autenticacion.tasks.NavigateTo;
import co.com.udea.certificacion.autenticacion.tasks.OpenBancolombia;
import co.com.udea.certificacion.autenticacion.userinterfaces.BancolombiaPage;
import co.com.udea.certificacion.autenticacion.utils.Constants2;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class PerformCreditStepDefinition {

    //actor
    private final Actor user = Actor.named("David");

    //driver
    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver theDriver;

    //inicializar
    @Before
    public void init(){
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("que me encuentro en la pagina de Bancolombia")
    public void estoyEnPaginaBancolombia(){
        user.attemptsTo(OpenBancolombia.browser(new BancolombiaPage()));
        user.attemptsTo(NavigateTo.credits());
    }

    @When("ingreso la informacion de mi credito")
    public void ingresoInformacionCredito(){
        user.attemptsTo(FillAllThe.data());
    }

    @Then("veo la confirmacion del prestamo")
    public void veoConfirmacionPrestamo(){
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationHomePage.verificacion(), Matchers.containsString(Constants2.VAL1)));
    }
}

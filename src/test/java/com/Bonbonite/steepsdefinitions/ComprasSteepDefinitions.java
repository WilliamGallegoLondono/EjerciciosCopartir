package com.Bonbonite.steepsdefinitions;

import com.Bonbonite.task.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprasSteepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Given("me encuentro en el home de la pagina Bon Bonite")
    public void meEncuentroEnElHomeDeLaPaginaBonBonite() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Bon Bonite");
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));


    }

    @Given("oprime el icono de login")
    public void oprimeElIconoDeLogin() {
        theActorInTheSpotlight().wasAbleTo(OprimirBoton.login());


    }

    @Given("ingreso {string} y {string}")
    public void ingresoY(String usuario, String contrasena) {
        theActorInTheSpotlight().wasAbleTo(InserarCredenciales.con(usuario,contrasena));


    }

    @Given("oprimo el boton aceder")
    public void oprimoElBotonAceder() {
        theActorInTheSpotlight().wasAbleTo(Oprimir.acceder());

    }

    @When("seleciono la categoria zapatos")
    public void selecionoLaCategoriaZapatos() {
        theActorInTheSpotlight().wasAbleTo(SelecionCategoria.en());

    }

    @When("seleciono el modelo de zapatos")
    public void selecionoElModeloDeZapatos() {
        theActorInTheSpotlight().wasAbleTo(Elegir.opcion());

    }

    @When("seleciono la talla")
    public void selecionoLaTalla() {
        theActorInTheSpotlight().wasAbleTo(ElegirTalla.con());

    }

    @When("oprimo el boton agregar al carrito")
    public void oprimoElBotonAgregarAlCarrito() {
        theActorInTheSpotlight().wasAbleTo(AgregarAlCarrito.con());

    }

    @When("oprimo el boton de carrito")
    public void oprimoElBotonDeCarrito() {

    }

    @When("oprimo el boton de finalizar compra")
    public void oprimoElBotonDeFinalizarCompra() {

    }

    @Then("deberia ver el {string}")
    public void deberiaVerEl(String string) {

    }




}

package com.Bonbonite.task;

import com.Bonbonite.user_interface.MiCuenta;
import com.Bonbonite.user_interface.Zapatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ElegirTalla implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SelectFromOptions.byVisibleText("38").from(Zapatos.TALLA));

    }

    public static ElegirTalla con(){
        return Tasks.instrumented(ElegirTalla.class);
    }
}

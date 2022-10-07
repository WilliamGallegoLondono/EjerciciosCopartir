package com.Bonbonite.task;

import com.Bonbonite.user_interface.MiCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Oprimir implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(MiCuenta.PANTALLADEACCESO),Click.on(MiCuenta.ACEDER)
                );

    }

    public static Oprimir acceder(){
        return Tasks.instrumented(Oprimir.class);
    }
}

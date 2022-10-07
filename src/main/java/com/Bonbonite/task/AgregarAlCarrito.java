package com.Bonbonite.task;

import com.Bonbonite.user_interface.MiCuenta;
import com.Bonbonite.user_interface.Zapatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AgregarAlCarrito implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Zapatos.AGREGARALCARRITO)
                );

    }

    public static AgregarAlCarrito con(){
        return Tasks.instrumented(AgregarAlCarrito.class);
    }
}

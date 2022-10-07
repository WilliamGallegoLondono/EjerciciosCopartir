package com.Bonbonite.task;

import com.Bonbonite.user_interface.Zapatos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Elegir implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Click.on(Zapatos.OPCIONTENNIS));
    }

    public static Elegir opcion(){
        return Tasks.instrumented(Elegir.class);
    }
}

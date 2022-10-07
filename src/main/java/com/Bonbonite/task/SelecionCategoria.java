package com.Bonbonite.task;

import com.Bonbonite.user_interface.Autenticado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelecionCategoria implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Autenticado.ZAPATOS));

    }

    public static SelecionCategoria en(){
        return Tasks.instrumented(SelecionCategoria.class);
    }
}

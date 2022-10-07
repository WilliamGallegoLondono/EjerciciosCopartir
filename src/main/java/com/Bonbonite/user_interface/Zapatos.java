package com.Bonbonite.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Zapatos {

    public static final Target OPCIONTENNIS = Target.the("Opcion tennis").locatedBy("//*[@id=\"wrapper\"]/div[5]/ul/li[3]/a");

    public static final Target TALLA = Target.the("Opcion talla").locatedBy("//*[@id=\"pa_talla\"]");

    public static final Target AGREGARALCARRITO = Target.the("Agregar al carrito").locatedBy("//*[@id=\"product-215373\"]/div[2]/div[1]/div/form/div/div[2]/button");

    public static final Target PATALLA = Target.the("Pantalla").locatedBy("//*[@id=\"wrapper\"]");


}


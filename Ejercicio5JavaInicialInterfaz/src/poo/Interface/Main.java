package poo.Interface;

import poo.Interface.Coche;

import java.awt.*;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDimpl();

    public static void main(String[] args) {

    Coche peugeot = new Coche(
            "Peugeot",
            "308 allure gps",
            2013,
            true);

    cocheCRUD.save(peugeot);
    cocheCRUD.findAll();
    cocheCRUD.delete(peugeot);

        System.out.println(peugeot);
    }
}






package poo.clases;

import poo.herencia.SmartPhone;
import poo.herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();


        SmartDevice samsung = new SmartDevice(
                "samsung",
                "Galaxy s22 ultra",
                "Exynos 2200 GPU AMD RDNA 2",
                4855,
                6.8,
                12,
                128,
                "Vidrio Templado",
                108,
                null);

        SmartDevice apple = new SmartDevice(
                "apple",
                "Iphone 12 Pro Max",
                "A14 Bionic",
                3687,
                6.1,
                6,
                512,
                "Aluminio",
                12,
                null);

        SmartDevice samsungWatch = new SmartDevice(
                "samsung",
                "Samsung watch Active",
                "Exynos 9110",
                230,
                1.1,
                1,
                4,
                 "Aluminio",
                0,
                "Techgnogel");

        SmartDevice appleWatch = new SmartDevice(
                "apple",
                "apple watch serie 4",
                "S4",
                292,
                1.78,
                1,
                16,
                "Aluminio",
                0,
                "Techgnogel");


        System.out.println("SMARTPHONE SAMSUNG:");
        System.out.println("Marca: " + samsung.marca);
        System.out.println("Modelo: " + samsung.modelo);
        System.out.println("Procesador: " + samsung.procesador);
        System.out.println("Bateria: " + samsung.bateria + ".mAh");
        System.out.println("Pantalla: " + samsung.pantalla + "p");
        System.out.println("Memoria Ram: " + samsung.memoriaRam + "GB");
        System.out.println("Memoria Interna: " + samsung.memoriaInterna + "GB");
        System.out.println("Carcasa: " + samsung.carcasa);
        System.out.println("Camara Principal: " + samsung.camaraPrincipal + "mp");
        System.out.println(" ");


        System.out.println("SMARTPHONE APPLE:");
        System.out.println("Marca: " + apple.marca);
        System.out.println("Modelo: " + apple.modelo);
        System.out.println("Procesador: " + apple.procesador);
        System.out.println("Bateria: " + apple.bateria + ".mAh");
        System.out.println("Pantalla: " + apple.pantalla + "p");
        System.out.println("Memoria Ram: " + apple.memoriaRam + "GB");
        System.out.println("Memoria Interna: " + apple.memoriaInterna + "GB");
        System.out.println("Carcasa: " + apple.carcasa);
        System.out.println("Camara Principal: " + apple.camaraPrincipal + "mp");
        System.out.println(" ");



        System.out.println("SMARTWATCH SAMSUNG:");
        System.out.println("Marca: " + samsungWatch.marca);
        System.out.println("Modelo: " + samsungWatch.modelo);
        System.out.println("Procesador: " + samsungWatch.procesador);
        System.out.println("Bateria: " + samsungWatch.bateria + ".mAh");
        System.out.println("Pantalla: " + samsungWatch.pantalla + "p");
        System.out.println("Memoria Ram: " + samsungWatch.memoriaRam + "GB");
        System.out.println("Memoria Interna: " + samsungWatch.memoriaInterna + "GB");
        System.out.println("Carcasa: " + samsungWatch.carcasa);
        System.out.println("Material de malla: " + samsungWatch.materialMalla);
        System.out.println(" ");



        System.out.println("SMARTWATCH APPLE:");

        System.out.println("Marca: " + appleWatch.marca);
        System.out.println("Modelo: " + appleWatch.modelo);
        System.out.println("Procesador: " + appleWatch.procesador);
        System.out.println("Bateria: " + appleWatch.bateria + ".mAh");
        System.out.println("Pantalla: " + appleWatch.pantalla + "p");
        System.out.println("Memoria Ram: " + appleWatch.memoriaRam + "GB");
        System.out.println("Memoria Interna: " + appleWatch.memoriaInterna + "GB");
        System.out.println("Carcasa: " + appleWatch.carcasa);
        System.out.println("Material de malla: " + appleWatch.materialMalla);
        System.out.println(" ");
    }
}



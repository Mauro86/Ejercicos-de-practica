package com.Ejercicio4OBCjavaInicial;

public class SmartDevice {

    // corrección ejercico 4 (Open bootcamp)

    String marca;
    String modelo;
    String procesador;
    int bateria;

    double pantalla;
    int memoriaRam;
    int memoriaInterna;


    public SmartDevice() {
    }

    public SmartDevice(String marca,
                       String modelo,
                       String procesador,
                       int bateria,
                       double pantalla,
                       int memoriaRam,
                       int memoriaInterna) {

        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.memoriaInterna = memoriaInterna;
    }

    public static class SmartPhone extends SmartDevice {
        int camaraPrincipal;
        String materialCarcasa;
        String sistema;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String marca,
                   String modelo,
                   String procesador,
                   int bateria,
                   double pantalla,
                   int memoriaRam,
                   int memoriaInterna,
                   int camaraPrincipal,
                   String sistema,
                   String materialCarcasa) {

            super(marca,
                    modelo,
                    procesador,
                    bateria,
                    pantalla,
                    memoriaRam,
                    memoriaInterna);

            this.camaraPrincipal = camaraPrincipal;
            this.sistema = sistema;
            this.materialCarcasa = materialCarcasa;
        }

        @Override
        public String toString() {
            return "marca=" + marca +
                    ", modelo=" + modelo +
                    ", procesador=" + procesador +
                    ", bateria=" + bateria + "mAh" +
                    ", pantalla=" + pantalla + "Pulgadas" +
                    ", ram=" + memoriaRam + "GB" +
                    ", memoriaInterna=" + memoriaInterna + "GB";

        }
    }
    public static class SmartWatch extends SmartDevice {
            String materialMalla;
            String conectividad;

            public SmartWatch() {
                super();
            }

            public SmartWatch(String marca,
                              String modelo,
                              String procesador,
                              int bateria,
                              double pantalla,
                              int memoriaRam,
                              int memoriaInterna,
                              String materialMalla,
                              String conectividad) {

                super(marca,
                        modelo,
                        procesador,
                        bateria,
                        pantalla,
                        memoriaRam,
                        memoriaInterna);

                this.materialMalla = materialMalla;
                this.conectividad = conectividad;
            }

            @Override
            public String toString() {
                return "marca=" + marca +
                        ", modelo=" + modelo +
                        ", procesador=" + procesador +
                        ", bateria=" + bateria + "mAh" +
                        ", pantalla=" + pantalla + "Pulgadas" +
                        ", ram=" + memoriaRam + "GB" +
                        ", memoriaInterna=" + memoriaInterna + "GB" +
                        ", materialMalla=" + materialMalla +
                        ", conectividad=" + conectividad;
            }
    }

    public static void main(String[] args) {

                SmartPhone smartPhone = new SmartPhone(
                        "Samsung",
                        "S22 Ultra",
                        "Exynos 2200 GPU AMD RDNA 2",
                        4855,
                        6.8,
                        12,
                        128,
                        108,
                        "Android",
                        "Vidrio Templado");

                SmartWatch smartWatch = new SmartWatch(
                        "Samsung",
                        "samsung watch active",
                        "Exynos 9110",
                        230,
                        1.1,
                        1,
                        4,
                        "techgnogel",
                        "bluetooth");

                System.out.println("El smartphone es: " + smartPhone + "\nEl smartwatch es: " + smartWatch);
            }
}


















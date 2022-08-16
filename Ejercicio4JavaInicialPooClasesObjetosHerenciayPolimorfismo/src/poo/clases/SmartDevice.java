package poo.clases;

import poo.herencia.SmartPhone;
import poo.herencia.SmartWatch;

public class SmartDevice {

    protected String marca;
    protected String modelo;
    protected String procesador;
    protected int bateria;
    protected double pantalla;
    protected int memoriaRam;
    protected int memoriaInterna;
    protected String carcasa;
    protected int camaraPrincipal;
    protected String materialMalla;

    SmartPhone smartPhone;
    SmartWatch smartWatch;

    //constructores

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo,
                       String procesador, int bateria,
                       double pantalla, int memoriaRam,
                       int memoriaInterna, String carcasa,
                       int camaraPrincipal, String materialMalla){

        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.bateria = bateria;
        this.pantalla = pantalla;
        this.memoriaRam = memoriaRam;
        this.memoriaInterna = memoriaInterna;
        this.carcasa = carcasa;
        this.camaraPrincipal = camaraPrincipal;
        this.materialMalla = materialMalla;

    }
}


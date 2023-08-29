package com.satc.satc.loja.models;



public class MargemLucroException extends Exception{

    public MargemLucroException(){
        super("A margem de lucro deve ser sempre maior ou 20% ");
    }
}

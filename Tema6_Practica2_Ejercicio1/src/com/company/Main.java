/*
Crea una clase denominada Pelıcula con los siguientes atributos: t´ıtulo, ano, duracion en minutos y tipo. ´
Crea otra clase denominada Estudio con los siguientes atributos: nombre, ciudad, direccion, direccion web, fecha de fundacion, paıs y telefo- ´
nos.
Relacion: Una pelıcula es producida en uno o mas estudios. ´
En este ejercicio hay que mostrar el nombre del o de los estudios en
los que se ha producido la pelcula mas larga y el nombre del estudio ´
que mas pelıculas ha producido. */

package com.company;
import Clase.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Pelicula aPelicula[] = new Pelicula[10];
        aPelicula[0] = new Pelicula("Pelicula1", 2017, 94, "Terror");
        aPelicula[1] = new Pelicula("Pelicula2", 2014, 125, "Aventuras");
        aPelicula[2] = new Pelicula("Pelicula3", 2015, 101, "Ciencia Ficcion");
        aPelicula[3] = new Pelicula("Pelicula4", 2012, 115, "Terror");
        aPelicula[4] = new Pelicula("Pelicula5", 2019, 98, "Aventuras");
        aPelicula[5] = new Pelicula("Pelicula6", 2021, 87, "Comedia");
        aPelicula[6] = new Pelicula("Pelicula7", 2017, 122, "Comedia");
        aPelicula[7] = new Pelicula("Pelicula8", 2013, 91, "Aventuras");
        aPelicula[8] = new Pelicula("Pelicula9", 2020, 90, "Terror");
        aPelicula[9] = new Pelicula("Pelicula10", 2007, 144, "Comedia");
        aPelicula[10] = new Pelicula("Pelicula11", 2018, 112, "Aventuras");

        ArrayList<Estudio> aEstudios = new ArrayList();
        aEstudios.add(new Estudio("Estudio1", "Vitoria", "Calle Avenida Principal",
                "www.Estudio1.com", "19/12/2013","España",
                "999999999", aPelicula[0]));
        aEstudios.add(new Estudio("Estudio2", "Bilbao", "Calle Guggenheim",
                "www.Estudio2.com", "049/042/2013","España",
                "999999999", aPelicula[1]));

        /*
        ArrayList<Estudio> cuentasPelicula = new ArrayList();
        cuentasPelicula.add(aEstudios.get(0));
        cuentasPelicula.add(aEstudios.get(1));


        EstudioPelicula = new ArrayList();
        EstudioPelicula.add(aEstudios.get(1));


        aEstudios.get(1).setE(aPelicula[0]);
        aEstudios.get(2).setE(aPelicula[1]);
        */


        {

        }
    }
}
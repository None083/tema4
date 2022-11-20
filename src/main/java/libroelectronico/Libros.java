/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libroelectronico;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 *
 */
public class Libros {

    private String identificador;
    private String titulo;
    private int numeroPagina;
    private double memoria;
    private int paginaActual;

    public Libros() {
        this.identificador = RandomStringUtils.randomNumeric(3);
        this.titulo = "Don Quijote";
        this.numeroPagina = 1435;
        this.memoria = 5;
        this.paginaActual = 1;
    }

    public Libros(String identificador, String titulo, int numeroPagina, double memoria, int paginaActual) {

        this.identificador = RandomStringUtils.randomNumeric(3);

        this.titulo = titulo;

        if (numeroPagina < 0 || numeroPagina > 9999) {
            this.numeroPagina = 0;
        } else {
            this.numeroPagina = numeroPagina;
        }

        if (memoria < 0 || memoria > 10) {
            this.memoria = 0;
        } else {
            this.memoria = memoria;
        }

        if (paginaActual < 0 || paginaActual > numeroPagina) {
            this.paginaActual = 0;
        } else {
            this.paginaActual = paginaActual;
        }

    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        if (paginaActual > 0 && paginaActual < this.numeroPagina) {
            this.paginaActual = paginaActual;
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        if (numeroPagina > 0 && numeroPagina < 9999) {
            this.numeroPagina = numeroPagina;
        }
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        if (memoria > 0 && memoria < 10) {
            this.memoria = memoria;
        }
    }

    @Override
    public String toString() {
        return "libros{" + "identificador=" + identificador + ", titulo=" + titulo + ", numeroPagina=" + numeroPagina + ", memoria=" + memoria + ", paginaActual=" + paginaActual + '}';
    }

    public void pasaPagina() {
        if (this.paginaActual < this.numeroPagina) {
            this.paginaActual++;
        }

    }

    public void retrocederPagina() {
        if (this.paginaActual > 0) {
            this.paginaActual--;
        }

    }

    public void saltarPagina(int numeroSaltarPagina) {
        if (this.paginaActual + numeroSaltarPagina < this.numeroPagina && this.paginaActual + numeroSaltarPagina > 0) {
            this.paginaActual = this.paginaActual + numeroSaltarPagina;
        }

    }

}

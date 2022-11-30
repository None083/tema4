/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package series;

import java.util.Objects;

/**
 * Título, género (accion, comedia, sci-fi, drama), sinopsis, num temporadas, 
 * productor
 * 
 * 
 *
 */
// Declaracion de la clase
public class Serie {
    
    // Atributos de clase (static)
    
    // Atributos de instancia (no static)
    private String titulo;
    private String genero;
    private String sinopsis;
    private String productor;
    private int numeroTemporadas;
    private int numeroLikes;

    public Serie() {
        //Los atributos quedan inicializados con valores por defecto
        //Objetos apuntan a null
        //numero a cero
        //boolean a false
    }
    
    public Serie(String titulo, String genero, String sinopsis, String productor, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.numeroTemporadas = numeroTemporadas;
    }

    public Serie(String titulo, String genero, String sinopsis, String productor, int numeroTemporadas, int numeroLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroLikes = numeroLikes;
    }
    
    

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", sinopsis=" + sinopsis + ", productor=" + productor + ", numeroTemporadas=" + numeroTemporadas + ", numeroLikes=" + numeroLikes + '}';
    }
    
    public void darLike(){
        //no hace falta el this, pero se pone por diferenciar y no liar
        this.numeroLikes++;    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.genero);
        hash = 97 * hash + Objects.hashCode(this.sinopsis);
        hash = 97 * hash + Objects.hashCode(this.productor);
        hash = 97 * hash + this.numeroTemporadas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Serie other = (Serie) obj;
        
        if (this.numeroTemporadas != other.numeroTemporadas) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.sinopsis, other.sinopsis)) {
            return false;
        }
        return Objects.equals(this.productor, other.productor);
    }
    
    public int getLikes(){
        return numeroLikes;
    }
    
}
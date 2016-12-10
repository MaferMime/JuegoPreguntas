/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jm.Dominio;

/**
 *
 * @author DANIEL-PC
 */
public class Puntajes {
       private int puntaje_id;
       private int primer_nivel;
       private int segundo_nivel;
       private int tercer_nivel;

    /**
     * @return the puntaje_id
     */
       
       public Puntajes(){
           
       }
       
       public Puntajes(int primer_nivel, int segundo_nivel, int tercer_nivel){
           this.primer_nivel=primer_nivel;
           this.segundo_nivel=segundo_nivel;
           this.tercer_nivel=tercer_nivel;
       }
       
    public int getPuntaje_id() {
        return puntaje_id;
    }

    /**
     * @param puntaje_id the puntaje_id to set
     */
    public void setPuntaje_id(int puntaje_id) {
        this.puntaje_id = puntaje_id;
    }

    /**
     * @return the primer_nivel
     */
    public int getPrimer_nivel() {
        return primer_nivel;
    }

    /**
     * @param primer_nivel the primer_nivel to set
     */
    public void setPrimer_nivel(int primer_nivel) {
        this.primer_nivel = primer_nivel;
    }

    /**
     * @return the segundo_nivel
     */
    public int getSegundo_nivel() {
        return segundo_nivel;
    }

    /**
     * @param segundo_nivel the segundo_nivel to set
     */
    public void setSegundo_nivel(int segundo_nivel) {
        this.segundo_nivel = segundo_nivel;
    }

    /**
     * @return the tercer_nivel
     */
    public int getTercer_nivel() {
        return tercer_nivel;
    }

    /**
     * @param tercer_nivel the tercer_nivel to set
     */
    public void setTercer_nivel(int tercer_nivel) {
        this.tercer_nivel = tercer_nivel;
    }

    @Override
    public String toString() {
        return "Puntajes{" + "primer_nivel=" + primer_nivel + ", segundo_nivel=" + segundo_nivel + ", tercer_nivel=" + tercer_nivel + '}';
    }
       
       
    
}

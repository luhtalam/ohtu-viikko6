/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author luhtalam
 */
public class Erotus implements Komento {
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Sovelluslogiikka logiikka;
    private int edellinen;

    
    public Erotus(Sovelluslogiikka logiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.logiikka = logiikka;
        this.edellinen = 0;
    }
    
    @Override
    public void suorita() {
        int arvo = Integer.parseInt(syotekentta.getText());
        edellinen = arvo;
        logiikka.miinus(arvo);
        int tulos = logiikka.tulos();
        syotekentta.setText("");
        tuloskentta.setText("" + tulos);
    }

    @Override
    public void peru() {
        tuloskentta.setText("" + edellinen);
    }

}

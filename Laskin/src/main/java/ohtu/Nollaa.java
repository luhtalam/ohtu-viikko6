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
public class Nollaa implements Komento {

    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Sovelluslogiikka logiikka;
    private int edellinen;

    public Nollaa(Sovelluslogiikka logiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.logiikka = logiikka;
        this.edellinen = 0;
    }

    @Override
    public void peru() {
        tuloskentta.setText(""+edellinen);
    }

    @Override
    public void suorita() {
        edellinen = Integer.parseInt(tuloskentta.getText());
        logiikka.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("0");
    }

}

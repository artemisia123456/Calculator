/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulačka;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author MSI
 */
public class Okno {

    private JFrame win;
    private JButton rovnasa;
    private JButton plus;
    private JButton minus;
    private JButton krat;
    private JButton delene;
    private JButton jedna;
    private JButton dva;
    private JButton tri;
    private JButton štyri;
    private JButton päť;
    private JButton šesť;
    private JButton sedem;
    private JButton osem;
    private JButton deväť;
    private JButton nula;
    private JTextField pole;
    private JButton delete;
    private JButton clear;
    private JButton dot;

    Okno(int vyska, int sirka) {
        win = new JFrame();
        win.setTitle("kalkulačka");
        win.setBounds(100, 100, sirka, vyska);
        win.setLayout(null);
        pridajTlačidlo();
        pridajTextovepole();
        akcia();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);

    }

    public void pridajTlačidlo() {
        rovnasa = new JButton();
        rovnasa.setText("=");
        rovnasa.setBounds(245, 450, 75, 55);
        win.add(rovnasa);

        plus = new JButton();
        plus.setText("+");
        plus.setBounds(245, 390, 75, 55);
        win.add(plus);

        minus = new JButton();
        minus.setText("-");
        minus.setBounds(245, 330, 75, 55);
        win.add(minus);

        krat = new JButton();
        krat.setText("*");
        krat.setBounds(245, 270, 75, 55);
        win.add(krat);

        delene = new JButton();
        delene.setText("/");
        delene.setBounds(245, 210, 75, 55);
        win.add(delene);

        jedna = new JButton();
        jedna.setText("1");
        jedna.setBounds(5, 390, 75, 55);
        win.add(jedna);

        dva = new JButton();
        dva.setText("2");
        dva.setBounds(85, 390, 75, 55);
        win.add(dva);

        tri = new JButton();
        tri.setText("3");
        tri.setBounds(165, 390, 75, 55);
        win.add(tri);

        štyri = new JButton();
        štyri.setText("4");
        štyri.setBounds(5, 330, 75, 55);
        win.add(štyri);

        päť = new JButton();
        päť.setText("5");
        päť.setBounds(85, 330, 75, 55);
        win.add(päť);

        šesť = new JButton();
        šesť.setText("6");
        šesť.setBounds(165, 330, 75, 55);
        win.add(šesť);

        sedem = new JButton();
        sedem.setText("7");
        sedem.setBounds(5, 270, 75, 55);
        win.add(sedem);

        osem = new JButton();
        osem.setText("8");
        osem.setBounds(85, 270, 75, 55);
        win.add(osem);

        deväť = new JButton();
        deväť.setText("9");
        deväť.setBounds(165, 270, 75, 55);
        win.add(deväť);

        nula = new JButton();
        nula.setText("0");
        nula.setBounds(85, 450, 75, 55);
        win.add(nula);

        delete = new JButton();
        delete.setText("⌫");
        delete.setBounds(245, 150, 75, 55);
        win.add(delete);

        clear = new JButton();
        clear.setText("CE");
        clear.setBounds(165, 150, 75, 55);
        win.add(clear);

        dot = new JButton();
        dot.setText(".");
        dot.setBounds(165, 450, 75, 55);
        win.add(dot);
    }

    public void pridajTextovepole() {
        pole = new JTextField();
        pole.setBounds(5, 50, 315, 70);
        pole.setFont(new Font("TimesRoman", Font.PLAIN, 28));
        pole.setHorizontalAlignment(SwingConstants.RIGHT);
        win.add(pole);
    }

    public void akcia() {
        rovnasa.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                vypocitaj();
            }
        });
        plus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("+");
            }
        });
        minus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("-");
            }
        });
        krat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("*");
            }
        });
        delene.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("/");
            }
        });
        jedna.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("1");
            }
        });
        dva.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("2");
            }
        });
        tri.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("3");
            }
        });
        štyri.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("4");
            }
        });
        päť.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("5");
            }
        });
        šesť.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("6");
            }
        });
        sedem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("7");
            }
        });
        osem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("8");
            }
        });
        deväť.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("9");
            }
        });
        nula.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak("0");
            }
        });
        delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                vymazZnak();
            }
        });
        clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                vymazVsetko();
            }
        });

        dot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pridajZnak(".");
            }
        });

    }

    public void vypocitaj() {
        double celkovyVysledok = 0;
        String priklad = "";
        priklad = pole.getText();
        //5 + 9 - 7 * 2
        String[] hodnoty = priklad.split(" ");
        for (int i = 0; i < hodnoty.length; i++) {
            if (znamiekoYesorNO(hodnoty[i])) {
                if (i == 1) {
                    if ("+".equals(hodnoty[i])) {
                        celkovyVysledok = zmen(hodnoty[i - 1]) + zmen(hodnoty[i + 1]);
                    }
                    if ("-".equals(hodnoty[i])) {
                        celkovyVysledok = zmen(hodnoty[i - 1]) - zmen(hodnoty[i + 1]);
                    }
                    if ("*".equals(hodnoty[i])) {
                        celkovyVysledok = zmen(hodnoty[i - 1]) * zmen(hodnoty[i + 1]);
                    }
                    if ("/".equals(hodnoty[i])) {
                        celkovyVysledok = zmen(hodnoty[i - 1]) / zmen(hodnoty[i + 1]);
                    }
                } else {
                    if ("+".equals(hodnoty[i])) {
                        celkovyVysledok = celkovyVysledok + zmen(hodnoty[i + 1]);
                    }
                    if ("-".equals(hodnoty[i])) {
                        celkovyVysledok = celkovyVysledok - zmen(hodnoty[i + 1]);
                    }
                    if ("*".equals(hodnoty[i])) {
                        celkovyVysledok = celkovyVysledok * zmen(hodnoty[i + 1]);
                    }
                    if ("/".equals(hodnoty[i])) {
                        celkovyVysledok = celkovyVysledok / zmen(hodnoty[i + 1]);
                    }

                }

            }

        }
        if ((celkovyVysledok % 1) == 0) {
            int i = (int) celkovyVysledok;
            pole.setText(i + "");
        } else {
            pole.setText(celkovyVysledok + "");
        }

    }

    public boolean znamiekoYesorNO(String g) {
        if ("+".equals(g) || "-".equals(g)
                || "/".equals(g) || "*".equals(g)) {
            return true;
        }
        return false;
    }

    public double zmen(String t) {
        return Double.parseDouble(t);
    }

    public void pridajZnak(String znak) { // 9 
        if (znamiekoYesorNO(znak)) {
            if ("".equals(pole.getText())) {
                pole.setText(pole.getText() + znak);
            } else if (pole.getText().length() >= 2) {
                if (znamiekoYesorNO(pole.getText().charAt(pole.getText().length() - 2) + "")) {
                    pole.setText(pole.getText() + znak);
                }
            } else {
                pole.setText(pole.getText() + " " + znak + " ");
            }
        } else {
            pole.setText(pole.getText() + znak);
        }
    }

    public void vymazZnak() {
        String textVpoli = pole.getText();
        pole.setText(method(textVpoli));
    }

    public String method(String str) {
        if (str != null && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public void vymazVsetko() {
        pole.setText("");

    }

}

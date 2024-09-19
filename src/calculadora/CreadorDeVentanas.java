package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreadorDeVentanas extends JFrame {

    public JPanel panel;
    JTextField Resultado = new JTextField();
    JTextField valor1 = new JTextField();
    JLabel resultado = new JLabel();
    int valor2 = 0;
    char simbolo = ' ';

    public CreadorDeVentanas() {
        this.setSize(385, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        Componentes();
    }

    private void Componentes() {
        Paneles();
        Botones();
        Texto();
    }

    private void Paneles() {
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }

    public void Texto() {
        valor1.setBounds(30, 60, 310, 40);
        panel.add(valor1);
        valor1.repaint();
    }

    private void Botones() {
        JButton boton1 = new JButton("1");
        boton1.setBounds(30, 120, 70, 30);
        panel.add(boton1);
        boton1.repaint();
        ActionListener Bot1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "1";
                valor1.setText(union);
            }
        };
        boton1.addActionListener(Bot1);
        JButton boton2 = new JButton("2");
        boton2.setBounds(110, 120, 70, 30);
        panel.add(boton2);
        boton2.repaint();
        ActionListener Bot2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "2";
                valor1.setText(union);
            }
        };
        boton2.addActionListener(Bot2);
        JButton boton3 = new JButton("3");
        boton3.setBounds(190, 120, 70, 30);
        panel.add(boton3);
        boton3.repaint();
        ActionListener Bot3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "3";
                valor1.setText(union);
            }
        };
        boton3.addActionListener(Bot3);
        JButton botonMas = new JButton("+");
        botonMas.setBounds(270, 120, 70, 30);
        panel.add(botonMas);
        botonMas.repaint();
        ActionListener Suma = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (valor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    valor2 += Integer.parseInt(valor1.getText());
                    simbolo = '+';
                    valor1.setText("");
                }
            }
        };
        botonMas.addActionListener(Suma);
        JButton boton4 = new JButton("4");
        boton4.setBounds(30, 160, 70, 30);
        panel.add(boton4);
        boton4.repaint();
        ActionListener Bot4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "4";
                valor1.setText(union);
            }
        };
        boton4.addActionListener(Bot4);
        JButton boton5 = new JButton("5");
        boton5.setBounds(110, 160, 70, 30);
        panel.add(boton5);
        boton5.repaint();
        ActionListener Bot5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "5";
                valor1.setText(union);
            }
        };
        boton5.addActionListener(Bot5);
        JButton boton6 = new JButton("6");
        boton6.setBounds(190, 160, 70, 30);
        panel.add(boton6);
        boton6.repaint();
        ActionListener Bot6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "6";
                valor1.setText(union);
            }
        };
        boton6.addActionListener(Bot6);
        JButton botonMenos = new JButton("-");
        botonMenos.setBounds(270, 160, 70, 30);
        panel.add(botonMenos);
        botonMenos.repaint();
        ActionListener Resta = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (valor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (valor2 == 0) {
                        valor2 = Integer.parseInt(valor1.getText());
                    } else {
                        valor2 -= Integer.parseInt(valor1.getText());
                    }
                    simbolo = '-';
                    valor1.setText("");
                }
            }
        };
        botonMenos.addActionListener(Resta);
        JButton boton7 = new JButton("7");
        boton7.setBounds(30, 200, 70, 30);
        panel.add(boton7);
        boton7.repaint();
        ActionListener Bot7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "7";
                valor1.setText(union);
            }
        };
        boton7.addActionListener(Bot7);
        JButton boton8 = new JButton("8");
        boton8.setBounds(110, 200, 70, 30);
        panel.add(boton8);
        boton8.repaint();
        ActionListener Bot8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "8";
                valor1.setText(union);
            }
        };
        boton8.addActionListener(Bot8);
        JButton boton9 = new JButton("9");
        boton9.setBounds(190, 200, 70, 30);
        panel.add(boton9);
        boton9.repaint();
        ActionListener Bot9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "9";
                valor1.setText(union);
            }
        };
        boton9.addActionListener(Bot9);
        JButton botonMult = new JButton("×");
        botonMult.setBounds(270, 200, 70, 30);
        panel.add(botonMult);
        botonMult.repaint();
        ActionListener Multi = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (valor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    valor2 *= Integer.parseInt(valor1.getText());
                    simbolo = '×';
                    valor1.setText("");
                }
            }
        };
        botonMult.addActionListener(Multi);
        JButton boton0 = new JButton("0");
        boton0.setBounds(30, 240, 70, 30);
        panel.add(boton0);
        boton0.repaint();
        ActionListener Bot0 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = valor1.getText() + "0";
                valor1.setText(union);
            }
        };
        boton0.addActionListener(Bot0);
        JButton botonPunto = new JButton(".");
        botonPunto.setBounds(110, 240, 70, 30);
        panel.add(botonPunto);
        botonPunto.repaint();
        ActionListener Puntos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (valor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor");
                } else {
                    String union = valor1.getText() + ".";
                    valor1.setText(union);
                }
            }
        };
        botonPunto.addActionListener(Puntos);
        JButton botonBorrar = new JButton("C");
        botonBorrar.setBounds(190, 240, 70, 30);
        panel.add(botonBorrar);
        botonBorrar.repaint();
        ActionListener Borrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = "";
                for (int i = 0; i < valor1.getText().length() - 1; i++) {
                    union = union + valor1.getText().charAt(i);
                }
                valor1.setText(union);
            }
        };
        botonBorrar.addActionListener(Borrar);
        JButton botonDiv = new JButton("÷");
        botonDiv.setBounds(270, 240, 70, 30);
        panel.add(botonDiv);
        botonDiv.repaint();
        ActionListener Divi = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (valor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (valor2 == 0) {
                        valor2 = Integer.parseInt(valor1.getText());;
                    } else {
                        valor2 /= Integer.parseInt(valor1.getText());
                    }
                    simbolo = '÷';
                    valor1.setText("");
                }
            }
        };
        botonDiv.addActionListener(Divi);
        JButton botonIgual = new JButton("=");
        botonIgual.setBounds(30, 280, 230, 30);
        panel.add(botonIgual);
        botonIgual.repaint();
        ActionListener Resultado = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int res = 0;
                if (simbolo == '+') {
                    res = valor2 + Integer.parseInt(valor1.getText());
                } else if (simbolo == '-') {
                    res = valor2 - Integer.parseInt(valor1.getText());
                }
                valor1.setText(String.valueOf(res));
                valor2 = 0;
            }
        };
        botonIgual.addActionListener(Resultado);
        JButton botonRaiz = new JButton("√");
        botonRaiz.setBounds(270, 280, 70, 30);
        panel.add(botonRaiz);
        botonRaiz.repaint();
        ActionListener Raiz = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (valor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (Double.parseDouble(valor1.getText()) >= 0) {
                        double total = Math.sqrt(Double.parseDouble(valor1.getText()));
                        valor1.setText(String.valueOf(total));
                        valor2 = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Math Error");
                    }
                }
            }
        };
        botonRaiz.addActionListener(Raiz);

    }
}

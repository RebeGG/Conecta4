package conecta4_cliente.Vista;

import conecta4_cliente.Modelo.Cliente;
import javax.swing.JButton;

//  Universidad Nacional
//  Facultad de Ciencias Exactas y Naturales
//  Escuela de Informática
//  
//     Práctica #4
//      (Vista)
//
//  Autores: Rebecca Garita Gutiérrez
//           María Fernanda González Arias
//
//  III Ciclo 2019

public class Vista extends javax.swing.JFrame {

    private JButton[][] botones = new JButton[6][7];
    private Cliente cliente;

    public Vista() {
        setVisible(true);
        try {
            initComponents();
            configurar();
            cliente = new Cliente(this);
            Thread hilo = new Thread(cliente);
            hilo.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void configurar() {
        botones[0][0] = btn00;
        botones[0][1] = btn01;
        botones[0][2] = btn02;
        botones[0][3] = btn03;
        botones[0][4] = btn04;
        botones[0][5] = btn05;
        botones[0][6] = btn06;

        botones[1][0] = btn10;
        botones[1][1] = btn11n;
        botones[1][2] = btn12n;
        botones[1][3] = btn13n;
        botones[1][4] = btn14n;
        botones[1][5] = btn15n;
        botones[1][6] = btn16n;

        botones[2][0] = btn20n;
        botones[2][1] = btn21n;
        botones[2][2] = btn22n;
        botones[2][3] = btn23n;
        botones[2][4] = btn24n;
        botones[2][5] = btn25n;
        botones[2][6] = btn26n;

        botones[3][0] = btn30n;
        botones[3][1] = btn31n;
        botones[3][2] = btn32n;
        botones[3][3] = btn33n;
        botones[3][4] = btn34n;
        botones[3][5] = btn35n;
        botones[3][6] = btn36n;

        botones[4][0] = btn40n;
        botones[4][1] = btn41n;
        botones[4][2] = btn42n;
        botones[4][3] = btn43n;
        botones[4][4] = btn44n;
        botones[4][5] = btn45n;
        botones[4][6] = btn46n;

        botones[5][0] = btn50;
        botones[5][1] = btn51n;
        botones[5][2] = btn52n;
        botones[5][3] = btn53n;
        botones[5][4] = btn54n;
        botones[5][5] = btn55n;
        botones[5][6] = btn56n;

    }

    public void cambioTexto(String cad) {
        lblTurno.setText(cad);
    }

    public JButton[][] getBotones() {
        return botones;
    }

    //Cuando se preciona un boton enviamos los datos de la jugada al servidor (fila y columna del boton precionado)
    public void enviarTurno(int f, int c) {
        cliente.enviarTurno(f, c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn30n = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn13n = new javax.swing.JButton();
        btn20n = new javax.swing.JButton();
        btn11n = new javax.swing.JButton();
        btn40n = new javax.swing.JButton();
        btn51n = new javax.swing.JButton();
        btn52n = new javax.swing.JButton();
        btn43n = new javax.swing.JButton();
        btn44n = new javax.swing.JButton();
        btn54n = new javax.swing.JButton();
        btn55n = new javax.swing.JButton();
        btn56n = new javax.swing.JButton();
        btn21n = new javax.swing.JButton();
        btn31n = new javax.swing.JButton();
        btn22n = new javax.swing.JButton();
        btn32n = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn12n = new javax.swing.JButton();
        btn14n = new javax.swing.JButton();
        btn15n = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn16n = new javax.swing.JButton();
        btn26n = new javax.swing.JButton();
        btn25n = new javax.swing.JButton();
        btn24n = new javax.swing.JButton();
        btn23n = new javax.swing.JButton();
        btn36n = new javax.swing.JButton();
        btn35n = new javax.swing.JButton();
        btn34n = new javax.swing.JButton();
        btn33n = new javax.swing.JButton();
        btn46n = new javax.swing.JButton();
        btn42n = new javax.swing.JButton();
        btn45n = new javax.swing.JButton();
        btn41n = new javax.swing.JButton();
        btn53n = new javax.swing.JButton();
        lblTurno = new javax.swing.JLabel();
        btn50 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conecta 4");

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        btn30n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn30n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30nActionPerformed(evt);
            }
        });

        btn00.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btn01.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btn10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn13n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn13n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13nActionPerformed(evt);
            }
        });

        btn20n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn20n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20nActionPerformed(evt);
            }
        });

        btn11n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn11n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11nActionPerformed(evt);
            }
        });

        btn40n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn40n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40nActionPerformed(evt);
            }
        });

        btn51n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn51n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn51nActionPerformed(evt);
            }
        });

        btn52n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn52n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn52nActionPerformed(evt);
            }
        });

        btn43n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn43n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43nActionPerformed(evt);
            }
        });

        btn44n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn44n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44nActionPerformed(evt);
            }
        });

        btn54n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn54n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn54nActionPerformed(evt);
            }
        });

        btn55n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn55n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn55nActionPerformed(evt);
            }
        });

        btn56n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn56n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn56nActionPerformed(evt);
            }
        });

        btn21n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn21n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21nActionPerformed(evt);
            }
        });

        btn31n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn31n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31nActionPerformed(evt);
            }
        });

        btn22n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn22n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22nActionPerformed(evt);
            }
        });

        btn32n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn32n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32nActionPerformed(evt);
            }
        });

        btn03.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });

        btn04.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn04ActionPerformed(evt);
            }
        });

        btn05.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn05ActionPerformed(evt);
            }
        });

        btn06.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn06ActionPerformed(evt);
            }
        });

        btn12n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn12n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12nActionPerformed(evt);
            }
        });

        btn14n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn14n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14nActionPerformed(evt);
            }
        });

        btn15n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn15n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15nActionPerformed(evt);
            }
        });

        btn02.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn16n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn16n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16nActionPerformed(evt);
            }
        });

        btn26n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn26n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26nActionPerformed(evt);
            }
        });

        btn25n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn25n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25nActionPerformed(evt);
            }
        });

        btn24n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn24n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24nActionPerformed(evt);
            }
        });

        btn23n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn23n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23nActionPerformed(evt);
            }
        });

        btn36n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn36n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36nActionPerformed(evt);
            }
        });

        btn35n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn35n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35nActionPerformed(evt);
            }
        });

        btn34n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn34n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34nActionPerformed(evt);
            }
        });

        btn33n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn33n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33nActionPerformed(evt);
            }
        });

        btn46n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn46n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46nActionPerformed(evt);
            }
        });

        btn42n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn42n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42nActionPerformed(evt);
            }
        });

        btn45n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn45n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45nActionPerformed(evt);
            }
        });

        btn41n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn41n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41nActionPerformed(evt);
            }
        });

        btn53n.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn53n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn53nActionPerformed(evt);
            }
        });

        lblTurno.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(255, 255, 255));
        lblTurno.setText("Turno");

        btn50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });

        btnReiniciar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn20n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn21n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(btn22n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn23n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn24n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn25n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn30n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn31n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn32n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn33n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn34n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn35n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn40n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn41n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn42n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn43n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn44n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn45n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn46n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn36n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn26n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn11n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn12n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn13n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn14n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn15n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn16n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn51n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn52n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn53n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn54n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn55n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn56n, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReiniciar))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn21n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn26n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn25n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn24n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn23n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn30n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn36n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn35n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn34n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn33n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn32n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn42n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn43n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn44n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn45n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn52n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn53n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn54n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn55n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn40n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn46n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn41n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btn56n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn51n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(btn31n, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTurno)
                    .addComponent(btnReiniciar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn31nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31nActionPerformed
        enviarTurno(3, 1);
    }//GEN-LAST:event_btn31nActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        enviarTurno(0, 0);
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        enviarTurno(0, 1);
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        enviarTurno(0, 2);
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        enviarTurno(0, 3);
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn04ActionPerformed
        enviarTurno(0, 4);
    }//GEN-LAST:event_btn04ActionPerformed

    private void btn05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn05ActionPerformed
        enviarTurno(0, 5);
    }//GEN-LAST:event_btn05ActionPerformed

    private void btn06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn06ActionPerformed
        enviarTurno(0, 6);
    }//GEN-LAST:event_btn06ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        enviarTurno(1, 0);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11nActionPerformed
        enviarTurno(1, 1);
    }//GEN-LAST:event_btn11nActionPerformed

    private void btn12nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12nActionPerformed
        enviarTurno(1, 2);
    }//GEN-LAST:event_btn12nActionPerformed

    private void btn13nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13nActionPerformed
        enviarTurno(1, 3);
    }//GEN-LAST:event_btn13nActionPerformed

    private void btn14nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14nActionPerformed
        enviarTurno(1, 4);
    }//GEN-LAST:event_btn14nActionPerformed

    private void btn15nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15nActionPerformed
        enviarTurno(1, 5);
    }//GEN-LAST:event_btn15nActionPerformed

    private void btn16nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16nActionPerformed
        enviarTurno(1, 6);
    }//GEN-LAST:event_btn16nActionPerformed

    private void btn20nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20nActionPerformed
        enviarTurno(2, 0);
    }//GEN-LAST:event_btn20nActionPerformed

    private void btn21nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21nActionPerformed
        enviarTurno(2, 1);
    }//GEN-LAST:event_btn21nActionPerformed

    private void btn22nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22nActionPerformed
        enviarTurno(2, 2);
    }//GEN-LAST:event_btn22nActionPerformed

    private void btn23nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23nActionPerformed
        enviarTurno(2, 3);
    }//GEN-LAST:event_btn23nActionPerformed

    private void btn24nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24nActionPerformed
        enviarTurno(2, 4);
    }//GEN-LAST:event_btn24nActionPerformed

    private void btn25nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25nActionPerformed
        enviarTurno(2, 5);
    }//GEN-LAST:event_btn25nActionPerformed

    private void btn26nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26nActionPerformed
        enviarTurno(2, 6);
    }//GEN-LAST:event_btn26nActionPerformed

    private void btn30nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30nActionPerformed
        enviarTurno(3, 0);
    }//GEN-LAST:event_btn30nActionPerformed

    private void btn32nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32nActionPerformed
        enviarTurno(3, 2);
    }//GEN-LAST:event_btn32nActionPerformed

    private void btn33nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33nActionPerformed
        enviarTurno(3, 3);
    }//GEN-LAST:event_btn33nActionPerformed

    private void btn34nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34nActionPerformed
        enviarTurno(3, 4);
    }//GEN-LAST:event_btn34nActionPerformed

    private void btn35nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35nActionPerformed
        enviarTurno(3, 5);
    }//GEN-LAST:event_btn35nActionPerformed

    private void btn36nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36nActionPerformed
        enviarTurno(3, 6);
    }//GEN-LAST:event_btn36nActionPerformed

    private void btn40nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40nActionPerformed
        enviarTurno(4, 0);
    }//GEN-LAST:event_btn40nActionPerformed

    private void btn41nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41nActionPerformed
        enviarTurno(4, 1);
    }//GEN-LAST:event_btn41nActionPerformed

    private void btn42nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42nActionPerformed
        enviarTurno(4, 2);
    }//GEN-LAST:event_btn42nActionPerformed

    private void btn43nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43nActionPerformed
        enviarTurno(4, 3);
    }//GEN-LAST:event_btn43nActionPerformed

    private void btn44nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44nActionPerformed
        enviarTurno(4, 4);
    }//GEN-LAST:event_btn44nActionPerformed

    private void btn45nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45nActionPerformed
        enviarTurno(4, 5);
    }//GEN-LAST:event_btn45nActionPerformed

    private void btn46nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46nActionPerformed
        enviarTurno(4, 6);
    }//GEN-LAST:event_btn46nActionPerformed

    private void btn51nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51nActionPerformed
        enviarTurno(5, 1);
    }//GEN-LAST:event_btn51nActionPerformed

    private void btn52nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn52nActionPerformed
        enviarTurno(5, 2);
    }//GEN-LAST:event_btn52nActionPerformed

    private void btn53nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn53nActionPerformed
        enviarTurno(5, 3);
    }//GEN-LAST:event_btn53nActionPerformed

    private void btn54nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn54nActionPerformed
        enviarTurno(5, 4);
    }//GEN-LAST:event_btn54nActionPerformed

    private void btn55nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn55nActionPerformed
        enviarTurno(5, 5);
    }//GEN-LAST:event_btn55nActionPerformed

    private void btn56nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn56nActionPerformed
        enviarTurno(5, 6);
    }//GEN-LAST:event_btn56nActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        enviarTurno(5, 0);
    }//GEN-LAST:event_btn50ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
       new Vista().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn05;
    private javax.swing.JButton btn06;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11n;
    private javax.swing.JButton btn12n;
    private javax.swing.JButton btn13n;
    private javax.swing.JButton btn14n;
    private javax.swing.JButton btn15n;
    private javax.swing.JButton btn16n;
    private javax.swing.JButton btn20n;
    private javax.swing.JButton btn21n;
    private javax.swing.JButton btn22n;
    private javax.swing.JButton btn23n;
    private javax.swing.JButton btn24n;
    private javax.swing.JButton btn25n;
    private javax.swing.JButton btn26n;
    private javax.swing.JButton btn30n;
    private javax.swing.JButton btn31n;
    private javax.swing.JButton btn32n;
    private javax.swing.JButton btn33n;
    private javax.swing.JButton btn34n;
    private javax.swing.JButton btn35n;
    private javax.swing.JButton btn36n;
    private javax.swing.JButton btn40n;
    private javax.swing.JButton btn41n;
    private javax.swing.JButton btn42n;
    private javax.swing.JButton btn43n;
    private javax.swing.JButton btn44n;
    private javax.swing.JButton btn45n;
    private javax.swing.JButton btn46n;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51n;
    private javax.swing.JButton btn52n;
    private javax.swing.JButton btn53n;
    private javax.swing.JButton btn54n;
    private javax.swing.JButton btn55n;
    private javax.swing.JButton btn56n;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables
}

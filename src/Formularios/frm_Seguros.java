package Formularios;

import Entidades.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Entidades.Ordenamiento.OrdenarPagosAsc;
import java.text.DecimalFormat;

public class frm_Seguros extends javax.swing.JFrame {

    //Instancias
    private Double e;
    private int numPaciente;
    private double totalPaciente, primerCuartil, segundoCuartil, tercerCuartil, cuartoCuartil, promedioGlobal, minimoGlobal, totalGlobal, maximoGlobal;
    DefaultTableModel modeloTabla;
    Usuario usuario;
    Cobertura cobertura;
    ArrayList<Usuario> lUsuarios;
    ArrayList<Double> lPagos;
    DecimalFormat df = new DecimalFormat("#.00");

    public frm_Seguros() {
        initComponents();
        this.showFrame();
        this.lUsuarios = new ArrayList<>();
        this.lPagos = new ArrayList<>();
        this.numPaciente = 0;
    }

    private void showFrame() {
        this.setEnabled(true);
        this.setVisible(true);
        this.setTitle("CentroSeguros - SEGUROS MEDICOS");
        this.setLocationRelativeTo(null);
        this.minimoGlobal = 6000;
        this.maximoGlobal = 0;
        this.promedioGlobal = 0;
        this.totalGlobal = 0;
    }
    
    private void actualizarDatosGlobales(){
        if(this.totalPaciente > this.maximoGlobal){
            this.maximoGlobal = this.totalPaciente;
            this.txtMaximoGlobal.setText("$ " + this.maximoGlobal );
        }
        if(this.totalPaciente < this.minimoGlobal){
            this.minimoGlobal = this.totalPaciente;
            this.txtMinimoGlobal.setText("$ " +this.minimoGlobal);
        }
        this.totalGlobal += this.totalPaciente;
        this.txtPromedioGlobal.setText("$ " + df.format(this.totalGlobal / this.numPaciente));
        this.txtTotalGlobal.setText("$ " + this.totalGlobal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngArea = new javax.swing.ButtonGroup();
        jpRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ffId = new javax.swing.JFormattedTextField();
        ffCelular = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chbCoberturaDental = new javax.swing.JCheckBox();
        chbAmbulancia = new javax.swing.JCheckBox();
        chbPsiquiatria = new javax.swing.JCheckBox();
        chbTransplante = new javax.swing.JCheckBox();
        chbTratamiento = new javax.swing.JCheckBox();
        chbDomiciliario = new javax.swing.JCheckBox();
        chbProtesis = new javax.swing.JCheckBox();
        chbMaternidad = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        rbnElSalvador = new javax.swing.JRadioButton();
        rbnCA = new javax.swing.JRadioButton();
        rbnInternational = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnRegistrarAsegurado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAsegurados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCoberturasCliente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPrimerCuartil = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtSegundoCuartil = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtTercerCuartil = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtCuartoCuartil = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMaximoGlobal = new javax.swing.JTextField();
        txtMinimoGlobal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPromedioGlobal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTotalGlobal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpRegistro.setPreferredSize(new java.awt.Dimension(1079, 250));

        jLabel1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        txtApellido.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel3.setText("DUI");

        try {
            ffId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ffId.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N

        try {
            ffCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ffCelular.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel4.setText("Número Celular");

        jLabel5.setFont(new java.awt.Font("FreeSans", 1, 16)); // NOI18N
        jLabel5.setText("Coberturas");

        chbCoberturaDental.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        chbCoberturaDental.setText("Cobertura Dental");
        chbCoberturaDental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbCoberturaDentalActionPerformed(evt);
            }
        });

        chbAmbulancia.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        chbAmbulancia.setText("Ambulancia");
        chbAmbulancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAmbulanciaActionPerformed(evt);
            }
        });

        chbPsiquiatria.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        chbPsiquiatria.setText("Psiquiatría Profesional");
        chbPsiquiatria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPsiquiatriaActionPerformed(evt);
            }
        });

        chbTransplante.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        chbTransplante.setText("Transplante de Organos");
        chbTransplante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbTransplanteActionPerformed(evt);
            }
        });

        chbTratamiento.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        chbTratamiento.setText("Tratamiendo de Sida");
        chbTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbTratamientoActionPerformed(evt);
            }
        });

        chbDomiciliario.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        chbDomiciliario.setText("Tratamiendo Domicilario");
        chbDomiciliario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbDomiciliarioActionPerformed(evt);
            }
        });

        chbProtesis.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        chbProtesis.setText("Protesis de miembros inferiores y superiores");
        chbProtesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbProtesisActionPerformed(evt);
            }
        });

        chbMaternidad.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        chbMaternidad.setText("Maternidad");
        chbMaternidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbMaternidadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("FreeSans", 3, 16)); // NOI18N
        jLabel6.setText("Registrar Asegurado");

        rbnElSalvador.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        rbnElSalvador.setText("Solo El Salvador");

        rbnCA.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        rbnCA.setText("Toda Centro America");

        rbnInternational.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        rbnInternational.setText("El Resto del Mundo");

        jLabel7.setFont(new java.awt.Font("FreeSans", 1, 16)); // NOI18N
        jLabel7.setText("Area demografica disponible");

        jLabel8.setFont(new java.awt.Font("FreeSans", 1, 16)); // NOI18N
        jLabel8.setText("Precio");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        txtPrecio.setText("$ 0.0");

        btnRegistrarAsegurado.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btnRegistrarAsegurado.setText("Registrar");
        btnRegistrarAsegurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAseguradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ffId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(chbCoberturaDental)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbAmbulancia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbPsiquiatria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbTransplante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbTratamiento))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(chbDomiciliario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbProtesis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbMaternidad)))
                .addGap(18, 18, 18)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(3, 3, 3)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbnCA)
                            .addComponent(rbnElSalvador)
                            .addComponent(rbnInternational)
                            .addComponent(btnRegistrarAsegurado))
                        .addGap(26, 26, 26)))
                .addGap(30, 30, 30))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(ffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(ffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chbCoberturaDental)
                            .addComponent(chbAmbulancia)
                            .addComponent(chbPsiquiatria)
                            .addComponent(chbTransplante)
                            .addComponent(chbTratamiento)))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(rbnElSalvador)
                        .addGap(9, 9, 9)
                        .addComponent(rbnCA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnInternational)))
                .addGap(18, 18, 18)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbDomiciliario)
                    .addComponent(chbProtesis)
                    .addComponent(chbMaternidad)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarAsegurado)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jpRegistro, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1013, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1094, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jtAsegurados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DUI", "Núm Celular", "Coste Anual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAsegurados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtAsegurados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAseguradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAsegurados);
        if (jtAsegurados.getColumnModel().getColumnCount() > 0) {
            jtAsegurados.getColumnModel().getColumn(0).setResizable(false);
            jtAsegurados.getColumnModel().getColumn(1).setResizable(false);
            jtAsegurados.getColumnModel().getColumn(2).setResizable(false);
            jtAsegurados.getColumnModel().getColumn(2).setHeaderValue("Núm Celular");
            jtAsegurados.getColumnModel().getColumn(3).setResizable(false);
            jtAsegurados.getColumnModel().getColumn(3).setHeaderValue("Coste Anual");
        }

        jtCoberturasCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coberturas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtCoberturasCliente);
        if (jtCoberturasCliente.getColumnModel().getColumnCount() > 0) {
            jtCoberturasCliente.getColumnModel().getColumn(0).setResizable(false);
        }

        jtPrimerCuartil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Costo Anual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtPrimerCuartil);
        if (jtPrimerCuartil.getColumnModel().getColumnCount() > 0) {
            jtPrimerCuartil.getColumnModel().getColumn(0).setResizable(false);
            jtPrimerCuartil.getColumnModel().getColumn(1).setResizable(false);
        }

        jtSegundoCuartil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Costo Anual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jtSegundoCuartil);
        if (jtSegundoCuartil.getColumnModel().getColumnCount() > 0) {
            jtSegundoCuartil.getColumnModel().getColumn(0).setResizable(false);
            jtSegundoCuartil.getColumnModel().getColumn(1).setResizable(false);
        }

        jtTercerCuartil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Costo Anual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jtTercerCuartil);
        if (jtTercerCuartil.getColumnModel().getColumnCount() > 0) {
            jtTercerCuartil.getColumnModel().getColumn(0).setResizable(false);
            jtTercerCuartil.getColumnModel().getColumn(1).setResizable(false);
        }

        jtCuartoCuartil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Costo Anual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jtCuartoCuartil);
        if (jtCuartoCuartil.getColumnModel().getColumnCount() > 0) {
            jtCuartoCuartil.getColumnModel().getColumn(0).setResizable(false);
            jtCuartoCuartil.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("FreeSans", 3, 16)); // NOI18N
        jLabel9.setText("Estadisticas");

        jLabel10.setFont(new java.awt.Font("FreeSans", 3, 16)); // NOI18N
        jLabel10.setText("Primer Cuartil");

        jLabel11.setFont(new java.awt.Font("FreeSans", 3, 16)); // NOI18N
        jLabel11.setText("Cuarto Cuartil");

        jLabel12.setFont(new java.awt.Font("FreeSans", 3, 16)); // NOI18N
        jLabel12.setText("Segundo Cuartil");

        jLabel13.setFont(new java.awt.Font("FreeSans", 3, 16)); // NOI18N
        jLabel13.setText("Tercer Cuartil");

        jLabel14.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        jLabel14.setText("Maximo");

        txtMaximoGlobal.setEditable(false);
        txtMaximoGlobal.setText("$ 0.0");
        txtMaximoGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaximoGlobalActionPerformed(evt);
            }
        });

        txtMinimoGlobal.setEditable(false);
        txtMinimoGlobal.setText("$ 0.0");

        jLabel15.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        jLabel15.setText("Minimo");

        txtPromedioGlobal.setEditable(false);
        txtPromedioGlobal.setText("$ 0.0");

        jLabel16.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        jLabel16.setText("Promedio");

        jLabel17.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        jLabel17.setText("Total");

        txtTotalGlobal.setEditable(false);
        txtTotalGlobal.setText("$ 0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(265, 265, 265)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaximoGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMinimoGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPromedioGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(484, 484, 484))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtMaximoGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtMinimoGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtPromedioGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtTotalGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(345, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ordenarPagos() {
        OrdenarPagosAsc oPA = new OrdenarPagosAsc();
        this.lPagos.sort(oPA);
        this.e = this.lPagos.get(this.lPagos.size() - 1);
        this.primerCuartil = e * 0.25;
        this.segundoCuartil = e * 0.50;
        this.tercerCuartil = e * 0.75;
        this.cuartoCuartil = 3 * 1;
    }

    private void agregarNuevoPacienteLista() {
        this.usuario = new Usuario(this.txtNombre.getText().trim().toUpperCase() + " " + this.txtApellido.getText().trim().toUpperCase(), this.ffId.getText(), this.ffCelular.getText(), this.txtPrecio.getText());
        this.lUsuarios.add(usuario);
        this.modeloTabla = (DefaultTableModel) this.jtAsegurados.getModel();
        String arrowPaciente[] = {this.txtNombre.getText().trim().toUpperCase() + " " + this.txtApellido.getText().trim().toUpperCase(), this.ffId.getText(), this.ffCelular.getText(), this.txtPrecio.getText()};
        this.modeloTabla.addRow(arrowPaciente);
    }

    public void agregarArrowPrimerCuartil() {
        System.out.println(this.primerCuartil);
        if (this.totalPaciente < this.primerCuartil) {
            this.modeloTabla = (DefaultTableModel) this.jtPrimerCuartil.getModel();
            this.modeloTabla.getDataVector().removeAllElements();
            this.modeloTabla.fireTableDataChanged();
            String arrowPrimerCuartil[] = {this.txtNombre.getText().trim().toUpperCase() + " " + this.txtApellido.getText().trim().toUpperCase(), String.valueOf(totalPaciente)};
            this.modeloTabla.addRow(arrowPrimerCuartil);
        }
    }

    public void segundoCuartil() {
        System.out.println(this.segundoCuartil);
        if (this.totalPaciente > this.primerCuartil && this.totalPaciente < this.segundoCuartil) {
            this.modeloTabla = (DefaultTableModel) this.jtSegundoCuartil.getModel();
            this.modeloTabla.getDataVector().removeAllElements();
            this.modeloTabla.fireTableDataChanged();
            String arrowPrimerCuartil[] = {this.txtNombre.getText().trim().toUpperCase() + " " + this.txtApellido.getText().trim().toUpperCase(), String.valueOf(totalPaciente)};
            this.modeloTabla.addRow(arrowPrimerCuartil);
        }
    }

    public void agregarArrowTercerCuartil() {
        System.out.println(this.tercerCuartil);
        if (this.totalPaciente > this.segundoCuartil && this.totalPaciente < this.tercerCuartil) {
            this.modeloTabla = (DefaultTableModel) this.jtTercerCuartil.getModel();
            this.modeloTabla.getDataVector().removeAllElements();
            this.modeloTabla.fireTableDataChanged();
            String arrowPrimerCuartil[] = {this.txtNombre.getText().trim().toUpperCase() + " " + this.txtApellido.getText().trim().toUpperCase(), String.valueOf(totalPaciente)};
            this.modeloTabla.addRow(arrowPrimerCuartil);
        }
    }

    public void agregarArrowCuartilCuartil(){
        System.out.println(this.cuartoCuartil);
        if (this.totalPaciente > this.tercerCuartil) {
            this.modeloTabla = (DefaultTableModel) this.jtCuartoCuartil.getModel();
            this.modeloTabla.getDataVector().removeAllElements();
            this.modeloTabla.fireTableDataChanged();
            String arrowPrimerCuartil[] = {this.txtNombre.getText().trim().toUpperCase() + " " + this.txtApellido.getText().trim().toUpperCase(), String.valueOf(totalPaciente)};
            this.modeloTabla.addRow(arrowPrimerCuartil);
        }
    }
    private void agregarCoberturasPaciente() {
        if (this.chbAmbulancia.isSelected()) {
            this.cobertura = new Cobertura("Servicio de Ambulancia");
            this.lUsuarios.get(this.numPaciente).agregarCoberturaLista(cobertura);
        }
        if (this.chbCoberturaDental.isSelected()) {
            this.cobertura = new Cobertura("Cobertura Dental");
            this.lUsuarios.get(this.numPaciente).agregarCoberturaLista(cobertura);
        }
        if (this.chbDomiciliario.isSelected()) {
            this.cobertura = new Cobertura("Servicio Domiciliario");
            this.lUsuarios.get(this.numPaciente).agregarCoberturaLista(cobertura);
        }
        if (this.chbMaternidad.isSelected()) {
            this.cobertura = new Cobertura("Servicio de Maternidad");
            this.lUsuarios.get(this.numPaciente).agregarCoberturaLista(cobertura);
        }
        if (this.chbProtesis.isSelected()) {
            this.cobertura = new Cobertura("Protesis de miembros inferiores y superiores");
            this.lUsuarios.get(this.numPaciente).agregarCoberturaLista(cobertura);
        }
        if (this.chbPsiquiatria.isSelected()) {
            this.cobertura = new Cobertura("Psiquatría profesional");
            this.lUsuarios.get(this.numPaciente).agregarCoberturaLista(cobertura);
        }
        if (this.chbTransplante.isSelected()) {
            this.cobertura = new Cobertura("Transplante");
            this.lUsuarios.get(this.numPaciente).agregarCoberturaLista(cobertura);
        }
        if (this.chbTratamiento.isSelected()) {
            this.cobertura = new Cobertura("Tratamiento de Sida");
            this.lUsuarios.get(this.numPaciente).agregarCoberturaLista(cobertura);
        }
        this.numPaciente += 1;
    }
    private void btnRegistrarAseguradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAseguradoActionPerformed

        this.agregarNuevoPacienteLista();
        this.agregarCoberturasPaciente();
        this.agregarTotalLista();
        this.ordenarPagos();
        this.agregarArrowPrimerCuartil();
        this.segundoCuartil();
        this.agregarArrowTercerCuartil();
        this.agregarArrowCuartilCuartil();
        this.actualizarDatosGlobales();
    }//GEN-LAST:event_btnRegistrarAseguradoActionPerformed

    private void agregarTotalLista() {
        this.lPagos.add(totalPaciente);
    }

    private void actualizarTxtPago() {
        this.txtPrecio.setText("$ " + this.totalPaciente);
    }

    private void chbCoberturaDentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbCoberturaDentalActionPerformed
        if (this.chbCoberturaDental.isSelected()) {
            this.totalPaciente += 125;
        } else {
            this.totalPaciente -= 125;
        }
        this.actualizarTxtPago();
    }//GEN-LAST:event_chbCoberturaDentalActionPerformed

    private void chbAmbulanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAmbulanciaActionPerformed
        if (this.chbAmbulancia.isSelected()) {
            this.totalPaciente += 300;
        } else {
            this.totalPaciente -= 300;
        }
        this.actualizarTxtPago();
    }//GEN-LAST:event_chbAmbulanciaActionPerformed

    private void chbPsiquiatriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPsiquiatriaActionPerformed
        if (this.chbPsiquiatria.isSelected()) {
            this.totalPaciente += 300;
        } else {
            this.totalPaciente -= 300;
        }
        this.actualizarTxtPago();
    }//GEN-LAST:event_chbPsiquiatriaActionPerformed

    private void chbTransplanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbTransplanteActionPerformed
        if (this.chbTransplante.isSelected()) {
            this.totalPaciente += 300;
        } else {
            this.totalPaciente -= 300;
        }
        this.actualizarTxtPago();
    }//GEN-LAST:event_chbTransplanteActionPerformed

    private void chbTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbTratamientoActionPerformed
        if (this.chbTratamiento.isSelected()) {
            this.totalPaciente += 300;
        } else {
            this.totalPaciente -= 300;
        }
        this.actualizarTxtPago();
    }//GEN-LAST:event_chbTratamientoActionPerformed

    private void chbDomiciliarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbDomiciliarioActionPerformed
        if (this.chbDomiciliario.isSelected()) {
            this.totalPaciente += 300;
        } else {
            this.totalPaciente -= 300;
        }
        this.actualizarTxtPago();
    }//GEN-LAST:event_chbDomiciliarioActionPerformed

    private void chbProtesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbProtesisActionPerformed
        if (this.chbProtesis.isSelected()) {
            this.totalPaciente += 300;
        } else {
            this.totalPaciente -= 300;
        }
        this.actualizarTxtPago();
    }//GEN-LAST:event_chbProtesisActionPerformed

    private void chbMaternidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbMaternidadActionPerformed
        if (this.chbMaternidad.isSelected()) {
            this.totalPaciente += 300;
        } else {
            this.totalPaciente -= 300;
        }
        this.actualizarTxtPago();
    }//GEN-LAST:event_chbMaternidadActionPerformed

    private void jtAseguradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAseguradosMouseClicked
        this.mostrarCoberturarPaciente();
    }//GEN-LAST:event_jtAseguradosMouseClicked

    private void txtMaximoGlobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaximoGlobalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaximoGlobalActionPerformed

    private void mostrarCoberturarPaciente() {
        this.modeloTabla = (DefaultTableModel) this.jtCoberturasCliente.getModel();
        this.modeloTabla.getDataVector().removeAllElements();
        this.modeloTabla.fireTableDataChanged();
        for (int i = 0; i < this.lUsuarios.get(this.jtAsegurados.getSelectedRow()).lCoberturasCliente.size(); i++) {
            String arrowCobertura[] = {this.lUsuarios.get(this.jtAsegurados.getSelectedRow()).lCoberturasCliente.get(i).getNombreCobertura()};
            this.modeloTabla.addRow(arrowCobertura);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarAsegurado;
    private javax.swing.ButtonGroup btngArea;
    private javax.swing.JCheckBox chbAmbulancia;
    private javax.swing.JCheckBox chbCoberturaDental;
    private javax.swing.JCheckBox chbDomiciliario;
    private javax.swing.JCheckBox chbMaternidad;
    private javax.swing.JCheckBox chbProtesis;
    private javax.swing.JCheckBox chbPsiquiatria;
    private javax.swing.JCheckBox chbTransplante;
    private javax.swing.JCheckBox chbTratamiento;
    private javax.swing.JFormattedTextField ffCelular;
    private javax.swing.JFormattedTextField ffId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JTable jtAsegurados;
    private javax.swing.JTable jtCoberturasCliente;
    private javax.swing.JTable jtCuartoCuartil;
    private javax.swing.JTable jtPrimerCuartil;
    private javax.swing.JTable jtSegundoCuartil;
    private javax.swing.JTable jtTercerCuartil;
    private javax.swing.JRadioButton rbnCA;
    private javax.swing.JRadioButton rbnElSalvador;
    private javax.swing.JRadioButton rbnInternational;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtMaximoGlobal;
    private javax.swing.JTextField txtMinimoGlobal;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPromedioGlobal;
    private javax.swing.JTextField txtTotalGlobal;
    // End of variables declaration//GEN-END:variables

}

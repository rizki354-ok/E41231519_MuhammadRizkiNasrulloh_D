/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Minggu9;
import java.awt.Color;
/**
 *
 * @author rizki
 */
public class Penjualan extends javax.swing.JPanel {

    /**
     * Creates new form Pembelian
     */
    public Penjualan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        LabelNoTrs = new javax.swing.JLabel();
        LabelTglTrs = new javax.swing.JLabel();
        LabelKodeBrg = new javax.swing.JLabel();
        LabelNamaBrg = new javax.swing.JLabel();
        LabelStock = new javax.swing.JLabel();
        LabelHarga = new javax.swing.JLabel();
        LabelJumlah = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        TxtNoTrs = new javax.swing.JTextField();
        TxtTglTrs = new javax.swing.JTextField();
        TxtKodeBrg = new javax.swing.JTextField();
        TxtNamaBrg = new javax.swing.JTextField();
        TxtStock = new javax.swing.JTextField();
        TxtHarga = new javax.swing.JTextField();
        TxtJumlah = new javax.swing.JTextField();
        TxtTotal = new javax.swing.JTextField();
        LabelTotalAkhir = new javax.swing.JLabel();
        TxtTotalAkhir = new javax.swing.JTextField();
        LabelBayar = new javax.swing.JLabel();
        TxtBayar = new javax.swing.JTextField();
        LabelKembali = new javax.swing.JLabel();
        TxtKembali = new javax.swing.JTextField();
        SubPanel = new javax.swing.JPanel();
        LabelKodeMem = new javax.swing.JLabel();
        TxtKodeMem = new javax.swing.JTextField();
        LabelNamaMem = new javax.swing.JLabel();
        TxtNamaMem = new javax.swing.JTextField();
        LabelDiskon = new javax.swing.JLabel();
        TxtDiskon = new javax.swing.JTextField();
        persen = new javax.swing.JLabel();
        ButtonAdd = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        ButtonCount = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        ButtonPrint = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setBackground(new java.awt.Color(2, 1, 101));
        setMaximumSize(new java.awt.Dimension(935, 575));
        setMinimumSize(new java.awt.Dimension(935, 575));
        setPreferredSize(new java.awt.Dimension(935, 575));

        Container.setBackground(new java.awt.Color(2, 1, 101));
        Container.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Penjualan", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        Container.setMaximumSize(new java.awt.Dimension(935, 575));
        Container.setMinimumSize(new java.awt.Dimension(935, 575));

        LabelNoTrs.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelNoTrs.setForeground(new java.awt.Color(255, 255, 255));
        LabelNoTrs.setText("No Transaksi");

        LabelTglTrs.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelTglTrs.setForeground(new java.awt.Color(255, 255, 255));
        LabelTglTrs.setText("Tgl Transaksi");

        LabelKodeBrg.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelKodeBrg.setForeground(new java.awt.Color(255, 255, 255));
        LabelKodeBrg.setText("Kode Barang");

        LabelNamaBrg.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelNamaBrg.setForeground(new java.awt.Color(255, 255, 255));
        LabelNamaBrg.setText("Nama Barang");

        LabelStock.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelStock.setForeground(new java.awt.Color(255, 255, 255));
        LabelStock.setText("Stock");

        LabelHarga.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelHarga.setForeground(new java.awt.Color(255, 255, 255));
        LabelHarga.setText("Harga");

        LabelJumlah.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelJumlah.setForeground(new java.awt.Color(255, 255, 255));
        LabelJumlah.setText("Jumlah");

        LabelTotal.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelTotal.setForeground(new java.awt.Color(255, 255, 255));
        LabelTotal.setText("Total");

        TxtNoTrs.setBackground(new java.awt.Color(255, 255, 255));
        TxtNoTrs.setForeground(new java.awt.Color(0, 0, 0));
        TxtNoTrs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtNoTrs.setName(""); // NOI18N
        TxtNoTrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNoTrsActionPerformed(evt);
            }
        });

        TxtTglTrs.setBackground(new java.awt.Color(255, 255, 255));
        TxtTglTrs.setForeground(new java.awt.Color(0, 0, 0));
        TxtTglTrs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtTglTrs.setName(""); // NOI18N

        TxtKodeBrg.setBackground(new java.awt.Color(255, 255, 255));
        TxtKodeBrg.setForeground(new java.awt.Color(0, 0, 0));
        TxtKodeBrg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtKodeBrg.setName(""); // NOI18N

        TxtNamaBrg.setBackground(new java.awt.Color(255, 255, 255));
        TxtNamaBrg.setForeground(new java.awt.Color(0, 0, 0));
        TxtNamaBrg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtNamaBrg.setName(""); // NOI18N

        TxtStock.setBackground(new java.awt.Color(255, 255, 255));
        TxtStock.setForeground(new java.awt.Color(0, 0, 0));
        TxtStock.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtStock.setName(""); // NOI18N

        TxtHarga.setBackground(new java.awt.Color(255, 255, 255));
        TxtHarga.setForeground(new java.awt.Color(0, 0, 0));
        TxtHarga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtHarga.setName(""); // NOI18N

        TxtJumlah.setBackground(new java.awt.Color(255, 255, 255));
        TxtJumlah.setForeground(new java.awt.Color(0, 0, 0));
        TxtJumlah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtJumlah.setName(""); // NOI18N

        TxtTotal.setBackground(new java.awt.Color(255, 255, 255));
        TxtTotal.setForeground(new java.awt.Color(0, 0, 0));
        TxtTotal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtTotal.setName(""); // NOI18N

        LabelTotalAkhir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelTotalAkhir.setForeground(new java.awt.Color(255, 255, 255));
        LabelTotalAkhir.setText("Total Setelah Diskon");

        TxtTotalAkhir.setBackground(new java.awt.Color(255, 255, 255));
        TxtTotalAkhir.setForeground(new java.awt.Color(0, 0, 0));
        TxtTotalAkhir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtTotalAkhir.setName(""); // NOI18N

        LabelBayar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelBayar.setForeground(new java.awt.Color(255, 255, 255));
        LabelBayar.setText("Bayar");

        TxtBayar.setBackground(new java.awt.Color(255, 255, 255));
        TxtBayar.setForeground(new java.awt.Color(0, 0, 0));
        TxtBayar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtBayar.setName(""); // NOI18N

        LabelKembali.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelKembali.setForeground(new java.awt.Color(255, 255, 255));
        LabelKembali.setText("Kembali");

        TxtKembali.setBackground(new java.awt.Color(255, 255, 255));
        TxtKembali.setForeground(new java.awt.Color(0, 0, 0));
        TxtKembali.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtKembali.setName(""); // NOI18N

        SubPanel.setBackground(new java.awt.Color(0, 0, 153));
        SubPanel.setMaximumSize(new java.awt.Dimension(100, 1250));
        SubPanel.setMinimumSize(new java.awt.Dimension(366, 125));
        SubPanel.setName(""); // NOI18N
        SubPanel.setPreferredSize(new java.awt.Dimension(366, 125));

        LabelKodeMem.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelKodeMem.setForeground(new java.awt.Color(255, 255, 255));
        LabelKodeMem.setText("Kode Member");

        TxtKodeMem.setBackground(new java.awt.Color(255, 255, 255));
        TxtKodeMem.setForeground(new java.awt.Color(0, 0, 0));
        TxtKodeMem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtKodeMem.setName(""); // NOI18N

        LabelNamaMem.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelNamaMem.setForeground(new java.awt.Color(255, 255, 255));
        LabelNamaMem.setText("Nama Member");

        TxtNamaMem.setBackground(new java.awt.Color(255, 255, 255));
        TxtNamaMem.setForeground(new java.awt.Color(0, 0, 0));
        TxtNamaMem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtNamaMem.setName(""); // NOI18N

        LabelDiskon.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LabelDiskon.setForeground(new java.awt.Color(255, 255, 255));
        LabelDiskon.setText("Diskon");

        TxtDiskon.setBackground(new java.awt.Color(255, 255, 255));
        TxtDiskon.setForeground(new java.awt.Color(0, 0, 0));
        TxtDiskon.setText("0");
        TxtDiskon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        TxtDiskon.setName(""); // NOI18N
        TxtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDiskonActionPerformed(evt);
            }
        });

        persen.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        persen.setForeground(new java.awt.Color(255, 255, 255));
        persen.setText("%");

        javax.swing.GroupLayout SubPanelLayout = new javax.swing.GroupLayout(SubPanel);
        SubPanel.setLayout(SubPanelLayout);
        SubPanelLayout.setHorizontalGroup(
            SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SubPanelLayout.createSequentialGroup()
                        .addComponent(LabelKodeMem)
                        .addGap(29, 29, 29)
                        .addComponent(TxtKodeMem, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SubPanelLayout.createSequentialGroup()
                        .addGroup(SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNamaMem)
                            .addComponent(LabelDiskon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SubPanelLayout.createSequentialGroup()
                                .addComponent(TxtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(persen))
                            .addComponent(TxtNamaMem, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        SubPanelLayout.setVerticalGroup(
            SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelKodeMem)
                    .addComponent(TxtKodeMem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNamaMem)
                    .addComponent(TxtNamaMem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDiskon)
                    .addComponent(TxtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persen))
                .addGap(14, 14, 14))
        );

        ButtonAdd.setBackground(new java.awt.Color(255, 255, 255));
        ButtonAdd.setForeground(new java.awt.Color(0, 0, 0));
        ButtonAdd.setText("ADD");
        ButtonAdd.setBorder(null);
        ButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAdd.setMaximumSize(new java.awt.Dimension(65, 22));
        ButtonAdd.setMinimumSize(new java.awt.Dimension(65, 22));
        ButtonAdd.setPreferredSize(new java.awt.Dimension(65, 22));

        ButtonDelete.setBackground(new java.awt.Color(255, 255, 255));
        ButtonDelete.setForeground(new java.awt.Color(0, 0, 0));
        ButtonDelete.setText("DELETE");
        ButtonDelete.setBorder(null);
        ButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDelete.setMaximumSize(new java.awt.Dimension(65, 22));
        ButtonDelete.setMinimumSize(new java.awt.Dimension(65, 22));
        ButtonDelete.setPreferredSize(new java.awt.Dimension(65, 22));

        ButtonCount.setBackground(new java.awt.Color(255, 255, 255));
        ButtonCount.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCount.setText("COUNT");
        ButtonCount.setBorder(null);
        ButtonCount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCount.setMaximumSize(new java.awt.Dimension(65, 22));
        ButtonCount.setMinimumSize(new java.awt.Dimension(65, 22));
        ButtonCount.setPreferredSize(new java.awt.Dimension(65, 22));

        ButtonSave.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSave.setForeground(new java.awt.Color(0, 0, 0));
        ButtonSave.setText("SAVE");
        ButtonSave.setBorder(null);
        ButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSave.setMaximumSize(new java.awt.Dimension(65, 22));
        ButtonSave.setMinimumSize(new java.awt.Dimension(65, 22));
        ButtonSave.setPreferredSize(new java.awt.Dimension(65, 22));

        ButtonPrint.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPrint.setForeground(new java.awt.Color(0, 0, 0));
        ButtonPrint.setText("PRINT");
        ButtonPrint.setBorder(null);
        ButtonPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonPrint.setMaximumSize(new java.awt.Dimension(65, 22));
        ButtonPrint.setMinimumSize(new java.awt.Dimension(65, 22));
        ButtonPrint.setPreferredSize(new java.awt.Dimension(65, 22));

        ButtonClear.setBackground(new java.awt.Color(255, 255, 255));
        ButtonClear.setForeground(new java.awt.Color(0, 0, 0));
        ButtonClear.setText("CLEAR");
        ButtonClear.setBorder(null);
        ButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonClear.setMaximumSize(new java.awt.Dimension(65, 22));
        ButtonClear.setMinimumSize(new java.awt.Dimension(65, 22));
        ButtonClear.setPreferredSize(new java.awt.Dimension(65, 22));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setSelectionBackground(new java.awt.Color(179, 179, 179));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setBackground(new java.awt.Color(255, 255, 255));
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setToolTipText("");
        jTable3.setSelectionBackground(new java.awt.Color(179, 179, 179));
        jTable3.setShowGrid(true);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(LabelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                        .addComponent(LabelJumlah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                        .addComponent(LabelHarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                        .addComponent(LabelStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                        .addComponent(LabelNamaBrg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                        .addComponent(LabelKodeBrg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtKodeBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(LabelTglTrs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtTglTrs, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(LabelNoTrs)
                        .addGap(75, 75, 75)
                        .addComponent(TxtNoTrs, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(0, 27, Short.MAX_VALUE)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                        .addComponent(SubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(ContainerLayout.createSequentialGroup()
                                                .addComponent(LabelKembali)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TxtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerLayout.createSequentialGroup()
                                                .addComponent(LabelBayar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TxtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerLayout.createSequentialGroup()
                                                .addComponent(LabelTotalAkhir)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtTotalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(83, 83, 83))))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(ButtonCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(ButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNoTrs)
                            .addComponent(TxtNoTrs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTglTrs)
                            .addComponent(TxtTglTrs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelKodeBrg)
                            .addComponent(TxtKodeBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNamaBrg)
                            .addComponent(TxtNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelStock)
                            .addComponent(TxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelHarga)
                                    .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelBayar))
                                .addGap(17, 17, 17)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelJumlah)
                                    .addComponent(TxtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelKembali)
                                .addGap(18, 18, 18))))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtTotalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTotalAkhir))
                        .addGap(18, 18, 18)
                        .addComponent(TxtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotal)
                    .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNoTrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNoTrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNoTrsActionPerformed

    private void TxtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDiskonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonCount;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonPrint;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel LabelBayar;
    private javax.swing.JLabel LabelDiskon;
    private javax.swing.JLabel LabelHarga;
    private javax.swing.JLabel LabelJumlah;
    private javax.swing.JLabel LabelKembali;
    private javax.swing.JLabel LabelKodeBrg;
    private javax.swing.JLabel LabelKodeMem;
    private javax.swing.JLabel LabelNamaBrg;
    private javax.swing.JLabel LabelNamaMem;
    private javax.swing.JLabel LabelNoTrs;
    private javax.swing.JLabel LabelStock;
    private javax.swing.JLabel LabelTglTrs;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JLabel LabelTotalAkhir;
    private javax.swing.JPanel SubPanel;
    private javax.swing.JTextField TxtBayar;
    private javax.swing.JTextField TxtDiskon;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JTextField TxtJumlah;
    private javax.swing.JTextField TxtKembali;
    private javax.swing.JTextField TxtKodeBrg;
    private javax.swing.JTextField TxtKodeMem;
    private javax.swing.JTextField TxtNamaBrg;
    private javax.swing.JTextField TxtNamaMem;
    private javax.swing.JTextField TxtNoTrs;
    private javax.swing.JTextField TxtStock;
    private javax.swing.JTextField TxtTglTrs;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField TxtTotalAkhir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel persen;
    // End of variables declaration//GEN-END:variables
}
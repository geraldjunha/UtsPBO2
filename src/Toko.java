import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerald junha
 */
public class Toko extends javax.swing.JFrame {
    java.util.Date tglsekarang = new java.util.Date();
    private SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd MMMMMMMMM yyyy", Locale.getDefault());
//diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
    private String tanggal = smpdtfmt.format(tglsekarang);

    /**
     * Creates new form Toko
     */
    public Toko() {
        initComponents();
        labeltanggal.setText(tanggal);
        SetJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IdBrg = new javax.swing.JTextField();
        NamaBarang = new javax.swing.JTextField();
        JumlahBarang = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        HargaBarang = new javax.swing.JTextField();
        Tanggal = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        NamaKasir = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        jLabel1.setText("Toko KL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 270, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("24 Jam");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 230, 30);

        labeltanggal.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel1.add(labeltanggal);
        labeltanggal.setBounds(330, 10, 180, 40);

        labeljam.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(labeljam);
        labeljam.setBounds(510, 10, 220, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 1070, 90);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Data Barang");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 110, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("IdBarang");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 40, 110, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("NamaBarang");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 90, 110, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("JumlahBarang");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 200, 110, 30);
        jPanel2.add(IdBrg);
        IdBrg.setBounds(10, 60, 170, 30);
        jPanel2.add(NamaBarang);
        NamaBarang.setBounds(10, 110, 170, 30);
        jPanel2.add(JumlahBarang);
        JumlahBarang.setBounds(10, 220, 170, 30);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 32, 290, 2);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("HargaBarang");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 140, 110, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("TanggalBeli");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 260, 110, 30);
        jPanel2.add(HargaBarang);
        HargaBarang.setBounds(10, 170, 170, 30);
        jPanel2.add(Tanggal);
        Tanggal.setBounds(10, 290, 170, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("NamaKasir");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 330, 110, 30);
        jPanel2.add(NamaKasir);
        NamaKasir.setBounds(10, 350, 170, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 290, 460);

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setLayout(null);

        tblData.setBackground(new java.awt.Color(102, 255, 102));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdBarang", "NamaBarang", "HargaBarang", "JumlahBarang", "TotalHarga", "Diskon", "TanggalBeli", "NamaKasir"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 750, 170);

        btnAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 0, 0));
        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd);
        btnAdd.setBounds(190, 200, 80, 30);

        Delete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 0, 0));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel4.add(Delete);
        Delete.setBounds(370, 200, 80, 30);

        btnPrint.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 0, 0));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel4.add(btnPrint);
        btnPrint.setBounds(550, 200, 80, 30);

        btnRefresh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 0, 0));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel4.add(btnRefresh);
        btnRefresh.setBounds(460, 200, 80, 30);

        Reset.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 0, 0));
        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel4.add(Reset);
        Reset.setBounds(280, 200, 80, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(310, 100, 770, 460);

        setBounds(0, 0, 1104, 604);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());

        if ("".equals(IdBrg.getText()) || "".equals(NamaBarang.getText()) || "".equals(HargaBarang.getText()) || "".equals(JumlahBarang.getText()) || "".equals(NamaKasir.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","Error",JOptionPane.WARNING_MESSAGE);
        } else {
            
            int total_harga_barang;
            int sub_total;
            int diskon = 10;
            int jumlah;
            int harga;
            int batas = 100000;
            
            String jumlahkotor = JumlahBarang.getText();
            jumlah = Integer.parseInt(jumlahkotor);
            
            String hargakotor = HargaBarang.getText();
            harga = Integer.parseInt(hargakotor);
            
            sub_total = jumlah * harga;
            if(sub_total > batas ){
                int hasil = (sub_total * diskon/100);
                total_harga_barang = sub_total - hasil;
            }else{
                total_harga_barang = sub_total; 
            }
            

            String SQL = "INSERT INTO tb_barang VALUES"
            + "('"+IdBrg.getText()+"','"+NamaBarang.getText()+"','"+HargaBarang.getText()+"','"+JumlahBarang.getText()+"','"+total_harga_barang+"','"+diskon+"','"+tanggal+"','"+NamaKasir.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris >= 0) {
            String IdBarang = tblData.getValueAt(baris, 0).toString();
            String SQL = "Delete FROM tb_barang WHERE IdBarang='"+IdBarang+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu","Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_DeleteActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        IdBrg.setText("");
        NamaBarang.setText("");
        HargaBarang.setText("");      
        JumlahBarang.setText("");
        NamaKasir.setText("");

    }//GEN-LAST:event_ResetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        selectData();

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Stroke Pembelian");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)"      );
        try {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if(baris !=1){
            IdBrg.setText(tblData.getValueAt(baris, 0).toString());
            NamaBarang.setText((String) tblData.getValueAt(baris, 1));
            HargaBarang.setText(tblData.getValueAt(baris, 2).toString());
            JumlahBarang.setText(tblData.getValueAt(baris, 3).toString());
           // Diskon.setText(tblData.getValueAt(baris, 4).toString());
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormat = null;
            try {
                dateFormat = date.parse(tblData.getValueAt(baris, 5).toString());
            } catch (ParseException ex) {
                Logger.getLogger(Toko.class.getName()).log(Level.SEVERE, null, ex);
            }
            Tanggal.setDate(dateFormat);
            NamaKasir.setText(tblData.getValueAt(baris, 6).toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Toko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField HargaBarang;
    private javax.swing.JTextField IdBrg;
    private javax.swing.JTextField JumlahBarang;
    private javax.swing.JTextField NamaBarang;
    private javax.swing.JTextField NamaKasir;
    private javax.swing.JButton Reset;
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"IdBarang","NamaBarang","HargaBarang","JumlahBarang","TotalHarga","Diskon","TanggalBeli","NamaKasir"};
        DefaultTableModel dtm = new DefaultTableModel (null, kolom);
        String SQL = "SELECT * FROM tb_barang";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
                String IdBarang = rs.getString(1);
                String NamaBarang = rs.getString(2);
                String HargaBarang = rs.getString(3);
                String JumlahBarang = rs.getString(4);
                String TotalHarga = rs.getString(5);
                String Diskon = rs.getString(6);
                String TanggalBeli = rs.getString(7);
                String NamaKasir = rs.getString(8);
                String data [] = {IdBarang,NamaBarang,HargaBarang,JumlahBarang,TotalHarga,Diskon,TanggalBeli,NamaKasir};
                dtm.addRow(data);
            }
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }
public void setTanggal(){
    java.util.Date skrg = new java.util.Date();
    java.text.SimpleDateFormat kal = new
    java.text.SimpleDateFormat("dd/MM/yyyy");
    labeltanggal.setText(kal.format(skrg));
    
}
    public void SetJam(){
    ActionListener taskPerformer = new ActionListener() {

            @Override
        public void actionPerformed(ActionEvent evt) {
        String nol_jam = "", nol_menit = " ",nol_detik = "";

        java.util.Date dateTime = new java.util.Date();
        int nilai_jam = dateTime.getHours();
        int nilai_menit = dateTime.getMinutes();
        int nilai_detik = dateTime.getSeconds();

        if(nilai_jam <= 9) nol_jam= "0";
        if(nilai_menit <= 9) nol_menit= "0";
        if(nilai_detik <= 9) nol_detik= "0";

        String jam = nol_jam + Integer.toString(nilai_jam);
        String menit = nol_menit + Integer.toString(nilai_menit);
        String detik = nol_detik + Integer.toString(nilai_detik);

        labeljam.setText(jam+":"+menit+":"+detik+"");
      }
    };
        new Timer(1000, taskPerformer).start();
}
    
    
    
}

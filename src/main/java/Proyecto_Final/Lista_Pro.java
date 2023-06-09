/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto_Final;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Lista_Pro extends javax.swing.JFrame {

  /**
   * Creates new form Lista_Pro
   */
  public Lista_Pro() {
    initComponents();
  }
    //clase de degradado
  class jPanelGradient extends JPanel{

    jPanelGradient() {
    }
    protected void paintComponent(Graphics g){
      Graphics2D g2d=(Graphics2D) g;
      int width=getWidth();
      int height=getHeight();
      
      Color color1=new Color(33, 47, 61);
      Color color2=new Color(51, 57, 255);
      GradientPaint gp=new GradientPaint(0,0,color1,180,height,color2);
      g2d.setPaint(gp);
      g2d.fillRect(0, 0, width, height);
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new jPanelGradient();
    jLabel1 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jTextField2 = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("LISTA DE PRODUCTOS");

    jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButton2.setText("REGRESAR");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jScrollPane1.setViewportView(jTable1);

    jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButton1.setText("CONDICIONES PARA MOSTRAR DATOS");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("TOTAL DE PRODUCTOS:");

    jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("TOTAL DE LOS PRODUTOS (Q.)");

    jTextField2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(180, 180, 180)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jButton1)
          .addComponent(jLabel1))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jButton2)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel2)
              .addComponent(jLabel3))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jTextField2)
              .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))))
        .addGap(30, 30, 30))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(jButton1)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton2)
        .addGap(11, 11, 11))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Frame_Principal objeto=new Frame_Principal();
    objeto.show(true);
    this.show(false);
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int ids=0;
    float total=0,cantidad=0,fin=0;
    Object [] restriccion ={"NINGUA","ID","NOMBRE","PRECIOS","CODIGO","CANTIDAD"};  
    Object restricci2 = JOptionPane.showInputDialog(null,"SELECCIONE", "RESTRICCION",JOptionPane.QUESTION_MESSAGE,null,restriccion, restriccion[0]);
    DefaultTableModel mitabla=new DefaultTableModel();
    mitabla.addColumn("ID");
    mitabla.addColumn("PRODUCTO");
    mitabla.addColumn("PRECIO (Q.)");
    mitabla.addColumn("CODIGO");
    mitabla.addColumn("CANTIDAD");
    mitabla.addColumn("TOTAL");
    jTextField1.setEditable(false);
    jTextField2.setEditable(false);
    //--------------------------------------------------Condicion 1-------------------------------
    if(restricci2.equals("NINGUA")){
        try {
        Conexion objeto1=new Conexion();
        PreparedStatement st = objeto1.Conexion().prepareStatement("select * from productos;");
        ResultSet result = st.executeQuery();
      
        while(result.next()){
          fin=Float.parseFloat(result.getString("cantidad"));
          Object[] col=new Object[6];
          col[0]=result.getInt("id");
          col[1]=result.getString("producto");
          col[2]= Float.parseFloat(result.getString("valor"));
          col[3]=result.getString("codigo");
          col[4]= Float.parseFloat(result.getString("cantidad"));
          col[5]=fin*Float.parseFloat(result.getString("valor"));
          
          mitabla.addRow(col);
          total=total+(fin*(Float.parseFloat(result.getString("valor"))));
          cantidad+=fin;
        }
        jTable1.setModel(mitabla);
        jTextField1.setText(Float.toString(cantidad));
        jTextField2.setText(Float.toString(total));
        
        result.isClosed();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane,"ERROR AL MOSTRAR LOS DATOS");
        }
      }
    //--------------------------------------------------Condicion 2-------------------------------
    else if(restricci2.equals("ID")){
      int id=0;
      String ID=JOptionPane.showInputDialog(rootPane, "INGRESE EL ID");
      if(ID.isEmpty()){
      id=0;
    }else{
      id=Integer.parseInt(ID);
    }
    try {
      Conexion objeto1=new Conexion();
      PreparedStatement st = objeto1.Conexion().prepareStatement("select * from productos where id = '"+id+"';");
      ResultSet result=st.executeQuery();
      
      if(result.next()){
        Object[] col=new Object[6];
        fin=Float.parseFloat(result.getString("cantidad"));
        col[0]=result.getInt("id");
        col[1]=result.getString("producto");
        col[2]= Float.parseFloat(result.getString("valor"));
        col[3]=result.getString("codigo");
        col[4]= Float.parseFloat(result.getString("cantidad"));
        col[5]=fin*Float.parseFloat(result.getString("valor"));
        
        
        total=total+(fin*(Float.parseFloat(result.getString("valor"))));
        cantidad+=fin;
        mitabla.addRow(col);
        jTable1.setModel(mitabla);
        jTextField1.setText(Float.toString(cantidad));
        jTextField2.setText(Float.toString(total));
        result.isClosed();
      }else{
      JOptionPane.showMessageDialog(null, "PRODUCTO INEXISTENTE", "ERROR", JOptionPane.WARNING_MESSAGE);
      
      }
      //st.close();
      //JOptionPane.showMessageDialog(rootPane,"USUARIO INGRESADO");

    }catch (SQLException ex) {
      JOptionPane.showMessageDialog(rootPane,"ERROR AL INGRESAR LOS DATOS");
    }
    }
    //--------------------------------------------------Condicion 3-------------------------------
    else if(restricci2.equals("NOMBRE")){
      String nombre=JOptionPane.showInputDialog(rootPane, "INGRESE EL NOMBRE DEL PRODUCTO");
    try {
      Conexion objeto1=new Conexion();
      PreparedStatement st = objeto1.Conexion().prepareStatement("select * from productos where producto = '"+nombre+"';");
      ResultSet result=st.executeQuery();
      
      if(result.next()){
        Object[] col=new Object[6];
        fin=Float.parseFloat(result.getString("cantidad"));
        col[0]=result.getInt("id");
        col[1]=result.getString("producto");
        col[2]= Float.parseFloat(result.getString("valor"));
        col[3]=result.getString("codigo");
        col[4]= Float.parseFloat(result.getString("cantidad"));
        col[5]=fin*Float.parseFloat(result.getString("valor"));
        
        total=total+(fin*(Float.parseFloat(result.getString("valor"))));
        cantidad+=fin;
        mitabla.addRow(col);
        jTable1.setModel(mitabla);
        jTextField1.setText(Float.toString(cantidad));
        jTextField2.setText(Float.toString(total));
        result.isClosed();
      }else{
      JOptionPane.showMessageDialog(null, "PRODUCTO INEXISTENTE", "ERROR", JOptionPane.WARNING_MESSAGE);
      
      }
      //st.close();
      //JOptionPane.showMessageDialog(rootPane,"USUARIO INGRESADO");

    }catch (SQLException ex) {
      JOptionPane.showMessageDialog(rootPane,"ERROR AL INGRESAR LOS DATOS");
    }
    }
    //--------------------------------------------------Condicion 4-------------------------------
    else if(restricci2.equals("PRECIOS")){
      float min=0,max=0;
      min=Float.parseFloat(JOptionPane.showInputDialog(rootPane, "INGRESE EL PRECIO INFERIOR (Q.)"));
      max=Float.parseFloat(JOptionPane.showInputDialog(rootPane, "INGRESE EL PRECIO SUPERIOR (Q.)"));
      
      try {
      Conexion objeto1=new Conexion();
      PreparedStatement st = objeto1.Conexion().prepareStatement("select * from productos where valor>"+min+" and valor<"+max+";");
      ResultSet result=st.executeQuery();
      
      if(result.next()){
        Object[] col=new Object[6];
        fin=Float.parseFloat(result.getString("cantidad"));
        col[0]=result.getInt("id");
        col[1]=result.getString("producto");
        col[2]= Float.parseFloat(result.getString("valor"));
        col[3]=result.getString("codigo");
        col[4]= Float.parseFloat(result.getString("cantidad"));
        col[5]=fin*Float.parseFloat(result.getString("valor"));
        
        total=total+(fin*(Float.parseFloat(result.getString("valor"))));
        cantidad+=fin;
        mitabla.addRow(col);
        jTable1.setModel(mitabla);
        jTextField1.setText(Float.toString(cantidad));
        jTextField2.setText(Float.toString(total));
        
      }else{
      JOptionPane.showMessageDialog(null, "PRODUCTO INEXISTENTE", "ERROR", JOptionPane.WARNING_MESSAGE);
      
      }
      st.close();
      //JOptionPane.showMessageDialog(rootPane,"USUARIO INGRESADO");

    }catch (SQLException ex) {
      JOptionPane.showMessageDialog(rootPane,"ERROR AL INGRESAR LOS DATOS");
    }
    }
    //--------------------------------------------------Condicion 5-------------------------------
    else if(restricci2.equals("CODIGO")){
      String nombre=JOptionPane.showInputDialog(rootPane, "INGRESE EL CODIGO DEL PRODUCTO");
    try {
      Conexion objeto1=new Conexion();
      PreparedStatement st = objeto1.Conexion().prepareStatement("select * from productos where codigo = '"+nombre+"';");
      ResultSet result=st.executeQuery();
      
      if(result.next()){
        Object[] col=new Object[6];
        fin=Float.parseFloat(result.getString("cantidad"));
        col[0]=result.getInt("id");
        col[1]=result.getString("producto");
        col[2]= Float.parseFloat(result.getString("valor"));
        col[3]=result.getString("codigo");
        col[4]= Float.parseFloat(result.getString("cantidad"));
        col[5]=fin*Float.parseFloat(result.getString("valor"));
       
        total=total+(fin*(Float.parseFloat(result.getString("valor"))));
        cantidad+=fin;
        mitabla.addRow(col);
        jTable1.setModel(mitabla);
        jTextField1.setText(Float.toString(cantidad));
        jTextField2.setText(Float.toString(total));
        result.isClosed();
      }else{
      JOptionPane.showMessageDialog(null, "PRODUCTO INEXISTENTE", "ERROR", JOptionPane.WARNING_MESSAGE);
      
      }
      //st.close();
      //JOptionPane.showMessageDialog(rootPane,"USUARIO INGRESADO");

    }catch (SQLException ex) {
      JOptionPane.showMessageDialog(rootPane,"ERROR AL INGRESAR LOS DATOS");
    }
    }
    
    //--------------------------------------------------Condicion 6-------------------------------
    else if(restricci2.equals("CANTIDAD")){
      float min=0,max=0;
      min=Float.parseFloat(JOptionPane.showInputDialog(rootPane, "INGRESE LA CANTIDAD MINIMA"));
      max=Float.parseFloat(JOptionPane.showInputDialog(rootPane, "INGRESE LA CANTIDAD MAXIMA"));
      
      try {
      Conexion objeto1=new Conexion();
      PreparedStatement st = objeto1.Conexion().prepareStatement("select * from productos where cantidad > "+min+" and cantidad < "+max+";");
      ResultSet result=st.executeQuery();
      
      if(result.next()){
        Object[] col=new Object[6];
        fin=Float.parseFloat(result.getString("cantidad"));
        col[0]=result.getInt("id");
        col[1]=result.getString("producto");
        col[2]= Float.parseFloat(result.getString("valor"));
        col[3]=result.getString("codigo");
        col[4]= Float.parseFloat(result.getString("cantidad"));
        col[5]=fin*Float.parseFloat(result.getString("valor"));
        
        total=total+(fin*(Float.parseFloat(result.getString("valor"))));
        cantidad+=fin;
        mitabla.addRow(col);
        jTable1.setModel(mitabla);
        jTextField1.setText(Float.toString(cantidad));
        jTextField2.setText(Float.toString(total));
        
      }else{
      JOptionPane.showMessageDialog(null, "PRODUCTO INEXISTENTE", "ERROR", JOptionPane.WARNING_MESSAGE);
      
      }
      st.close();
      //JOptionPane.showMessageDialog(rootPane,"USUARIO INGRESADO");

    }catch (SQLException ex) {
      JOptionPane.showMessageDialog(rootPane,"ERROR AL INGRESAR LOS DATOS");
    }
    }
    
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextField2ActionPerformed

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
      java.util.logging.Logger.getLogger(Lista_Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Lista_Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Lista_Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Lista_Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Lista_Pro().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTextField jTextField2;
  // End of variables declaration//GEN-END:variables
}

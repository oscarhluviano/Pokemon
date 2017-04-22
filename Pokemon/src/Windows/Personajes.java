package Windows;

import Principal.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Personajes extends javax.swing.JFrame {

    static Persona personaje;
    Pokemon home;
    Pokemon rival;
    
    public Personajes()
    {
        initComponents();
        ajustarIconos();
    }
    
    private void ajustarIconos()
    {
        ImageIcon imagen;
        Icon icono; 
        //Imagenes
        imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoPersonajes.jpg"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblFondoPersonajes.getWidth(), lblFondoPersonajes.getHeight(), Image.SCALE_DEFAULT));
        lblFondoPersonajes.setIcon(icono);
        lblPersonajesNombre.setText(personaje.nickname);
        
        //BOTONES
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Pikachu.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(pikachu.getWidth(), pikachu.getHeight(), Image.SCALE_DEFAULT));
        pikachu.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/raichu.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(raichu.getWidth(), raichu.getHeight(), Image.SCALE_DEFAULT));
        raichu.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Bulbasaur.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(bulbasaur.getWidth(), bulbasaur.getHeight(), Image.SCALE_DEFAULT));
        bulbasaur.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Charizard.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(charizard.getWidth(), charizard.getHeight(), Image.SCALE_DEFAULT));
        charizard.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Squirtle.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(squirtle.getWidth(), squirtle.getHeight(), Image.SCALE_DEFAULT));
        squirtle.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Mewtwo.jpg"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(mewtwo.getWidth(), mewtwo.getHeight(), Image.SCALE_DEFAULT));
        mewtwo.setIcon(icono);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoPersonajes = new javax.swing.JPanel();
        pnlPersonajesSUperior = new javax.swing.JPanel();
        lblTituloBatalla = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pikachu = new javax.swing.JButton();
        raichu = new javax.swing.JButton();
        bulbasaur = new javax.swing.JButton();
        charizard = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        squirtle = new javax.swing.JButton();
        mewtwo = new javax.swing.JButton();
        btnPersonajes7 = new javax.swing.JButton();
        btnPersonajes8 = new javax.swing.JButton();
        lblPersonajesContrincante = new javax.swing.JLabel();
        lblPersonajesNombre = new javax.swing.JLabel();
        btnPelear = new javax.swing.JButton();
        lblPersonajesNombre1 = new javax.swing.JLabel();
        lblFondoPersonajes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondoPersonajes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPersonajesSUperior.setOpaque(false);

        lblTituloBatalla.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblTituloBatalla.setForeground(new java.awt.Color(0, 204, 204));
        lblTituloBatalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloBatalla.setText("Personajes");

        javax.swing.GroupLayout pnlPersonajesSUperiorLayout = new javax.swing.GroupLayout(pnlPersonajesSUperior);
        pnlPersonajesSUperior.setLayout(pnlPersonajesSUperiorLayout);
        pnlPersonajesSUperiorLayout.setHorizontalGroup(
            pnlPersonajesSUperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPersonajesSUperiorLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(lblTituloBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        pnlPersonajesSUperiorLayout.setVerticalGroup(
            pnlPersonajesSUperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonajesSUperiorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTituloBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlFondoPersonajes.add(pnlPersonajesSUperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(2, 4, 20, 20));

        pikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pikachu.png"))); // NOI18N
        pikachu.setBorderPainted(false);
        pikachu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pikachuMouseClicked(evt);
            }
        });
        pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pikachuActionPerformed(evt);
            }
        });
        jPanel5.add(pikachu);

        raichu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/raichu.png"))); // NOI18N
        raichu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                raichuMouseClicked(evt);
            }
        });
        raichu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raichuActionPerformed(evt);
            }
        });
        jPanel5.add(raichu);

        bulbasaur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bulbasaur.png"))); // NOI18N
        bulbasaur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bulbasaurMouseClicked(evt);
            }
        });
        jPanel5.add(bulbasaur);

        charizard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Charizard.png"))); // NOI18N
        charizard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                charizardMouseClicked(evt);
            }
        });
        jPanel5.add(charizard);

        pnlFondoPersonajes.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 190));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(2, 4, 20, 20));

        squirtle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Squirtle.png"))); // NOI18N
        squirtle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                squirtleMouseClicked(evt);
            }
        });
        jPanel6.add(squirtle);

        mewtwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mewtwo.jpg"))); // NOI18N
        mewtwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mewtwoMouseClicked(evt);
            }
        });
        jPanel6.add(mewtwo);

        btnPersonajes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonajes7ActionPerformed(evt);
            }
        });
        jPanel6.add(btnPersonajes7);
        jPanel6.add(btnPersonajes8);

        pnlFondoPersonajes.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 250, 190));

        lblPersonajesContrincante.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblPersonajesContrincante.setForeground(new java.awt.Color(153, 0, 0));
        lblPersonajesContrincante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlFondoPersonajes.add(lblPersonajesContrincante, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 210, 30));

        lblPersonajesNombre.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblPersonajesNombre.setForeground(new java.awt.Color(204, 0, 0));
        lblPersonajesNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlFondoPersonajes.add(lblPersonajesNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 30));

        btnPelear.setBackground(new java.awt.Color(0, 204, 204));
        btnPelear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPelear.setText("PELEA!!!");
        btnPelear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelearActionPerformed(evt);
            }
        });
        pnlFondoPersonajes.add(btnPelear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, 40));

        lblPersonajesNombre1.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblPersonajesNombre1.setForeground(new java.awt.Color(0, 204, 204));
        lblPersonajesNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonajesNombre1.setText("VS");
        pnlFondoPersonajes.add(lblPersonajesNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 100, 30));

        lblFondoPersonajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondoPersonajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPersonajes.jpg"))); // NOI18N
        pnlFondoPersonajes.add(lblFondoPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raichuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raichuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raichuActionPerformed

    private void btnPersonajes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonajes7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPersonajes7ActionPerformed

    private void btnPelearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelearActionPerformed
        Batalla.ejecutar(personaje, home, rival);
    }//GEN-LAST:event_btnPelearActionPerformed

    private void pikachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pikachuActionPerformed
        
    }//GEN-LAST:event_pikachuActionPerformed

    private void pikachuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pikachuMouseClicked
        if (evt.isMetaDown())
        {
            rival = new Pikachu();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Pikachu();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_pikachuMouseClicked

    private void charizardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_charizardMouseClicked
        if (evt.isMetaDown())
        {
            rival = new Charizard();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Charizard();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_charizardMouseClicked

    private void raichuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raichuMouseClicked
        if (evt.isMetaDown())
        {
            rival = new Raichu();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Raichu();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_raichuMouseClicked

    private void squirtleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squirtleMouseClicked
        if (evt.isMetaDown())
        {
            rival = new Squirtle();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Squirtle();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_squirtleMouseClicked

    private void mewtwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mewtwoMouseClicked
        if (evt.isMetaDown())
        {
            rival = new Mewtwo();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Mewtwo();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_mewtwoMouseClicked

    private void bulbasaurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bulbasaurMouseClicked
        if (evt.isMetaDown())
        {
            rival = new Bulbasaur();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Bulbasaur();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_bulbasaurMouseClicked

    public static void ejecutar(Persona personaje2)
    {
        personaje = personaje2;
        Personajes personajes = new Personajes();
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                personajes.setVisible(true);
                personajes.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                personajes.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPelear;
    private javax.swing.JButton btnPersonajes7;
    private javax.swing.JButton btnPersonajes8;
    private javax.swing.JButton bulbasaur;
    private javax.swing.JButton charizard;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblFondoPersonajes;
    private javax.swing.JLabel lblPersonajesContrincante;
    private javax.swing.JLabel lblPersonajesNombre;
    private javax.swing.JLabel lblPersonajesNombre1;
    private javax.swing.JLabel lblTituloBatalla;
    private javax.swing.JButton mewtwo;
    private javax.swing.JButton pikachu;
    private javax.swing.JPanel pnlFondoPersonajes;
    private javax.swing.JPanel pnlPersonajesSUperior;
    private javax.swing.JButton raichu;
    private javax.swing.JButton squirtle;
    // End of variables declaration//GEN-END:variables
}

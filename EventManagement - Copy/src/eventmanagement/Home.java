package eventmanagement;
/**
 *
 * @author Armabel
 * @author LEANDER
 */

import javax.swing.JOptionPane;
import java.awt.Color;
import static java.awt.Color.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {
    
    stack linkedList = new stack();
    int num = 1;
    int btn_del = 0;
    
    Color defaultcolor, clickedcolor, white, black;
    
    public Home() {
        initComponents();
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnEnter.setEnabled(false);
            btnClear.setEnabled(false);
        jLabel7.setVisible(false);
        
        setTitle("Home");   // name of the frame
        setLocationRelativeTo(null); // center the frame
        setVisible(true);  // set the frame into visible
        
        defaultcolor = new Color (203,108,230);
        clickedcolor = new Color (51,51,51);
        white = new Color (255,255,255);
        black = new Color (0,0,0);
    }
     
    
    
     
     
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        m12 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        m11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        m1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        m2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        Event = new javax.swing.JLabel();
        Attendees = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEvent = new javax.swing.JTextField();
        txtAttendees = new javax.swing.JTextField();
        txtVenue = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        Venue = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        AddOns = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtAddOns = new javax.swing.JComboBox<>();
        Customer = new javax.swing.JLabel();
        txtpid = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 74, 173));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 74, 173));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/150.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 622, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jPanel1.setBackground(new java.awt.Color(203, 108, 230));
        jPanel1.setPreferredSize(new java.awt.Dimension(766, 403));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, -7, 560, 430));

        p2.setBackground(new java.awt.Color(203, 124, 225));

        m12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        m12.setText("Booking");
        m12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                m12MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(m12)
                .addGap(59, 59, 59))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 180, 40));

        p1.setBackground(new java.awt.Color(203, 124, 225));

        m11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        m11.setText("Home");
        m11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m11MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                m11MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(m11)
                .addGap(67, 67, 67))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 160, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 180, 420));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel1.setText("MAKE YOUR EVENT EXTRAORDINARY");

        jLabel3.setText("=============================================================================");

        jLabel4.setFont(new java.awt.Font("Brush Script MT", 1, 14)); // NOI18N
        jLabel4.setText("WITH");

        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel5.setText("THE FIRST STEP EVENTS");

        jLabel6.setText("=============================================================================");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("We are happy to help you to plan your upcoming event! ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Make your Booking Now");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setText("<< back");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout m1Layout = new javax.swing.GroupLayout(m1);
        m1.setLayout(m1Layout);
        m1Layout.setHorizontalGroup(
            m1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        m1Layout.setVerticalGroup(
            m1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", m1);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));

        Event.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Event.setText("Event :  ");

        Attendees.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Attendees.setText("No. of Attendees :");

        Name.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Name.setText("Name :");

        Email.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Email.setText("Email :");

        Venue.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Venue.setText("Venue :");

        AddOns.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AddOns.setText("Add Ons :");

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddMouseReleased(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Event", "Venue", "No_of_Attendees", "Add Ons"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtAddOns.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtAddOns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Catering", "Photographer", "Clown" }));

        Customer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Customer.setText("Customer ID :");

        txtpid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtpid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all" }));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnEnter.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEnter.setText("ENTER");
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnterMouseExited(evt);
            }
        });
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Attendees, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAttendees, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(Name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(41, 41, 41)
                                .addComponent(btnClear))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(Event)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(AddOns)
                        .addGap(17, 17, 17)
                        .addComponent(txtAddOns, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Venue)
                            .addComponent(Email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete))
                            .addComponent(txtEmail)
                            .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(93, 93, 93))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Venue)
                        .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Event)
                        .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddOns)
                            .addComponent(txtAddOns, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Attendees)
                            .addComponent(txtAttendees, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnClear))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Customer)
                    .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnEnter))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout m2Layout = new javax.swing.GroupLayout(m2);
        m2.setLayout(m2Layout);
        m2Layout.setHorizontalGroup(
            m2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        m2Layout.setVerticalGroup(
            m2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bookings", m2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 570, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m12MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_m12MouseClicked

    private void m12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m12MousePressed
        // TODO add your handling code here:
        p1.setBackground(defaultcolor);
        p2.setBackground(clickedcolor);
       
        
        m12.setForeground(white);
    }//GEN-LAST:event_m12MousePressed

    private void m12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m12MouseReleased
        // TODO add your handling code here:
        p2.setBackground(defaultcolor);
        m12.setForeground(black);
    }//GEN-LAST:event_m12MouseReleased

    private void m11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m11MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_m11MouseClicked

    private void m11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m11MousePressed
        // TODO add your handling code here:
        p1.setBackground(clickedcolor);
        p2.setBackground(defaultcolor);
       
        
        m11.setForeground(white);
    }//GEN-LAST:event_m11MousePressed

    private void m11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m11MouseReleased
        // TODO add your handling code here:
        p1.setBackground(defaultcolor);
        m11.setForeground(black);
    }//GEN-LAST:event_m11MouseReleased

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here
        String selectedValue = txtpid.getSelectedItem().toString();
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to continue Booking?", "Confirmation", JOptionPane.YES_NO_OPTION);            
          if (confirmation == JOptionPane.YES_OPTION) {                            
                // If you clicked yes it will go to the next frame
             String Name = linkedList.search(String.valueOf(selectedValue)).name;
             String Email = linkedList.search(String.valueOf(selectedValue)).email;
             String event = linkedList.search(String.valueOf(selectedValue)).event;
             String venue = linkedList.search(String.valueOf(selectedValue)).venue;
             String addons = linkedList.search(String.valueOf(selectedValue)).addons;

             // Calculate the prices 
            double eventPrice = 0.0, venuePrice  = 0.0,addonsPrice = 0.0;

            if (event.equals("Birthday")) eventPrice = 200.0;
            else if (event.equals("Marriage")) eventPrice = 500.0;
            else eventPrice = 300.0;

            if (venue.equals("Crown Royale")) venuePrice = 100.0;
            else venuePrice = 300.0;

            if (addons.equals("Catering")) addonsPrice = 250.0;
            else if (addons.equals("Photographer")) addonsPrice = 200.0;
            else if (addons.equals("Clown")) addonsPrice = 100.0;
            else addonsPrice = 0.0;
        

          // Calculate the total price
            double totalPrice = eventPrice + venuePrice + addonsPrice;

          // Display the summary/receipt
        String summary = "Name: " + Name + "\n"
                + "Email: " + Email + "\n"
                + "Event: " + event + " ($" + eventPrice + ")\n"
                + "Venue: " + venue + " ($" + venuePrice + ")\n"
                + "Add-ons: " + addons + " ($" + addonsPrice + ")\n"
                + "Total Price: $" + totalPrice;

        JOptionPane.showMessageDialog(this, summary, "Receipt", JOptionPane.INFORMATION_MESSAGE);
        
        //remove the data in jtable, linkedlist, and textfields
        String sv = txtpid.getSelectedItem().toString();
        DefaultTableModel dt = (DefaultTableModel)jTable2.getModel();
        int num_of_rows = dt.getRowCount();
        for(int a=0; a<num_of_rows; a++)
        {
            dt.removeRow(0);
        }
        linkedList.delete(sv);
        if(linkedList.size()==0) 
        {
            btnAdd.setEnabled(true);
            btnClear.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnEnter.setEnabled(false);
        }
        else if(dt.getRowCount()==0) {
            btnClear.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnEnter.setEnabled(false);
        }
            
            txtName.setText("");
            txtEmail.setText("");
            txtEvent.setText("");
            txtVenue.setText("");
            txtAttendees.setText("");
            txtAddOns.setSelectedIndex(0);
        txtpid.removeItemAt(linkedList.size()+1);
        btn_del = 0;
        num--;
        } 
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String selectedValue = txtpid.getSelectedItem().toString();
        DefaultTableModel dt = (DefaultTableModel)jTable2.getModel();
        int num_of_rows = dt.getRowCount();
        for(int a=0; a<num_of_rows; a++) dt.removeRow(0);
        
        //enabling only add button when the all button is selected in jcombo
        if(selectedValue.equals("all"))
        {
            btnAdd.setEnabled(true);
            btnClear.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnEnter.setEnabled(false);
            btn_del = 0;
            for(int a=1; a<=linkedList.size(); a++)
            {
                String setOfData[] = {linkedList.search(String.valueOf(a)).id, 
                            linkedList.search(String.valueOf(a)).name, 
                            linkedList.search(String.valueOf(a)).email,
                            linkedList.search(String.valueOf(a)).event,
                            linkedList.search(String.valueOf(a)).venue,
                            linkedList.search(String.valueOf(a)).no_of_attendees,
                            linkedList.search(String.valueOf(a)).addons};
                dt.addRow(setOfData);
                
                txtName.setText("");
                txtEmail.setText("");
                txtEvent.setText("");
                txtVenue.setText("");
                txtAttendees.setText("");
                txtAddOns.setSelectedIndex(0);
            }
        }else
        {
            btnAdd.setEnabled(false);
            btnClear.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnEnter.setEnabled(true);
            String setOfData[] = {linkedList.search(selectedValue).id, 
                            linkedList.search(selectedValue).name, 
                            linkedList.search(selectedValue).email,
                            linkedList.search(selectedValue).event,
                            linkedList.search(selectedValue).venue,
                            linkedList.search(selectedValue).no_of_attendees,
                            linkedList.search(selectedValue).addons};
            dt.addRow(setOfData);
            
            txtName.setText(linkedList.search(selectedValue).name);
            txtEmail.setText(linkedList.search(selectedValue).email);
            txtEvent.setText(linkedList.search(selectedValue).event);
            txtVenue.setText(linkedList.search(selectedValue).venue);
            txtAttendees.setText(linkedList.search(selectedValue).no_of_attendees);
            txtAddOns.setSelectedItem(linkedList.search(selectedValue).addons);
            btn_del=1;
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        //remove the data in jtable, linkedlist, and textfields
        String selectedValue = txtpid.getSelectedItem().toString();
        DefaultTableModel dt = (DefaultTableModel)jTable2.getModel();
        int num_of_rows = dt.getRowCount();
        for(int a=0; a<num_of_rows; a++)
        {
            dt.removeRow(0);
        }
        linkedList.delete(selectedValue);
        if(linkedList.size()==0) 
        {
            btnAdd.setEnabled(true);
            btnClear.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnEnter.setEnabled(false);
        }
        else if(dt.getRowCount()==0) {
            btnClear.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnEnter.setEnabled(false);
        }
            
            txtName.setText("");
            txtEmail.setText("");
            txtEvent.setText("");
            txtVenue.setText("");
            txtAttendees.setText("");
            txtAddOns.setSelectedIndex(0);
        txtpid.removeItemAt(linkedList.size()+1);
        btn_del = 0;
        num--;
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Updating information in table
        String selectedValue = txtpid.getSelectedItem().toString();
        linkedList.update(selectedValue, txtName.getText(), txtEmail.getText(), txtEvent.getText(), txtVenue.getText(), txtAttendees.getText(), txtAddOns.getSelectedItem().toString());
        DefaultTableModel dt = (DefaultTableModel)jTable2.getModel();
        int num_of_rows = dt.getRowCount();
        btnClear.setEnabled(false);
        for(int a=0; a<num_of_rows; a++)
        {
            dt.removeRow(0);
        }
        String setOfData[] = {linkedList.search(selectedValue).id, 
                            linkedList.search(selectedValue).name, 
                            linkedList.search(selectedValue).email,
                            linkedList.search(selectedValue).event,
                            linkedList.search(selectedValue).venue,
                            linkedList.search(selectedValue).no_of_attendees,
                            linkedList.search(selectedValue).addons};
            dt.addRow(setOfData);
            
        //remove the data in textfields
        txtName.setText("");
        txtEmail.setText("");
        txtEvent.setText("");
        txtVenue.setText("");
        txtAttendees.setText("");
        txtAddOns.setSelectedIndex(0);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        //remove the data in textfields
        txtName.setText("");
        txtEmail.setText("");
        txtEvent.setText("");
        txtVenue.setText("");
        txtAttendees.setText("");
        txtAddOns.setSelectedIndex(0);

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      DefaultTableModel dt = (DefaultTableModel)jTable2.getModel();
      stack ll = linkedList;
      if(!(txtName.getText().equals("")) && !(txtEmail.getText().equals("")) && !(txtEvent.getText().equals("")) && !(txtVenue.getText().equals("")) && !(txtAttendees.getText().equals("")))
      {
        ll.enqueue(String.valueOf(num), txtName.getText(), txtEmail.getText(), txtEvent.getText(), txtVenue.getText(), txtAttendees.getText(), txtAddOns.getSelectedItem().toString());
        txtpid.addItem(String.valueOf(linkedList.size()));


        String setOfData[] = {linkedList.search(String.valueOf(num)).id, 
                              linkedList.search(String.valueOf(num)).name, 
                              linkedList.search(String.valueOf(num)).email,
                              linkedList.search(String.valueOf(num)).event,
                              linkedList.search(String.valueOf(num)).venue,
                              linkedList.search(String.valueOf(num)).no_of_attendees,
                              linkedList.search(String.valueOf(num)).addons};
          dt.addRow(setOfData);

          txtName.setText("");
          txtEmail.setText("");
          txtEvent.setText("");
          txtVenue.setText("");
          txtAttendees.setText("");
          txtAddOns.setSelectedIndex(0);
          id_num:num++;
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
        if(btn_del == 0) 
        {
            jLabel7.setVisible(true);
            jLabel7.setText("Search specific ID first");
        }
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
        jLabel7.setVisible(false);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        // TODO add your handling code here:
        if(btn_del == 0) 
        {
            jLabel7.setVisible(true);
            jLabel7.setText("Search specific ID first");
        }
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        // TODO add your handling code here:
        jLabel7.setVisible(false);
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
        if(btn_del == 1) 
        {
            jLabel7.setVisible(true);
            jLabel7.setText("Search specific ID first");
        }
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
        jLabel7.setVisible(false);
    }//GEN-LAST:event_btnAddMouseExited

    private void btnEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseEntered
        // TODO add your handling code here:
        if(btn_del == 0) 
        {
            jLabel7.setVisible(true);
            jLabel7.setText("Search specific ID first");
        }
    }//GEN-LAST:event_btnEnterMouseEntered

    private void btnEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseExited
        // TODO add your handling code here:
        jLabel7.setVisible(false);
    }//GEN-LAST:event_btnEnterMouseExited

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
        // TODO add your handling code here:
        if(txtName.getText().equals("")) txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
        if(txtEmail.getText().equals("")) txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
        if(txtEvent.getText().equals("")) txtEvent.setBorder(BorderFactory.createLineBorder(Color.RED));
        if(txtVenue.getText().equals("")) txtVenue.setBorder(BorderFactory.createLineBorder(Color.RED));
        if(txtAttendees.getText().equals("")) txtAttendees.setBorder(BorderFactory.createLineBorder(Color.RED));
    }//GEN-LAST:event_btnAddMousePressed

    private void btnAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseReleased
        // TODO add your handling code here:
        if(txtName.getText().equals("")) txtName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(txtEmail.getText().equals("")) txtEmail.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(txtEvent.getText().equals("")) txtEvent.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(txtVenue.getText().equals("")) txtVenue.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(txtAttendees.getText().equals("")) txtAttendees.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }//GEN-LAST:event_btnAddMouseReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jLabel8.setForeground(blue);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jLabel8.setForeground(black);
    }//GEN-LAST:event_jLabel8MouseExited

   
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddOns;
    private javax.swing.JLabel Attendees;
    private javax.swing.JLabel Customer;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Event;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Venue;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel m1;
    private javax.swing.JLabel m11;
    private javax.swing.JLabel m12;
    private javax.swing.JPanel m2;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JComboBox<String> txtAddOns;
    private javax.swing.JTextField txtAttendees;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEvent;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtVenue;
    private javax.swing.JComboBox<String> txtpid;
    // End of variables declaration//GEN-END:variables

}
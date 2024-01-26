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
            ta.setEditable(false);
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
        Attendees1 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        Attendees2 = new javax.swing.JLabel();
        hour_1 = new javax.swing.JSpinner();
        hour_2 = new javax.swing.JSpinner();
        min_1 = new javax.swing.JSpinner();
        min_2 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        ap = new javax.swing.JComboBox<>();
        m3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();

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
                "ID", "Name", "Email", "Event", "Venue", "No_of_Attendees", "Add Ons", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
        }

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

        Attendees1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Attendees1.setText("Date:");

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" }));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        Attendees2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Attendees2.setText("Time:");

        hour_1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));

        hour_2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));

        min_1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        min_2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));

        jLabel9.setText(":");

        ap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(Name)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(Event)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(Attendees, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAttendees, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(Customer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(btnAdd)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnSearch)
                                            .addComponent(btnClear))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Venue)
                                    .addComponent(Email))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail)
                                    .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(AddOns)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddOns, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(68, 68, 68)
                                .addComponent(btnDelete)))))
                .addGap(93, 93, 93))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Attendees1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(Attendees2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hour_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(hour_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(min_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(min_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Event)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddOns)
                            .addComponent(txtAddOns, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Attendees)
                            .addComponent(txtAttendees, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Attendees1)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Attendees2)
                    .addComponent(hour_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hour_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Customer)
                    .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnEnter))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Event", "Venue", "No_of_Attendees", "Add Ons", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
            jTable3.getColumnModel().getColumn(6).setResizable(false);
            jTable3.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel12.setText("***Note***");

        ta.setColumns(20);
        ta.setLineWrap(true);
        ta.setRows(5);
        ta.setText("this Jpanel is only seen from system database only. that's the reason why there's no button of this transaction in the left side. page should not possessed the ability to delete any transaction records.");
        ta.setBorder(null);
        ta.setOpaque(false);
        jScrollPane2.setViewportView(ta);

        javax.swing.GroupLayout m3Layout = new javax.swing.GroupLayout(m3);
        m3.setLayout(m3Layout);
        m3Layout.setHorizontalGroup(
            m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
            .addGroup(m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
        );
        m3Layout.setVerticalGroup(
            m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m3Layout.createSequentialGroup()
                    .addGap(0, 88, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Transaction", m3);

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
        
        DefaultTableModel jtbl = (DefaultTableModel)jTable3.getModel();
      //the jcombo and jspinner will get the value of hour and minutes and merge it into time variable
        String hour = hour_1.getValue().toString()+hour_2.getValue().toString();
        String min = min_1.getValue().toString()+min_2.getValue().toString();
        
        //the jcombo will get the value of month, day, year variable and merge it into date variable
        String selectedValue_month = month.getSelectedItem().toString();
        String selectedValue_day = day.getSelectedItem().toString();
        String selectedValue_year = year.getSelectedItem().toString();
        stack ll = linkedList;
      
        ll.transaction_add(selectedValue, txtName.getText(), txtEmail.getText(), txtEvent.getText(), txtVenue.getText(), txtAttendees.getText(), txtAddOns.getSelectedItem().toString(), selectedValue_month, selectedValue_day, selectedValue_year, hour_1.getValue().toString(), hour_2.getValue().toString(), min_1.getValue().toString(), min_2.getValue().toString(), ap.getSelectedItem().toString());


        String setOfData[] = {linkedList.locate(selectedValue).id, 
                              linkedList.locate(selectedValue).name, 
                              linkedList.locate(selectedValue).email,
                              linkedList.locate(selectedValue).event,
                              linkedList.locate(selectedValue).venue,
                              linkedList.locate(selectedValue).no_of_attendees,
                              linkedList.locate(selectedValue).addons,
                              linkedList.locate(selectedValue).month+" "+linkedList.locate(selectedValue).day+", "+linkedList.locate(selectedValue).year,
                              linkedList.locate(selectedValue).hour1+linkedList.locate(selectedValue).hour2+":"+linkedList.locate(selectedValue).min1+linkedList.locate(selectedValue).min2+linkedList.locate(selectedValue).ap
        };
          jtbl.addRow(setOfData);
        
        //remove the data in jtable, linkedlist, and textfields
        String sv = txtpid.getSelectedItem().toString();
        DefaultTableModel dt = (DefaultTableModel)jTable2.getModel();
        int num_of_rows = dt.getRowCount();
        for(int a=0; a<num_of_rows; a++)
        {
            dt.removeRow(0);
        }
        linkedList.pop(sv);
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
            month.setSelectedIndex(0);
            day.setSelectedIndex(0);
            year.setSelectedIndex(0);
            ap.setSelectedIndex(0);
            hour_1.setValue(0);
            hour_2.setValue(0);
            min_1.setValue(0);
            min_2.setValue(0);
        txtpid.removeItemAt(linkedList.size()+1);
        btn_del = 0;
        num--;
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String selectedValue = txtpid.getSelectedItem().toString();
        
        //the jcombo and jspinner will get the value of hour and minutes and merge it into time variable
        String hour = hour_1.getValue().toString()+hour_2.getValue().toString();
        String min = min_1.getValue().toString()+min_2.getValue().toString();
        String time = hour+":"+min+ap.getSelectedItem().toString();
        
        //the jcombo will get the value of month, day, year variable and merge it into date variable
        String selectedValue_month = month.getSelectedItem().toString();
        String selectedValue_day = day.getSelectedItem().toString();
        String selectedValue_year = year.getSelectedItem().toString();
        String date = selectedValue_month+" "+selectedValue_day+", "+selectedValue_year;
        
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
                            linkedList.search(String.valueOf(a)).addons,
                            linkedList.search(String.valueOf(a)).month+" "+linkedList.search(String.valueOf(a)).day+", "+linkedList.search(String.valueOf(a)).year,
                            linkedList.search(String.valueOf(a)).hour1+linkedList.search(String.valueOf(a)).hour2+":"+linkedList.search(String.valueOf(a)).min1+linkedList.search(String.valueOf(a)).min2+linkedList.search(String.valueOf(a)).ap
            };
                dt.addRow(setOfData);
                
                txtName.setText("");
                txtEmail.setText("");
                txtEvent.setText("");
                txtVenue.setText("");
                txtAttendees.setText("");
                txtAddOns.setSelectedIndex(0);
                month.setSelectedIndex(0);
                day.setSelectedIndex(0);
                year.setSelectedIndex(0);
                ap.setSelectedIndex(0);
                hour_1.setValue(0);
                hour_2.setValue(0);
                min_1.setValue(0);
                min_2.setValue(0);
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
                            linkedList.search(selectedValue).addons,
                            linkedList.search(selectedValue).month+" "+linkedList.search(selectedValue).day+", "+linkedList.search(selectedValue).year,
                            linkedList.search(selectedValue).hour1+linkedList.search(selectedValue).hour2+":"+linkedList.search(selectedValue).min1+linkedList.search(selectedValue).min2+linkedList.search(selectedValue).ap
            };
            dt.addRow(setOfData);
            
            txtName.setText(linkedList.search(selectedValue).name);
            txtEmail.setText(linkedList.search(selectedValue).email);
            txtEvent.setText(linkedList.search(selectedValue).event);
            txtVenue.setText(linkedList.search(selectedValue).venue);
            txtAttendees.setText(linkedList.search(selectedValue).no_of_attendees);
            txtAddOns.setSelectedItem(linkedList.search(selectedValue).addons);
            month.setSelectedItem(linkedList.search(selectedValue).month);
            day.setSelectedItem(linkedList.search(selectedValue).day);
            year.setSelectedItem(linkedList.search(selectedValue).year);
            hour_1.setValue(Integer.parseInt(linkedList.search(selectedValue).hour1));
            hour_2.setValue(Integer.parseInt(linkedList.search(selectedValue).hour2));
            min_1.setValue(Integer.parseInt(linkedList.search(selectedValue).min1));
            min_2.setValue(Integer.parseInt(linkedList.search(selectedValue).min2));
            ap.setSelectedItem(linkedList.search(selectedValue).ap);
            
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
        linkedList.pop(selectedValue);
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
          month.setSelectedIndex(0);
          day.setSelectedIndex(0);
          year.setSelectedIndex(0);
          ap.setSelectedIndex(0);
          hour_1.setValue(0);
          hour_2.setValue(0);
          min_1.setValue(0);
          min_2.setValue(0);
          ap.setSelectedIndex(0);
        txtpid.removeItemAt(linkedList.size()+1);
        btn_del = 0;
        num--;
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //the jcombo and jspinner will get the value of hour and minutes and merge it into time variable
        String hour = hour_1.getValue().toString()+hour_2.getValue().toString();
        String min = min_1.getValue().toString()+min_2.getValue().toString();
        
        //the jcombo will get the value of month, day, year variable and merge it into date variable
        String selectedValue_month = month.getSelectedItem().toString();
        String selectedValue_day = day.getSelectedItem().toString();
        String selectedValue_year = year.getSelectedItem().toString();

// Updating information in table
        String selectedValue = txtpid.getSelectedItem().toString();
        linkedList.update(selectedValue, txtName.getText(), txtEmail.getText(), txtEvent.getText(), txtVenue.getText(), txtAttendees.getText(), txtAddOns.getSelectedItem().toString(), selectedValue_month, selectedValue_day, selectedValue_year, hour_1.getValue().toString(), hour_2.getValue().toString(), min_1.getValue().toString(), min_2.getValue().toString(), ap.getSelectedItem().toString());
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
                            linkedList.search(selectedValue).addons,
                            linkedList.search(selectedValue).month+" "+linkedList.search(selectedValue).day+", "+linkedList.search(selectedValue).year,
                            linkedList.search(selectedValue).hour1+linkedList.search(selectedValue).hour2+":"+linkedList.search(selectedValue).min1+linkedList.search(selectedValue).min2+linkedList.search(selectedValue).ap
            };
            dt.addRow(setOfData);
            
        //remove the data in textfields
        txtName.setText("");
        txtEmail.setText("");
        txtEvent.setText("");
        txtVenue.setText("");
        txtAttendees.setText("");
        txtAddOns.setSelectedIndex(0);
        btnUpdate.setEnabled(false);
          month.setSelectedIndex(0);
          day.setSelectedIndex(0);
          year.setSelectedIndex(0);
          ap.setSelectedIndex(0);
          hour_1.setValue(0);
          hour_2.setValue(0);
          min_1.setValue(0);
          min_2.setValue(0);
          ap.setSelectedIndex(0);
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
        month.setSelectedIndex(0);
        day.setSelectedIndex(0);
        year.setSelectedIndex(0);
        ap.setSelectedIndex(0);
        hour_1.setValue(0);
        hour_2.setValue(0);
        min_1.setValue(0);
        min_2.setValue(0);

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      DefaultTableModel dt = (DefaultTableModel)jTable2.getModel();
      //the jcombo and jspinner will get the value of hour and minutes and merge it into time variable
        String hour = hour_1.getValue().toString()+hour_2.getValue().toString();
        String min = min_1.getValue().toString()+min_2.getValue().toString();
        
        //the jcombo will get the value of month, day, year variable and merge it into date variable
        String selectedValue_month = month.getSelectedItem().toString();
        String selectedValue_day = day.getSelectedItem().toString();
        String selectedValue_year = year.getSelectedItem().toString();
      stack ll = linkedList;
      if(!(txtName.getText().equals("")) && !(txtEmail.getText().equals("")) && !(txtEvent.getText().equals("")) && !(txtVenue.getText().equals("")) && !(txtAttendees.getText().equals("")) && !(selectedValue_month.equals("Month")) && !(selectedValue_day.equals("Day")) && !(selectedValue_year.equals("Year")) && ((!(hour_1.equals("0"))) || !(hour_2.equals("0"))) )
      {
        ll.push(String.valueOf(num), txtName.getText(), txtEmail.getText(), txtEvent.getText(), txtVenue.getText(), txtAttendees.getText(), txtAddOns.getSelectedItem().toString(), selectedValue_month, selectedValue_day, selectedValue_year, hour_1.getValue().toString(), hour_2.getValue().toString(), min_1.getValue().toString(), min_2.getValue().toString(), ap.getSelectedItem().toString());
        txtpid.addItem(String.valueOf(linkedList.size()));


        String setOfData[] = {linkedList.search(String.valueOf(num)).id, 
                              linkedList.search(String.valueOf(num)).name, 
                              linkedList.search(String.valueOf(num)).email,
                              linkedList.search(String.valueOf(num)).event,
                              linkedList.search(String.valueOf(num)).venue,
                              linkedList.search(String.valueOf(num)).no_of_attendees,
                              linkedList.search(String.valueOf(num)).addons,
                              linkedList.search(String.valueOf(num)).month+" "+linkedList.search(String.valueOf(num)).day+", "+linkedList.search(String.valueOf(num)).year,
                              linkedList.search(String.valueOf(num)).hour1+linkedList.search(String.valueOf(num)).hour2+":"+linkedList.search(String.valueOf(num)).min1+linkedList.search(String.valueOf(num)).min2+linkedList.search(String.valueOf(num)).ap
        };
          dt.addRow(setOfData);

          txtName.setText("");
          txtEmail.setText("");
          txtEvent.setText("");
          txtVenue.setText("");
          txtAttendees.setText("");
          txtAddOns.setSelectedIndex(0);
          month.setSelectedIndex(0);
          day.setSelectedIndex(0);
          year.setSelectedIndex(0);
          ap.setSelectedIndex(0);
          hour_1.setValue(0);
          hour_2.setValue(0);
          min_1.setValue(0);
          min_2.setValue(0);
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
        if(month.getSelectedItem().toString().equals("Month")) month.setBorder(BorderFactory.createLineBorder(Color.RED));
        if(day.getSelectedItem().toString().equals("Day")) day.setBorder(BorderFactory.createLineBorder(Color.RED));
        if(year.getSelectedItem().toString().equals("Year")) year.setBorder(BorderFactory.createLineBorder(Color.RED));
        if(((hour_1.getValue().toString().equals("0")) && hour_2.getValue().toString().equals("0"))){
            hour_1.setBorder(BorderFactory.createLineBorder(Color.RED));
            hour_2.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
    }//GEN-LAST:event_btnAddMousePressed

    private void btnAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseReleased
        // TODO add your handling code here:
        if(txtName.getText().equals("")) txtName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(txtEmail.getText().equals("")) txtEmail.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(txtEvent.getText().equals("")) txtEvent.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(txtVenue.getText().equals("")) txtVenue.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(txtAttendees.getText().equals("")) txtAttendees.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(month.getSelectedItem().toString().equals("Month")) month.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(day.getSelectedItem().toString().equals("Day")) day.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if(year.getSelectedItem().toString().equals("Year")) year.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        //ayusin pa tong if statement na to
        if(((hour_1.getValue().toString().equals("0")) && hour_2.getValue().toString().equals("0"))){
            hour_1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            hour_2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }
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

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

   
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
    private javax.swing.JLabel Attendees1;
    private javax.swing.JLabel Attendees2;
    private javax.swing.JLabel Customer;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Event;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Venue;
    private javax.swing.JComboBox<String> ap;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JSpinner hour_1;
    private javax.swing.JSpinner hour_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel m1;
    private javax.swing.JLabel m11;
    private javax.swing.JLabel m12;
    private javax.swing.JPanel m2;
    private javax.swing.JPanel m3;
    private javax.swing.JSpinner min_1;
    private javax.swing.JSpinner min_2;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JTextArea ta;
    private javax.swing.JComboBox<String> txtAddOns;
    private javax.swing.JTextField txtAttendees;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEvent;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtVenue;
    private javax.swing.JComboBox<String> txtpid;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables

}
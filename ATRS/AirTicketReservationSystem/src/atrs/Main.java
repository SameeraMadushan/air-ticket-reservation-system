/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atrs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.util.HashMap;
import java.util.*;


/**
 *
 * @author Sameera
 */
public class Main extends javax.swing.JFrame {

    //variable for connect to database
    Connection conn=null;
    //
    PreparedStatement pstatement=null;
    ResultSet Results=null;
    
    
    //Initializing variables
    //user
    //reservation,basic details, transaction and package
    String departure = "";  
    String destination = "";
    String flightClass = "";
    String dateDay = "";
    String dateMonth = "";
    String dateYear = "";
    int ticketCount = 0;
    double price = 0;
    String flightId = "";
    

    String airlineId = "";
    String airlineName = "";
    String landingTime = "";
    String departureTime = "";
    int availableSeats = 0;

    //customer details
    String customerId = "";
    String passportId = "";
    String surname = "";
    String firstName = "";
    String dobDay = "";
    String dobMonth = "";
    String dobYear;
    String gender = "";
    String nationality = "";
    String nic = "";
    String address = "";
    String occupation = "";
    String contact = "";
    String email = "";
    
    // User Details
    String userID = null;
    String userName = null;
    String userPassword = null;
    String phoneNo = null;
    String name = null;
    String userEmail = null;
    int userLevel;

    //transaction details
    String transactionId="";
    String paymentMethod = null;
    double amount;

    //confirmation
    double totalAmount = 0;
    String userId = "";
    String password = "";
    
    //holiday packages
    String packageId="";
    String packageName="";
    int days;
    String hotelName;
    
    //seat id's
    String seatId1="";
    String seatId2="";
    String seatId3="";
    String seatId4="";
    String seatId5="";
    String seatId6="";
    String seatId7="";
    String seatId8="";
    String seatId9="";
    String seatId10="";
    String seat[]=new String[10];
    String seatId[]=new String[10];
    
    //confirmation details
    int ticketId;
    String passId;
    double prce;
    String fltId;
    String stId;
    int count;
    
    public Main() {
        initComponents();
        jTabbedPaneUser.setEnabledAt(0, true);
        jTabbedPaneUser.setEnabledAt(1, false);
        jTabbedPaneUser.setEnabledAt(2, false);
        jTabbedPaneUser.setEnabledAt(3, false);
        jTabbedPaneUser.setEnabledAt(4, false);
        jTabbedPaneUser.setEnabledAt(5, false);
        jTabbedPaneUser.setEnabledAt(6, false);
        jTabbedPaneUser.setEnabledAt(7, false);
        jTabbedPaneUser.setEnabledAt(8, false);
        jTabbedPaneUser.setEnabledAt(9, false);
        jTabbedPaneAdmin.setVisible(false);
        jTabbedPaneUser.setVisible(false);
        jInternalFrameLogin.setVisible(true);
        
        
        jLabelCus.setVisible(false);
        jLabelPass.setVisible(false);
        jLabelSur.setVisible(false);
        jLabelfname.setVisible(false);
        jLabelgender.setVisible(false);
        jLabelnational.setVisible(false);
        jLabelnic.setVisible(false);
        jLabeladd.setVisible(false);
        jLabelocc.setVisible(false);
        jLabelcontact.setVisible(false);
        jLabelemail.setVisible(false);
        jLabeldob.setVisible(false);
        
        
        seat10letter.setVisible(false);
        seat10number.setVisible(false);
        seat10.setVisible(false);
        seat9letter.setVisible(false);
        seat9number.setVisible(false);
        seat9.setVisible(false);
        seat8letter.setVisible(false);
        seat8number.setVisible(false);
        seat8.setVisible(false);
        seat7letter.setVisible(false);
        seat7number.setVisible(false);
        seat7.setVisible(false);
        seat6letter.setVisible(false);
        seat6number.setVisible(false);
        seat6.setVisible(false);
        seat5letter.setVisible(false);
        seat5number.setVisible(false);
        seat5.setVisible(false);
        seat4letter.setVisible(false);
        seat4number.setVisible(false);
        seat4.setVisible(false);
        seat3letter.setVisible(false);
        seat3number.setVisible(false);
        seat3.setVisible(false); 
        seat2letter.setVisible(false);
        seat2number.setVisible(false);
        seat2.setVisible(false);
        seat1letter.setVisible(false);
        seat1number.setVisible(false);
        seat1.setVisible(false);

        
          
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDesktopPaneMain = new javax.swing.JDesktopPane();
        jInternalFrameLogin = new javax.swing.JInternalFrame();
        txtusername = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jTabbedPaneAdmin = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jTextFieldUserID1 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jTextFieldusername1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPasswordFieldconfirm1 = new javax.swing.JPasswordField();
        jTextFieldphone1 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jComboBoxuserlevel = new javax.swing.JComboBox<>();
        jButtonaddUser = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jTextFieldemail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextFielduserId = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jButtondeleteUser = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTablesearchUser = new javax.swing.JTable();
        jButtonSearcuser = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jTextFieldcustomerId3 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jTextFieldpassID3 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jTextFieldNIC3 = new javax.swing.JTextField();
        jButtonsearchCustomer = new javax.swing.JButton();
        jButtonDeletecustomer = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTablesearchResult3 = new javax.swing.JTable();
        jLabel81 = new javax.swing.JLabel();
        jTabbedPaneUser = new javax.swing.JTabbedPane();
        jPanelMainMenu = new javax.swing.JPanel();
        TicketsOnly = new javax.swing.JButton();
        jButtonTourPackages = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanelBasicDetails = new javax.swing.JPanel();
        BasicDetailsNext = new javax.swing.JButton();
        BasicDetailsBack = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jComboBoxdeparture = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxdestination = new javax.swing.JComboBox<>();
        jComboBoxflightclass = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxday = new javax.swing.JComboBox<>();
        jComboBoxmonth = new javax.swing.JComboBox<>();
        jComboBoxyear = new javax.swing.JComboBox<>();
        jComboBoxticketcount = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanelReservation = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFlightDetails = new javax.swing.JTable();
        ReserveNext = new javax.swing.JButton();
        ReserveBack = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldFrom2 = new javax.swing.JTextField();
        jTextFieldAirline2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldAirlineId2 = new javax.swing.JTextField();
        jTextFieldFlightId2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextFieldArrivasl2 = new javax.swing.JTextField();
        jTextFieldDeparture2 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jTextFieldSeats = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextFieldTo2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPanelPackages = new javax.swing.JPanel();
        PackagesBack = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButtonpackageMalayasia = new javax.swing.JButton();
        jButtonpackageAfrica = new javax.swing.JButton();
        jButtonpackageDownunder = new javax.swing.JButton();
        jButtonpackageParis = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jButtonpackageMilan = new javax.swing.JButton();
        jPanelPackageReservation = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldpname4 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextFieldhotelname4 = new javax.swing.JTextField();
        jTextFieldFlightId4 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextFieldpackageprice = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextFielddays = new javax.swing.JTextField();
        jComboBoxticketcount4 = new javax.swing.JComboBox<>();
        packagereservationNext = new javax.swing.JButton();
        Packagereserback = new javax.swing.JButton();
        jPlanelSeatArrangement = new javax.swing.JPanel();
        LockSeats = new javax.swing.JButton();
        LockSeatsNext = new javax.swing.JButton();
        seat1number = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        seat1letter = new javax.swing.JComboBox<>();
        seat2number = new javax.swing.JComboBox<>();
        seat2letter = new javax.swing.JComboBox<>();
        seat2 = new javax.swing.JLabel();
        seat1 = new javax.swing.JLabel();
        seat3 = new javax.swing.JLabel();
        seat3number = new javax.swing.JComboBox<>();
        seat3letter = new javax.swing.JComboBox<>();
        seat4 = new javax.swing.JLabel();
        seat4number = new javax.swing.JComboBox<>();
        seat4letter = new javax.swing.JComboBox<>();
        seat5letter = new javax.swing.JComboBox<>();
        seat5 = new javax.swing.JLabel();
        seat5number = new javax.swing.JComboBox<>();
        seat6letter = new javax.swing.JComboBox<>();
        seat6 = new javax.swing.JLabel();
        seat6number = new javax.swing.JComboBox<>();
        seat7letter = new javax.swing.JComboBox<>();
        seat7 = new javax.swing.JLabel();
        seat7number = new javax.swing.JComboBox<>();
        seat8letter = new javax.swing.JComboBox<>();
        seat8 = new javax.swing.JLabel();
        seat8number = new javax.swing.JComboBox<>();
        seat9 = new javax.swing.JLabel();
        seat9letter = new javax.swing.JComboBox<>();
        seat9number = new javax.swing.JComboBox<>();
        seat10number = new javax.swing.JComboBox<>();
        seat10 = new javax.swing.JLabel();
        seat10letter = new javax.swing.JComboBox<>();
        ReserveBack2 = new javax.swing.JButton();
        jPanelCustomerDetails = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCustomerId5 = new javax.swing.JTextField();
        jTextFieldPassportId5 = new javax.swing.JTextField();
        jTextFieldSurname5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFirstName5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNationality5 = new javax.swing.JTextField();
        jComboBoxGender5 = new javax.swing.JComboBox();
        jLabelCus = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jLabelSur = new javax.swing.JLabel();
        jLabelfname = new javax.swing.JLabel();
        jLabelgender = new javax.swing.JLabel();
        jLabelnational = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldNic5 = new javax.swing.JTextField();
        jLabelnic = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress5 = new javax.swing.JTextArea();
        jLabeladd = new javax.swing.JLabel();
        jTextFieldOccupation5 = new javax.swing.JTextField();
        jLabelocc = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabelcontact = new javax.swing.JLabel();
        jTextFieldContact5 = new javax.swing.JTextField();
        jLabelContact = new javax.swing.JLabel();
        jLabelContact1 = new javax.swing.JLabel();
        jTextFieldEmail5 = new javax.swing.JTextField();
        jLabelemail = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxdobday = new javax.swing.JComboBox<>();
        jComboBoxdobmonth = new javax.swing.JComboBox<>();
        jComboBoxdobyear = new javax.swing.JComboBox<>();
        jLabeldob = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        AddCustomer = new javax.swing.JButton();
        CustomerDetailsNext = new javax.swing.JButton();
        jButtonDeleteCustomer = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableCustomerDetails = new javax.swing.JTable();
        jPanelTransaction = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldTransactionId6 = new javax.swing.JTextField();
        jTextFieldCustomerId6 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxPaymentMethod6 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldAmount6 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        TransactionNext = new javax.swing.JButton();
        TransactionBack = new javax.swing.JButton();
        transactionNext = new javax.swing.JButton();
        jPanelConfirmation = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableConfirmation = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ConfirmReservation = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        confirmationBack8 = new javax.swing.JButton();
        jlableTotalAmount8 = new javax.swing.JTextField();
        jlableTransactionId = new javax.swing.JTextField();
        confirmationNext8 = new javax.swing.JButton();
        jPanelPrintTicket = new javax.swing.JPanel();
        PrintTicket = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemexit = new javax.swing.JMenuItem();
        jMenuItemlogout = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameLogin.setBackground(new java.awt.Color(204, 204, 255));
        jInternalFrameLogin.setVisible(true);
        jInternalFrameLogin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jInternalFrameLogin.getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 180, -1));

        jLabel66.setText("User Name");
        jInternalFrameLogin.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel67.setText("Password");
        jInternalFrameLogin.getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        jInternalFrameLogin.getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 180, -1));

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jInternalFrameLogin.getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 60, 30));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atrs/login  icon.png"))); // NOI18N
        jInternalFrameLogin.getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jDesktopPaneMain.add(jInternalFrameLogin);
        jInternalFrameLogin.setBounds(335, 70, 390, 340);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel68.setText("User ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(150, 190, 0, 0);
        jPanel2.add(jLabel68, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(140, 34, 0, 0);
        jPanel2.add(jTextFieldUserID1, gridBagConstraints);

        jLabel70.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 190, 0, 0);
        jPanel2.add(jLabel70, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 34, 0, 0);
        jPanel2.add(jTextFieldusername1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 34, 0, 0);
        jPanel2.add(jPasswordField1, gridBagConstraints);

        jLabel71.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 190, 0, 0);
        jPanel2.add(jLabel71, gridBagConstraints);

        jLabel72.setText("Confirm Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 190, 0, 0);
        jPanel2.add(jLabel72, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 34, 0, 0);
        jPanel2.add(jPasswordFieldconfirm1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(140, 50, 0, 208);
        jPanel2.add(jTextFieldphone1, gridBagConstraints);

        jLabel73.setText("Phone Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(150, 138, 0, 0);
        jPanel2.add(jLabel73, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 50, 0, 208);
        jPanel2.add(jTextFieldname, gridBagConstraints);

        jLabel74.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 138, 0, 0);
        jPanel2.add(jLabel74, gridBagConstraints);

        jLabel75.setText("User Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 138, 0, 0);
        jPanel2.add(jLabel75, gridBagConstraints);

        jComboBoxuserlevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 108;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 0, 208);
        jPanel2.add(jComboBoxuserlevel, gridBagConstraints);

        jButtonaddUser.setText("Add User");
        jButtonaddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(120, 130, 107, 0);
        jPanel2.add(jButtonaddUser, gridBagConstraints);

        jLabel76.setText("E-Mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 138, 0, 0);
        jPanel2.add(jLabel76, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 0, 208);
        jPanel2.add(jTextFieldemail, gridBagConstraints);

        jTabbedPaneAdmin.addTab("Insert User", jPanel2);

        jLabel77.setText("User ID");

        jButtondeleteUser.setText("Delete");
        jButtondeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteUserActionPerformed(evt);
            }
        });

        jTablesearchUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTablesearchUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablesearchUserMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTablesearchUser);

        jButtonSearcuser.setText("Search");
        jButtonSearcuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearcuserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("User Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtondeleteUser)
                            .addGap(60, 60, 60)
                            .addComponent(jButtonSearcuser))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(140, 140, 140)
                                    .addComponent(jLabel77)
                                    .addGap(24, 24, 24)
                                    .addComponent(jTextFielduserId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(491, 491, 491)
                                    .addComponent(jLabel4)))
                            .addGap(399, 399, 399)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77)
                    .addComponent(jTextFielduserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtondeleteUser)
                    .addComponent(jButtonSearcuser))
                .addGap(57, 57, 57))
        );

        jTabbedPaneAdmin.addTab("Delete User", jPanel1);

        jLabel78.setText("Customer ID");

        jTextFieldcustomerId3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcustomerId3ActionPerformed(evt);
            }
        });

        jLabel79.setText("Passport ID");

        jTextFieldpassID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpassID3ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Customer Details");

        jButtonsearchCustomer.setText("Search");
        jButtonsearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearchCustomerActionPerformed(evt);
            }
        });

        jButtonDeletecustomer.setText("Delete");
        jButtonDeletecustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletecustomerActionPerformed(evt);
            }
        });

        jTablesearchResult3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        jTablesearchResult3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablesearchResult3MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTablesearchResult3);

        jLabel81.setText("NIC");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonsearchCustomer)
                                .addGap(33, 33, 33)
                                .addComponent(jButtonDeletecustomer))
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(531, 531, 531)
                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel78)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldcustomerId3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel79)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldpassID3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel81)
                                .addGap(40, 40, 40)))
                        .addComponent(jTextFieldNIC3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldcustomerId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel78))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldpassID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel79))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNIC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel81)))
                .addGap(62, 62, 62)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeletecustomer)
                    .addComponent(jButtonsearchCustomer))
                .addGap(10, 10, 10))
        );

        jTabbedPaneAdmin.addTab("Edit Customer", jPanel3);

        jPanelMainMenu.setLayout(null);

        TicketsOnly.setBackground(new java.awt.Color(51, 153, 255));
        TicketsOnly.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TicketsOnly.setForeground(new java.awt.Color(255, 255, 255));
        TicketsOnly.setText("Tickets Only");
        TicketsOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsOnlyActionPerformed(evt);
            }
        });
        jPanelMainMenu.add(TicketsOnly);
        TicketsOnly.setBounds(370, 210, 150, 77);

        jButtonTourPackages.setBackground(new java.awt.Color(51, 153, 255));
        jButtonTourPackages.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTourPackages.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTourPackages.setText("Tour Packages");
        jButtonTourPackages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTourPackagesActionPerformed(evt);
            }
        });
        jPanelMainMenu.add(jButtonTourPackages);
        jButtonTourPackages.setBounds(680, 210, 150, 77);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atrs/background.jpg"))); // NOI18N
        jLabel32.setRequestFocusEnabled(false);
        jPanelMainMenu.add(jLabel32);
        jLabel32.setBounds(0, 0, 1900, 1181);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanelMainMenu.add(jPanel14);
        jPanel14.setBounds(260, 130, 700, 270);

        jTabbedPaneUser.addTab("Main Menu", jPanelMainMenu);

        jPanelBasicDetails.setEnabled(false);

        BasicDetailsNext.setText("Next");
        BasicDetailsNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasicDetailsNextActionPerformed(evt);
            }
        });

        BasicDetailsBack.setText("Back");
        BasicDetailsBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasicDetailsBackActionPerformed(evt);
            }
        });

        jComboBoxdeparture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo", "Doha", "Chennai", "Australia", "Hambantota", "Delhi", "Paris" }));

        jLabel19.setText("Departure");

        jLabel13.setText("Destination ");

        jComboBoxdestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one.", "Chennai", "Colombo", "Doha", "Australia", "Hambantota", "Delhi", "Paris" }));

        jComboBoxflightclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one.", "Economy", "1st Class" }));

        jLabel12.setText("Flight Class");

        jLabel11.setText("Date");

        jComboBoxday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2016", "2017", " " }));

        jComboBoxticketcount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select number..", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));

        jLabel9.setText("Ticket Count ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jComboBoxticketcount, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxdeparture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxdestination, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxflightclass, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 60, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxdeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxflightclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxticketcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBasicDetailsLayout = new javax.swing.GroupLayout(jPanelBasicDetails);
        jPanelBasicDetails.setLayout(jPanelBasicDetailsLayout);
        jPanelBasicDetailsLayout.setHorizontalGroup(
            jPanelBasicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBasicDetailsLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelBasicDetailsLayout.createSequentialGroup()
                .addGap(870, 870, 870)
                .addComponent(BasicDetailsBack)
                .addGap(18, 18, 18)
                .addComponent(BasicDetailsNext))
        );
        jPanelBasicDetailsLayout.setVerticalGroup(
            jPanelBasicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBasicDetailsLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanelBasicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BasicDetailsBack)
                    .addComponent(BasicDetailsNext)))
        );

        jTabbedPaneUser.addTab("Basic Details", jPanelBasicDetails);

        jPanelReservation.setEnabled(false);

        jTableFlightDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "Airline ID", "Airline ", "From", "To", "Departure", "Arrival", "Seats", "Price (USD)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFlightDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFlightDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableFlightDetails);

        ReserveNext.setText("Next");
        ReserveNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveNextActionPerformed(evt);
            }
        });

        ReserveBack.setText("Back");
        ReserveBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveBackActionPerformed(evt);
            }
        });

        jLabel15.setText("To");

        jLabel14.setText("From");

        jLabel18.setText("Airline");

        jLabel17.setText("Airline ID");

        jLabel16.setText("Flight ID");

        jLabel42.setText("Arrival");

        jLabel43.setText("Departure");

        jLabel46.setText("Price");

        jLabel47.setText("Seats");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldFlightId2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel14)
                        .addGap(46, 46, 46)
                        .addComponent(jTextFieldFrom2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(38, 38, 38)
                                .addComponent(jTextFieldAirline2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldDeparture2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(24, 24, 24)
                                .addComponent(jTextFieldAirlineId2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel15)
                                .addGap(58, 58, 58)
                                .addComponent(jTextFieldTo2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel46)
                                .addGap(37, 37, 37)
                                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel42)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel47)
                                        .addGap(37, 37, 37)))
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldArrivasl2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel16))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFlightId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jTextFieldFrom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldArrivasl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42))
                        .addGap(1, 1, 1)))
                .addGap(15, 15, 15)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldTo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addComponent(jTextFieldAirlineId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel18))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldAirline2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDeparture2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel46))
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("Flight Details");

        javax.swing.GroupLayout jPanelReservationLayout = new javax.swing.GroupLayout(jPanelReservation);
        jPanelReservation.setLayout(jPanelReservationLayout);
        jPanelReservationLayout.setHorizontalGroup(
            jPanelReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservationLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelReservationLayout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jLabel33))
            .addGroup(jPanelReservationLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelReservationLayout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(ReserveBack)
                .addGap(25, 25, 25)
                .addComponent(ReserveNext))
        );
        jPanelReservationLayout.setVerticalGroup(
            jPanelReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel33)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanelReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReserveBack)
                    .addComponent(ReserveNext)))
        );

        jTabbedPaneUser.addTab("Reservation", jPanelReservation);

        jPanelPackages.setLayout(null);

        PackagesBack.setText("Back");
        PackagesBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackagesBackActionPerformed(evt);
            }
        });
        jPanelPackages.add(PackagesBack);
        PackagesBack.setBounds(980, 402, 55, 23);

        jButtonpackageMalayasia.setText("MARVELOUS MALAYSIA");
        jButtonpackageMalayasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpackageMalayasiaActionPerformed(evt);
            }
        });

        jButtonpackageAfrica.setText("SAFARI AFRICA");
        jButtonpackageAfrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpackageAfricaActionPerformed(evt);
            }
        });

        jButtonpackageDownunder.setText("DOWN UNDER");
        jButtonpackageDownunder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpackageDownunderActionPerformed(evt);
            }
        });

        jButtonpackageParis.setText("ARTISTIC PARIS");
        jButtonpackageParis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpackageParisActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "--3 Days", "--Hotel accommodation ", "  (Sheraton)", "--Transport", "--International Air Ticket", "--Meals", " ", "--Price -  $250.00", "(for one person)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "--14 Days", "--Hotel accommodation (W)", "--Safari Tour", "--Transport", "--International Air Ticket", "--Meals", " ", "--Price -  $500.00", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList2);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "--7 Days", "--Hotel accommodation (Mariott)", "--Transport", "--International Air Ticket", "--Meals", " ", "--Price -  $270.00", "(for one person)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList3);

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "--7 Days", "--Hotel accommodation", "--Transport", "--International Air Ticket", "--Meals", " ", "--Price -  $260.00" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(jList4);

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "--4 Days", "--Hotel accommodation", "--Transport", "--International Air Ticket", "--Meals", " ", "--Price -  $170.00", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(jList5);

        jButtonpackageMilan.setText("SHOPPING IN MILAN");
        jButtonpackageMilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpackageMilanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonpackageMalayasia, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jButtonpackageAfrica, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(jButtonpackageDownunder, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7)
                    .addComponent(jButtonpackageParis, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(jButtonpackageMilan, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonpackageMalayasia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonpackageAfrica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonpackageDownunder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonpackageParis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButtonpackageMilan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(83, Short.MAX_VALUE))))
        );

        jPanelPackages.add(jPanel8);
        jPanel8.setBounds(30, 20, 1040, 385);

        jTabbedPaneUser.addTab("Packages", jPanelPackages);

        jLabel21.setText("Package Price");

        jLabel26.setText("Package Name");

        jTextFieldpname4.setEditable(false);
        jTextFieldpname4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpname4ActionPerformed(evt);
            }
        });

        jLabel36.setText("Hotel Name");

        jTextFieldhotelname4.setEditable(false);

        jTextFieldFlightId4.setEditable(false);

        jLabel37.setText("Flight ID");

        jLabel45.setText("Ticket Count");

        jTextFieldpackageprice.setEditable(false);

        jLabel35.setText("Days");

        jTextFielddays.setEditable(false);

        jComboBoxticketcount4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldFlightId4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldpname4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel45))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldhotelname4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel21)
                        .addGap(23, 23, 23)
                        .addComponent(jTextFieldpackageprice, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel35)))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFielddays)
                    .addComponent(jComboBoxticketcount4, 0, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel37))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldFlightId4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel26))
                    .addComponent(jTextFieldpname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(jComboBoxticketcount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel36))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldhotelname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel21))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldpackageprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFielddays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        packagereservationNext.setText("Next");
        packagereservationNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packagereservationNextActionPerformed(evt);
            }
        });

        Packagereserback.setText("Back");
        Packagereserback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackagereserbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPackageReservationLayout = new javax.swing.GroupLayout(jPanelPackageReservation);
        jPanelPackageReservation.setLayout(jPanelPackageReservationLayout);
        jPanelPackageReservationLayout.setHorizontalGroup(
            jPanelPackageReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPackageReservationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Packagereserback)
                .addGap(18, 18, 18)
                .addComponent(packagereservationNext)
                .addGap(89, 89, 89))
            .addGroup(jPanelPackageReservationLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanelPackageReservationLayout.setVerticalGroup(
            jPanelPackageReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPackageReservationLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addGroup(jPanelPackageReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packagereservationNext)
                    .addComponent(Packagereserback))
                .addGap(60, 60, 60))
        );

        jTabbedPaneUser.addTab("Package Reservation", jPanelPackageReservation);

        jPlanelSeatArrangement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LockSeats.setText("Reserve Seats");
        LockSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockSeatsActionPerformed(evt);
            }
        });
        jPlanelSeatArrangement.add(LockSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, -1, -1));

        LockSeatsNext.setText("Next");
        LockSeatsNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockSeatsNextActionPerformed(evt);
            }
        });
        jPlanelSeatArrangement.add(LockSeatsNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, -1, -1));

        seat1number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat1number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atrs/seat arrangement.jpg"))); // NOI18N
        jPlanelSeatArrangement.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, 240));

        seat1letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        seat1letter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat1letterActionPerformed(evt);
            }
        });
        jPlanelSeatArrangement.add(seat1letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 50, -1));

        seat2number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat2number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 60, -1));

        seat2letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        jPlanelSeatArrangement.add(seat2letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 50, -1));

        seat2.setText("Seat 2");
        jPlanelSeatArrangement.add(seat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        seat1.setText("Seat 1");
        jPlanelSeatArrangement.add(seat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        seat3.setText("Seat 3");
        jPlanelSeatArrangement.add(seat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        seat3number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat3number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 60, -1));

        seat3letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        jPlanelSeatArrangement.add(seat3letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 50, -1));

        seat4.setText("Seat 4");
        jPlanelSeatArrangement.add(seat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        seat4number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat4number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, -1));

        seat4letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        jPlanelSeatArrangement.add(seat4letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 50, -1));

        seat5letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        jPlanelSeatArrangement.add(seat5letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 50, -1));

        seat5.setText("Seat 5");
        jPlanelSeatArrangement.add(seat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        seat5number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat5number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 60, -1));

        seat6letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        seat6letter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat6letterActionPerformed(evt);
            }
        });
        jPlanelSeatArrangement.add(seat6letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 50, -1));

        seat6.setText("Seat 6");
        jPlanelSeatArrangement.add(seat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        seat6number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat6number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 60, -1));

        seat7letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        jPlanelSeatArrangement.add(seat7letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 50, -1));

        seat7.setText("Seat 7");
        jPlanelSeatArrangement.add(seat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        seat7number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat7number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 60, -1));

        seat8letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        jPlanelSeatArrangement.add(seat8letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 50, -1));

        seat8.setText("Seat 8");
        jPlanelSeatArrangement.add(seat8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        seat8number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat8number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 60, -1));

        seat9.setText("Seat 9");
        jPlanelSeatArrangement.add(seat9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        seat9letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        jPlanelSeatArrangement.add(seat9letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 50, -1));

        seat9number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat9number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 60, -1));

        seat10number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " " }));
        jPlanelSeatArrangement.add(seat10number, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 60, -1));

        seat10.setText("Seat 10");
        jPlanelSeatArrangement.add(seat10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 50, -1));

        seat10letter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        jPlanelSeatArrangement.add(seat10letter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 50, -1));

        ReserveBack2.setText("Back");
        ReserveBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveBack2ActionPerformed(evt);
            }
        });
        jPlanelSeatArrangement.add(ReserveBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, -1, -1));

        jTabbedPaneUser.addTab("Seat Arrangement", jPlanelSeatArrangement);

        jPanelCustomerDetails.setLayout(null);

        jLabel6.setText("Passport ID");

        jLabel3.setText("Surname");

        jLabel2.setText("Customer ID");

        jLabel5.setText("First Name");

        jLabel8.setText("Gender");

        jLabel10.setText("Nationality");

        jComboBoxGender5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select gender", "Male", "Female" }));

        jLabelCus.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelCus.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCus.setText("*");

        jLabelPass.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPass.setText("*");

        jLabelSur.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelSur.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSur.setText("*");

        jLabelfname.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelfname.setForeground(new java.awt.Color(255, 0, 0));
        jLabelfname.setText("*");

        jLabelgender.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelgender.setForeground(new java.awt.Color(255, 0, 0));
        jLabelgender.setText("*");

        jLabelnational.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelnational.setForeground(new java.awt.Color(255, 0, 0));
        jLabelnational.setText("*");

        jLabel23.setText("NIC");

        jLabelnic.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelnic.setForeground(new java.awt.Color(255, 0, 0));
        jLabelnic.setText("*");

        jLabel25.setText("Address");

        jTextAreaAddress5.setColumns(20);
        jTextAreaAddress5.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress5);

        jLabeladd.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabeladd.setForeground(new java.awt.Color(255, 0, 0));
        jLabeladd.setText("*");

        jLabelocc.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelocc.setForeground(new java.awt.Color(255, 0, 0));
        jLabelocc.setText("*");

        jLabel24.setText("Occuptation");

        jLabelcontact.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelcontact.setForeground(new java.awt.Color(255, 0, 0));
        jLabelcontact.setText("*");

        jLabelContact.setText("Contact");

        jLabelContact1.setText("E-mail");

        jLabelemail.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabelemail.setForeground(new java.awt.Color(255, 0, 0));
        jLabelemail.setText("*");

        jLabel20.setText("Date Of Birth");

        jComboBoxdobday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxdobmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBoxdobyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", " " }));

        jLabeldob.setFont(new java.awt.Font("Tunga", 1, 13)); // NOI18N
        jLabeldob.setForeground(new java.awt.Color(255, 0, 0));
        jLabeldob.setText("*");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCustomerId5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPassportId5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSurname5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFirstName5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCus, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSur, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelfname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(94, 94, 94))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxdobday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxdobmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxdobyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabeldob, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxGender5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNationality5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNic5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldOccupation5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelgender, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelnational, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelnic, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelocc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(jLabel25)
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabeladd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTextFieldContact5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabelContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jTextFieldEmail5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelemail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldCustomerId5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabelCus))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldPassportId5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabelPass))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldSurname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelSur)
                                .addComponent(jLabel23)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelfname)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldFirstName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabelgender)
                        .addGap(22, 22, 22)
                        .addComponent(jLabelnational)
                        .addGap(22, 22, 22)
                        .addComponent(jLabelnic)
                        .addGap(22, 22, 22)
                        .addComponent(jLabelocc))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel25))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeladd)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxGender5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNationality5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(20, 20, 20)
                        .addComponent(jTextFieldNic5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldOccupation5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldContact5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelContact)
                                .addComponent(jLabelcontact))
                            .addComponent(jLabelContact1)
                            .addComponent(jTextFieldEmail5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelemail)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxdobyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxdobmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxdobday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabeldob))))
                .addContainerGap())
        );

        jPanelCustomerDetails.add(jPanel9);
        jPanel9.setBounds(0, 0, 1100, 270);

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanelCustomerDetails.add(Reset);
        Reset.setBounds(730, 470, 77, 23);

        AddCustomer.setText("Add Customer");
        AddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerActionPerformed(evt);
            }
        });
        jPanelCustomerDetails.add(AddCustomer);
        AddCustomer.setBounds(870, 470, 130, 23);

        CustomerDetailsNext.setText("Next");
        CustomerDetailsNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerDetailsNextActionPerformed(evt);
            }
        });
        jPanelCustomerDetails.add(CustomerDetailsNext);
        CustomerDetailsNext.setBounds(1020, 470, 55, 23);

        jButtonDeleteCustomer.setText("Delete Customer");
        jButtonDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCustomerActionPerformed(evt);
            }
        });
        jPanelCustomerDetails.add(jButtonDeleteCustomer);
        jButtonDeleteCustomer.setBounds(573, 470, 140, 23);

        jTableCustomerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        jScrollPane9.setViewportView(jTableCustomerDetails);

        jPanelCustomerDetails.add(jScrollPane9);
        jScrollPane9.setBounds(20, 300, 1050, 140);

        jTabbedPaneUser.addTab("Customer Details", jPanelCustomerDetails);

        jLabel27.setText("Transaction ID");

        jTextFieldTransactionId6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTransactionId6ActionPerformed(evt);
            }
        });

        jTextFieldCustomerId6.setEditable(false);

        jLabel28.setText("Customer ID");

        jLabel29.setText("Payment Method");

        jComboBoxPaymentMethod6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit Card", "Debit Card", "Cash", "Cheque" }));

        jLabel30.setText("Amount");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel22.setText("Transaction Details");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jTextFieldTransactionId6))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxPaymentMethod6, javax.swing.GroupLayout.Alignment.LEADING, 0, 232, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAmount6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCustomerId6)))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel22)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextFieldTransactionId6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextFieldCustomerId6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jComboBoxPaymentMethod6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextFieldAmount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        TransactionNext.setText("Confirm Transaction");
        TransactionNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionNextActionPerformed(evt);
            }
        });

        TransactionBack.setText("Back");
        TransactionBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionBackActionPerformed(evt);
            }
        });

        transactionNext.setText("Next");
        transactionNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransactionLayout = new javax.swing.GroupLayout(jPanelTransaction);
        jPanelTransaction.setLayout(jPanelTransactionLayout);
        jPanelTransactionLayout.setHorizontalGroup(
            jPanelTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransactionLayout.createSequentialGroup()
                .addGroup(jPanelTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTransactionLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTransactionLayout.createSequentialGroup()
                        .addGap(761, 761, 761)
                        .addComponent(TransactionBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TransactionNext)
                        .addGap(18, 18, 18)
                        .addComponent(transactionNext)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelTransactionLayout.setVerticalGroup(
            jPanelTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransactionLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanelTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransactionNext)
                    .addComponent(TransactionBack)
                    .addComponent(transactionNext)))
        );

        jTabbedPaneUser.addTab("Transaction", jPanelTransaction);

        jTableConfirmation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Customer Name", "Passport", "Flight ID", "Seat ID", "Airline", "Depature", "Destination", "Departure Time", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableConfirmation);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel44.setText("Confirmation");

        jLabel31.setText("Total Amount           :");

        ConfirmReservation.setText("Confirm Reservation");
        ConfirmReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmReservationActionPerformed(evt);
            }
        });

        jLabel41.setText("Transaction ID         :");

        confirmationBack8.setText("Back");
        confirmationBack8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmationBack8ActionPerformed(evt);
            }
        });

        jlableTotalAmount8.setEditable(false);

        jlableTransactionId.setEditable(false);

        confirmationNext8.setText("Next");
        confirmationNext8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmationNext8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConfirmationLayout = new javax.swing.GroupLayout(jPanelConfirmation);
        jPanelConfirmation.setLayout(jPanelConfirmationLayout);
        jPanelConfirmationLayout.setHorizontalGroup(
            jPanelConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfirmationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(jPanelConfirmationLayout.createSequentialGroup()
                .addGap(464, 464, 464)
                .addComponent(jLabel44)
                .addContainerGap(522, Short.MAX_VALUE))
            .addGroup(jPanelConfirmationLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlableTotalAmount8, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jlableTransactionId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmationBack8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConfirmReservation)
                .addGap(18, 18, 18)
                .addComponent(confirmationNext8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanelConfirmationLayout.setVerticalGroup(
            jPanelConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfirmationLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConfirmationLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanelConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jlableTotalAmount8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jlableTransactionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(confirmationBack8)
                        .addComponent(ConfirmReservation)
                        .addComponent(confirmationNext8)))
                .addGap(71, 71, 71))
        );

        jTabbedPaneUser.addTab("Confirmation", jPanelConfirmation);

        PrintTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PrintTicket.setText("Print Ticket");
        PrintTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrintTicketLayout = new javax.swing.GroupLayout(jPanelPrintTicket);
        jPanelPrintTicket.setLayout(jPanelPrintTicketLayout);
        jPanelPrintTicketLayout.setHorizontalGroup(
            jPanelPrintTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrintTicketLayout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(PrintTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        jPanelPrintTicketLayout.setVerticalGroup(
            jPanelPrintTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrintTicketLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(PrintTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jTabbedPaneUser.addTab("Print Ticket", jPanelPrintTicket);

        jMenu1.setText("File");

        jMenuItemexit.setText("Exit");
        jMenuItemexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemexitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemexit);

        jMenuItemlogout.setText("Log out");
        jMenuItemlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemlogoutActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemlogout);

        jMenuItem3.setText("Profile");
        jMenu1.add(jMenuItem3);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Update Customer");
        jMenu2.add(jMenuItem2);

        jMenuBar.add(jMenu2);

        jMenu3.setText("View");
        jMenuBar.add(jMenu3);

        jMenu6.setText("About");
        jMenuBar.add(jMenu6);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneUser)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPaneAdmin)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPaneMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneUser)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPaneAdmin)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPaneMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BasicDetailsNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasicDetailsNextActionPerformed
             
        //connecting to database
        conn=DBconnect.ConnectDB();
        
        //getting values from combo boxes
        String Sql;
        try{
          departure=jComboBoxdeparture.getSelectedItem().toString();
          destination=jComboBoxdestination.getSelectedItem().toString();
          flightClass=jComboBoxflightclass.getSelectedItem().toString();
          dateDay=jComboBoxday.getSelectedItem().toString();
          dateMonth=jComboBoxmonth.getSelectedItem().toString();
          dateYear=jComboBoxyear.getSelectedItem().toString();
          ticketCount=Integer.parseInt(jComboBoxticketcount.getSelectedItem().toString());
          count=ticketCount;  //this for confirmation part(to assign passportID)
          Sql="select f.flightId,f.airlineId,f.airlineName,f.depatureLocation,f.destinationLocation,f.depatureTime,f.landingTime,(f.numberOfSeats-count(fs.seatId))as AvalableSeats,f.price\n" +
               " from flight f,flight_seat fs \n" +
                " where f.flightId=fs.flightId and f.destinationLocation='"+destination+"'\n" +
                " and fs.travelClass='Economy' and f.depatureLocation='"+departure+"'\n" +
                "and date(f.depatureTime) = '"+dateYear+"-"+dateMonth+"-"+dateDay+"'\n" +
                "group by f.flightId,f.airlineId,f.airlineName,f.depatureLocation,f.destinationLocation,f.depatureTime,f.landingTime,f.price\n" +"";          
         
          pstatement=conn.prepareStatement(Sql);
          Results=pstatement.executeQuery();
          
          jTableFlightDetails.setModel(DbUtils.resultSetToTableModel(Results));
        
          
        }
        catch(Exception e){
            ticketCount=0;
        }
        if((departure.equals("Select one."))||(destination.equals("Select one."))||(flightClass.equals("Select one."))||(dateDay.equals("Day"))||(dateMonth.equals("Month"))||(dateYear.equals("Year"))||(ticketCount==0)){
          JOptionPane.showMessageDialog(null, "Please Select Values First!!");  
        }
        else{
            jTabbedPaneUser.setEnabledAt(1,false);
            jTabbedPaneUser.setSelectedIndex(2);
            jTabbedPaneUser.setEnabledAt(2,true);
        }        
        
      
    }//GEN-LAST:event_BasicDetailsNextActionPerformed

    private void jMenuItemexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemexitActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Do you want to quit?");
            if(response==0){
                this.dispose();
            }
        
    }//GEN-LAST:event_jMenuItemexitActionPerformed

    private void jMenuItemlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemlogoutActionPerformed
        // TODO add your handling code here:
        jInternalFrameLogin.setVisible(true);
        jTabbedPaneAdmin.setVisible(false);
        jTabbedPaneUser.setVisible(false);
        
    }//GEN-LAST:event_jMenuItemlogoutActionPerformed

    private void TicketsOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketsOnlyActionPerformed
            //Selecting Tickets Only option
        jTabbedPaneUser.setEnabledAt(0,false);
        jTabbedPaneUser.setSelectedIndex(1);
        jTabbedPaneUser.setEnabledAt(1,true);
        
    }//GEN-LAST:event_TicketsOnlyActionPerformed

    private void LockSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockSeatsActionPerformed
        // TODO add your handling code here:
        boolean error_mark = false;
        
        
        switch(ticketCount){
            case 10: seatId10=(seat10number.getSelectedItem().toString())+(seat10letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId10+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[9]="Free";
                                    seatId[9]= seatId10;
                                }}}
                                catch(Exception e){}
            case 9 : seatId9=(seat9number.getSelectedItem().toString())+(seat9letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId9+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[8]="Free";
                                    seatId[8]= seatId9;
                                }}}
                                catch(Exception e){}
            case 8 : seatId8=(seat8number.getSelectedItem().toString())+(seat8letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId8+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[7]="Free";
                                    seatId[7]= seatId8;
                                }}}
                                catch(Exception e){}
            case 7 : seatId7=(seat7number.getSelectedItem().toString())+(seat7letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId7+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[6]="Free";
                                    seatId[6]= seatId7;
                                }}}
                                catch(Exception e){}
            case 6 : seatId6=(seat6number.getSelectedItem().toString())+(seat6letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId6+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[5]="Free";
                                    seatId[5]= seatId6;
                                }}}
                                catch(Exception e){}
            case 5 : seatId5=(seat5number.getSelectedItem().toString())+(seat5letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId5+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[4]="Free";
                                    seatId[4]= seatId5;
                                }}}
                                catch(Exception e){}
            case 4 : seatId4=(seat4number.getSelectedItem().toString())+(seat4letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId4+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[3]="Free";
                                    seatId[3]= seatId4;
                                }}}
                                catch(Exception e){}
            case 3 : seatId3=(seat3number.getSelectedItem().toString())+(seat3letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId3+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[2]="Free";
                                    seatId[2]= seatId3;
                                }}}
                                catch(Exception e){}
            case 2 : seatId2=(seat2number.getSelectedItem().toString())+(seat2letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId2+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[1]="Free";
                                    seatId[1]= seatId2;
                                }}}
                                catch(Exception e){}
            default : seatId1=(seat1number.getSelectedItem().toString())+(seat1letter.getSelectedItem().toString());
                            try{
                                String sql1="select seatAvailability from flight_seat where flightId='"+flightId+"'and seatId='"+seatId1+"'";
                                pstatement=conn.prepareStatement(sql1);
                                Results=pstatement.executeQuery();
                                String temp;
                                while(Results.next()){
                                     temp=Results.getString("seatAvailability");
                                    
                                                                
                                if(temp.equals("Taken")){
                                    error_mark=true;
                                }
                                else{
                                    seat[0]="Free";
                                    seatId[0]= seatId1;
                                }}}
                                catch(Exception e){}
        }
        
        
        
        if(error_mark==false){
           
            for(int i=0;i<10;i++){
                if(seat[i].equals("Free")){
                    try{
                        if(i>ticketCount){
                            break;
                        }
                        String sql="update flight_seat set seatAvailability='Taken' where flightId='"+flightId+"' and seatId='"+seatId[i]+"'";
                        pstatement=conn.prepareStatement(sql);
                        pstatement.execute();
                        
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                }
                
            }
            

            
        }
        else{
            JOptionPane.showMessageDialog(null,"Seat you selected already reserved!");
        }
        
    }//GEN-LAST:event_LockSeatsActionPerformed

    private void PrintTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintTicketActionPerformed
        main_report r = new main_report();
        String reportPath = "C:\\Users\\HP\\Documents\\stproject\\AirTicketReservationSystem\\src\\atrs\\report3.jrxml";
        Map para = new HashMap();
        
        para.put("ticket_count", ticketCount);
        r.view(para, reportPath);
        
        
        jTabbedPaneUser.setEnabledAt(9,false);
        jTabbedPaneUser.setSelectedIndex(0);
        jTabbedPaneUser.setEnabledAt(0,true);
    }//GEN-LAST:event_PrintTicketActionPerformed

    private void jButtonTourPackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTourPackagesActionPerformed
        // TODO add your handling code here:
        //Hiding Main Menu
        
        jTabbedPaneUser.setEnabledAt(0,false);
        jTabbedPaneUser.setSelectedIndex(3);
        jTabbedPaneUser.setEnabledAt(3,true);
          
    }//GEN-LAST:event_jButtonTourPackagesActionPerformed

    private void BasicDetailsBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasicDetailsBackActionPerformed
        // TODO add your handling code here:
        jTabbedPaneUser.setEnabledAt(1,false);
        jTabbedPaneUser.setSelectedIndex(0);
        jTabbedPaneUser.setEnabledAt(0,true);
    }//GEN-LAST:event_BasicDetailsBackActionPerformed

    private void PackagesBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackagesBackActionPerformed
        // TODO add your handling code here:
        jTabbedPaneUser.setEnabledAt(3,false);
        jTabbedPaneUser.setSelectedIndex(0);
        jTabbedPaneUser.setEnabledAt(0,true);
    }//GEN-LAST:event_PackagesBackActionPerformed

    private void LockSeatsNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockSeatsNextActionPerformed
        // TODO add your handling code here:
        tableLoad();
        jTabbedPaneUser.setEnabledAt(5,false);
        jTabbedPaneUser.setSelectedIndex(6);
        jTabbedPaneUser.setEnabledAt(6,true);    
                         
    }//GEN-LAST:event_LockSeatsNextActionPerformed

    private void jTableFlightDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFlightDetailsMouseClicked
        // TODO add your handling code here:
        int row = jTableFlightDetails.getSelectedRow();
        flightId = jTableFlightDetails.getValueAt(row, 0).toString();
        airlineId = jTableFlightDetails.getValueAt(row, 1).toString();
        airlineName = jTableFlightDetails.getValueAt(row, 2).toString();
        departure = jTableFlightDetails.getValueAt(row, 3).toString();
        destination = jTableFlightDetails.getValueAt(row, 4).toString();
        departureTime = jTableFlightDetails.getValueAt(row, 5).toString();
        landingTime = jTableFlightDetails.getValueAt(row, 6).toString();
        availableSeats = Integer.parseInt(jTableFlightDetails.getValueAt(row, 7).toString());
        price = Double.parseDouble(jTableFlightDetails.getValueAt(row, 8).toString());
        
        
        jTextFieldFlightId2.setText(flightId);
        jTextFieldAirlineId2.setText(airlineId);
        jTextFieldAirline2.setText(airlineName);
        jTextFieldFrom2.setText(departure);
        jTextFieldTo2.setText(destination);
        jTextFieldDeparture2.setText(departureTime);
        jTextFieldArrivasl2.setText(landingTime);
        jTextFieldSeats.setText(Integer.toString(availableSeats));
        jTextFieldPrice.setText(Double.toString(price));

    }//GEN-LAST:event_jTableFlightDetailsMouseClicked

    private void ReserveNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveNextActionPerformed
        // TODO add your handling code here:
        
        switch(ticketCount){
            case 10: seat10letter.setVisible(true);
                    seat10number.setVisible(true);
                    seat10.setVisible(true);
            case 9: seat9letter.setVisible(true);
                    seat9number.setVisible(true);
                    seat9.setVisible(true);
            case 8: seat8letter.setVisible(true);
                    seat8number.setVisible(true);
                    seat8.setVisible(true);
            case 7: seat7letter.setVisible(true);
                    seat7number.setVisible(true);
                    seat7.setVisible(true);
            case 6: seat6letter.setVisible(true);
                    seat6number.setVisible(true);
                    seat6.setVisible(true);
            case 5: seat5letter.setVisible(true);
                    seat5number.setVisible(true);
                    seat5.setVisible(true);
            case 4: seat4letter.setVisible(true);
                    seat4number.setVisible(true);
                    seat4.setVisible(true);
            case 3: seat3letter.setVisible(true);
                    seat3number.setVisible(true);
                    seat3.setVisible(true); 
            case 2: seat2letter.setVisible(true);
                    seat2number.setVisible(true);
                    seat2.setVisible(true);                  
            default :
                    seat1letter.setVisible(true);
                    seat1number.setVisible(true);
                    seat1.setVisible(true);
            
        }
                
            
        
        
        jTabbedPaneUser.setEnabledAt(2,false);
        jTabbedPaneUser.setSelectedIndex(5);
        jTabbedPaneUser.setEnabledAt(5,true);
       
    }//GEN-LAST:event_ReserveNextActionPerformed

    private void ReserveBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBackActionPerformed
        // TODO add your handling code here:
        jTabbedPaneUser.setEnabledAt(2,false);
        jTabbedPaneUser.setSelectedIndex(1);
        jTabbedPaneUser.setEnabledAt(1,true);
    }//GEN-LAST:event_ReserveBackActionPerformed

    private void jButtonpackageMalayasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpackageMalayasiaActionPerformed
        
        packageName="MARVELOUS MALAYSIA";
        days=3;
        price=250.00;
        hotelName="Sheraton";
        flightId="F099";
        
        
        jTextFieldFlightId4.setText(flightId);
        jTextFieldpname4.setText(packageName);
        jTextFieldhotelname4.setText(hotelName);
        jTextFieldpackageprice.setText(Double.toString(price));
        jTextFielddays.setText(Integer.toString(days));
        
        
        
        
        
        jTabbedPaneUser.setEnabledAt(3,false);
        jTabbedPaneUser.setSelectedIndex(4);
        jTabbedPaneUser.setEnabledAt(4,true);
       
    }//GEN-LAST:event_jButtonpackageMalayasiaActionPerformed

    private void jButtonpackageMilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpackageMilanActionPerformed
        
        packageName="SHOPPING IN MILAN";      
        days=4;
        price=170.00;
        hotelName="Famous Hotel";
        flightId="F098";
        
        
        jTextFieldFlightId4.setText(flightId);
        jTextFieldpname4.setText(packageName);
        jTextFieldhotelname4.setText(hotelName);
        jTextFieldpackageprice.setText(Double.toString(price));
        jTextFielddays.setText(Integer.toString(days));
        
        
        jTabbedPaneUser.setEnabledAt(3,false);
        jTabbedPaneUser.setSelectedIndex(4);
        jTabbedPaneUser.setEnabledAt(4,true);
    }//GEN-LAST:event_jButtonpackageMilanActionPerformed

    private void jButtonpackageAfricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpackageAfricaActionPerformed
        
        packageName="SAFARI AFRICA";
        days=14;
        price=500.00;
        hotelName="W";
        flightId="F097";
        
        
        jTextFieldFlightId4.setText(flightId);
        jTextFieldpname4.setText(packageName);
        jTextFieldhotelname4.setText(hotelName);
        jTextFieldpackageprice.setText(Double.toString(price));
        jTextFielddays.setText(Integer.toString(days));
        
        
        
        jTabbedPaneUser.setEnabledAt(3,false);
        jTabbedPaneUser.setSelectedIndex(4);
        jTabbedPaneUser.setEnabledAt(4,true);
        
    }//GEN-LAST:event_jButtonpackageAfricaActionPerformed

    private void jButtonpackageDownunderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpackageDownunderActionPerformed
        
        packageName="DOWN UNDER";
        days=7;
        price=300.00;
        hotelName="Mariott";
        flightId="F096";
        
        
        
        jTextFieldFlightId4.setText(flightId);
        jTextFieldpname4.setText(packageName);
        jTextFieldhotelname4.setText(hotelName);
        jTextFieldpackageprice.setText(Double.toString(price));
        jTextFielddays.setText(Integer.toString(days));
        
        
        
        jTabbedPaneUser.setEnabledAt(3,false);
        jTabbedPaneUser.setSelectedIndex(4);
        jTabbedPaneUser.setEnabledAt(4,true);
        
    }//GEN-LAST:event_jButtonpackageDownunderActionPerformed

    private void jButtonpackageParisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpackageParisActionPerformed
        
        packageName="ARTISTIC PARIS";
        days=7;
        price=260.00;
        hotelName="Sheraton";
        flightId="F095";
        
        
        jTextFieldFlightId4.setText(flightId);
        jTextFieldpname4.setText(packageName);
        jTextFieldhotelname4.setText(hotelName);
        jTextFieldpackageprice.setText(Double.toString(price));
        jTextFielddays.setText(Integer.toString(days));
        
        
        jTabbedPaneUser.setEnabledAt(3,false);
        jTabbedPaneUser.setSelectedIndex(4);
        jTabbedPaneUser.setEnabledAt(4,true);
        
    }//GEN-LAST:event_jButtonpackageParisActionPerformed
    
    
    private void TransactionNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionNextActionPerformed
        transactionId = jTextFieldTransactionId6.getText().toString();
        paymentMethod = jComboBoxPaymentMethod6.getSelectedItem().toString();
        jlableTotalAmount8.setText(String.valueOf(amount));         // set total amount value to confirmation 

        String Sql;
        
        // Validation for
        if((transactionId.length() != 5) || (transactionId.isEmpty())){
           
            JOptionPane.showMessageDialog(null,"Please enter valid transaction ID with 5 Digit!");
        }
                
        else{
            try{
                int response = JOptionPane.showConfirmDialog(null, "Confirm transaction details?");

                if(response==0){

                    Sql="insert into transaction(transactionId,customerId,transactionType,amount) values('"+transactionId+"','"+customerId+"','"+paymentMethod+"',"+amount+")";
                    pstatement=conn.prepareStatement(Sql);
                    pstatement.execute();

                                //***************Setting Confirmation Table**********************

                    try{                      
                      String sql = "select c.customerId, concat(c.fname,' ',c.surname) as customer, c.passportId, f.flightId, fc.seatId, f.airlineName, f.depatureLocation, f.destinationLocation, f.depatureTime, f.price from customer c, flight_seat fc, flight f where c.passportId = fc.passengerId and fc.flightId = f.flightId order by customerId desc limit " + ticketCount;          
                        pstatement = conn.prepareStatement(sql);
                        Results = pstatement.executeQuery();   
                        jTableConfirmation.setModel(DbUtils.resultSetToTableModel(Results));                      
                    }        
                    catch(Exception e){
                    }
                    jlableTransactionId.setText(transactionId);
                    jTabbedPaneUser.setEnabledAt(7,false);
                    jTabbedPaneUser.setSelectedIndex(8);
                    jTabbedPaneUser.setEnabledAt(8,true);
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        } 
    }//GEN-LAST:event_TransactionNextActionPerformed

    private void TransactionBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionBackActionPerformed
        // TODO add your handling code here:
        jTabbedPaneUser.setEnabledAt(7,false);
        jTabbedPaneUser.setSelectedIndex(6);
        jTabbedPaneUser.setEnabledAt(6,true);
    }//GEN-LAST:event_TransactionBackActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        conn=DBconnect.ConnectDB();
        String Sql;
        String username=txtusername.getText();
        String password=txtpassword.getText();
        try{
            Sql="select * from user where username='"+username+"' and password='"+password+"'";
            pstatement=conn.prepareStatement(Sql);
            
            Results=pstatement.executeQuery();
            if(Results.next()){
                
                int i=Results.getByte(7);
                if(i==1){
                    jInternalFrameLogin.dispose();
                    jTabbedPaneAdmin.setVisible(true);    
                    
                }
                else{
                    jInternalFrameLogin.dispose();
                    jTabbedPaneUser.setVisible(true);    
                     
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Username or Password or user ID!!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldTransactionId6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTransactionId6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTransactionId6ActionPerformed

    public void tableLoad(){
        //set values to table from text fields
        try{
            String Sql="select * from customer ";
            
            pstatement=conn.prepareStatement(Sql);
            Results=pstatement.executeQuery();
            
            jTableCustomerDetails.setModel(DbUtils.resultSetToTableModel(Results));
        }
        catch(Exception e){
        
        }

    }
    
    private void jButtonaddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddUserActionPerformed
        userID = jTextFieldUserID1.getText();
        userName = jTextFieldusername1.getText();
        userPassword = jPasswordField1.getText();
        phoneNo = jTextFieldphone1.getText();
        name = jTextFieldname.getText();
        userEmail = jTextFieldemail.getText();
        userLevel = jComboBoxuserlevel.getSelectedIndex();

        String Sql = null;

        if(userID.isEmpty() || userName.isEmpty() || userPassword.isEmpty() || phoneNo.isEmpty() || name.isEmpty() || userEmail.isEmpty()){
            
            JOptionPane.showMessageDialog(null," Please fill all the  fields!!");
        }
        else {
                    try{
                Sql = "INSERT INTO user VALUES ('" + userID + "', '"
                + userName + "' , '"
                + userPassword + "', '"
                + phoneNo + "', '"
                + name + "', '"
                + userEmail + "', "
                + userLevel + ");";
                pstatement = conn.prepareStatement(Sql);
                pstatement.execute();
                
                JOptionPane.showMessageDialog(null," User Added Succesfully!!");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButtonaddUserActionPerformed

    private void jButtondeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteUserActionPerformed
        userId = jTextFielduserId.getText().toString();
        String Sql;
        int confirm=5;

        if(userId!="" ){
            confirm=JOptionPane.showConfirmDialog(null,"Do you want to Delete This:");
            if(confirm==0){

                //JOptionPane.showMessageDialog(null,SQL1);
                try{
                    Sql="DELETE FROM user  \n"+
                    " WHERE userId='"+userId+"'";
                    pstatement = conn.prepareStatement(Sql);
                    pstatement.execute();
                    tableloadsearchuser();

                    JOptionPane.showMessageDialog(null,"Record Deleted!!!");
                }

                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);

                }}

            }
            else
            JOptionPane.showMessageDialog(null," User you are deleting doesn't exist!!");
    }//GEN-LAST:event_jButtondeleteUserActionPerformed

    private void jTablesearchUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesearchUserMouseClicked
        // TODO add your handling code here:

        int row=jTablesearchUser.getSelectedRow();
        userId=jTablesearchUser.getValueAt(row,0).toString();

    }//GEN-LAST:event_jTablesearchUserMouseClicked

    private void jButtonSearcuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearcuserActionPerformed
        // TODO add your handling code here:
        tableloadsearchuser();

    }//GEN-LAST:event_jButtonSearcuserActionPerformed

    private void jTextFieldcustomerId3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcustomerId3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcustomerId3ActionPerformed

    private void jTextFieldpassID3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpassID3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpassID3ActionPerformed

    private void jButtonsearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearchCustomerActionPerformed
        // TODO add your handling code here:
        
        String sql;

        try {
            customerId=jTextFieldcustomerId3.getText();
            passportId=jTextFieldpassID3.getText();
            nic=jTextFieldNIC3.getText();

            sql="SELECT * \n"+
            "FROM customer  \n"+
            " WHERE customerId='"+customerId+"'OR \n"
            + "passportId='"+ passportId+"'OR \n"
            + "NIC='"+nic+"'";

            pstatement=conn.prepareStatement(sql);
            Results=pstatement.executeQuery();

            jTablesearchResult3.setModel(DbUtils.resultSetToTableModel(Results));

            if(Results.next())
            {
                JOptionPane.showMessageDialog(null,"Cannot find Value!");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonsearchCustomerActionPerformed

    private void jButtonDeletecustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletecustomerActionPerformed
        // TODO add your handling code here:
        String Sql;
        int confirm=5;
        customerId=jTextFieldcustomerId3.getText().toString();
        passportId=jTextFieldpassID3.getText().toString();
        nic=jTextFieldNIC3.getText().toString();

        if(customerId!="" || passportId!="" || nic!=""){
            confirm=JOptionPane.showConfirmDialog(null,"Do you want to Delete This:");

            if(confirm==0){
                try {

                    Sql="DELETE FROM customer  \n"+
                    " WHERE customerId='"+customerId+"' and passportId='"+passportId+"' and NIC='"+nic+"'";

                    pstatement=conn.prepareStatement(Sql);
                    pstatement.execute();

                    jTablesearchResult3.setModel(DbUtils.resultSetToTableModel(Results));

                    JOptionPane.showMessageDialog(null,"Record Deleted!!!");
                    jTextFieldpassID3.setText("");
                    jTextFieldNIC3.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);

                }}
            }
            else
            JOptionPane.showMessageDialog(null,"Customer you are deleting doesn't exist!!");
    }//GEN-LAST:event_jButtonDeletecustomerActionPerformed

    private void jTablesearchResult3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesearchResult3MouseClicked
        // TODO add your handling code here:
        int row=jTablesearchResult3.getSelectedRow();
        customerId=jTablesearchResult3.getValueAt(row,0).toString();
        passportId=jTablesearchResult3.getValueAt(row,1).toString();
        nic=jTablesearchResult3.getValueAt(row,2).toString();

        jTextFieldcustomerId3.setText(customerId);
        jTextFieldpassID3.setText(passportId);
        jTextFieldNIC3.setText(nic);
    }//GEN-LAST:event_jTablesearchResult3MouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:

        //Resetting Values in data fields
        jTextFieldCustomerId5.setText(null);
        jTextFieldPassportId5.setText(null);
        jTextFieldSurname5.setText(null);
        jTextFieldFirstName5.setText(null);
        jComboBoxdobday.setSelectedIndex(0);
        jComboBoxdobmonth.setSelectedIndex(0);
        jComboBoxdobyear.setSelectedIndex(0);
        jTextFieldNationality5.setText(null);
        jTextFieldNic5.setText(null);
        jTextAreaAddress5.setText(null);
        jTextFieldOccupation5.setText(null);
        jTextFieldContact5.setText(null);
        jTextFieldEmail5.setText(null);
        jComboBoxGender5.setSelectedIndex(0);

        jLabelCus.setVisible(false);
        jLabelPass.setVisible(false);
        jLabelSur.setVisible(false);
        jLabelfname.setVisible(false);
        jLabelgender.setVisible(false);
        jLabelnational.setVisible(false);
        jLabelnic.setVisible(false);
        jLabeladd.setVisible(false);
        jLabelocc.setVisible(false);
        jLabelcontact.setVisible(false);
        jLabelemail.setVisible(false);
        jLabeldob.setVisible(false);
    }//GEN-LAST:event_ResetActionPerformed

    private void AddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerActionPerformed
        // TODO add your handling code here:

        //Setting values
        customerId = jTextFieldCustomerId5.getText();
        /*
        //Setting customers according to ticket
        if(index < ticketCount){
            customers[index] =  customerId;
            index++;
        }
        */
        //Setting values (continued)
        passportId = jTextFieldPassportId5.getText();
        surname = jTextFieldSurname5.getText();
        firstName = jTextFieldFirstName5.getText();
        //date of birth
        dobDay = jComboBoxdobday.getSelectedItem().toString();
        dobMonth = jComboBoxdobmonth.getSelectedItem().toString();
        dobYear = jComboBoxdobyear.getSelectedItem().toString();

        String dob = dobDay + "-" + dobMonth + "-" + dobYear;

        nationality = jTextFieldNationality5.getText().toString();
        nic = jTextFieldNic5.getText().toString();
        address = jTextAreaAddress5.getText().toString();
        occupation = jTextFieldOccupation5.getText().toString();
        contact = jTextFieldContact5.getText().toString();
        email = jTextFieldEmail5.getText().toString();
        gender = jComboBoxGender5.getSelectedItem().toString();

        //Validation
        boolean validCustomerId = false;
        boolean validPassportId = true;
        boolean validSurname = true;
        boolean validFname = true;
        boolean validDob = true;
        boolean validGender = false;
        boolean validNationality = true;
        boolean validNic = true;
        boolean validOccupation = true;
        boolean validAddress = false;
        boolean validEmail = false;
        boolean validPhone = true;

        //validate customerId
        if((customerId.length() == 5) && (customerId.charAt(0) == 'C')){
            validCustomerId = true;
            jLabelCus.setVisible(false);
        }
        else{
            jLabelCus.setVisible(true);
        }

        //Validate passportId
        if((passportId.length() == 9)){
            if(passportId.charAt(0) == 'N'){
                for(int i = 1; i < passportId.length(); i++){
                    char res = passportId.charAt(i);
                    if(!Character.isDigit(res)){
                        validPassportId = false;
                        jLabelPass.setVisible(true);
                        break;
                    }
                }
            }
        }
        else{
            jLabelPass.setVisible(true);
        }

        //Validate surname, fname
        if(surname.length() == 0){
            jLabelSur.setVisible(true);
        }
        else{
            for(int i = 0; i < surname.length(); i++){
                char res = surname.charAt(i);
                if(!Character.isLetter(res))
                {
                    validSurname = false;
                    jLabelSur.setVisible(true);
                    break;
                }

            }
        }

        if(firstName.length() != 0){
            for(int i = 0; i < firstName.length(); i++){
                char res = firstName.charAt(i);
                if(!Character.isLetter(res)){
                    validFname = false;
                    jLabelfname.setVisible(true);
                    break;
                }
            }
        }
        else{
            jLabelfname.setVisible(true);
        }

        //Validate dob
        if(dobDay.equals("Day") || dobMonth.equals("Month") || dobYear.equals("Year")){
            validDob = false;
            jLabeldob.setVisible(true);
        }
        else{
            jLabeldob.setVisible(false);
        }

        //Validate gender
        if(gender.equals("Male") || gender.equals("Female")){
            validGender = true;
            jLabelgender.setVisible(false);
        }
        else{
            validGender = false;
            jLabelgender.setVisible(true);
        }
        //Validate nationality
        if(nationality.length() != 0){
            for(int i = 0; i < nationality.length(); i++){
                char res = nationality.charAt(i);
                if(!Character.isLetter(res)){
                    validNationality = false;
                    jLabelnational.setVisible(true);
                    break;
                }
            }
        }
        else{
            jLabelnational.setVisible(true);
        }

        //Validate nic
        if((nic.length() == 10) && (nic.charAt(9) == 'v' || nic.charAt(9) == 'V')){
            for(int i = 0; i < 9; i++){
                char res = nic.charAt(i);
                if(!Character.isDigit(res)){
                    validNic = false;
                    jLabelnic.setVisible(true);
                    break;
                }
                else{
                    jLabelnic.setVisible(false);
                }
            }
        }
        else{
            jLabelnic.setVisible(true);
        }

        //Validate occupation
        if(occupation.length() != 0){
            for(int i = 0; i < occupation.length(); i++){
                char res = occupation.charAt(i);
                if(!Character.isLetter(res)){
                    validOccupation = false;
                    jLabelocc.setVisible(true);
                    break;
                }
                else{
                    jLabelocc.setVisible(false);
                }
            }
        }
        else{
            jLabelocc.setVisible(true);
        }

        //Validate address
        if(address.length() > 3){
            validAddress = true;
            jLabeladd.setVisible(false);
        }
        else{
            jLabeladd.setVisible(true);
        }

        //Validate email

        if(email.matches("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{3}")){
            validEmail = true;
            jLabelemail.setVisible(false);
        }
        else{
            jLabelemail.setVisible(true);
        }

        //Validate phone
        if(!contact.isEmpty())
        for(int i = 0; i < contact.length(); i++){
            char res = contact.charAt(i);
            if(!Character.isDigit(res)){
                validPhone = false;
                jLabelcontact.setVisible(true);
                break;
            }
            else{
                jLabelcontact.setVisible(false);
            }
        }
        else
        jLabelcontact.setVisible(true);

        if(validCustomerId && validPassportId && validNic && validSurname && validFname && validDob && validGender && validNationality && validOccupation && validAddress && validEmail && validPhone){
            //Inserting customer details
            try{
                String sql = "insert into customer "
                + " values( '" + customerId + "', '" + passportId + "', '" + nic
                + "', '" + surname + "', '" + firstName + "',  '" + dob
                + "' , '" + gender + "', '" + nationality + "', '" + occupation
                + "', '" + address + "', '" + email + "', '" + contact + "' )";
                pstatement = conn.prepareStatement(sql);
                pstatement.execute();
                JOptionPane.showMessageDialog(null, "Customer ID : " + customerId + " Added to Database!");
                
                //Resetting Values in data fields
                jTextFieldCustomerId5.setText(null);
                jTextFieldPassportId5.setText(null);
                jTextFieldSurname5.setText(null);
                jTextFieldFirstName5.setText(null);
                jComboBoxdobday.setSelectedIndex(0);
                jComboBoxdobmonth.setSelectedIndex(0);
                jComboBoxdobyear.setSelectedIndex(0);
                jTextFieldNationality5.setText(null);
                jTextFieldNic5.setText(null);
                jTextAreaAddress5.setText(null);
                jTextFieldOccupation5.setText(null);
                jTextFieldContact5.setText(null);
                jTextFieldEmail5.setText(null);
                jComboBoxGender5.setSelectedIndex(0);
                
                
             
                    try{
                        String currentSeat = seatId[--count];
                        String Sql="update flight_seat set passengerId='"+passportId+"' where flightId='"+flightId+"' and seatId='"+currentSeat+"'";
                        pstatement=conn.prepareStatement(Sql);
                        pstatement.execute();
                        
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
           

                jTextFieldCustomerId6.setText(customerId);  //set transaction customerID
                amount =ticketCount*price;                  //calculate amount
                jTextFieldAmount6.setText(String.valueOf(amount)); //set amount in transaction

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Some fields are Missing or Invalid!");
        }

        tableLoad();

    }//GEN-LAST:event_AddCustomerActionPerformed

    private void CustomerDetailsNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerDetailsNextActionPerformed
        // TODO add your handling code here:

        jTabbedPaneUser.setEnabledAt(6,false);
        jTabbedPaneUser.setSelectedIndex(7);
        jTabbedPaneUser.setEnabledAt(8,true);
    }//GEN-LAST:event_CustomerDetailsNextActionPerformed

    private void jButtonDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteCustomerActionPerformed
        // TODO add your handling code here:

        //Delete customer details
        try{
            String sql = "delete from customer "
            + " where  customerId = '" + customerId + "'";
            pstatement = conn.prepareStatement(sql);
            pstatement.execute();
            JOptionPane.showMessageDialog(null, "Customer ID : " + customerId + " Deleted from Database!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        tableLoad();
    }//GEN-LAST:event_jButtonDeleteCustomerActionPerformed

    private void seat1letterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat1letterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seat1letterActionPerformed

    private void seat6letterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat6letterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seat6letterActionPerformed

    private void ConfirmReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmReservationActionPerformed

            int r = jTableConfirmation.getSelectedRow();
            passId = jTableConfirmation.getValueAt(r, 2).toString();
            fltId = jTableConfirmation.getValueAt(r, 3).toString();
            stId = jTableConfirmation.getValueAt(r, 4).toString();
            prce = Double.parseDouble(jTableConfirmation.getValueAt(r, 9).toString());
                        
            try{
                String sql = "insert into reservation(passportId, price, flightId, seatId) values('" + passId + "', " + price + ", '" + flightId + "', '" + stId + "' )";
                pstatement = conn.prepareStatement(sql);
                pstatement.execute();
                JOptionPane.showMessageDialog(null, "Ticket Reserved!");
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_ConfirmReservationActionPerformed

    private void confirmationBack8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmationBack8ActionPerformed
        // TODO add your handling code here:
        jTabbedPaneUser.setEnabledAt(8,false);
        jTabbedPaneUser.setSelectedIndex(7);
        jTabbedPaneUser.setEnabledAt(7,true);
    }//GEN-LAST:event_confirmationBack8ActionPerformed

    private void confirmationNext8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmationNext8ActionPerformed
        // TODO add your handling code here:
        //proceeding to next window
        jTabbedPaneUser.setEnabledAt(8,false);
        jTabbedPaneUser.setSelectedIndex(9);
        jTabbedPaneUser.setEnabledAt(9,true);
    }//GEN-LAST:event_confirmationNext8ActionPerformed

    private void ReserveBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBack2ActionPerformed
        // TODO add your handling code here:
        seat10letter.setVisible(false);
        seat10number.setVisible(false);
        seat10.setVisible(false);
        seat9letter.setVisible(false);
        seat9number.setVisible(false);
        seat9.setVisible(false);
        seat8letter.setVisible(false);
        seat8number.setVisible(false);
        seat8.setVisible(false);
        seat7letter.setVisible(false);
        seat7number.setVisible(false);
        seat7.setVisible(false);
        seat6letter.setVisible(false);
        seat6number.setVisible(false);
        seat6.setVisible(false);
        seat5letter.setVisible(false);
        seat5number.setVisible(false);
        seat5.setVisible(false);
        seat4letter.setVisible(false);
        seat4number.setVisible(false);
        seat4.setVisible(false);
        seat3letter.setVisible(false);
        seat3number.setVisible(false);
        seat3.setVisible(false); 
        seat2letter.setVisible(false);
        seat2number.setVisible(false);
        seat2.setVisible(false);
        seat1letter.setVisible(false);
        seat1number.setVisible(false);
        seat1.setVisible(false);
        
        
        jTabbedPaneUser.setEnabledAt(5,false);
        jTabbedPaneUser.setSelectedIndex(4);
        jTabbedPaneUser.setEnabledAt(4,true);
        
    }//GEN-LAST:event_ReserveBack2ActionPerformed

    private void packagereservationNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packagereservationNextActionPerformed
        // TODO add your handling code here:
        ticketCount=Integer.parseInt(jComboBoxticketcount4.getSelectedItem().toString());
        count=ticketCount; //this for confirmation part(to assign passportID) 
        switch(ticketCount){
            case 10: seat10letter.setVisible(true);
                    seat10number.setVisible(true);
                    seat10.setVisible(true);
            case 9: seat9letter.setVisible(true);
                    seat9number.setVisible(true);
                    seat9.setVisible(true);
            case 8: seat8letter.setVisible(true);
                    seat8number.setVisible(true);
                    seat8.setVisible(true);
            case 7: seat7letter.setVisible(true);
                    seat7number.setVisible(true);
                    seat7.setVisible(true);
            case 6: seat6letter.setVisible(true);
                    seat6number.setVisible(true);
                    seat6.setVisible(true);
            case 5: seat5letter.setVisible(true);
                    seat5number.setVisible(true);
                    seat5.setVisible(true);
            case 4: seat4letter.setVisible(true);
                    seat4number.setVisible(true);
                    seat4.setVisible(true);
            case 3: seat3letter.setVisible(true);
                    seat3number.setVisible(true);
                    seat3.setVisible(true); 
            case 2: seat2letter.setVisible(true);
                    seat2number.setVisible(true);
                    seat2.setVisible(true);                  
            default :
                    seat1letter.setVisible(true);
                    seat1number.setVisible(true);
                    seat1.setVisible(true);
            
        }
        
        jTabbedPaneUser.setEnabledAt(4,false);
        jTabbedPaneUser.setSelectedIndex(5);
        jTabbedPaneUser.setEnabledAt(5,true);
    }//GEN-LAST:event_packagereservationNextActionPerformed

    private void jTextFieldpname4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpname4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpname4ActionPerformed

    private void PackagereserbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackagereserbackActionPerformed
        // TODO add your handling code here:
        jTabbedPaneUser.setEnabledAt(4,false);
        jTabbedPaneUser.setSelectedIndex(3);
        jTabbedPaneUser.setEnabledAt(3,true);
    }//GEN-LAST:event_PackagereserbackActionPerformed

    private void transactionNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionNextActionPerformed
        // TODO add your handling code here:
        jTabbedPaneUser.setEnabledAt(7,false);
        jTabbedPaneUser.setSelectedIndex(8);
        jTabbedPaneUser.setEnabledAt(8,true);
    }//GEN-LAST:event_transactionNextActionPerformed

    public void tableloadsearchuser(){
        String sql;
        userID=jTextFielduserId.getText();
        try {
            sql="SELECT * \n"+
                "FROM user \n"+
                "WHERE userId='"+userID+"'";
            
            pstatement=conn.prepareStatement(sql);
            Results=pstatement.executeQuery();
            
           jTablesearchUser.setModel(DbUtils.resultSetToTableModel(Results));
           
           if(Results.next())
           {
              JOptionPane.showMessageDialog(null,"Cannot find Value!");
           }
                       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     
 
 }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomer;
    private javax.swing.JButton BasicDetailsBack;
    private javax.swing.JButton BasicDetailsNext;
    private javax.swing.JButton ConfirmReservation;
    private javax.swing.JButton CustomerDetailsNext;
    private javax.swing.JButton LockSeats;
    private javax.swing.JButton LockSeatsNext;
    private javax.swing.JButton Packagereserback;
    private javax.swing.JButton PackagesBack;
    private javax.swing.JButton PrintTicket;
    private javax.swing.JButton ReserveBack;
    private javax.swing.JButton ReserveBack2;
    private javax.swing.JButton ReserveNext;
    private javax.swing.JButton Reset;
    private javax.swing.JButton TicketsOnly;
    private javax.swing.JButton TransactionBack;
    private javax.swing.JButton TransactionNext;
    private javax.swing.JButton confirmationBack8;
    private javax.swing.JButton confirmationNext8;
    private javax.swing.JButton jButtonDeleteCustomer;
    private javax.swing.JButton jButtonDeletecustomer;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSearcuser;
    private javax.swing.JButton jButtonTourPackages;
    private javax.swing.JButton jButtonaddUser;
    private javax.swing.JButton jButtondeleteUser;
    private javax.swing.JButton jButtonpackageAfrica;
    private javax.swing.JButton jButtonpackageDownunder;
    private javax.swing.JButton jButtonpackageMalayasia;
    private javax.swing.JButton jButtonpackageMilan;
    private javax.swing.JButton jButtonpackageParis;
    private javax.swing.JButton jButtonsearchCustomer;
    private javax.swing.JComboBox jComboBoxGender5;
    private javax.swing.JComboBox<String> jComboBoxPaymentMethod6;
    private javax.swing.JComboBox<String> jComboBoxday;
    private javax.swing.JComboBox<String> jComboBoxdeparture;
    private javax.swing.JComboBox<String> jComboBoxdestination;
    private javax.swing.JComboBox<String> jComboBoxdobday;
    private javax.swing.JComboBox<String> jComboBoxdobmonth;
    private javax.swing.JComboBox<String> jComboBoxdobyear;
    private javax.swing.JComboBox<String> jComboBoxflightclass;
    private javax.swing.JComboBox<String> jComboBoxmonth;
    private javax.swing.JComboBox<String> jComboBoxticketcount;
    private javax.swing.JComboBox<String> jComboBoxticketcount4;
    private javax.swing.JComboBox<String> jComboBoxuserlevel;
    private javax.swing.JComboBox<String> jComboBoxyear;
    private javax.swing.JDesktopPane jDesktopPaneMain;
    private javax.swing.JInternalFrame jInternalFrameLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelContact1;
    private javax.swing.JLabel jLabelCus;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelSur;
    private javax.swing.JLabel jLabeladd;
    private javax.swing.JLabel jLabelcontact;
    private javax.swing.JLabel jLabeldob;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabelfname;
    private javax.swing.JLabel jLabelgender;
    private javax.swing.JLabel jLabelnational;
    private javax.swing.JLabel jLabelnic;
    private javax.swing.JLabel jLabelocc;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemexit;
    private javax.swing.JMenuItem jMenuItemlogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelBasicDetails;
    private javax.swing.JPanel jPanelConfirmation;
    private javax.swing.JPanel jPanelCustomerDetails;
    private javax.swing.JPanel jPanelMainMenu;
    private javax.swing.JPanel jPanelPackageReservation;
    private javax.swing.JPanel jPanelPackages;
    private javax.swing.JPanel jPanelPrintTicket;
    private javax.swing.JPanel jPanelReservation;
    private javax.swing.JPanel jPanelTransaction;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordFieldconfirm1;
    private javax.swing.JPanel jPlanelSeatArrangement;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPaneAdmin;
    private javax.swing.JTabbedPane jTabbedPaneUser;
    private javax.swing.JTable jTableConfirmation;
    private javax.swing.JTable jTableCustomerDetails;
    private javax.swing.JTable jTableFlightDetails;
    private javax.swing.JTable jTablesearchResult3;
    private javax.swing.JTable jTablesearchUser;
    private javax.swing.JTextArea jTextAreaAddress5;
    private javax.swing.JTextField jTextFieldAirline2;
    private javax.swing.JTextField jTextFieldAirlineId2;
    private javax.swing.JTextField jTextFieldAmount6;
    private javax.swing.JTextField jTextFieldArrivasl2;
    private javax.swing.JTextField jTextFieldContact5;
    private javax.swing.JTextField jTextFieldCustomerId5;
    private javax.swing.JTextField jTextFieldCustomerId6;
    private javax.swing.JTextField jTextFieldDeparture2;
    private javax.swing.JTextField jTextFieldEmail5;
    private javax.swing.JTextField jTextFieldFirstName5;
    private javax.swing.JTextField jTextFieldFlightId2;
    private javax.swing.JTextField jTextFieldFlightId4;
    private javax.swing.JTextField jTextFieldFrom2;
    private javax.swing.JTextField jTextFieldNIC3;
    private javax.swing.JTextField jTextFieldNationality5;
    private javax.swing.JTextField jTextFieldNic5;
    private javax.swing.JTextField jTextFieldOccupation5;
    private javax.swing.JTextField jTextFieldPassportId5;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldSeats;
    private javax.swing.JTextField jTextFieldSurname5;
    private javax.swing.JTextField jTextFieldTo2;
    private javax.swing.JTextField jTextFieldTransactionId6;
    private javax.swing.JTextField jTextFieldUserID1;
    private javax.swing.JTextField jTextFieldcustomerId3;
    private javax.swing.JTextField jTextFielddays;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldhotelname4;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldpackageprice;
    private javax.swing.JTextField jTextFieldpassID3;
    private javax.swing.JTextField jTextFieldphone1;
    private javax.swing.JTextField jTextFieldpname4;
    private javax.swing.JTextField jTextFielduserId;
    private javax.swing.JTextField jTextFieldusername1;
    private javax.swing.JTextField jlableTotalAmount8;
    private javax.swing.JTextField jlableTransactionId;
    private javax.swing.JButton packagereservationNext;
    private javax.swing.JLabel seat1;
    private javax.swing.JLabel seat10;
    private javax.swing.JComboBox<String> seat10letter;
    private javax.swing.JComboBox<String> seat10number;
    private javax.swing.JComboBox<String> seat1letter;
    private javax.swing.JComboBox<String> seat1number;
    private javax.swing.JLabel seat2;
    private javax.swing.JComboBox<String> seat2letter;
    private javax.swing.JComboBox<String> seat2number;
    private javax.swing.JLabel seat3;
    private javax.swing.JComboBox<String> seat3letter;
    private javax.swing.JComboBox<String> seat3number;
    private javax.swing.JLabel seat4;
    private javax.swing.JComboBox<String> seat4letter;
    private javax.swing.JComboBox<String> seat4number;
    private javax.swing.JLabel seat5;
    private javax.swing.JComboBox<String> seat5letter;
    private javax.swing.JComboBox<String> seat5number;
    private javax.swing.JLabel seat6;
    private javax.swing.JComboBox<String> seat6letter;
    private javax.swing.JComboBox<String> seat6number;
    private javax.swing.JLabel seat7;
    private javax.swing.JComboBox<String> seat7letter;
    private javax.swing.JComboBox<String> seat7number;
    private javax.swing.JLabel seat8;
    private javax.swing.JComboBox<String> seat8letter;
    private javax.swing.JComboBox<String> seat8number;
    private javax.swing.JLabel seat9;
    private javax.swing.JComboBox<String> seat9letter;
    private javax.swing.JComboBox<String> seat9number;
    private javax.swing.JButton transactionNext;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}

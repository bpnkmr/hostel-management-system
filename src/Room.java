
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Room extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    PreparedStatement user_name;
    ResultSet rs;


    /**
     * Creates new form Room
     */
    public Room() {
        try{
             
            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
            //ALSO SET THE CLASSPATH
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_db","root","");
            pst= con.prepareStatement("select * from users where room_id =?");
             
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Room9 = new javax.swing.JButton();
        Room1 = new javax.swing.JButton();
        Room10 = new javax.swing.JButton();
        Room2 = new javax.swing.JButton();
        Room4 = new javax.swing.JButton();
        Room6 = new javax.swing.JButton();
        Room7 = new javax.swing.JButton();
        Room3 = new javax.swing.JButton();
        Room8 = new javax.swing.JButton();
        Room5 = new javax.swing.JButton();
        room1 = new javax.swing.JButton();
        room3 = new javax.swing.JButton();
        room4 = new javax.swing.JButton();
        room5 = new javax.swing.JButton();
        room2 = new javax.swing.JButton();
        room6 = new javax.swing.JButton();
        room7 = new javax.swing.JButton();
        room8 = new javax.swing.JButton();
        room10 = new javax.swing.JButton();
        room9 = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Building B");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Room Configuration");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Building A");

        Room9.setText("Room A9");
        Room9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room9ActionPerformed(evt);
            }
        });

        Room1.setText("Room A1");
        Room1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room1ActionPerformed(evt);
            }
        });

        Room10.setText("Room A10");
        Room10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room10ActionPerformed(evt);
            }
        });

        Room2.setText("Room A2");
        Room2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room2ActionPerformed(evt);
            }
        });

        Room4.setText("Room A4");
        Room4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room4ActionPerformed(evt);
            }
        });

        Room6.setText("Room A6");
        Room6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room6ActionPerformed(evt);
            }
        });

        Room7.setText("Room A7");
        Room7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room7ActionPerformed(evt);
            }
        });

        Room3.setText("Room A3");
        Room3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room3ActionPerformed(evt);
            }
        });

        Room8.setText("Room A8");
        Room8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room8ActionPerformed(evt);
            }
        });

        Room5.setText("Room A5");
        Room5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room5ActionPerformed(evt);
            }
        });

        room1.setText("Room B1");
        room1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room1ActionPerformed(evt);
            }
        });

        room3.setText("Room B3");
        room3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room3ActionPerformed(evt);
            }
        });

        room4.setText("Room B4");
        room4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room4ActionPerformed(evt);
            }
        });

        room5.setText("Room B5");

        room2.setText("Room B2");

        room6.setText("Room B6");
        room6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room6ActionPerformed(evt);
            }
        });

        room7.setText("Room B7");
        room7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room7ActionPerformed(evt);
            }
        });

        room8.setText("Room B8");

        room10.setText("Room B10");
        room10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room10ActionPerformed(evt);
            }
        });

        room9.setText("Room B9");
        room9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room9ActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Room1)
                                    .addComponent(Room10)
                                    .addComponent(Room9)
                                    .addComponent(Room8)
                                    .addComponent(Room7)
                                    .addComponent(Room6)
                                    .addComponent(Room5)
                                    .addComponent(Room4)
                                    .addComponent(Room3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(room9)
                                    .addComponent(room7)
                                    .addComponent(room5)
                                    .addComponent(room1)
                                    .addComponent(jLabel1)
                                    .addComponent(room10)
                                    .addComponent(room8)
                                    .addComponent(room6)
                                    .addComponent(room4)
                                    .addComponent(room3)
                                    .addComponent(room2))))
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Room2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room1)
                            .addComponent(Room1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room2)
                    .addComponent(room2))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room3)
                    .addComponent(room3))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room4)
                    .addComponent(room4))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room5)
                    .addComponent(room5))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room6)
                    .addComponent(room6))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room7)
                    .addComponent(room7))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room8)
                    .addComponent(room8))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room9)
                    .addComponent(room9))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room10)
                    .addComponent(room10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back)
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Room10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room10ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "10";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_Room10ActionPerformed

    private void Room5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room5ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "5";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_Room5ActionPerformed

    private void Room8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room8ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "8";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_Room8ActionPerformed

    private void room3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_room3ActionPerformed

    private void room7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_room7ActionPerformed

    private void room10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_room10ActionPerformed

    private void room6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_room6ActionPerformed

    private void room1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room1ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "1";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_room1ActionPerformed

    private void room9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_room9ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Dashboard regFace = new Dashboard();
                    regFace.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void Room1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room1ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "1";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
        
    }//GEN-LAST:event_Room1ActionPerformed

    private void room4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_room4ActionPerformed

    private void Room2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room2ActionPerformed
        // TODO add your handling code here:
         try {
                        
           String s = "2";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_Room2ActionPerformed

    private void Room3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room3ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "3";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_Room3ActionPerformed

    private void Room4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room4ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "4";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_Room4ActionPerformed

    private void Room6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room6ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "6";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_Room6ActionPerformed

    private void Room7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room7ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "7";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_Room7ActionPerformed

    private void Room9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room9ActionPerformed
        // TODO add your handling code here:
        try {
                        
           String s = "9";
        pst.setString(1, s);
        
            rs=pst.executeQuery();
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String userName = rs.getString("user_name");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String roomid = rs.getString("room_id");
        String Branch = rs.getString("Branch");
        
        // print the results
        
            JOptionPane.showMessageDialog(null, "First Name :" + firstName + "\n" + " Last Name :" + lastName + "\n" + " email :" + email + "\n" + "phone :" + phone + "\n" + "address :" + address + "\n" + "roomid :" + roomid + "\n" + "Branch :" + Branch + "\n");
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, email, phone, address, roomid, Branch);
      }

            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
        }
    }//GEN-LAST:event_Room9ActionPerformed
      
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
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Room1;
    private javax.swing.JButton Room10;
    private javax.swing.JButton Room2;
    private javax.swing.JButton Room3;
    private javax.swing.JButton Room4;
    private javax.swing.JButton Room5;
    private javax.swing.JButton Room6;
    private javax.swing.JButton Room7;
    private javax.swing.JButton Room8;
    private javax.swing.JButton Room9;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton room1;
    private javax.swing.JButton room10;
    private javax.swing.JButton room2;
    private javax.swing.JButton room3;
    private javax.swing.JButton room4;
    private javax.swing.JButton room5;
    private javax.swing.JButton room6;
    private javax.swing.JButton room7;
    private javax.swing.JButton room8;
    private javax.swing.JButton room9;
    // End of variables declaration//GEN-END:variables
}
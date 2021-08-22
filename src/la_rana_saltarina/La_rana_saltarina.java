/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_rana_saltarina;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author jean
 */
public class La_rana_saltarina extends JFrame {

    public static ArrayList<rana> ranas = new ArrayList<rana>();

    public static JPanel contentPane;
    public static JLabel piso = new JLabel();
    public static JLabel nube1 = new JLabel();
    public static JLabel nube2 = new JLabel();
    
    public static JLabel ranaR1 = new JLabel();
    public static JLabel ranaR2 = new JLabel();
    public static JLabel ranaR3 = new JLabel();

    public static JLabel ranaV1 = new JLabel();
    public static JLabel ranaV2 = new JLabel();
    public static JLabel ranaV3 = new JLabel();

    public static JButton btnMover = new JButton();
    public static La_rana_saltarina frame = new La_rana_saltarina();

    private static String[] movimiento = {"rrrovvv", // prueba 
        "rrorvvv",
        "rrvrovv",
        "rrvrvov",
        "rrvovrv",
        "rovrvrv",
        "orvrvrv",
        "vrorvrv",
        "vrvrorv",
        "vrvrvro",
        "vrvrvor",
        "vrvovrr",
        "vovrvrr",
        "vvorvrr",
        "vvvrorr",
        "vvvorrr"
    };
    
     public static double [] angulos = new double[180];
        
          
    
    
    
    public int c = 1; // contador de los pasos

    public URL url = getClass().getResource("/img/paisaje.jpg");
    public Image image = new ImageIcon(url).getImage();

    public La_rana_saltarina() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1200, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 1200, 700);

        contentPane.setBackground(Color.CYAN);

        piso.setBounds(0, 465, 1400, 250);
        ImageIcon imgfriki1 = new ImageIcon(getClass().getResource("/img/piso.jpg"));
        ImageIcon imgescalada = new ImageIcon(imgfriki1.getImage().getScaledInstance(piso.getWidth(),
                piso.getHeight(), Image.SCALE_DEFAULT));
        piso.setIcon(imgescalada);

        contentPane.add(piso);
        
        
        nube1.setBounds(100, 10, 200, 150);
        ImageIcon imgfriki2 = new ImageIcon(getClass().getResource("/img/nube.png"));
        ImageIcon imgescalada2 = new ImageIcon(imgfriki2.getImage().getScaledInstance(nube1.getWidth(),
                nube1.getHeight(), Image.SCALE_DEFAULT));
        nube1.setIcon(imgescalada2);

        contentPane.add(nube1);
        
        nube2.setBounds(900, 10, 200, 150);
        ImageIcon imgfriki3 = new ImageIcon(getClass().getResource("/img/nube.png"));
        ImageIcon imgescalada3 = new ImageIcon(imgfriki3.getImage().getScaledInstance(nube2.getWidth(),
                nube1.getHeight(), Image.SCALE_DEFAULT));
        nube2.setIcon(imgescalada3);

        contentPane.add(nube2);
        

        btnMover.setBounds(550, 600, 100, 40);
        btnMover.setText("Iniciar");
        btnMover.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                btnMover.setText("Siguiente");
                if (movimiento[c] == "rrorvvv") {
                    moverDer(2, "corto");
                } else {
                    if (movimiento[c] == "rrvrovv") {
                        moverIzq(3, "largo");
                    } else {
                        if (movimiento[c] == "rrvrvov") {
                            moverIzq(4, "corto");
                        } else {
                            if (movimiento[c] == "rrvovrv") {
                                moverDer(2, "largo");
                            } else {
                                if (movimiento[c] == "rovrvrv") {
                                    moverDer(1, "largo");
                                }
                            }
                        }
                    }

                }

                c++;
                btnMover.setEnabled(false);
            }
        });
        contentPane.add(btnMover);

        setRanas();
        contentPane.repaint();

    }

    public void setRanas() {
        ranaR3.setBounds(50, 300, 200, 200);
        ImageIcon imgfriki1 = new ImageIcon(getClass().getResource("/img/frogRed.png"));
        ImageIcon imgescalada = new ImageIcon(imgfriki1.getImage().getScaledInstance(ranaR3.getWidth(),
                ranaR3.getHeight(), Image.SCALE_DEFAULT));
        ranaR3.setIcon(imgescalada);

        ranaR2.setBounds(200, 300, 200, 200);
        ImageIcon imgfriki2 = new ImageIcon(getClass().getResource("/img/frogRed.png"));
        ImageIcon imgescalada2 = new ImageIcon(imgfriki2.getImage().getScaledInstance(ranaR2.getWidth(),
                ranaR2.getHeight(), Image.SCALE_DEFAULT));
        ranaR2.setIcon(imgescalada2);

        ranaR1.setBounds(350, 300, 200, 200);
        ImageIcon imgfriki3 = new ImageIcon(getClass().getResource("/img/frogRed.png"));
        ImageIcon imgescalada3 = new ImageIcon(imgfriki3.getImage().getScaledInstance(ranaR1.getWidth(),
                ranaR1.getHeight(), Image.SCALE_DEFAULT));
        ranaR1.setIcon(imgescalada3);

        ranaV1.setBounds(650, 300, 200, 200);
        ImageIcon imgfriki4 = new ImageIcon(getClass().getResource("/img/frog.png"));
        ImageIcon imgescalada4 = new ImageIcon(imgfriki4.getImage().getScaledInstance(ranaV1.getWidth(),
                ranaV1.getHeight(), Image.SCALE_DEFAULT));
        ranaV1.setIcon(imgescalada4);

        ranaV2.setBounds(800, 300, 200, 200);
        ImageIcon imgfriki5 = new ImageIcon(getClass().getResource("/img/frog.png"));
        ImageIcon imgescalada5 = new ImageIcon(imgfriki5.getImage().getScaledInstance(ranaV2.getWidth(),
                ranaV2.getHeight(), Image.SCALE_DEFAULT));
        ranaV2.setIcon(imgescalada5);

        ranaV3.setBounds(950, 300, 200, 200);
        ImageIcon imgfriki6 = new ImageIcon(getClass().getResource("/img/frog.png"));
        ImageIcon imgescalada6 = new ImageIcon(imgfriki6.getImage().getScaledInstance(ranaV3.getWidth(),
                ranaV3.getHeight(), Image.SCALE_DEFAULT));
        ranaV3.setIcon(imgescalada6);

        rana r3 = new rana("rana roja 0", 50, 200);
        rana r2 = new rana("rana roja 1", 200, 200);
        rana r1 = new rana("rana roja 2", 350, 200);
        rana v1 = new rana("rana verde 3", 650, 200);
        rana v2 = new rana("rana verde 4", 800, 200);
        rana v3 = new rana("rana verde 5", 950, 200);

        ranas.add(r3);
        ranas.add(r2);
        ranas.add(r1);

        ranas.add(v1);
        ranas.add(v2);
        ranas.add(v3);

    }

    public static void moverDer(int num, String salto) { // mover las ranas rojas .... numero de rana y salto
        Thread mover = new Thread() {
            public void run() {
                if (num == 2) {
                    if (salto.equals("corto")) { // salto corto
                        try {
                            int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                           
                            for (int i =0; i<=150; i++) {
                                 if (i < 75) {
                                        ranaR1.setBounds(posx + i, 300 - (i * 2), 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR1);
                                        contentPane.repaint();
                                    } else {
                                        ranaR1.setBounds(posx + i, 300 + (i - 150) * 2, 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR1);
                                        contentPane.repaint();
                                    
                                      }
                           
                                sleep(5);
                                
                            }
                            ranas.get(num).setPosX(posx + 150); // nueva posicion de la rana
                        } catch (Exception e) {
                        }
                        btnMover.setEnabled(true);
                    } else {  // salto largo
                        try {
                            int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                            for (int i = 1; i <= 300; i++) {

                                if (i < 125) {
                                    ranaR1.setBounds(posx + i, 300 - (i*2), 200, 200);  // aumenta la posicion en x  
                                    contentPane.add(ranaR1);
                                    contentPane.repaint();
                                } else {
                                    if(i<175){
                                        ranaR1.setBounds(posx + i, 50, 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR1);
                                        contentPane.repaint();
                                    }else{
                                        
                                        ranaR1.setBounds(posx + i,50+(i-174)*2, 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR1);
                                        contentPane.repaint();
                                    }
                                }
                       
                                sleep(5);
                                

                            }
                            ranas.get(num).setPosX(posx + 300); // nueva posicion de la rana
                        } catch (Exception e) {
                        }
                        btnMover.setEnabled(true);
                    }
                } else {
                    if (num == 1) {
                        if (salto.equals("corto")) { // salto corto
                            try {
                                int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                                for (int i = 1; i <= 150; i++) {
                                    if (i < 75) {
                                        ranaR2.setBounds(posx + i, 300 - (i * 2), 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR2);
                                        contentPane.repaint();
                                    } else {
                                        ranaR2.setBounds(posx + i, 300 + (i - 150) * 2, 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR2);
                                        contentPane.repaint();
                                    }
                                    sleep(5);

                                }
                                ranas.get(num).setPosX(posx + 150); // nueva posicion de la rana
                            } catch (Exception e) {
                            }
                            btnMover.setEnabled(true);
                            
                        } else {  // salto largo
                            try {
                                int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                                for (int i = 1; i <= 300; i++) {

                                    if (i < 150) {
                                        ranaR2.setBounds(posx + i, 300 - (i * 2), 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR2);
                                        contentPane.repaint();
                                    } else {
                                        ranaR2.setBounds(posx + i, 300 + (i - 300) * 2, 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR2);
                                        contentPane.repaint();
                                    }
                                    sleep(5);

                                }
                                ranas.get(num).setPosX(posx + 300); // nueva posicion de la rana
                            } catch (Exception e) {
                            }
                            btnMover.setEnabled(true);
                            
                        }
                    } else { // si el numero es igual a 3
                        if (salto.equals("corto")) { // salto corto
                            try {
                                int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                                for (int i = 1; i <= 150; i++) {
                                    if (i < 75) {
                                        ranaR3.setBounds(posx + i, 300 - (i * 2), 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR3);
                                        contentPane.repaint();
                                    } else {
                                        ranaR3.setBounds(posx + i, 300 + (i - 150) * 2, 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR3);
                                        contentPane.repaint();
                                    }
                                    sleep(5);

                                }
                                ranas.get(num).setPosX(posx + 150); // nueva posicion de la rana
                            } catch (Exception e) {
                            }
                            btnMover.setEnabled(true);
                            
                            
                        } else {  // salto largo
                            try {
                                int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                                for (int i = 1; i <= 300; i++) {

                                    if (i < 150) {
                                        ranaR3.setBounds(posx + i, 300 - (i * 2), 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR3);
                                        contentPane.repaint();
                                    } else {
                                        ranaR3.setBounds(posx + i, 300 + (i - 300) * 2, 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaR3);
                                        contentPane.repaint();
                                    }
                                    sleep(5);

                                }
                                ranas.get(num).setPosX(posx + 300); // nueva posicion de la rana
                            } catch (Exception e) {
                            }
                            btnMover.setEnabled(true);
                            
                        }
                    }
                }

            }
        };
        mover.start();

    }

    public static void moverIzq(int num, String salto) {
        Thread t = new Thread() {

            public void run() {

                if (num == 3) {
                    if (salto.equals("corto")) { // salto corto
                        try {
                            int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                            for (int i = 1; i <= 150; i++) {

                                if (i < 75) {

                                    ranaV1.setBounds(posx - i, 300 - (i * 2), 200, 200);  // aumenta la posicion en x  
                                    contentPane.add(ranaV1);
                                    contentPane.repaint();

                                } else {

                                    ranaV1.setBounds(posx - i, 300 + (i - 150) * 2, 200, 200);  // aumenta la posicion en x  
                                    contentPane.add(ranaV1);
                                    contentPane.repaint();
                                }

                                sleep(5);

                            }
                            ranas.get(num).setPosX(posx - 150); // nueva posicion de la rana
                        } catch (Exception e) {
                        }
                        
                        btnMover.setEnabled(true);
                        
                    } else {  // salto largo
                        try {
                            int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                            for (int i = 1; i <= 300; i++) {
                                if (i < 150) {
                                    ranaV1.setBounds(posx - i, 300 - (i * 2), 200, 200);
                                    contentPane.add(ranaV1);
                                    contentPane.repaint();
                                } else {
                                    ranaV1.setBounds(posx - i, 300 + (i - 300) * 2, 200, 200);
                                    contentPane.add(ranaV1);
                                    contentPane.repaint();
                                }

                                sleep(5);

                            }
                            ranas.get(num).setPosX(posx - 300); // nueva posicion de la rana
                        } catch (Exception e) {
                        }
                    }
                    btnMover.setEnabled(true);
                    

                } else {

                    if (num == 4) {
                        if (salto.equals("corto")) { // salto corto
                            try {
                                int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                                for (int i = 1; i <= 150; i++) {
                                    if (i < 75) {

                                        ranaV2.setBounds(posx - i, 300 - (i * 2), 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaV2);
                                        contentPane.repaint();

                                    } else {

                                        ranaV2.setBounds(posx - i, 300 + (i - 150) * 2, 200, 200);  // aumenta la posicion en x  
                                        contentPane.add(ranaV2);
                                        contentPane.repaint();
                                    }
                                    sleep(5);

                                }
                                ranas.get(num).setPosX(posx - 150); // nueva posicion de la rana
                            } catch (Exception e) {
                            }
                            
                            btnMover.setEnabled(true);
                            
                        } else {  // salto largo
                            try {
                                int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                                for (int i = 1; i <= 300; i++) {

                                    if (i < 150) {
                                        ranaV2.setBounds(posx - i, 300 - (i * 2), 200, 200);
                                        contentPane.add(ranaV2);
                                        contentPane.repaint();
                                    } else {
                                        ranaV2.setBounds(posx - i, 300 + (i - 300) * 2, 200, 200);
                                        contentPane.add(ranaV2);
                                        contentPane.repaint();
                                    }
                                    sleep(5);

                                }
                                ranas.get(num).setPosX(posx - 300); // nueva posicion de la rana
                            } catch (Exception e) {
                            }
                            btnMover.setEnabled(true);
                        }
                    } else {

                        if (salto.equals("corto")) { // salto corto
                            try {
                                int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                                for (int i = 1; i <= 150; i++) {
                                    ranaV3.setBounds(posx - i, 300, 200, 200);  // aumenta la posicion en x  
                                    contentPane.add(ranaV3);
                                    contentPane.repaint();
                                    sleep(5);

                                }
                                ranas.get(num).setPosX(posx - 150); // nueva posicion de la rana
                            } catch (Exception e) {
                            }
                            btnMover.setEnabled(true);
                            
                        } else {  // salto largo
                            try {
                                int posx = ranas.get(num).getPosX(); // extraemos la posicion de la rana
                                for (int i = 1; i <= 300; i++) {

                                    if (i < 150) {
                                        ranaV3.setBounds(posx - i, 300 - (i * 2), 200, 200);
                                        contentPane.add(ranaV3);
                                        contentPane.repaint();
                                    } else {
                                        ranaV3.setBounds(posx - i, 300 + (i - 300) * 2, 200, 200);
                                        contentPane.add(ranaV3);
                                        contentPane.repaint();
                                    }
                                    sleep(5);

                                }
                                ranas.get(num).setPosX(posx - 300); // nueva posicion de la rana
                            } catch (Exception e) {
                            }
                            
                            btnMover.setEnabled(true);
                        }

                    }

                }
            }
        };

        t.start();

    }

    public static void main(String[] args) {

        try {

            frame.setVisible(true);
            
            
          // angulos para y;

        
            

            frame.add(ranaR1);
            frame.add(ranaR2);
            frame.add(ranaR3);
            frame.add(ranaV1);
            frame.add(ranaV2);
            frame.add(ranaV3);
            frame.add(piso);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

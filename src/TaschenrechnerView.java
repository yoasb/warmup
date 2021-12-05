import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TaschenrechnerView {
    private JTextField anzeige;
    private JButton nullButton;
    private JButton einsButton;
    private JButton zweiButton;
    private JButton dreiButton;
    private JButton vierButton;
    private JButton fünfButton;
    private JButton sechsButton;
    private JButton siebenButton;
    private JButton achtButton;
    private JButton neunButton;
    private JButton plusButton;
    private JButton gleichButton;
    private JButton minusButton;
    private JButton malButton;
    private JButton cButton;
    private JButton geteiltButton;
    private JButton punktButton;
    private JPanel mainPanel;
    private TaschenrechnerModel model;

    public TaschenrechnerView() {
        nullButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("0");
            }
        });
        einsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("1");
            }
        });
        zweiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("2");
            }
        });
        dreiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("3");
            }
        });
        vierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("4");
            }
        });
        fünfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("5");
            }
        });
        sechsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("6");
            }
        });
        siebenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("7");
            }
        });
        achtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("8");
            }
        });
        neunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen("9");
            }
        });
        model = new TaschenrechnerModel();

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rechenoperationAusfuehren("+");
            }
        });
        gleichButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setZweiterOperand(Double.parseDouble(anzeige.getText()));
                anzeige.setText(String.valueOf(model.getErgebnis()));
                model.zuruecksetzen();

            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rechenoperationAusfuehren("-");
            }
        });
        malButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rechenoperationAusfuehren("*");
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(null);
            }
        });
        geteiltButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rechenoperationAusfuehren("/");
            }
        });
        punktButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeichenHinzufügen(".");
            }
        });

        gleichButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Color mintgruen = Color.decode("#ade3d1");
                gleichButton.setBackground(mintgruen);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                gleichButton.setBackground(null);
            }
        });
        cButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Color rot = Color.decode("#CC0054");
                cButton.setBackground(rot);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                cButton.setBackground(null);
            }
        });
    }
    public void zeichenHinzufügen(String zahl) {
        anzeige.setText(anzeige.getText() + zahl);
    }
    public void rechenoperationAusfuehren(String op) {
        model.setErsterOperand(Double.parseDouble(anzeige.getText()));
        model.setOperator(op);
        anzeige.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaschenrechnerView");
        frame.setContentPane(new TaschenrechnerView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

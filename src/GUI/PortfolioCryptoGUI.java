package GUI;

import Data.*;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.util.Random;

public class PortfolioCryptoGUI extends JPanel {
    int numberOfCrypto =1;
    JLabel nothing,suggestion;
    ImageIcon emptyError;
    PortfolioCryptoGUI(){
        if(numberOfCrypto ==0) {
            //null page is created(when the user have no crypto for now)
            nothing = new JLabel("You haven't purchased or sold any crypto yet!!");
            suggestion = new JLabel("Please go to Investing section");
            emptyError = new ImageIcon("Assets/Images/emptyPiggy.png");
            Image i = emptyError.getImage();
            Image resideImage = i.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
            emptyError = new ImageIcon(resideImage);

            suggestion.setForeground(new Color(189, 189, 189));
            suggestion.setFont(new Font("Consolas", Font.BOLD, 17));
            suggestion.setBounds(0, 200, 1200, 200);
            suggestion.setHorizontalAlignment(JLabel.CENTER);
            suggestion.setIcon(emptyError);
            suggestion.setHorizontalTextPosition(JLabel.CENTER);
            suggestion.setVerticalTextPosition(JLabel.TOP);

            nothing.setForeground(new Color(164, 164, 166));
            nothing.setFont(new Font("Consolas", Font.BOLD, 20));
            nothing.setBounds(0, 170, 1200, 25);
            nothing.setHorizontalAlignment(JLabel.CENTER);

            this.add(suggestion);
            this.add(nothing);
            this.setBackground(new Color(250, 250, 255));
            this.setBounds(300, 150, 1200, 600);
            this.setLayout(null);
            this.setVisible(true);
        }else{
            this.setBackground(new Color(250, 250, 255));
            this.setBounds(300, 150, 1200, 600);

            String[] headers = {"Name","Price","Change"};
            Object[][] data = {{"Tata",521,(new Random().nextInt(2)*(3)-1)*0.025}};

            JTable table = new JTable(data,headers);


            JScrollPane TablePane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            TablePane.setBorder(null);
            TablePane.setBounds(0, 0, 1200, 600);

            this.add(TablePane);
            this.setVisible(true);
            this.setLayout(null);
        }
    }
}

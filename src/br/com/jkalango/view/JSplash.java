package br.com.jkalango.view;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;





        public class JSplash extends JFrame{
            public JSplash(){
//formulário
                setTitle("Jkalango Splash Screen");
                setSize(400, 300);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());

//botão com o título Start
            JButton starButton = new JButton("Start");
            add(starButton); 

// adicionar um evento ao botão que ao clicar mostre "jkalango"
        starButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new JIntro();            }


        });
// mostrar o formulário        
        setVisible(true);
    }  
}

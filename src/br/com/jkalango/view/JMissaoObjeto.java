package br.com.jkalango.view;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.jkalango.bo;

public class JMissaoObjeto extends JFrame implements IColor {

    public JMissaoObjeto() {
        // Configurações básicas da janela
        setTitle("Missão Objeto");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Label com a mensagem
        JLabel mensagemLabel = new JLabel();
        mensagemLabel.setText("<html><body style='text-align: center; color: black; font-family: \"Press Start 2P\", cursive; font-size: 10px;'>"+
            "Bem-vindos ao Jogo Sombrio dos Números. Acerte o número ou fique preso para sempre...</body></html>");

        // Botão
        JButton iniciarMissaoButton = new JButton("Iniciar Primeira Missão");
        iniciarMissaoButton.setForeground(Color.WHITE);
        iniciarMissaoButton.setBackground(Color.BLACK); // só um exemplo de fundo

        // Listener do botão
        iniciarMissaoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Missão iniciada!");
                // Aqui você pode chamar a próxima janela, por exemplo:
                // new OutraClasse();
                dispose(); // Fecha esta janela
            }
        });

        // Adiciona componentes à janela
        add(mensagemLabel);
        add(iniciarMissaoButton);

        setVisible(true); // Torna a janela visível
    }

    @Override
    public void mudarFundo() {
        // Coloque a mecânica do jogo aqui
    }
}
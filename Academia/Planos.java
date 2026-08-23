import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
 
public class Planos extends JFrame {

    public Planos() {

        setTitle("Planos da Academia");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBackground(Color.BLACK);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 1;

        JLabel nomePlanos = new JLabel("Planos da academia");
        gbc.gridy = 0;
        painel.add(nomePlanos, gbc);
        nomePlanos.setForeground(Color.white);

        JButton basico = new JButton("Básico");
        gbc.gridy = 1;
        painel.add(basico, gbc);
        basico.setBackground(Color.ORANGE);
        basico.setForeground(Color.WHITE);

        JButton premium = new JButton("Premium");
        gbc.gridy = 2;
        painel.add(premium, gbc);
        premium.setBackground(Color.ORANGE);
        premium.setForeground(Color.WHITE);

        JButton anual = new JButton("Anual");
        gbc.gridy = 3;
        painel.add(anual, gbc);
        anual.setBackground(Color.ORANGE);
        anual.setForeground(Color.WHITE);

        basico.addActionListener(b-> {

            JFrame telaBasico = new JFrame("Plano Básico");
            telaBasico.setSize(350, 250);
            telaBasico.setLocationRelativeTo(null);
            

            JPanel painelBasico = new JPanel(new GridBagLayout());
            painelBasico.setBackground(Color.BLACK);

            GridBagConstraints Info = new GridBagConstraints();
            Info.insets = new Insets(10, 10, 10, 10);
            Info.gridx = 0;
            Info.anchor = GridBagConstraints.CENTER;

            JLabel titulo = new JLabel("PLANO BÁSICO");
            titulo.setForeground(Color.WHITE);
            Info.gridy = 0;
            painelBasico.add(titulo, Info);

            JLabel preco = new JLabel("Preço: R$ 79,90 por mês");
            preco.setForeground(Color.WHITE);
            Info.gridy = 1;
            painelBasico.add(preco, Info);

            JLabel beneficios = new JLabel("Musculação: Acesso de segunda a sexta");
            beneficios.setForeground(Color.WHITE);
            Info.gridy = 2;
            
            
            JButton assinar = new JButton("Assine já");
            assinar.setBackground(Color.ORANGE);
            assinar.setForeground(Color.WHITE);
            Info.gridy = 3;
            
            painelBasico.add(assinar, Info);
            telaBasico.add(painelBasico);
            telaBasico.setVisible(true);
        });
        
        	premium .addActionListener(p -> {

            JFrame telaPremium = new JFrame("Plano Premium");
            telaPremium.setSize(350, 250);
            telaPremium.setLocationRelativeTo(null);
           

            JPanel painelPremium = new JPanel(new GridBagLayout());
            painelPremium.setBackground(Color.BLACK);

            GridBagConstraints Info = new GridBagConstraints();
            Info.insets = new Insets(10, 10, 10, 10);
            Info.gridx = 0;
            Info.anchor = GridBagConstraints.CENTER;

            JLabel titulo = new JLabel("PLANO Premium");
            titulo.setForeground(Color.WHITE);
            Info.gridy = 0;
            painelPremium.add(titulo, Info);

            JLabel preco = new JLabel("Preço: R$ 99,89 por mês");
            preco.setForeground(Color.WHITE);
            Info.gridy = 1;
            painelPremium.add(preco, Info);

            JLabel Musculacao = new JLabel("Musculação:Acesso de segunda a sexta" );
            Musculacao.setForeground(Color.WHITE);
            Info.gridy = 2;
            painelPremium.add(Musculacao, Info);
            
            JLabel Boxe = new JLabel("Boxe: Acesso às terças e quintas 21:00");
            Boxe.setForeground(Color.WHITE);
            Info.gridy = 3;
            painelPremium.add(Boxe, Info);
            
            
            JButton assinar = new JButton("Assine já");
            assinar.setBackground(Color.ORANGE);
            assinar.setForeground(Color.WHITE);
            Info.gridy = 4;
            painelPremium.add(assinar, Info);

            telaPremium.add(painelPremium);
            telaPremium.setVisible(true);
        });
        	
        	anual.addActionListener(an -> {

                JFrame telaAnual = new JFrame("Plano Anual");
                telaAnual.setSize(350, 250);
                telaAnual.setLocationRelativeTo(null);
                

                JPanel painelAnual = new JPanel(new GridBagLayout());
                painelAnual.setBackground(Color.BLACK);

                GridBagConstraints Info = new GridBagConstraints();
                Info.insets = new Insets(10, 10, 10, 10);
                Info.gridx = 0;
                Info.anchor = GridBagConstraints.CENTER;

                JLabel titulo = new JLabel("PLANO ANUAL");
                titulo.setForeground(Color.WHITE);
                Info.gridy = 0;
                painelAnual.add(titulo, Info);

                JLabel preco = new JLabel("Preço: R$ 129,89 por mês");
                preco.setForeground(Color.WHITE);
                Info.gridy = 1;
                painelAnual.add(preco, Info);

                JLabel beneficios = new JLabel("Musculação: Acesso de segunda a sexta");
                beneficios.setForeground(Color.WHITE);
                Info.gridy = 2;
                painelAnual.add(beneficios, Info);
                
                
                JLabel Boxe = new JLabel("Boxe: Acesso às terças e quintas 21:00");
                Boxe.setForeground(Color.WHITE);
                Info.gridy = 3;
                painelAnual.add(Boxe, Info);
                
                JButton assinar = new JButton("Assine já");
                assinar.setBackground(Color.ORANGE);
                assinar.setForeground(Color.WHITE);
                Info.gridy = 4;
                painelAnual.add(assinar, Info);

                telaAnual.add(painelAnual);
                telaAnual.setVisible(true);
            });
        
        
        
        add(painel);
    }
}
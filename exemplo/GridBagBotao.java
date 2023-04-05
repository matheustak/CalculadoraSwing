
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridBagBotao implements ActionListener {
	JButton btn0;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;

	JButton jMultiplo;
	JButton jDporZero;
	JButton rAiz;
	JButton jSoma;
	JButton jDivisao;
	JButton jIgual;
	JButton jSubtracao;
	JButton jMultiplicacao;
	JButton jLimpar;
	JFrame painel;
	JTextField txt;

	long soma;
	// long loong;
	double doublee;
	char operacao;
	long leitura;
	long memoria;
	String a;

	GridBagBotao() {

		painel = new JFrame("GridBagBotao");
		painel.setSize(350, 350);
		painel.setResizable(false);
		painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		leitura = 0;
		memoria = 0;
		c.insets = new Insets(2, 2, 0, 0);

		jDivisao = new JButton("   /   ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridx = 3;
		c.gridy = 3;
		painel.add(jDivisao, c);

		btn0 = new JButton("  0  ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridy = 4;
		c.gridx = 2;
		painel.add(btn0, c);

		btn1 = new JButton("   1   ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridy = 3;
		c.gridx = 0;
		painel.add(btn1, c);

		btn2 = new JButton("   2   ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridy = 3;
		c.gridx = 1;
		painel.add(btn2, c);

		btn3 = new JButton("   3   ");
		c.ipady = 20;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 3;
		c.gridx = 2;
		painel.add(btn3, c);

		btn4 = new JButton("   4   ");
		c.ipady = 20;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 2;
		c.gridx = 0;
		painel.add(btn4, c);

		btn5 = new JButton("   5   ");
		c.ipady = 20;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 2;
		c.gridx = 1;
		painel.add(btn5, c);

		btn6 = new JButton("   6   ");
		c.ipady = 20;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 2;
		c.gridx = 2;
		painel.add(btn6, c);

		btn7 = new JButton("   7   ");
		c.ipady = 20;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 1;
		c.gridx = 0;
		painel.add(btn7, c);

		btn8 = new JButton("   8  ");
		c.ipady = 20;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 1;
		c.gridx = 1;
		painel.add(btn8, c);

		btn9 = new JButton("   9   ");
		c.ipady = 20;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 1;
		c.gridx = 2;
		painel.add(btn9, c);

		jSoma = new JButton("   +   ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridy = 2;
		c.gridx = 3;
		painel.add(jSoma, c);

		jSubtracao = new JButton("  -  ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridy = 1;
		c.gridx = 3;
		painel.add(jSubtracao, c);

		jMultiplicacao = new JButton("  *  ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridy = 4;
		c.gridx = 3;
		painel.add(jMultiplicacao, c);

		jMultiplo = new JButton("  ²x  ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridy = 1;
		c.gridx = 4;
		painel.add(jMultiplo, c);

		jDporZero = new JButton("  ¹/x  ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridy = 2;
		c.gridx = 4;
		painel.add(jDporZero, c);

		rAiz = new JButton(" RaizQ ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridy = 3;
		c.gridx = 4;
		painel.add(rAiz, c);

		jIgual = new JButton("  =  ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.weightx = 0.0;
		c.gridwidth = 2;
		c.gridy = 4;
		c.gridx = 0;
		painel.add(jIgual, c);

		jLimpar = new JButton("Limpar");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridx = 4;
		c.gridy = 4;
		painel.add(jLimpar, c);

		///////////////////////////////////////////////////////
		// Caixa de Resultado D calculadora.
		txt = new JTextField("0");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 0.0;
		c.gridwidth = 5;
		txt.setEditable(false);

		// Definir variáveisde instância na instância GridBagConstraints...
		painel.add(txt, c);

		// Listando os componentes de ação do Usuario
		txt.addActionListener(this);

		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);

		jMultiplo.addActionListener(this);
		jDporZero.addActionListener(this);
		rAiz.addActionListener(this);
		jIgual.addActionListener(this);
		jSoma.addActionListener(this);
		jSubtracao.addActionListener(this);
		jMultiplicacao.addActionListener(this);
		jDivisao.addActionListener(this);
		jLimpar.addActionListener(this);

		painel.setVisible(true);

	}

	// Trata os eventos do Butao
	// Implementa o metodo da
	// interface ActionLinester.

	public void actionPerformed(ActionEvent evt) {
		if (evt.getActionCommand() == btn0.getText()) {
			a = btn0.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 0;
			txt.setText("" + leitura + "");
		}

		if (evt.getActionCommand() == btn1.getText()) {
			a = btn1.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 1;

			txt.setText("" + leitura + "");

		}

		if (evt.getActionCommand() == btn2.getText()) {
			a = btn2.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 2;

			txt.setText("" + leitura + "");
		}

		if (evt.getActionCommand() == btn3.getText()) {
			a = btn3.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 3;

			txt.setText("" + leitura + "");

		}

		if (evt.getActionCommand() == btn4.getText()) {
			a = btn4.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 4;
			txt.setText("" + leitura + "");
		}

		if (evt.getActionCommand() == btn5.getText()) {
			a = btn5.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 5;
			txt.setText("" + leitura + "");

		}

		if (evt.getActionCommand() == btn6.getText()) {
			a = btn6.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 6;
			txt.setText("" + leitura + "");

		}

		if (evt.getActionCommand() == btn7.getText()) {
			a = btn7.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 7;
			txt.setText("" + leitura + "");

		}

		if (evt.getActionCommand() == btn8.getText()) {
			a = btn8.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 8;
			txt.setText("" + leitura + "");

		}

		if (evt.getActionCommand() == btn9.getText()) {
			a = btn9.getText();
			System.out.println(a);

			leitura *= 10;
			leitura += 9;
			txt.setText("" + leitura + "");

		}

		// Calculo Operadores Aritmeticos

		if (evt.getActionCommand() == jSoma.getText()) {
			memoria = leitura;
			leitura = 0;
			operacao = '+';
			txt.setText(" + ");
		}

		if (evt.getActionCommand() == jDivisao.getText()) {
			memoria = leitura;
			leitura = 0;
			operacao = '/';
			txt.setText(" / ");

		}

		if (evt.getActionCommand() == jSubtracao.getText()) {
			memoria = leitura;
			leitura = 0;
			operacao = '-';
			txt.setText(" - ");
		}

		if (evt.getActionCommand() == jMultiplicacao.getText()) {
			memoria = leitura;
			leitura = 0;
			operacao = '*';
			txt.setText(" * ");

		}

		if (evt.getActionCommand() == rAiz.getText()) {
			memoria = leitura;
			leitura = 0;
			operacao = '√';
			txt.setText("√");

		}

		if (evt.getActionCommand() == jDporZero.getText()) {
			doublee = leitura;
			doublee = 1.0 / doublee;

			if (leitura == 0)
				txt.setText("Valor Não divisivel.");
			else

				txt.setText("" + doublee);

			leitura = 0;
		}

		if (evt.getActionCommand() == jMultiplo.getText()) {
			soma = leitura * leitura;
			leitura = 0;
			txt.setText("" + soma);

		}

		if (evt.getActionCommand() == jIgual.getText()) {
			txt.setText("" + 0);
			switch (operacao) {

				case '+':
					soma = memoria + leitura;
					leitura = soma;

					txt.setText("" + soma);
					break;

				case '/':
					soma = memoria / leitura;
					leitura = soma;
					doublee = soma;
					txt.setText("" + doublee);
					break;

				case '-':
					soma = memoria - leitura;
					leitura = soma;
					txt.setText("" + soma);
					break;

				case '*':
					soma = memoria * leitura;
					leitura = soma;
					txt.setText("" + soma);
					break;

				case '√':

					doublee = Math.sqrt(memoria);
					txt.setText("" + doublee);
					break;

			}
		}

		// Botao Limpar Telar
		if (evt.getActionCommand() == jLimpar.getText()) {
			soma = 0;
			leitura = 0;
			doublee = 0;
			operacao = 'l';
			txt.setText("0");

		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				new GridBagBotao();
			}

		});

	}
}

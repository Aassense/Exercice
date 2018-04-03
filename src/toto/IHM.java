package toto;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IHM {

	private JFrame frame;
	private JTextField textFieldScoreJ1;
	private JTextField textFieldDe1;
	private JTextField textFieldDe2;
	private JTextField textFieldScoreJ2;
	private JButton btnLancerJ1;
	private JLabel labelTourValue;
	private JButton btnLancerJ2;
	private JButton btnRestart;

	private JLabel lblJoueurJ1, label, lblTour, lblScoreJ1, lblScoreJ2, lblDe1, lblDe2, LabelTourValue;
	private JLabel lblJoueurJ2;
	private PartieBean partieBean;
	private JCheckBox cbJ1;
	private JCheckBox cbJ2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					IHM window = new IHM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IHM() {
		partieBean = new PartieBean("Toto", "Tata");
		initialize();
		refreshScreen();
	}

	private void refreshScreen() {
		// Joueur1
		lblJoueurJ1.setText(partieBean.getJ1().getNom());
		textFieldScoreJ1.setText("" + partieBean.getJ1().getScorePartie());
		cbJ1.setSelected(partieBean.getJ1().isTricheur());

		// joueur 2
		lblJoueurJ2.setText(partieBean.getJ2().getNom());
		textFieldScoreJ2.setText("" + partieBean.getJ2().getScorePartie());
		cbJ2.setSelected(partieBean.getJ2().isTricheur());
		// le nombre de tour

		LabelTourValue.setText("" + partieBean.getTourEnCours());

		if (partieBean.isTermine()) {
			btnLancerJ1.setVisible(false);
			btnLancerJ2.setVisible(false);
			btnRestart.setVisible(true);
		} else {

			btnRestart.setVisible(false);
			// La visibilité des boutons en fonction du joueur actif
			if (partieBean.getJoueurActif() == partieBean.getJ1()) {
				btnLancerJ1.setVisible(true);
				btnLancerJ2.setVisible(false);
				textFieldDe1.setText("" + partieBean.getJ1().getGobelet().getD1().getValue());
				textFieldDe2.setText("" + partieBean.getJ1().getGobelet().getD2().getValue());

			} else {
				btnLancerJ1.setVisible(false);
				btnLancerJ2.setVisible(true);
				textFieldDe1.setText("" + partieBean.getJ2().getGobelet().getD1().getValue());
				textFieldDe2.setText("" + partieBean.getJ2().getGobelet().getD2().getValue());

			}

		}
	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 708, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnLancerJ1 = new JButton("Lancer");
		btnLancerJ1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				partieBean.getJ1().lancer();

				if (partieBean.getJ1().getGobelet().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
					partieBean.getJ1().ajouter1Pts();
				}
				partieBean.changerJoueurActif();

				refreshScreen();

			}
		});
		btnLancerJ1.setBounds(10, 153, 89, 23);
		frame.getContentPane().add(btnLancerJ1);

		btnLancerJ2 = new JButton("Lancer");
		btnLancerJ2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				partieBean.getJ2().lancer();

				if (partieBean.getJ2().getGobelet().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
					partieBean.getJ2().ajouter1Pts();
				}
				partieBean.ajouter1Tour();

				partieBean.changerJoueurActif();

				refreshScreen();
			}
		});
		btnLancerJ2.setBounds(593, 153, 89, 23);
		frame.getContentPane().add(btnLancerJ2);

		btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				partieBean = new PartieBean("Toto", "Tata");

				refreshScreen();
			}
		});
		btnRestart.setBounds(324, 280, 89, 23);
		frame.getContentPane().add(btnRestart);

		lblJoueurJ1 = new JLabel("Joueur 1");
		lblJoueurJ1.setBounds(10, 26, 46, 14);
		frame.getContentPane().add(lblJoueurJ1);

		lblJoueurJ2 = new JLabel("Joueur 2");
		lblJoueurJ2.setBounds(636, 26, 46, 14);
		frame.getContentPane().add(lblJoueurJ2);

		textFieldDe1 = new JTextField();
		textFieldDe1.setBounds(198, 154, 89, 82);
		frame.getContentPane().add(textFieldDe1);
		textFieldDe1.setColumns(10);

		textFieldDe2 = new JTextField();
		textFieldDe2.setColumns(10);
		textFieldDe2.setBounds(435, 153, 89, 82);
		frame.getContentPane().add(textFieldDe2);

		lblTour = new JLabel("Tour:");
		lblTour.setBounds(268, 26, 46, 37);
		frame.getContentPane().add(lblTour);

		lblScoreJ1 = new JLabel("score:");
		lblScoreJ1.setBounds(0, 81, 46, 14);
		frame.getContentPane().add(lblScoreJ1);

		label = new JLabel("New label");
		label.setBounds(562, 50, 46, 14);
		frame.getContentPane().add(label);

		lblScoreJ2 = new JLabel("score:");
		lblScoreJ2.setBounds(593, 81, 46, 14);
		frame.getContentPane().add(lblScoreJ2);

		lblDe1 = new JLabel("     DE 1");
		lblDe1.setBounds(212, 115, 56, 28);
		frame.getContentPane().add(lblDe1);

		lblDe2 = new JLabel("     DE 2");
		lblDe2.setBounds(449, 115, 56, 28);
		frame.getContentPane().add(lblDe2);

		textFieldScoreJ1 = new JTextField();
		textFieldScoreJ1.setColumns(10);
		textFieldScoreJ1.setBounds(38, 78, 39, 20);
		frame.getContentPane().add(textFieldScoreJ1);

		textFieldScoreJ2 = new JTextField();
		textFieldScoreJ2.setColumns(10);
		textFieldScoreJ2.setBounds(636, 78, 39, 20);
		frame.getContentPane().add(textFieldScoreJ2);

		LabelTourValue = new JLabel("New label");
		LabelTourValue.setBounds(324, 37, 46, 14);
		frame.getContentPane().add(LabelTourValue);

		cbJ1 = new JCheckBox("Tricheur");
		cbJ1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				partieBean.getJ1().setTricheur(cbJ1.isSelected());
				refreshScreen();

			}
		});
		cbJ1.setBounds(2, 212, 97, 23);
		frame.getContentPane().add(cbJ1);

		cbJ2 = new JCheckBox("Tricheur");
		cbJ2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				partieBean.getJ2().setTricheur(cbJ2.isSelected());
				refreshScreen();
			}
		});
		cbJ2.setBounds(435, 242, 97, 23);
		frame.getContentPane().add(cbJ2);
	}
}

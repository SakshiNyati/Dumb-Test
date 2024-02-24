package sam;

import java.lang.Math;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Cursor;

public class DumbTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DumbTest frame = new DumbTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DumbTest() {
		setLocationByPlatform(true);
		setTitle("Dumb Test\r\n");
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setType(Type.POPUP);

		int min = 150;
		int max = 250;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 483, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 469, 292);
		contentPane.add(panel);
		panel.setLayout(null);

		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 10, 26, 13);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("ARE YOU DUMB?");
		lblNewLabel.setBounds(104, 45, 265, 43);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 32));
		panel.add(lblNewLabel);

		JButton btnNewButton = new JButton("NO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a = (int)(Math.random()*(max-min+1)+min);
				int b = (int)(Math.random()*(max-min+1)+min);

				btnNewButton.setLocation(a, b);
			}
		});
		btnNewButton.setBounds(249, 190, 92, 43);
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(btnNewButton);

		JButton btnYes = new JButton("YES");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnNewButton.setVisible(false);
				lblNewLabel.setText("I KNEW IT:D");

				btnYes.setText("LOL");
				btnYes.setLocation(100,150);
				btnYes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						System.exit(0);

					}
				});
			}

			private Object addActionListner(ActionListener actionListener) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnYes.setBounds(104, 190, 92, 43);
		btnYes.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(btnYes);

	}
}

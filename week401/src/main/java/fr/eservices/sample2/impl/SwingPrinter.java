package fr.eservices.sample2.impl;

import javax.swing.JOptionPane;

import fr.eservices.sample2.api.Printer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("swing")
public class SwingPrinter implements Printer {

	@Override
	public void print(String message) {
		JOptionPane.showMessageDialog(null, message, "Nice 2 meet U", JOptionPane.INFORMATION_MESSAGE);
	}
}

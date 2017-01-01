package fr.eservices.sample2.impl;

import fr.eservices.sample2.api.Printer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("console")
public class ConsolePrinter implements Printer {
	
	@Override
	public void print(String message) {
		new fr.eservices.sample1.Printer().print(message);
	}

}

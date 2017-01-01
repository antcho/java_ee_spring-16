package fr.eservices.sample2.appl;

import fr.eservices.sample2.api.Greeter;
import fr.eservices.sample2.api.Printer;
import fr.eservices.sample2.api.Welcome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//TODO Add annotation if required.
@Configuration
@ComponentScan("fr.eservices.sample2.impl")
public class Application {

	@Qualifier("swing")
	@Autowired
	Welcome welcome;

	@Qualifier("french")
	@Autowired
	Greeter greeter;

	@Qualifier("swing")
	@Autowired
	Printer printer;

    public void setWelcome(Welcome welcome) {
        this.welcome = welcome;
    }

    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public Application() {
	}
	
	public void run() {
		String name = welcome.askName();
		String response = greeter.hello(name);
		printer.print( response );
	}
	
	public static void main(String[] args) {

		// TODO Create a spring context
		// TODO Get Application From context
		// TODO Call run

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
		Application app = ctx.getBean(Application.class);
		app.run();
	}
}

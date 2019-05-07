package org.helloworldmvc.main;

import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {

		Model m = new Model();
		View v = new View();
		
		Controller c = new Controller(v, m);
		
		c.run();
	}

}

package org.helloworldmvc.model;

import java.io.IOException;

import org.helloworldmvc.Contract.IModel;

public class Model implements IModel {

	@Override
	public String getHelloWordel() {
		
		DAOHelloWorld D = null;
		try {
			D = DAOHelloWorld.getInstance();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return D.getHelloWorldMessage();
		
	}
}


package fr.enseeiht;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PDLXStandaloneSetup extends PDLXStandaloneSetupGenerated{

	public static void doSetup() {
		new PDLXStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


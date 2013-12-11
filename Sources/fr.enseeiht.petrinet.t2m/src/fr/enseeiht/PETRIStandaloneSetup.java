
package fr.enseeiht;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PETRIStandaloneSetup extends PETRIStandaloneSetupGenerated{

	public static void doSetup() {
		new PETRIStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


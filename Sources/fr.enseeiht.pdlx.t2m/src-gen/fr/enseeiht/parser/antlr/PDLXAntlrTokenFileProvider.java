/*
* generated by Xtext
*/
package fr.enseeiht.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PDLXAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("fr/enseeiht/parser/antlr/internal/InternalPDLX.tokens");
	}
}
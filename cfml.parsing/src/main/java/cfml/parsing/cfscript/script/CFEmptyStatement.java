package cfml.parsing.cfscript.script;

/*
 * A completely empty statement (";") which does nothing.
 */

import org.antlr.v4.runtime.Token;

public class CFEmptyStatement extends CFParsedStatement implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public CFEmptyStatement(Token t) {
		super(t);
	}
	
	public CFEmptyStatement() {
		super(0, 0);
	}
	
	@Override
	public String Decompile(int indent) {
		return Indent(indent) + ";";
	}
	
}

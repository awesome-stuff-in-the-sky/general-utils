package pt.asits.util.assertion.assertions;


import pt.asits.util.assertion.Assertion;


/**
 * 
 * @author Pedro Caleia
 *
 */
public enum NotNullAssertion implements Assertion<Object> {

	INSTANCE;


	@Override
	public boolean assertion( Object object ) {
		return object != null;
	}

}

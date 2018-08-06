package edu.neu.coe.neuralnetwork.backpropagation.math;


/*********************************
* SigmoidFunction.java
* 
* My actual idea was to create an interface for an activation function.
* This Sigmoid Function would then be an implementation of this interface.
* 
* But unfortunately, Java does not allow static methods which are defined in the
* interface, and I preferred my functions to be static, so that they could be called
* in a static way and they would require less memory space.
* 
* This is the standard sigmoid function, see Backpropagation.java for more information.
*/

/**
 * @author ketulshukla
 *
 */
public final class SigmoidFunction {	
	public SigmoidFunction() { }

	public static final double compute(double val) {
		return 1 / (1 + Math.pow(Math.E, -val));
	}
}

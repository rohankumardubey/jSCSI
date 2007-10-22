package org.jscsi.target.task;

/**
 * A State represents one processing instruction set,
 * that will end the initiator's command request successfully or not,
 * if an unrecoverable error occurred.  
 * @author Marcus Specht
 */
public abstract class AbstractState extends AbstractOperation implements State, Runnable{
	
	
	/** the State's referenced Task */
	private final Task refTask;
	
	/** Constructor with referenced Task */
	public AbstractState(Task refTask){
		this.refTask = refTask;
	}
	
	/**
	 * Returns the referenced Task
	 * @return referenced Task
	 */
	public Task getReferencedTask() {
		return refTask;
	}



}

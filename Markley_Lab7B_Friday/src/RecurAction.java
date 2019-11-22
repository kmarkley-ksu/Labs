import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class RecurAction extends RecursiveAction
{
	private long workLoad = 0;

    public RecurAction(long workLoad)
    {
        this.workLoad = workLoad;
    }
    
	@Override
	protected void compute()
	{
		//if work is above threshold, break tasks up into smaller tasks
		if(this.workLoad > 10)
		{
		    System.out.println("Splitting workLoad : " + this.workLoad);
		
		    List<RecurAction> subtasks =
		        new ArrayList<RecurAction>();
		
		    subtasks.addAll(createSubtasks());
		
		    for(RecursiveAction subtask : subtasks){
		        subtask.fork();
		    }
		
		}
		else
		{
		    System.out.println("Doing workLoad myself: " + this.workLoad);
		}
   }

    private List<RecurAction> createSubtasks()
    {
        List<RecurAction> subtasks =
            new ArrayList<RecurAction>();

        RecurAction subtask1 = new RecurAction(this.workLoad / 2);
        RecurAction subtask2 = new RecurAction(this.workLoad / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

        return subtasks;
    }
}
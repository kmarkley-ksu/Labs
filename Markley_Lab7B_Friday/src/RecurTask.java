import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class RecurTask extends RecursiveTask<Long>
{
	private long workLoad = 0;

	public RecurTask(long workLoad)
    {
        this.workLoad = workLoad;
    }

	protected Long compute()
	{
		// if work is above threshold, break tasks up into smaller tasks
		if (this.workLoad > 16)
		{
			System.out.println("Splitting workLoad : " + this.workLoad);

			List<RecurTask> subtasks = new ArrayList<RecurTask>();
			subtasks.addAll(createSubtasks());

			for (RecurTask subtask : subtasks)
			{
				subtask.fork();
			}

			long result = 0;
			
			for (RecurTask subtask : subtasks)
			{
				result += subtask.join();
			}
			return result;
		}
		else
		{
			System.out.println("Doing workLoad myself: " + this.workLoad);
			return workLoad * 3;
		}
	}

	private List<RecurTask> createSubtasks()
	{
		List<RecurTask> subtasks = new ArrayList<RecurTask>();

		RecurTask subtask1 = new RecurTask(this.workLoad / 2);
		RecurTask subtask2 = new RecurTask(this.workLoad / 2);

		subtasks.add(subtask1);
		subtasks.add(subtask2);

		return subtasks;
	}
}
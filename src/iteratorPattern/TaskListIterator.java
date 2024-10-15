package iteratorPattern;

import handler.Task;

public class TaskListIterator implements TaskIterator {
    private int index = 0;
    private final TaskList taskList;

    public TaskListIterator(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public boolean hasNext() {
        return index < taskList.size();
    }

    @Override
    public Task next() {
        return taskList.get(index++);
    }


}

package iteratorPattern;

import handler.Task;

class TaskList implements Iterable<Task> {
    private final Task[] tasks;
    private int size = 0;

    public TaskList(int capacity) {
        tasks = new Task[capacity];
    }

    public void addTask(Task task) {
        if (size < tasks.length) {
            tasks[size++] = task;
        } else {
            System.out.println("Task list is full.");
        }
    }

    public int size() {
        return size;
    }

    @Override
    public TaskIterator iterator() {
        return new TaskListIterator(this);
    }

    public Task get(int index) {
        if (index < size) {
            return tasks[index];
        }
        return null;
    }
}
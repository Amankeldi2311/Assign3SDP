package iteratorPattern;

import handler.Task;

import java.util.Iterator;

public interface TaskIterator extends Iterator<Task> {
    boolean hasNext();

    Task next();
}

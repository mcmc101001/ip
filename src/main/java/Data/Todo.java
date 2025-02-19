package Data;

/**
 * Class to represent a todo task
 */
public class Todo extends Task {
    /**
     * Constructor for Todo task
     * @param description Description of the task
     */
    public Todo (String description) {
        super(description);
    }

    /**
     * Returns the string representation of the task
     * @return String representation of the task
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}

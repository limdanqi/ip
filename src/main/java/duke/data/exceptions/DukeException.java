package duke.data.exceptions;

/**
 * An abstract class DukeException that is a parent to all exceptions pertaining to Duke.
 */
public abstract class DukeException extends Exception {
    /**
     * Initialises a DukeException object.
     *
     * @param errorMessage error occurred when object is thrown
     */
    public DukeException (String errorMessage) {
        super(errorMessage);
    }
}

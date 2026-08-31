package enum_prac;

public class TaskUtil {
    
    public static int getEstimatedComTime(PriorityEnum priority) {

        return switch (priority) {

            case Low -> 7;
            case Medium -> 5;
            case High -> 3;
            case Urgent -> 1;
        };
    }
}

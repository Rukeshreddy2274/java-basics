package enum_prac;

public class AdvancePriorityEnumTest {
    
    public static void main(String[] args) {
        for(AdvancePriorityEnum p : AdvancePriorityEnum.values()) {

            String name = p.name();
            int ordinal = p.ordinal();
            int days = p.getEstimateComDays();

            System.out.println("name : " + name  + " ordinal : " + ordinal + " days: " + days);
        }

    }
}

package enum_prac;

public enum AdvancePriorityEnum {

    Low(7), Medium(5), High(2), Urgent(1);

    private int estimateComDays;

    private AdvancePriorityEnum(int estimateComDays) {
        this.estimateComDays = estimateComDays;
    }

    public int getEstimateComDays() {
        return estimateComDays;
    }

}
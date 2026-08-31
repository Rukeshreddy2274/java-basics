package enum_prac;

import java.util.EnumSet;

public class EnumSetDemo {
    
    public static void main(String[] args) {
        
        //allOf() : It is a static factory method used to create an EnumSet containing all elements in the specified enum type. 
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);

        //of(): It is a static factory method used to create an EnumSet containing specifed enum constants. It allow you to craete a EnumSet with variable num of enum constants passed as arguments.
        EnumSet<Day> someDays = EnumSet.of(Day.Monday, Day.Tuesday, Day. Wednesday);

        for(Day day : someDays) {
            System.out.println(day);
        }

        //range() : It is a static factory method creates an EnumSet consisting all ements in specified range. It is useful when dealing with enum types that have natural order such as numeric or alphabetical order.
        EnumSet<Grades> passGrade = EnumSet.range(Grades.A, Grades.B);
        for(Grades grade : passGrade) {
            System.out.println(grade);
        }

        //complimentOf() : sttaic factoru method that returns an EnumSet consisting all elemts in specified universe that are not present in specified set.
         EnumSet<Grades> failGrade = EnumSet.complementOf(passGrade);
        for(Grades grade : failGrade) {
            System.out.println("Fail grades :" + grade);
        }
    }
}

/* 
Adv of Enum:

1. Type Saftey: Allow you to define a fixed set of names values. Mesans you can avoid errors caused by passing invalid values to methods or using the wrong data type.

2. Readbility

3.Robustness: Enum makes code more robust by providing a centralized and consitent way to handle a set of related constants. This makes it easier to modify code in future without introducting bugs.

4. Code organization: Makes easier to find and modify code.

5.Switch statements: Handle a set of related cases. It improves the readablity and maintanabilty of your code.

*/
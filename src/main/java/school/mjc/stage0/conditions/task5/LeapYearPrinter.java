package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        int residue = year%4;

        boolean isLastYearOfCentury = year%100 == 0;
        boolean isMultipleOf400 = year%400 == 0;

        switch (residue) {
            default:
                System.out.println("not leap");
                break;
            case (0):
                if (isLastYearOfCentury == false) {
                    System.out.println("leap");
                } else if (isMultipleOf400 == true) {
                    System.out.println("leap");
                } else {
                    System.out.println("not leap");
                }
                break;
        }

    }
}

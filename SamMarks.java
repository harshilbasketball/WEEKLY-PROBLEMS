public class SamMarks {
    public static void main(String[] args) {
        int mathsMarks = 94;
        int PhyscisMarks = 95;
        int ChemistryMarks = 96;
        int totalMarks = 100;

        double average = (mathsMarks + PhyscisMarks + ChemistryMarks)/3;
        double average_percentage = (average/totalMarks) * 100;
        System.err.println("Average percenatge is: " + average_percentage );


    }
    
}

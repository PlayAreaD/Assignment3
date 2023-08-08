public class table {
    public static void main(String[] args) {
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_BLUE_BOLD = "\033[36;1m";
        final String RESET = "\033[30;0m";
        String name = "deneth perera";
        int age = 11;
        String subject1 ="SE-1";
        String subject2 = "SE-2";
        String subject3 = "SE-3";
        double marks1= 75.25;
        double marks2 = 80.333;
        double marks3 = 45.624;

        double total = marks1+marks2+marks3;
        double avg = total/3;

        String status; //overall status
        String subject1status;
        String subject2status;
        String subject3status;

        final String DP =COLOR_BLUE_BOLD +"D Pass"+ RESET;
        final String CP ="";
        final String P ="";
        final String Fail = "";


        if (avg >= 75) status ="D Pass";
        else if (avg >=65) status = "C Pass";
        else if (avg >=55) status = "Pass";
        else status= "Fail";

        System.out.println(status);

        //subject1 status
        if (marks1 >= 75) subject1status = DP;
        else if (marks1 >=65) subject1status = CP;
        else if (marks1 >=55) subject1status = P;
        else subject1status= Fail;

        

        //subject2 status
        if (marks2 >= 75) subject2status ="D Pass";
        else if (marks2 >=65) subject2status = "C Pass";
        else if (marks2 >=55) subject2status = "Pass";
        else subject2status= "Fail";

        

        //subject3 status
        if (marks3 >= 75) subject3status ="D Pass";
        else if (marks3 >=65) subject3status = "C Pass";
        else if (marks3 >=55) subject3status = "Pass";
        else subject3status= "Fail";

        



        //table generation
        System.out.println("+".concat("-".repeat(40)).concat("+"));
        System.out.printf("|%10s: %-28s|\n","Name",name.toUpperCase());
        System.out.printf("|%10s: %-28s|\n","Age",age+" years old");
        System.out.printf("|%10s: %-28s|\n","Status",status.toUpperCase());
        System.out.printf("|%10s: %-28s|\n","Total",String.format("%.2f",total));
        System.out.printf("|%10s: %-28s|\n","Average",String.format("%.2f",avg));
        System.out.println("+".concat("-".repeat(40)).concat("+"));

        final String LINE = "+".concat("-".repeat(10).concat("+").concat("-".repeat(10)).concat("+").concat("-".repeat(18)).concat("+"));

        System.out.println(LINE);
        System.out.printf("|%-10s|%-10.2s|%-18s|\n", subject1,marks1,subject1status);
        System.out.printf("|%-10s|%-10.2s|%-18s|\n", subject2,marks2,subject2status);
        System.out.printf("|%-10s|%-10.2s|%-18s|\n", subject3,marks3,subject3status);
        System.out.println(LINE);






    }
    
}

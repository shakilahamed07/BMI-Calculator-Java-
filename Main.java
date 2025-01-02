import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //foot to meter convater start
        double m1=0.3048;
        int foot;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your hight in foot: ");
        foot=input.nextInt();

        double foot_to_meter = (double)foot*m1;
        //foot to meter convater end

        //inch to meter convater start
        double m2=0.0254;
        int inch;
        Scanner input2= new Scanner(System.in);
        System.out.print("Enter your hight in inch: ");
        inch=input2.nextInt();

        double inch_to_meter=(double)inch*m2;
        //inch to meter convater end
        //foot and inch to meter convater
        double meter=foot_to_meter+inch_to_meter;
        //.........


        int weight;
        Scanner input3= new Scanner(System.in);
        System.out.print("Enter your weight: ");
        weight=input3.nextInt();
        
        double meter2=meter*meter;
        double BMI=weight/meter2;
        
        System.out.println("\nResult:");
        System.out.println("Your BMI is: "+BMI);

        if (BMI<18.5) {
            System.out.println("Your weight condition: Underweight      ");
        }
        else if (18.5<=BMI & BMI<=25) {
            System.out.println("Your weight condition: Normal      ");
        }
        else if (25<BMI) {
            System.out.println("Your weight condition: Overweight      ");
        }
        System.out.println("\n0-18.4 Underweight\n18.5-25 Normal\n25.1-... Overweight\n\n\n__Development by Shakil Ahmed");
        input.close();
        input2.close();
        input3.close();
    }
}
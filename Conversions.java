import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Pounds to Kilograms");
        System.out.println("8. Kilograms to Pounds");
        System.out.println("9. Inches to Centimeters");
        System.out.println("10. Centimeters to Inches");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.


        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the end-line and be ready for more input


        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Farenhiet");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celcius = (fahrenheit - 32) * (5.0/9.0);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celcius + " degrees celcius");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = (feet * 0.3048);
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter meters");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = (meters * 3.28084);
            System.out.println(meters + " meters is " + feet + " feet");
        }   
        if (selection == 5)       
        {
            System.out.println("Enter Ounces");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = (ounces * 29.5735);
            System.out.println(ounces + " ounces is " + milliliters + " milliliters");  
        }                      
        if (selection == 6)
        {
            System.out.println("Enter Milliliters");
            double millileters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = (millileters * 0.033814);
            System.out.println(millileters + " milliliters is " + ounces + " ounces"); 
        }
        if (selection == 7)
        {
        System.out.println("Enter Pounds");
            double pounds = keyboard.nextDouble();
            keyboard.nextLine();
            double kilograms = (pounds * 0.453592);
            System.out.println(pounds + " pounds is " + kilograms + " kilograms"); 
        }
        if (selection == 8)
        {
        System.out.println("Kilograms");
            double kilograms = keyboard.nextDouble();
            keyboard.nextLine();
            double pounds = (kilograms * 2.20462);
            System.out.println(kilograms + " kilograms is " + pounds + " pounds"); 
        }
        if (selection == 9)
        {
        System.out.println("Inches");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double centimeters = (inches * 2.54);
            System.out.println(inches + " inches is " + centimeters + " centimeters");    
        }
        if (selection ==10)
        {
        System.out.println("Centimeters");
                double centimeters = keyboard.nextDouble();
                keyboard.nextLine();
                double inches = (centimeters * 0.393701);
                System.out.println(centimeters + " centimeters is " + inches + " inches");
        }
}   }


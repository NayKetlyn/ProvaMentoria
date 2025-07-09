
import java .util.Scanner;
public class ConversorTemperatura {
    public static void main(String[]args){
        Scanner temp = new Scanner(System.in);
        
        double temperatura, Kelvin, Fahrenheit;
        
        System.out.println("Conversor de temperatura");
        System.out.println("=");
        
        System.out.println("Digite a Temperatura em Celsius(C°):");
        temperatura = temp.nextDouble();
        
        Fahrenheit =(temperatura*9/5) + 32;
        Kelvin = temperatura + 273.15;
        
        System.out.println("=");
        
        System.out.println(temperatura+" Graus Celsius convertido em Fahrenheit:"+
        Kelvin);
        
    }
}
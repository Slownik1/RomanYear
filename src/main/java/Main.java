import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static{
            map.put(1, "I");
            map.put(2, "II");
            map.put(3, "III");
            map.put(4, "IV");
            map.put(5, "V");
            map.put(6, "VI");
            map.put(7, "VII");
            map.put(8, "VIII");
            map.put(9, "IX");
            map.put(10, "X");
            map.put(20, "XX");
            map.put(30, "XXX");
            map.put(40, "XL");
            map.put(50, "L");
            map.put(60, "LX");
            map.put(70, "LXX");
            map.put(80, "LXXX");
            map.put(90, "XC");
            map.put(100, "C");
            map.put(200, "CC");
            map.put(300, "CCC");
            map.put(400, "CD");
            map.put(500, "D");
            map.put(600, "DC");
            map.put(700, "DCC");
            map.put(800, "DCCC");
            map.put(900, "CM");
            map.put(100, "M");
            map.put(1500, "MD");
            map.put(2000, "MM");
    };

    public static String RomanYear(int year) {

        int romanMap = map.floorKey(year);

        if(year == romanMap){
            return map.get(year);
        }
        return map.get(romanMap)+RomanYear(year-romanMap);

    }

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.printf("INSERT YEAR 1- 3999: ");
    int year = scan.nextInt();

    if((year<1)||(year>3999)) {
        System.out.printf("ERROR ! PLEASE ENTER NUMBER FROM 1-3999 RANGE !");
    }else {
        System.out.print(RomanYear(year));
    }
    }

}

package utils;

import java.util.List;
import java.util.Random;

/**
 * Created by kamilwrobel on 08.09.2016.
 */
public class Faker {
    public static String FIRST_NAME = "data/firstname.txt";
    public static String LAST_NAME = "data/lastname.txt";
    public static String CITY = "data/city.txt";
    public static Random rnd = new Random();

    public static String name(){
        List<String> names = DataParser.getDataFromFile(FIRST_NAME);;
        int id = rnd.nextInt(names.size() - 1);
        return names.get(id);
    }

    public static String lastName(){
        List<String> names = DataParser.getDataFromFile(LAST_NAME);;
        int id = rnd.nextInt(names.size() - 1);
        return names.get(id);
    }

    public static String city(){
        List<String> names = DataParser.getDataFromFile(CITY);;
        int id = rnd.nextInt(names.size() - 1);
        return names.get(id);
    }

    public static String postalCode(String format, char delimiter){
        StringBuilder postal = new StringBuilder();

        for(char letter : format.toCharArray()){
            if(letter == 'x'){
                postal.append(rnd.nextInt(9));
            }else if(letter == delimiter){
                postal.append(delimiter);
            }
        }
        return postal.toString();
    }

    public static String postalCode(){
        return postalCode("xx-xxx",'-');
    }

    public static String phone(String format, char delimiter){
        StringBuilder phone = new StringBuilder();

        for(char letter : format.toCharArray()){
            if(letter == 'x'){
                phone.append(rnd.nextInt(9));
            }else if(letter == delimiter){
                phone.append(delimiter);
            }
        }
        return phone.toString();
    }

    public static String phone(int length){
        StringBuilder phone = new StringBuilder();
        for(int i = 0; i < length; i++){
            phone.append(rnd.nextInt(9));
        }
        return phone.toString();

    }
}
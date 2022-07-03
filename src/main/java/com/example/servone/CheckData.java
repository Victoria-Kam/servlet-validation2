package com.example.servone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckData {

    public static boolean checkNames(String name){

        Pattern pattern = Pattern.compile("^[A-Za-z]{3,16}$");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    public static boolean checkEmail(String email){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+@[A-Za-z0-9]+.[a-z]{3}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public static boolean checkNumber(String number){
        Pattern pattern = Pattern.compile("^\\+(\\d{3})\\((25|29|33|44)\\)(\\d{3})[-](\\d{2})[-](\\d{2})$");
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }
}

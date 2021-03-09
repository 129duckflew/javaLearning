package cn.duckflew.LeetCode;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ValidIPAddress
{
//    public String Ipv4Address(String ip)
//    {
//        String[] strings = ip.split("\\.");
//        for (String string : strings)
//        {
//            if (string.length()==0|| string.length()>3)return "Neither";
//            if (string.charAt(0)=='0'&&string.length()!=1)return "Neither";
//            for (char c : string.toCharArray())
//            {
//                if (!Character.isDigit(c))return "Neither";
//            }
//            int parseint = Integer.parseInt(string);
//            if (parseint>255||parseint<0)return "Neither";
//        }
//        return "IPv4";
//    }
//    public String Ipv6Address(String ip)
//    {
//        String[] strings = ip.split(":");
//        for (String string : strings)
//        {
//            if (string.length()==0|| string.length()>4)return "Neither";
//            for (int i = 0; i < string.length(); i++)
//            {
//                char ch=string.charAt(i);
//                if (Character.isDigit(ch))
//                {
//                   continue;
//                }
//                if (Character.isAlphabetic(ch)&&Character.toUpperCase(ch)>'F')
//                {
//                    return "Neither";
//                }
//            }
//        }
//        return "IPv6";
//    }
//    public String validIPAddress(String IP)
//    {
//        if (IP.chars().filter(value -> value=='.').count()==3)return Ipv4Address(IP);
//        if (IP.chars().filter(value -> value==':').count()==7)return Ipv6Address(IP);
//        return "Neither";
//    }
public String validateIPv4(String IP) {
    String[] nums = IP.split("\\.", -1);
    for (String x : nums) {
        // Validate integer in range (0, 255):
        // 1. length of chunk is between 1 and 3
        if (x.length() == 0 || x.length() > 3) return "Neither";
        // 2. no extra leading zeros
        if (x.charAt(0) == '0' && x.length() != 1) return "Neither";
        // 3. only digits are allowed
        for (char ch : x.toCharArray()) {
            if (! Character.isDigit(ch)) return "Neither";
        }
        // 4. less than 255
        if (Integer.parseInt(x) > 255) return "Neither";
    }
    return "IPv4";
}

    public String validateIPv6(String IP) {
        String[] nums = IP.split(":", -1);
        String hexdigits = "0123456789abcdefABCDEF";
        for (String x : nums) {
            // Validate hexadecimal in range (0, 2**16):
            // 1. at least one and not more than 4 hexdigits in one chunk
            if (x.length() == 0 || x.length() > 4) return "Neither";
            // 2. only hexdigits are allowed: 0-9, a-f, A-F
            for (Character ch : x.toCharArray()) {
                if (hexdigits.indexOf(ch) == -1) return "Neither";
            }
        }
        return "IPv6";
    }

    public String validIPAddress(String IP) {
        if (IP.chars().filter(ch -> ch == '.').count() == 3) {
            return validateIPv4(IP);
        }
        else if (IP.chars().filter(ch -> ch == ':').count() == 7) {
            return validateIPv6(IP);
        }
        else return "Neither";
    }


    public static void main(String[] args)
    {
        String res = new ValidIPAddress().validIPAddress("1.0.1.");
        System.out.println(res);
    }
}

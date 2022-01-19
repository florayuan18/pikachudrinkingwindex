package com.example.sping_portfolio.controllers.CrystalFRQ;
import java.util.Scanner;

public class CrystalLength {
    public static void CrystalLength(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s = scanner.nextLine();

        int ans=1;
        int cnt=1, start=0, end=0, newStart=0;
        char c=s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1))cnt++;
            else {
                if(cnt > ans){
                    ans = cnt;
                    start = newStart;
                    end =i-1;
                    c = s.charAt(i-1);
                }
                cnt = 1;
                newStart = i;
            }
        }
        if(cnt > ans){
            ans = cnt;
            start = newStart;
            end = s.length()-1;
            c = s.charAt(s.length()-1);
        }
        System.out.println("Length: " + ans + " Char: " + c + " Start: " + start + " End: " + end);
    }
}

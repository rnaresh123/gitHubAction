package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
      String str="NARASGONDA BHOJGONDA";
        char[] chars = str.toCharArray();
        Map<Character,Integer>map=new HashMap<>();
        for (char ch:chars) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char firstchar=' ';
        char secondchar=' ';
        int firstCount=0;
        int secondCount=0;
        for(Map.Entry<Character,Integer>entry : map.entrySet()){
            if (entry.getValue()>firstCount){
                secondCount=firstCount;
                secondchar=firstchar;
                firstCount= entry.getValue();
                firstchar=entry.getKey();
            } else if (entry.getValue()>secondCount && entry.getValue()!=firstCount) {
                secondCount=entry.getValue();
                secondchar= entry.getKey();
                
            }
        }

        System.out.println("first maximum repeting character : "+firstchar+ " count : "+firstCount);
        System.out.println("second maximum repeting character : "+secondchar+ " count:"+secondCount);
    }
}



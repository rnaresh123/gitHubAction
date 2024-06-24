package codingpractice;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.Arrays;

public class RemoveAdjcentCharacterFromString {
    public static void main(String[] args) {
       String str = "abbacab";
       char[] ch=str.toCharArray();
       int j=0;
       for(int i=1; i<ch.length; i++){
           if(j>=0&&ch[i]==ch[j]){
               j--;
           }
           else{
              ch[++j]=ch[i];
           }
       }
       String str1=new String(ch,0,j+1);
        System.out.println(str1);
    }
}

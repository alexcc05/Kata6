/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Kata6 {


        public static void main(String[] args) throws IOException{
            String name= "emails.txt";
            ArrayList<Person> mailList= MailListReader.read(name);
            System.out.println(mailList.size());
            HistogramBuilder<Person> builder = new HistogramBuilder<>(mailList);
            Histogram<String> domains = builder.build(new Attribute<Person,String>(){
                @Override
                public String get(Person item){
                    return item.getMail().split("@")[1];
                }
                
                
            });
            Histogram<Character> letters = builder.build(new Attribute<Person,Character>(){
                @Override
                public Character get(Person item){
                    return item.getMail().charAt(0);
                }
                
                
            });
            new HistogramDisplay(domains, "Dominios").execute();
            new HistogramDisplay(letters, "Caracter").execute();
            

         }
    
 
    
    
}




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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Kata6 {


        public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException{
            String name= "emails.txt";
            ArrayList<Person> mailList= MailListReader.read(name);
            ArrayList<Person1> mailList1= PersonLoader.read();
            System.out.println(mailList.size());
            HistogramBuilder<Person> builder = new HistogramBuilder<>(mailList);
            HistogramBuilder<Person1> builder1 = new HistogramBuilder<>(mailList1);
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
            Histogram<String> domains1 = builder1.build(new Attribute<Person1,String>(){
                @Override
                public String get(Person1 item){
                    return item.getMail().split("@")[1];
                }
                
                
            });
            Histogram<Float> weights = builder1.build(new Attribute<Person1,Float>(){
                @Override
                public Float get(Person1 item){
                    return item.getWeight();
                }
                
                
            });
            Histogram<Character> genders = builder1.build(new Attribute<Person1,Character>(){
                @Override
                public Character get(Person1 item){
                    return item.getGender().charAt(0);
                }
                
                
            });
            
            new HistogramDisplay(domains, "Dominios").execute();
            new HistogramDisplay(domains1, "Dominios 1").execute();
            new HistogramDisplay(weights, "Pesos").execute();
            new HistogramDisplay(genders, "Géneros").execute();
            new HistogramDisplay(letters, "Caracter").execute();
            

         }
    
 
    
    
}




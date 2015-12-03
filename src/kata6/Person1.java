/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

/**
 *
 * @author usuario
 */
public class Person1 {
   private final int id;
   private final String name;
   private final String gender;
   private final String birthDate;
   private final float weight;
   private final String mail;

    public Person1(int id, String name, String gender, String birthDate, float weight, String mail) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.weight = weight;
        this.mail = mail;
    }
   
   
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public float getWeight() {
        return weight;
    }

    public String getMail() {
        return mail;
    }
    
    
    
}

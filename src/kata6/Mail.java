/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

/**
 *
 * @author usuario
 */
public class Mail {
     private final String mail;
    public String getMail() {
        return mail;
    }

    

    public Mail(String mail) {
        this.mail = mail;
    }
    public String getDominio(){
        return mail.split("@")[1];
    }
    
}

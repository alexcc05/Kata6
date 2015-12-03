/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.util.ArrayList;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author usuario
 */
public class HistogramBuilder <T> {
    private final ArrayList<T> list;

    public HistogramBuilder(ArrayList<T> list) {
        this.list = list;
    }
    
    public <A> Histogram <A> build (Attribute<T,A> attribute){
        Histogram <A> histo = new Histogram<>();
        for(T list1: list){
            A value = attribute.get(list1);
            histo.increment(value);
        }
        return histo;
        
    }
   
}

package Modelo;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Henry
 * @date 17-ago-2018
 * @time 11:20:07
 */
public class ConexionBD 
{
    static ConexionBD cbd;
    public static void main(String[] args) 
    {
         try 
        {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | 
                IllegalAccessException | 
                InstantiationException | 
                UnsupportedLookAndFeelException e)
        {
        }
        cbd = new ConexionBD();
        //cbd.show();    
        System.out.println("Ejemplo 1");
    }

}

/**
 * libreria para ingresar codigo en pantalla
 */
import javax.swing.*;

/**
 * Programa que encripta y desencripta un mensaje Un usuario ingresa un texto y
 * de encripta e indica la palabra que de encripto (no es necesario) Por medio
 * de un usuario, el que recibe el mensaje podra obtener la palabra
 * desencriptada.
 * El programa solo permite ingresar mayusculas y minuscular y el simbolo coma ","
 * Muchos caracteres ya han sido ocupados por palabras especificas
 * Tambien el programa permite ingresar muchas variables, sean mayusculas o minusculas.
 *
 * @author JASON
 */

public class Prueba {

    public static void main(String[] args) {

        /**
         * Intancia de la clase Encapsulamiento por medio del set, se fija una
         * palabra tipo mensaje por medio del get, se obtiene la palabra fijada
         */
        Encapsulamiento encapsulamiento = new Encapsulamiento();
        encapsulamiento.setClaveAcceso("usuario conectado...");
        System.out.println(encapsulamiento.getClaveAcceso());

        /**
         * Intancia de la clase Criptografia Manera dinamica se ingresa mensaje
         * por el usuario en consola Se encripta la palabra ingresada La palabra
         * secreta aparece, con y sin encriptacion para control unicamente, la
         * desencriptacion no era necesario.
         */
        Criptografia criptografia = new Criptografia();
        String pSecreta = JOptionPane.showInputDialog("Ingrese palabra, palabras o texto para encriptar mensaje");
        System.out.println(criptografia.encriptacion(pSecreta));
        System.out.println("La palabra ingresada fue: solo es informativo para validar la palabra correcta al usar el segundo metodo: " + pSecreta);

        /**
         * Por medio de una "CLAVE" llamada "superUsuario" podemos acceder a la
         * palabra desencriptada por parte del que recibe el mensaje Si la clave
         * es incorrecta no le da la desencriptacion correcta. Ademas, con la
         * contraseña correcta podemos acceder a la instancia y al metodo de
         * desencriptacion.
         */
        String usuario = JOptionPane.showInputDialog("Ingrese su usuario para desencriptar el codigo");

        if (usuario.equals("superUsuario")) {

            String secreta = JOptionPane.showInputDialog("copie y pegue aqui la palabra secreta para desencriptar");
            System.out.println(criptografia.desEncriptacion(secreta));

        } else {

            System.out.println("No tienes permiso para acceder a la primera capa para "
                    + " por fallas de usuario");

        }

        {

        }

    }
}

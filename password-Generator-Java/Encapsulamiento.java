/**
 * Clase lo que me permite es encapsular.
 * Se asigna una variable privada.
 * Me permite indicar en la ejecucion del programa que el usuario esta conectado.
 * @author JASON
 */
public class Encapsulamiento {

    private String claveAcceso;

    Encapsulamiento() {

    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public Encapsulamiento(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }
}

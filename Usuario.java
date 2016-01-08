
/**
 * Write a description of class Usuario here.
 * 
 * @author Verónica Serrano 
 * @version 08/01/2016
 */
public class Usuario
{
    //Variable que representa el nombre
    private String nombre;
    //Variable que representa el alimento 
    private Alimento alimento;
    //Variable que representa los gramos del alimento
    private float gramos;
    //Variable que representa el total de carbohidratos consumidos por el ususario
    private float totalCarb;
    //Variable que representa la cantidad de grasas consumidas por el usuario
    private float totalGra;
    //Variable que representa la cantidad de proteinas consumidas por el usuario
    private float totalPro;
    //Variable que representa el total de calorías consumidas por el usuario
    private float totalCal;

    /**
     * Constructor de la clase usuario
     */
    public Usuario(String nombre)
    {
        this.nombre = nombre;
        totalCarb = 0;
        totalGra = 0;
        totalPro = 0;
        totalCal = 0;
    }
    
    /**
     * Método que le permite al usuario comer un alimento
     */
    public void comer(Alimento alimento, float gramos)
    {
        totalCarb = alimento.getCarb()*(gramos/100) + totalCarb;
        totalGra = alimento.getGrasas()*(gramos/100) + totalGra;
        totalPro = alimento.getProt()*(gramos/100) + totalPro;
        totalCal = alimento.getCal()*(gramos/100)+ totalCal;
    }
    
    /**
     * Método que nos permite ver los datos referidos a comida del usuario
     */
    public void mostarDatos()
    {
        System.out.println("Nombre:                                                " + nombre);
        System.out.println("Gramos totales de proteinas ingeridos:                 " + totalPro);
        System.out.println("Gramos totales de carbohidratos ingeridos:             " + totalCarb);
        System.out.println("Gramos totales de grasas ingeridas:                    " + totalGra);
        System.out.println("Calorías totales ingeridas:                            " + totalCal);
    }
}

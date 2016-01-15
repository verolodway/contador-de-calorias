import java.util.ArrayList;
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
    private ArrayList<Alimento> alimento;
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
    //Variable que representa el alimento con más calorías consumido por el usuario
    private Alimento alimentoMasCalorico;

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
        alimentoMasCalorico = null;
        alimento = new ArrayList<Alimento>();
        
    }

    /**
     * Método que le permite al usuario comer un alimento
     */
    public void comer(ArrayList<Alimento> alimento, float gramos)
    {        
        totalCarb = alimento.getCarb()*(gramos/100) + totalCarb;
        totalGra = alimento.getGrasas()*(gramos/100) + totalGra;
        totalPro = alimento.getProt()*(gramos/100) + totalPro;
        totalCal = alimento.getCal()*(gramos/100)+ totalCal;        
        //Si el alimento que se esta comiendo es mas calorico que
        //el que teniamos guardado, entonces tenemos que guardar ese alimento como
        //más calorico. Si no hemos comido ningun alimento entonces el alimento
        //que nos estamos comiendo es el más calorico
        if (alimentoMasCalorico != null) {
            if (alimento.getCal() >= alimentoMasCalorico.getCal()) {
            alimentoMasCalorico = alimento;
            }
        }
        else {
            alimentoMasCalorico = alimento;
        }
        
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
    
    /**
     * Método que nos permite conocer el nombre del usuario
     */
    public String getNombre()
    {
        return nombre;
    }
    /**
     * Método que nos permite conocer el total de calorías ingeridas
     */
    public float getTotalCal()
    {
        return totalCal;
    }
    
    /**
     * Método que nos permite saber qué alimentos hemos consumido
     */
    public ArrayList<Alimento> getAlimento()
    {
        return alimento;
    }
    
    /**
     * Método que nos permite comparar los datos entre dos usuarios
     */
    public void comparacion(Usuario segundoUsuario){
        if(totalCal == segundoUsuario.getTotalCal())
            System.out.println("Los dos usuarios han consumido el mismo número de calorías: " + totalCal);
        else if (totalCal > segundoUsuario.getTotalCal())
            System.out.println("El usuario: " + nombre + " ha consumido más calorias que el usuario: " + segundoUsuario.getNombre() + " "
            + "(" + totalCal + " frente a " + segundoUsuario.getTotalCal()+ ")");
        else
            System.out.println("El usuario: " + segundoUsuario.getNombre() + " ha consumido más calorias que el usuario: " + nombre + " "
            + "(" + segundoUsuario.getTotalCal() + " frente a " + totalCal+ ")");
    }
    /**
     * Método que nos permite saber cual es el alimento con más calorías consumido
     */
    public void AlimentoMasCalorico(){
       if (alimentoMasCalorico == null) {
            System.out.println("No has consumido ningun alimento");
        }
        else {
            System.out.println("El alimento mas calorico es: " + alimentoMasCalorico.getNombre() +
                   "(" + alimentoMasCalorico.getCal() + ")");
          }
    }
    
    /**
     * Método que le permite al usuario ver la información nutricional  de cualquier alimento que haya comido pasando su posición como parámetro
     */
    public void verAlimento(int numAlim)
    {
        numAlim = 1 ;
            for (Alimento alim: alimento){
            System.out.println("Nombre:                                                      " + alim.getNombre());
            System.out.println("Proteínas por cada 100 gramos:                               " + alim.getProt());
            System.out.println("Carbohidratos por cada 100 gramos:                           " + alim.getCarb());
            System.out.println("Grasas por cada 100 gramos:                                  " + alim.getGrasas());
            System.out.println("Calorías:                                                    " + alim.getCal());
            System.out.println("Componente/s mayoritario/s:                                  " + alim.getCompMay());
            numAlim = numAlim +1;
        }
    }
    
    /**
     * Método que le permite al usuario saber si ha comido o no un alimento
     */
    public void ComprobarAlimento (Alimento alimento1){
        boolean comprobacion;
        if(alimento1.getNombre() = alimento.getNombre())
        {
            comprobacion = true;
        }
        else{
            comprobacion = false;
        }
        if (comprobacion == true){
            System.out.println("El alimento :" + alimento + " ya ha sido consumido por el usuario.");
        }
        else {
            System.out.println("El alimento : " + alimento + " no ha sido consumido por el usuario.");
        }
    }
    
    /**
     * Método que nos permite conocer los alimentos que ya hemos consumido repetidamente
     */
    public void AlimentosRepetidos(){
        if(comprobacion == true)
        {
            System.out.println(alimento.getNombre());
        }
        else {
            System.out.println("No hay alimentos repetidos.");
        }
    }
}
   

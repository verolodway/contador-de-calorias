
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    private String nombre;
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private float calorias;
    private float gramos;
    private String componenteMay;
    
    /**
     * Constructor de la clase alimento 
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas)
    
    {
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        calorias = (proteinas*4) + (carbohidratos*4) + (grasas*9);
        if (proteinas > carbohidratos && proteinas > grasas && carbohidratos != grasas)
        {
            componenteMay = "Proteinas";
        }
        else if(carbohidratos > proteinas && carbohidratos > grasas && proteinas != grasas)
        {
            componenteMay = "Carbohidratos";
        }
        else if (grasas > proteinas && grasas > carbohidratos && proteinas != carbohidratos)
        {
            componenteMay = "Grasas";
        }
        else if(proteinas == carbohidratos)
        {
            componenteMay = "Proteinas y carbohidratos";
        }
        else if(grasas == carbohidratos)
        {
            componenteMay = "Grasas y carbohidratos";
        }
        else if(proteinas == grasas)
        {
            componenteMay = "Proteinas y grasas";
        }
        else
        {
            componenteMay = "Proteínas, carbohidratos y grasas";
        }
    }
    
    public float getCarb(){
        return carbohidratos;
    }
    
    public float getProt(){
        return proteinas;
    }
    
    public float getGrasas(){
        return grasas;
    }
    
    public float getCal(){
        return calorias;
    }
    
    public void muestraDatos(){
        
       
        System.out.println("Nombre:                                                      " + nombre);
        System.out.println("Proteínas por cada 100 gramos:                               " + proteinas );
        System.out.println("Carbohidratos por cada 100 gramos:                           " + carbohidratos);
        System.out.println("Grasas por cada 100 gramos:                                  " + grasas);
        System.out.println("Calorías:                                                    " + calorias);
        System.out.println("Componente/s mayoritario/s:                                  " + componenteMay);
    }
    
}

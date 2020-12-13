
/**
 * Clase de Productos
 * 
 * @author Leonardo Rios
 * @version v1.0
 */
public class Producto
{
    // Caracteristicas
    public boolean pequena;
    public boolean mediana;
    public boolean grande;
    
    // Productos
    public int pro001;
    public int pro002;
    public int pro003;
    public int pro004;
    public int pro005;
    
    public Producto()
    {
        this.pro001 = 10;
        this.pro002 = 10;
        this.pro003 = 10;
        this.pro004 = 10;
        this.pro005 = 10;
    }
    
    public Producto(boolean pequena, boolean mediana, boolean grande)
    {
        this.pequena = pequena;
        this.mediana = pequena;
        this.grande = pequena;
    }
    
    public String getProducto()
    {
        
    }
    
}

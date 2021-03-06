//
/**
 * Evaluavion del ramo Programacion orientada a objetos
 * del 2 Bisemestre de Informatica en Iplacex
 * 
 * @author Leonardo Rios 
 * @version v1.0
 */
public class Caja
{
    // Contenedor de vuelto
    private int cantM10;
    private int cantM50;
    private int cantM100;
    private int cantM500;
    
    // Contenedor de monedas Entrantes
    private int cantCajaM10;
    private int cantCajaM50;
    private int cantCajaM100;
    private int cantCajaM500;
    
    // Variable Moneda
    public int moneda;
    //public int saldo;
        
    /*
     * La caja solo se crea cuando tiene todos los tipos de monedas en el 
     * contenedor de vuelto y deja todos los tipos de moneda en el contenedor
     * de monedas entrantes en 0
     */
    public Caja(int cantM10, int cantM50, int cantM100, int cantM500)
    {
        // Contenedor de vueltos
        this.cantM10 = cantM10;
        this.cantM50 = cantM50;
        this.cantM100 = cantM100;
        this.cantM500 = cantM500;
        
        // Caja de ingreso
        this.cantCajaM10 = 0;
        this.cantCajaM50 = 0;
        this.cantCajaM100 = 0;
        this.cantCajaM500 = 0;
        
    }

    /*
     * Verifica si la moneda pertenece a la moneda chilena entregando true
     * si es valido y false su no es valido
     */
    private boolean verificarMoneda(int moneda)
    {
        if(moneda==10)
        {
            return true;
        }
        if(moneda==50)
        {
            return true;
        }
        if(moneda==100)
        {
            return true;
        }
        if(moneda==500)
        {
            return true;
        }
        return false;
    }
    /*
     * Metodos para obtener moneda dentro de la caja  
     */
    public int getCantM10(){
        return cantM10;
    }
    public int getCantM50(){
        return cantM50;
    }
    public int getCantM100(){
        return cantM100;
    }
    public int getCantM500(){
        return cantM500;
    }
    public int getCantCajaM10(){
        return cantCajaM10;
    }
    public int getCantCajaM50(){
        return cantCajaM50;
    }
    public int getCantCajaM100(){
        return cantCajaM100;
    }
    public int getCantCajaM500(){
        return cantCajaM500;
    }
    
    /*
     * Metodo que permita ingresar moneda, verificabdo si la moneda es valida e 
     * ingresando la moneda al contenedor de deposito, en caso que no sea valido
     * indicar en un mensaje "Moneda Invalida"
     */
    public String ingresarMoneda(int moneda){
       
        if(verificarMoneda(moneda) == true)
        {
           if(moneda == 10)
           {
            cantCajaM10 = cantCajaM10 + 1;
            }
            if(moneda == 50)
           {
            cantCajaM50 = cantCajaM50 + 1;
            }
            if(moneda == 100)
           {
            cantCajaM100 = cantCajaM100 + 1;
            }
            if(moneda == 500)
           {
            cantCajaM500 = cantCajaM500 + 1;
            }
           return "Moneda Ingresada";
        }
        else
        {
           return "Moneda Invalida";
        }
    }
    
    /*public String pedirProducto(int moneda){
        
        if(saldo == 0)
        {
            return "Producto " + producto " entregado!";
        }
        else
        {
            return "Falta saldo, Ingrese moneda...";
        }
       
    }*/
}

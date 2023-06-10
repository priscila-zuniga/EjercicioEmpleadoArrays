import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase que representa un empleado.
 */
public class Empleado
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    private String nombre;

    private String apellido;

    /**
     * Genero del empleado. <br>
     * 1 indica g�nero masculino. <br>
     * 2 indica g�nero femenino. <br>
     */
    private int genero;

    private Fecha fechaNacimiento;


    private Fecha fechaIngreso;


    private double salario;
    private static int numEmpleado=0;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Construye el empleado. <br>
     * <b>post: </b> Se cre� el empleado con los siguientes valores: <br>
     * Nombre: Juan, Apellido: Piguave, G�nero: masculino (1), Fecha de nacimiento: 16-6-1982, Fecha de ingreso: 5-4-2000, Salario: 2500.
     */
    public Empleado( )
    {
        nombre = "Juan";
        apellido = "Piguave";
        genero = 1;
        fechaNacimiento = new Fecha( 16, 6, 1982 );
        fechaIngreso = new Fecha( 5, 4, 2000 );
        salario = 2500;
        numEmpleado++;
    }

    public Empleado(String nombre, String apellido, int genero, Fecha fechaNacimiento, Fecha fechaIngreso, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        numEmpleado++;
    }

    public static int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Retorna el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna el genero del empleado.
     * @return Genero del empleado.
     */
    public int darGenero( )
    {
        return genero;
    }

    /**
     * Retorna la fecha de nacimiento del empleado en una cadena.
     * @return Fecha de nacimiento del empleado.
     */
    public String darFechaNacimiento( )
    {
        String strFecha = fechaNacimiento.toString( );
        return strFecha;
    }

    /**
     * Retorna la fecha de ingreso del empleado en una cadena.
     * @return Fecha de ingreso del empleado.
     */
    public String darFechaIngreso( )
    {
        String strFecha = fechaIngreso.toString( );
        return strFecha;
    }

    /**
     * Retorna el salario del empleado.
     * @return Salario del empleado.
     */
    public double darSalario( )
    {
        return salario;
    }

    /**
     * Retorna el apellido del empleado.
     * @return Apellido del empleado.
     */
    public String darApellido( )
    {
        return apellido;
    }

    /**
     * Retorna la edad del empleado en a�os.
     * @return Edad del empleado en a�os.
     */
    public int calcularEdad( )
    {
        Fecha hoy = new Fecha(0,0,0);
        hoy.darFechaActual( );
        int edad = fechaNacimiento.darDiferenciaEnMeses( hoy ) / 12;
        return edad;
    }

    /**
     * Retorna la antig�edad del empleado en a�os.
     * @return Antig�edad del empleado en a�os.
     */
    public int calcularAntiguedad( )
    {
        Fecha hoy = new Fecha(0,0,0);
        hoy.darFechaActual( );
        int antiguedad = fechaIngreso.darDiferenciaEnMeses( hoy ) / 12;
        return antiguedad;
    }

    /**
     * Retorna las prestaciones del empleado usando la f�rmula: p = (a * s)/12 (p: prestaciones, a: antig�edad, s: salario). <br>
     * La antig�edad que se utiliza est� dada en a�os, as� que si un empleado lleva menos de un a�o en la empresa, sus prestaciones ser�n 0.
     * @return Prestaciones del empleado.
     */
    public double calcularPrestaciones( )
    {
        int antiguedad = calcularAntiguedad( );
        double prestaciones = ( ( double ) ( antiguedad * salario ) ) / 12;
        return prestaciones;
    }


    /**
     * Cambia el salario del empleado con el valor dado por par�metro. <br>
     * <b>post: </b> El salario tiene el valor ingresado por par�metro.
     * @param pSalario Nuevo salario del empleado. pSalario > 0.
     */
    public void cambiarSalario( double pSalario )
    {
        salario = pSalario;
    }

   @Override
    public String toString() {
        return "Empleado{" +
                "nombre= " + darNombre()+ '\'' +
                ", apellido= " + apellido + '\'' +
                ", genero=" + genero +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaIngreso=" + fechaIngreso +
                ", salario=" + salario +
                '}';
    }
}

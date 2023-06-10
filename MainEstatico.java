public class MainEstatico {
    //LISTAS
    public static void main(String[] args) {
        System.out.println("Cantidad de empleados: "+Empleado.getNumEmpleado());
        Empleado e1= new Empleado();
        System.out.println("Cantidad de empleados: "+Empleado.getNumEmpleado());
        Empleado empleado[]=new Empleado[5];
        System.out.println("Cantidad de empleados: "+Empleado.getNumEmpleado());
        empleado[1] = new Empleado();
        System.out.println("Cantidad de empleados: "+Empleado.getNumEmpleado());
        System.out.println("Cantidad de empleados utilizando el objeto: "+e1.getNumEmpleado());
    }
}

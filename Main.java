import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//ARREGLOS
public class Main {
    public static void main(String[] args) {
        //Empleado e1 = null;
        Empleado empleados[] = new Empleado[10];
        String nombre, apellido;
        int dia, mes, anio,genero;
        int opc, indice=0;
        double salario;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.- Ingresar Empleado");
            System.out.println("2.- Cambiar salario");
            System.out.println("3.- Calcular edad");
            System.out.println("4.- Calcular antiguedad");
            System.out.println("5.- Calcular prestaciones");
            System.out.println("6.- Imprimir empleados ");
            System.out.println("7.- Salir");
            System.out.println("Ingrese una opcion: ");
            opc = Integer.parseInt(sc.next());

            switch (opc){
                case 1:{
                    System.out.println("Ingreso del empleado " + indice);
                    System.out.print("Ingrese el nombre: ");
                    nombre = sc.next();
                    System.out.print("Ingrese el apellido: ");
                    apellido = sc.next();
                    System.out.print("Ingrese el genero 1 Masculino, 2 Femenino: ");
                    genero = Integer.parseInt(sc.next());
                    //validar solo 1 o 2
                    if (genero > 2) {
                        System.out.println("Error!!!!!!!");
                        break;
                    } else {
                            System.out.print("Ingrese el dia de nacimiento: ");
                            dia = Integer.parseInt(sc.next());
                            System.out.print("Ingrese el mes de nacimiento: ");
                            mes = Integer.parseInt(sc.next());
                            System.out.print("Ingrese el anio de nacimiento: ");
                            anio = Integer.parseInt(sc.next());
                            //se crea un objeto auxiliar fn
                            Fecha fn = new Fecha(dia, mes, anio);

                            System.out.print("Ingrese el dia de ingreso: ");
                            dia = Integer.parseInt(sc.next());
                            System.out.print("Ingrese el mes de ingreso: ");
                            mes = Integer.parseInt(sc.next());
                            System.out.print("Ingrese el anio de ingreso: ");
                            anio = Integer.parseInt(sc.next());
                            Fecha fi = new Fecha(dia, mes, anio);

                            System.out.print("Ingrese el salario: ");
                            salario = Double.parseDouble(sc.next());
                            do{
                            empleados[indice] = new Empleado(nombre, apellido, genero, fn, fi, salario);
                            indice+=1;
                            }while(empleados.length>indice);
                            //controlar para que cuando no haya mas espacio, no ingresar mas}
                        }
                }break;

                case 2:{
                    System.out.println("Ingrese el nombre del empleado: ");
                    nombre= sc.next();
                    Empleado e1= buscarEmpleado(empleados, nombre);
                    if(e1!=null){
                    System.out.print("Ingrese el salario: ");
                    salario = Double.parseDouble(sc.next());
                    e1.cambiarSalario(salario);
                    }else{
                        System.out.println("No existe el empleado");
                    }
                }break;
                case 3:{
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre=sc.next();
                    Empleado e1= buscarEmpleado(empleados, nombre);
                    if (e1!=null) {

                        System.out.println("La edad de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularEdad());
                    }else{
                        System.out.println("No existe el empleado");
                    }

                }break;
                case 4:{
                    System.out.println("Ingrese el nombre del empleado: ");
                    nombre=sc.next();
                    Empleado e1= buscarEmpleado(empleados, nombre);
                    if(e1!=null) {
                        System.out.println("La antiguedad de " + e1.darNombre() + " " + e1.darApellido() + " es " + e1.calcularAntiguedad());
                    }else{
                        System.out.println("No existe el empleado");
                        break;
                    }
                }break;
                case 5:{
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre=sc.next();
                    Empleado e1= buscarEmpleado(empleados, nombre);
                    if (e1 != null) {
                        System.out.println("Las prestaciones de "+e1.darNombre()+" "+e1.darApellido()+" son "+e1.calcularPrestaciones());
                    }else{
                        System.out.println("No existe el empleado");
                    }
                }break;
                case 6:{
                    //imprimirLista((ArrayList<Empleado>) empleadosList );
                }break;
                case 7:{
                    System.out.println("Gracias!");
                }break;
                default:
                    System.out.println("opción no válida");

            }


        }while(opc!=7);
    }


    /**
     * busca un empleado por nombre en el arreglo y lo retorna
     * @param empleados arreglo de empleados
     * @param nombre un String diferente de null
     * @return el empleado si lo encuentra o null si no
     */
    public static Empleado buscarEmpleado(Empleado empleados[],String nombre){
        for(int i=0;i<empleados.length;i++){
            if(nombre.equalsIgnoreCase(empleados[i].darNombre()))
                return empleados[i];
        }
        return null;
    }

}
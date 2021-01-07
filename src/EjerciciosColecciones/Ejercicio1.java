package EjerciciosColecciones;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ejercicio1 {
    public static void main(String[] args) {
        String colores [] = {"rojo","verde","azul"};
        int prueba [] = {1,2,3};
        ArrayList array0 = new ArrayList();
        LinkedList lista1 = new LinkedList();

        for(String col:colores) {
            array0.add(col);
            lista1.add(col);
        }

        Imprimir(array0,'A');
        Imprimir(array0,'d');
    }

    public static void Imprimir(List arrayInput,char selec) {
        selec = Character.toLowerCase(selec);
        if(!arrayInput.isEmpty()) {
            ListIterator ite = arrayInput.listIterator();
            if(selec == 'a') {
                while(ite.hasNext()) {
                    System.out.println(ite.next());
                }
            }else if(selec == 'd') {
                ite = arrayInput.listIterator(arrayInput.size());
                while(ite.hasPrevious()) {
                    System.out.println(ite.previous());
                }
            }else {
                System.out.println("Has introducido un valor erroneo");
            }

        }else {
            System.out.println("El array esta vacio");
        }

    }
}

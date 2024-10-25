
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();

       /*  System.out.println("Listado de carros generadas:");
        for (Carro carroslis : carros) {
            System.out.println(carrolist);
        }
        MetodosOrdenamientoBusquedaGrupoB metodos = new MetodosOrdenamientoBusquedaGrupoB();
        System.out.println("Lista ordenada de Carros: ");
        metodos.sortBYearWithBubbleAvnAsendente(carros);
        metodos.showPeople(carros);
        metodos.searchBinaryByYear(carros, 2020);*/

        PersonasGenerator generarPersonas = new PersonasGenerator();
        Person[] personas = generarPersonas.generarPersonas();
        System.out.println("Listado de personas generadas:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
        System.out.println("Lista ordenada de personas");
        MetodosOrdenamientoBusqueda metodosdeBusqueda = new MetodosOrdenamientoBusqueda();
        //metodosdeBusqueda.sortByAgeWithSelection(personas);
        //metodosdeBusqueda.sortByHeightWithSelection(personas);
        //metodosdeBusqueda.sortByAgeWithInsertion(personas);
        metodosdeBusqueda.sortByHeightWithInsertion(personas);
        metodosdeBusqueda.showPeople(personas);
        //metodosdeBusqueda.searchBinaryByAge(personas, 72);
        metodosdeBusqueda.searchBinaryByHeight(personas, 183);
    }
}

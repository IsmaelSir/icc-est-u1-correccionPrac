import models.Carro;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Asendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] people) {
        // TODO: Implement selection sort 
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 0; j < people.length-1-i; j++) {
                if(people[j].getYear() > people[j+1].getYear()){
                    Carro aux = people[j];
                    people[j] = people[j+1];
                    people[j+1] = aux;
                }
            }
        }
    }

    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] people) {
        // TODO: Implement selection sort by height
        int n = people.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(people[j].getYear() < people[j+1].getYear()){
                    Carro aux = people[j];
                    people[j] = people[j+1];
                    people[j+1] = aux;
                }
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] people, int height) {
        int inicio = 0;
        int fin = people.length;
        while(inicio <= fin){
            int medio = inicio+(fin-inicio)/2;
            if(people[medio].getYear()== height){
                System.out.println("Valor encontrado"+ medio);
                return medio;
            }
            if(people[medio].getYear() < height){
                inicio = medio+1;
            }else{
                fin = medio-1;
            }
        }
        System.out.println("Valor no encontrado");
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Carro[] people) {
        // TODO: Implement showPeople
        Carro[] lista = people;
        for(Carro ano: lista){
            System.out.println(ano);
        }
        
    }
}
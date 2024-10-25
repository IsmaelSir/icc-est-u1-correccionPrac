import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        int indice;
        for(int i=0; i<people.length-1; i++){
            indice = i;
            for(int j=i+1; j<people.length; j++){
                if(people[j].getAge()< people[indice].getAge()){
                    indice = j;
                }
            }
            Person aux = people[i];
            people[i] = people[indice];
            people[indice] = aux;
        }

    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        // TODO: Implement selection sort by height
        int indice;
        for(int i=0; i<people.length-1; i++){
            indice = i;
            for(int j=i+1; j<people.length; j++){
                if(people[j].getHeight()< people[indice].getHeight()){
                    indice = j;
                }
            }
            Person aux = people[i];
            people[i] = people[indice];
            people[indice] = aux;
        }

    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by age
        for(int i =1; i<people.length; i++){
            Person personaAux = people[i];
            int j = i-1;
            while(j>=0 && people[j].getAge() > personaAux.getAge()){
                people[j+1] = people[j];
                j--;
            }
            people[j+1] = personaAux;
        }
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by height
        for(int i =1; i<people.length; i++){
            Person personaAux = people[i];
            int j = i-1;
            while(j>=0 && people[j].getHeight() > personaAux.getHeight()){
                people[j+1] = people[j];
                j--;
            }
            people[j+1] = personaAux;
        }
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        // TODO: Implement binary search by age
        int inicio = 0;
        int fin = people.length;
        while(inicio <= fin){
            int medio = inicio+(fin-inicio)/2;
            if(people[medio].getAge()== age){
                System.out.println("Edad encontrada"+ medio);
                return medio;
            }
            if(people[medio].getAge() < age){
                inicio = medio+1;
            }else{
                fin = medio-1;
            }
        }
        System.out.println("Valor no encontrado");
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        // TODO: Implement binary search by height
        int inicio = 0;
        int fin = people.length;
        while(inicio <= fin){
            int medio = inicio+(fin-inicio)/2;
            if(people[medio].getHeight()== height){
                System.out.println("Edad encontrada"+ medio);
                return medio;
            }
            if(people[medio].getHeight() < height){
                inicio = medio+1;
            }else{
                fin = medio-1;
            }
        }
        System.out.println("Valor no encontrado");
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] persona) {
        // TODO: Implement showPeople
        for(Person personas: persona){
            System.out.println(personas);
        }
    }
}
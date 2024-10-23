package busquedalineal;
public class BusquedaLineal {
    public static void main(String[] args) {
        String swap;
        String nombre="funalito";
        boolean encontrado=false;
        String [] nombres={"pepito","perez","dani","juan","jose","funalito"};
        int indice=0;
        int posicion=0;
        do{
            if(nombres[indice].equals(nombre)){
                encontrado=true;
                posicion=indice+1; 
                swap=nombres[indice];
                nombres[indice]=nombres[indice-1];
                nombres[indice-1]=swap;
            }else{
                indice++;
            }
        }while(!encontrado);
        System.out.println(posicion);
        for(String nom:nombres){
            System.out.println(nom);
        }
    }
    
}

package uni.aed.sort;
import java.util.Random;
public class SortMain {
    
    static Sort sort=new Sort();
    
    public static void main(String[] args){
        carga();
        visualizar();
        insercionSort();
        selectionWuSort();
        bubbleWuSort();
        
//        selectionWuSort();
//        visualizar();
//        bubbleWuSort(); 
//        visualizar(); 
    } 
    public static void carga(){
    Integer X[] = new Integer[5000];
    Random random = new Random();
    for (int i = 0; i < 5000; i++) {
        int randomNumber;
        do{
            randomNumber = random.nextInt(1000);
        }
        while(randomNumber < 100);//repetira hasta que el numero este dentro de 100 y 999
        X[i] = randomNumber;
    }
    sort.setY(X);
}

    
     //numero de intercambios;
     //numero de comparaciones;
     //tiempo de ejecucion;
    
    public static void visualizar(){
        System.out.println("El array origen contiene los siguientes elementos");
        System.out.println(sort.toString());
    }
    
    
    
    public static void insercionSort(){
        for(Integer y: sort.insercionSort())
            System.out.print(y.toString()+ ","); 
        System.out.println(" nComp= "+sort.getnComp()+" nInt= "+sort.getnInt()+" tEjec(ns)= "+ sort.gettEjec());
    }  
    
   
    
    public static void selectionWuSort(){
        for(Integer y: sort.selectionWuSort())
            System.out.print(y.toString()+ ",");   
        System.out.println(" nComp= "+sort.getnComp()+" nInt= "+sort.getnInt()+" tEjec(ns)= "+ sort.gettEjec());
    }        
    
    public static void bubbleWuSort(){
        for(Integer y: sort.bubbleWuSort())
            System.out.print(y.toString()+ ",");   
        System.out.println(" nComp= "+sort.getnComp()+" nInt= "+sort.getnInt()+" tEjec(ns)= "+ sort.gettEjec());
    }            
    
}

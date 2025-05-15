public class Duvida10 {
    public static void main(String args[]){
    double [] areasJardins = {200, 300, 500};
    //System.out.println(areasJardins[0]);
    //System.out.println(areasJardins[1]);
    //System.out.println(areasJardins[2]);
    //System.out.println(areasJardins);
    double acumlador = 0;
    for(int i = 0; i<areasJardins.length; i++){
        System.err.println(areasJardins[i]+ " Indice:" + i);
        acumlador = acumlador+ areasJardins[i];

    }
    double media = acumlador / areasJardins.length;
    System.err.println(media);
    }
}

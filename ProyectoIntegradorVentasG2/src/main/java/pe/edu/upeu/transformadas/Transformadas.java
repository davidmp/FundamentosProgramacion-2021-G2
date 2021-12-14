package pe.edu.upeu.transformadas;

public class Transformadas {
  

    public void imprimirM(Object[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if(data[i][j]!=null){
                    System.out.print(data[i][j]+"\t");
                }else{
                    System.out.print(" \t");
                }                
            }
            System.out.println("");
        }
    }

    public Object[][] transformada11(int dimension, int numInit) {// 5   0
        Object[][] matrizRellenar=new Object[dimension][dimension];
        for (int f = 0; f < matrizRellenar.length; f++) {
            for (int c = (matrizRellenar[0].length-1)-f; c>=0; c--) {
                matrizRellenar[f][c]=numInit;
                numInit++;
            }
        }
        return matrizRellenar;
    }


    public static void main(String[] args) {
        Transformadas tra=new Transformadas();
        tra.imprimirM(tra.transformada11(5, 0));
    }
    
}

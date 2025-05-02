package practice.challenges;

public class Offspring {
    public static void main(String[] args) {
        int total = 1;
        int[] matured = new int[7];
        // initializing the array with one
        for(int i = 0 ; i < 7; i++){
            matured[i]=1;
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<7; j++){
                matured[j] = matured[j]*8;
                total = total + matured[j];
                matured[j] = total;
                System.out.print(matured[j]+" ");
            }
        }
    }
}

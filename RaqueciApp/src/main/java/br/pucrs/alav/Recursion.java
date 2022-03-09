package br.pucrs.alav;
import java.util.ArrayList;
/**
    Modele e implemente um método recursivo que calculeo somatório dos números inteiros entre os números k e j, passados como parâmetro.

    public int somaIntervalo(int k, int j){
        if(j < k)
        throw new IllegalArgumentException("j deve ser maior que k");

        if(k==j){
            return j;
        }
        return  k + somaIntervalo(k+1,j);
    }

    Modele e implemente um método recursivo que recebeum String em retorna true se este String for umpalíndrome, false caso contrário.
boolean isPal(String s)

    public boolean isPal(String s){
        if(s.length()==0)
        throw new IllegalArgumentException("S não pode estar vazia");

        if(s.length()==1){
            return true;
        }
        else if(s.length()==2){
            return s.charAt(0).equals(s.charAt(1));
        }
        else if(s.charAt(0).equals(s.charAt(s.length()-1))){
            return isPal(s.substring(1,length()-2));
        }
        return false;
    }

    Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e
     retorna um String com o número em binário.
    String convBase2(int n)
    if(n<0){
        throw new IllegalArgumentException("n tem q ser zero ou positivo");
    }
    else if(n==0){
        return "0";
    }
    else if(n==1){
        return "1";
    }
    return Integer.toString(n%2) + convBase2(n/2);


    Modele e implemente um método recursivo que calcule
    o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.
    int somaArray(ArrayList vet)
    if(vet.size() == 0){
        return 0;
    }
    int temp vet.get(0);
    vet.remove(0);
    return temp + somaArray(vet);
    return somaArray(vet.get(vet.length()-1)) + vet


    Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
    int findBiggest(ArrayList<Integer> ar, int aux){
        if(vet.size() == 0){
            return aux;
        }
        int temp vet.get(0);
        vet.remove(0);
        if(aux<temp){
            aux = temp;
        }
        return somaArray(vet, aux);
    }
 */

public class Recursion {
	public static int somaIntervalo(int k, int j){
        if(j < k){
            throw new IllegalArgumentException("j deve ser maior que k");
        }

        if(k==j){
            return j;
        }
        return  k + somaIntervalo(k+1,j);
    }

    public static boolean isPal(String s){
        if(s.length()==0){
            throw new IllegalArgumentException("S não pode estar vazia");
        }

        if(s.length()==1){
            return true;
        }
        else if(s.length()==2){
            return s.charAt(0)==s.charAt(1);
        }
        else if(s.charAt(0)==s.charAt(s.length()-1)){
            return isPal(s.substring(1,s.length()-1));
        }
        return false;
    }

    public static String convBase2(int n){
        if(n<0){
            throw new IllegalArgumentException("n tem q ser zero ou positivo");
        }
        else if(n==0){
            return "0";
        }
        else if(n==1){
            return "1";
        }
        return convBase2(n/2) + Integer.toString(n%2);
    }

    public static int somaArray(ArrayList<Integer> vet){
        if(vet.size() == 0){
            return 0;
        }
        int temp = vet.get(0);
        vet.remove(0);
        return temp + somaArray(vet);
    }

    public static int findBiggest(ArrayList<Integer> vet, int aux){
        if(vet.size() == 0){
            return aux;
        }
        int temp = vet.get(0);
        vet.remove(0);
        if(aux < temp){
            aux = temp;
        }
        return findBiggest(vet, aux);
    }

    public static void main(String args[]){
        System.out.println(somaIntervalo(1,5));
        System.out.println(isPal("bola"));
        System.out.println(isPal("arara"));
        System.out.println(convBase2(57));
        ArrayList<Integer> vet = new ArrayList<Integer>();
        vet.add(6);
        vet.add(9);
        vet.add(15);
        //System.out.println(somaArray(vet));
        System.out.println(findBiggest(vet, -2147483648));
    }
}

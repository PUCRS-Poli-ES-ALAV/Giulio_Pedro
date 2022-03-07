package br.pucrs.alav;

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
    return "n%2" + convBase2(n/2);


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

    public static void main(String args[]){
        System.out.println(somaIntervalo(1,5));
        System.out.println(isPal("bola"));
        System.out.println(isPal("arara"));
    }
}

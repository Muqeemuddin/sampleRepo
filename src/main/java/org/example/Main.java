package org.example;

import org.example.easy.*;
import org.example.medium.TowerOfHanoi;

public class Main {
    public static void main(String[] args) {
//        SquareRoot sr = new SquareRoot();
//        int x = Integer.MAX_VALUE/2;
//        int res = sr.findSquareRoot(x);
//        System.out.print("Square root of xx "+res);
//        System.out.println(GcdOrHcf.gcdMethodthree(10,15));
//        System.out.println(IsPrime.isPrimeMethodThree(65));
//        System.out.println(RootsOfQuad.findRoots(-264,-750,504));
//        System.out.println(DigitsInFact.digitsInFactorial(42));
//        System.out.println(KbitSolution.isKBitOne(5, 4));
//        System.out.println(CountSetBits.countSetBitsBrianMethod(7));
        TowerOfHanoi.towerOfHanoi(3, 'A','B','C');
    }
}
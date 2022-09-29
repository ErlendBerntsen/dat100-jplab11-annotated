package no.hvl.dat100.jplab11.common;

import no.hvl.annotations.*;

public class Replacement {

    @ReplacementCode(id = "1")
    public static void replacement(){
        //TODO implement constructor
        throw new UnsupportedOperationException("Not implemented");
    }


    public int faculty(int x) {
        int n = 1;
        SolutionStart start;
        while(x > 0){
            n *= x;
            x--;
        }
        SolutionEnd end;
        return n;
    }

}

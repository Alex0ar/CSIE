package acs.ase.ro.dpcomportamentale.strategy.calculator;

import java.util.List;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation){
        this.operation = operation;
    }

    public double compute(Integer... values){
        if(operation != null){
            return operation.executeOperation(List.of(values));
        }
        throw new OperatorNotSetException("Operation not set!");
    }
}

package rikkei.academy.service;

import rikkei.academy.model.Operation;

import java.util.ArrayList;
import java.util.List;

public class OperationServiceIMPL implements IOperationService{
    public static List<Operation> operationList = new ArrayList<>();
    static {
        operationList.add(new Operation(1,"Addition (+)"));
        operationList.add(new Operation(2,"Subtraction (-)"));
        operationList.add(new Operation(3,"Multiplication (*)"));
        operationList.add(new Operation(4,"Division (/)"));
    }
    @Override
    public List<Operation> findAll() {
        return operationList;
    }

    @Override
    public Operation findById(int id) {
        for (int i = 0; i < operationList.size(); i++) {
            if (operationList.get(i).getId() == id){
                return operationList.get(i);
            }
        }
        return null;
    }

}

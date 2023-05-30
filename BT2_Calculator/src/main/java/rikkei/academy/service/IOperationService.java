package rikkei.academy.service;

import rikkei.academy.model.Operation;

import java.util.List;

public interface IOperationService {
    List<Operation> findAll();
    Operation findById(int id);
}

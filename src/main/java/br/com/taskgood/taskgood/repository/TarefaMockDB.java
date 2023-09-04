package br.com.taskgood.taskgood.repository;

import br.com.taskgood.taskgood.model.Tarefa;
import br.com.taskgood.taskgood.model.Usuario;

import java.util.HashMap;
import java.util.Map;

public class TarefaMockDB {

    private static TarefaMockDB mockDB;
    private Map<Long, Tarefa> dataBase = new HashMap<>();

    private Long index = 0l;

    private TarefaMockDB() {

    }

    public static synchronized TarefaMockDB getInstance() {
        if (mockDB == null) {
            mockDB = new TarefaMockDB();
        }
        return mockDB;
    }


    public Map<Long, Tarefa> getDataBase() {
        return dataBase;
    }

    public void setDataBase(Map<Long, Tarefa> dataBase) {
        this.dataBase = dataBase;
    }


    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }
}

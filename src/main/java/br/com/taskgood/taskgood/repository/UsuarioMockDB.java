package br.com.taskgood.taskgood.repository;

import br.com.taskgood.taskgood.model.Usuario;

import java.util.HashMap;
import java.util.Map;

public class UsuarioMockDB {

    private  static UsuarioMockDB mockDB;
    private Map<Long, Usuario> dataBase = new HashMap<>();

    private Long index = 0l;

    private UsuarioMockDB (){

    }

    public static synchronized UsuarioMockDB getInstance(){
        if(mockDB==null){
            mockDB = new UsuarioMockDB();
        }
        return mockDB;
    }


    public Map<Long, Usuario> getDataBase() {
        return dataBase;
    }

    public void setDataBase(Map<Long, Usuario> dataBase) {
        this.dataBase = dataBase;
    }


    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }
}

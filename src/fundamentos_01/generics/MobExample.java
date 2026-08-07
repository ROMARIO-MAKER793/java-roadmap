package fundamentos_01.generics;

import java.util.List;

public class MobExample{

    public static <T> T primero(List<T> lista){

        if(lista == null || lista.isEmpty()){
            return null;
        }

        return lista.get(0);
    }


}

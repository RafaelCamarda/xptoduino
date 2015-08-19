package br.ufop.rafael.xptoduino;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rafael on 12/04/15.
 */
public class SharedResources {
    public static SharedResources shared = null;

    private Map comandos;

    public Map getComandos() {
        return comandos;
    }

    public void setComandos(Map comandos) {
        this.comandos = comandos;
    }

  ;

    public static SharedResources getInstance(){
        if(shared == null){
            shared = new SharedResources();
        }
        return shared;
    }

    public static SharedResources getShared() {
        return shared;
    }

    public static void setShared(SharedResources shared) {
        SharedResources.shared = shared;
    }

    private SharedResources (){
        comandos = new HashMap();
        comandos.put("lall" ,"onall");
        comandos.put("dall" ,"offall");
        comandos.put("l13" ,"on13");
        comandos.put("d13" ,"off13");
        comandos.put("l12" ,"on12");
        comandos.put("d12" ,"off12");
        comandos.put("l11" ,"on11");
        comandos.put("d11" ,"off11");
        comandos.put("l10" ,"on11");
        comandos.put("d10" ,"off10");
        comandos.put("mab" ,"mab");
        comandos.put("meb" ,"meb");
        comandos.put("pall" ,"pall");
        comandos.put("mus" ,"mus");
    }
}

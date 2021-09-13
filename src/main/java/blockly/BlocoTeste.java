package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoTeste {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// BlocoTeste
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.database.Operations.insert(Var.valueOf("app.entity.Teste"),Var.valueOf("dataHora",
    cronapi.dateTime.Operations.formatDateTime(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf("dd/MM/YYYY HH:mm:ss"))));

    System.out.println(
    cronapi.dateTime.Operations.formatDateTime(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf("dd/MM/YYYY HH:mm:ss")).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}


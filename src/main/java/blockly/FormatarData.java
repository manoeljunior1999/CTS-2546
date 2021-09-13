package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class FormatarData {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// FormatarData
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;

   public Var call() throws Exception {

    data =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("app.entity.Teste"),Var.valueOf("select t from Teste t   having MIN(t.id) = :id"),Var.valueOf("id",
    Var.valueOf("768306D1-EC61-4E15-9DB4-F6CE2F34EA95"))),
    Var.valueOf("this[0].dataHora"));

    System.out.println(
    cronapi.dateTime.Operations.formatDateTime(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf("dd/MM/yyyy HH:mm:ss")).getObjectAsString());

    System.out.println(
    cronapi.dateTime.Operations.formatDateTime(data,
    Var.valueOf("dd/MM/yyyy HH:mm:ss")).getObjectAsString());

    System.out.println(
    Var.valueOf(
    cronapi.dateTime.Operations.formatDateTime(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf("dd/MM/yyyy HH:mm:ss")).equals(
    cronapi.dateTime.Operations.formatDateTime(data,
    Var.valueOf("dd/MM/yyyy HH:mm:ss")))).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}


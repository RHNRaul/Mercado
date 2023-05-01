package DataBase;
/* Administrador de la Base de Datos
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DBHELPER  extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NOMBRE = "MercadoKids.db";

    public static final String TABLA_PADRES = "padre";

    public static final String TABLA_HIJOS = "hijo";

   public DBHELPER(Context context){
       super(context,DATABASE_NOMBRE,null,DATABASE_VERSION);

   }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

       String crearbdpadre = "CREATE TABLE IF NOT EXISTS "+TABLA_PADRES+"(\n" +
                "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    correo TEXT NOT NULL,\n" +
                "    contrasena TEXT NOT NULL,\n" +
                "    nombre TEXT NOT NULL,\n" +
                "    apellidop TEXT NOT NULL,\n" +
                "    apellidom TEXT NOT NULL,\n" +
                "    codigopaternal TEXT NOT NULL\n" +
                ")";

        String crearbdhijo = "CREATE TABLE IF NOT EXISTS "+TABLA_HIJOS+"(\n" +
                "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    correo TEXT NOT NULL,\n" +
                "    contrasena TEXT NOT NULL,\n" +
                "    codigopaternal TEXT NOT NULL\n" +
                ")";
       sqLiteDatabase.execSQL(crearbdpadre);
       sqLiteDatabase.execSQL(crearbdhijo);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

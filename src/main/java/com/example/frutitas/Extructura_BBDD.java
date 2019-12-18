package com.example.frutitas;

public class Extructura_BBDD {
 private Extructura_BBDD(){}
    public static final String Table_Name = "tabldatosFrutas";
    public static final String Nombre_campo1 = "id";
   public static final String Nombre_campo2 = "nombre";
    public static final String Nombre_campo3 = "peso";
    public static final String Nombre_campo4 = "tipo";
    public static final String Nombre_campo5 = "prodrido";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Extructura_BBDD.Table_Name + "(" +
                    Extructura_BBDD.Nombre_campo1 + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    Extructura_BBDD.Nombre_campo2+ " TEXT," +
                    Extructura_BBDD.Nombre_campo3 + " Int," +
                    Extructura_BBDD.Nombre_campo4 + " TEXT," +
                    Extructura_BBDD.Nombre_campo5 + " Boolean)";

    public static final String SQL_DELETES_ENTRRIES =
            "DROP TABLE IF EXISTS" + Extructura_BBDD.Table_Name;

}
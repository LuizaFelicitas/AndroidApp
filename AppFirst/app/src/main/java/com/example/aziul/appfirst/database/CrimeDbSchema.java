package com.example.aziul.appfirst.database;

/**
 * Created by aziul on 14.02.2018.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
       public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "_id";
            public static final String TITLE = "name";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT="suspect";
        }
    }
}

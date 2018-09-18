package com.example.aziul.appfirst.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import com.example.aziul.appfirst.database.CrimeDbSchema.CrimeTable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static android.content.ContentValues.TAG;

/**
 * Created by aziul on 14.02.2018.
 */

public class CrimeBaseHelper extends SQLiteOpenHelper {

    private static final int VERSION=1;
    private static  final String DATABASE_NAME="crimeBase.db";

    private SQLiteDatabase mDataBase;
  //  private final Context mContext;
    private boolean mNeedUpdate=false;

    public CrimeBaseHelper(Context context){
        super(context, DATABASE_NAME,null, VERSION);

    }

   /* public void updateDataBase() throws IOException{
        if (mNeedUpdate){
            File dbFile=new File(DB_PATH+DATABASE_NAME);
            if (dbFile.exists())
                dbFile.delete();
            copyDataBase();
            mNeedUpdate=false;
        }
    }
    private boolean checkDataBase(){
        File dbFile=new File(DB_PATH+DATABASE_NAME);
        return dbFile.exists();
    }
    private void copyDataBase() {
      if (!checkDataBase()){
          this.getReadableDatabase();
          this.close();
          try{
              copyDBFile();
          }catch (IOException mIOException){
              throw new Error("ErrorCopyingDataBase");
          }
      }
    }
    private void copyDBFile() throws IOException{
        InputStream mInput=mContext.getAssets().open(DATABASE_NAME);
        OutputStream mOutput=new FileOutputStream(DB_PATH+DATABASE_NAME);
        byte[] mBuffer=new byte[1024];
        int mLength;
        while((mLength=mInput.read(mBuffer))>0)
            mOutput.write(mBuffer,0, mLength);
        mOutput.flush();
        mOutput.close();
        mInput.close();
    }
    public boolean openDataBase() throws SQLException{
        mDataBase=SQLiteDatabase.openDatabase(DB_PATH+DATABASE_NAME,null, SQLiteDatabase.CREATE_IF_NECESSARY);
        return mDataBase!=null;
    }
    @Override
    public synchronized void close(){
        if (mDataBase!=null)
            mDataBase.close();
        super.close();
    }*/
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, " DB is creating");
        db.execSQL("create table "+ CrimeTable.NAME+"("+
        " _id integer primary key autoincrement, "+
        CrimeTable.Cols.UUID+", "+CrimeTable.Cols.TITLE+", "+
        CrimeTable.Cols.DATE+", "+ CrimeTable.Cols.SOLVED+","+CrimeTable.Cols.SUSPECT+")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
if (newVersion > oldVersion)
    mNeedUpdate=true;
    }
}

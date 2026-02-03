package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddka extends ddln {
    private final Context a;
    private final String b;
    private final ekgb c;
    private final int d;
    private boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    public ddka(Context context, ekgb ekgbVar) {
        ekoe ekoeVar = (ekoe) ekgbVar;
        super(context, ekoeVar.c);
        this.a = context;
        this.b = "primes_example_store";
        this.c = ekgbVar;
        this.d = ekoeVar.c;
    }

    private static SQLiteException a(SQLiteException sQLiteException) {
        return sQLiteException instanceof SQLiteCantOpenDatabaseException ? new ddjz(sQLiteException) : sQLiteException;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("brella.SqliteOpenHelper", "Error opening database, deleting the database and trying again", e);
            Context context = this.a;
            String str = this.b;
            if (!SQLiteDatabase.deleteDatabase(context.getDatabasePath(str))) {
                Log.e("brella.SqliteOpenHelper", a.a(str, "Deletion of ", " failed"), e);
                throw a(e);
            }
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (SQLiteException e2) {
                Log.e("brella.SqliteOpenHelper", "failed to get the database after recreating", e2);
                throw a(e2);
            }
        }
        if (!this.e) {
            return writableDatabase;
        }
        String path = writableDatabase.getPath();
        writableDatabase.close();
        SQLiteDatabase.deleteDatabase(new File(path));
        this.e = false;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e3) {
            Log.e("brella.SqliteOpenHelper", "Error getting database after downgrading", e3);
            throw a(e3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ejwl.a(i >= 0);
        ejwl.a(i < i2);
        ejwl.a(i2 == this.d);
        sQLiteDatabase.beginTransaction();
        while (i < i2) {
            try {
                sQLiteDatabase.execSQL((String) this.c.get(i));
                i++;
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        sQLiteDatabase.setTransactionSuccessful();
    }
}

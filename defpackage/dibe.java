package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibe extends diaj {
    public dibe() {
        super(dbjt.EXEC_SQL_FIX, 10L);
    }

    private static void c(SQLiteDatabase sQLiteDatabase, List list) throws SQLException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                sQLiteDatabase.execSQL(str);
            } catch (SQLiteException e) {
                Log.e("EXEC_SQL_FIX", "Unable to execute query ".concat(String.valueOf(str)));
                throw e;
            }
        }
    }

    @Override // defpackage.diaj
    public final diap a(diap diapVar, ejwi ejwiVar) {
        if (!ejwiVar.g() || ((dbkw) ejwiVar.c()).b != 2) {
            throw new IllegalArgumentException();
        }
        Context contextCreateDeviceProtectedStorageContext = diapVar.b;
        dbkw dbkwVar = (dbkw) ejwiVar.c();
        dbke dbkeVar = dbkwVar.b == 2 ? (dbke) dbkwVar.c : dbke.a;
        if (dbkeVar.f) {
            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
        }
        File databasePath = contextCreateDeviceProtectedStorageContext.getDatabasePath(dbkeVar.c);
        if (databasePath.exists()) {
            int i = 0;
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(databasePath.getPath(), null, 0);
            try {
                int version = sQLiteDatabaseOpenDatabase.getVersion();
                int i2 = dbkeVar.d;
                if (i2 == 0 || i2 == version) {
                    int i3 = dbkeVar.b;
                    if (i3 == 0) {
                        i = 2;
                    } else if (i3 == 1) {
                        i = 3;
                    } else if (i3 == 2) {
                        i = 4;
                    }
                    if (i == 0) {
                        i = 1;
                    }
                    int i4 = i - 2;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new UnsupportedOperationException("This command type is not supported");
                        }
                        contextCreateDeviceProtectedStorageContext.deleteDatabase(dbkeVar.c);
                    } else if (dbkeVar.g) {
                        evtg evtgVar = dbkeVar.e;
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            c(sQLiteDatabaseOpenDatabase, evtgVar);
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                        } catch (Throwable th) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        c(sQLiteDatabaseOpenDatabase, dbkeVar.e);
                    }
                }
                if (sQLiteDatabaseOpenDatabase != null) {
                    sQLiteDatabaseOpenDatabase.close();
                }
            } catch (Throwable th2) {
                if (sQLiteDatabaseOpenDatabase != null) {
                    try {
                        sQLiteDatabaseOpenDatabase.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return diapVar;
    }

    @Override // defpackage.diaj
    public final String b() {
        return "EXEC_SQL_FIX";
    }
}

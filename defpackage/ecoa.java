package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecoa {
    final CancellationSignal a = new CancellationSignal();
    final SQLiteDatabase b;

    public ecoa(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    static String e(Cursor cursor) {
        String string;
        try {
            StringBuilder sb = new StringBuilder();
            String[] columnNames = cursor.getColumnNames();
            sb.append(Arrays.toString(columnNames));
            sb.append('\n');
            while (cursor.moveToNext()) {
                for (int i = 0; i < columnNames.length; i++) {
                    try {
                        string = cursor.getString(i);
                    } catch (Exception unused) {
                        string = cursor.getType(i) != 4 ? "Unknown" : "Blob, length " + cursor.getBlob(i).length;
                    }
                    sb.append("|");
                    sb.append(string);
                }
                sb.append('\n');
            }
            String string2 = sb.toString();
            if (cursor != null) {
                cursor.close();
            }
            return string2;
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static void f() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final int a(ecnt ecntVar) throws InterruptedException {
        f();
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        String str = ecntVar.a;
        sb.append(str);
        sb.append(" WHERE ");
        String str2 = ecntVar.b;
        sb.append(str2);
        eieu eieuVarK = eiiy.k(sb.toString());
        try {
            int iDelete = this.b.delete(str, str2, ecntVar.c);
            eieuVarK.close();
            return iDelete;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @SafeVarargs
    public final int b(String str, String str2, String... strArr) throws InterruptedException {
        f();
        eieu eieuVarK = eiiy.k(a.n(str2, str, "DELETE FROM ", " WHERE "));
        try {
            int iDelete = this.b.delete(str, str2, strArr);
            eieuVarK.close();
            return iDelete;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long c(String str, ContentValues contentValues, int i) throws InterruptedException {
        f();
        eieu eieuVarK = eiiy.k("INSERT WITH ON CONFLICT ".concat(str));
        try {
            long jInsertWithOnConflict = this.b.insertWithOnConflict(str, null, contentValues, i);
            eieuVarK.close();
            return jInsertWithOnConflict;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Cursor d(ecnv ecnvVar) throws InterruptedException {
        f();
        if (Log.isLoggable("ASQLDB", 2)) {
            Log.v("ASQLDB", e(this.b.rawQueryWithFactory(new ecnx(ecnvVar), "EXPLAIN QUERY PLAN ".concat(ecnvVar.a), null, null)));
        }
        String str = ecnvVar.a;
        eieu eieuVarK = eiiy.k("Query: ".concat(str));
        try {
            Cursor cursorRawQueryWithFactory = this.b.rawQueryWithFactory(new ecnx(ecnvVar), str, null, null, this.a);
            eieuVarK.close();
            return cursorRawQueryWithFactory;
        } finally {
        }
    }

    public final void g(ecnv ecnvVar) throws InterruptedException {
        f();
        String str = ecnvVar.a;
        eieu eieuVarK = eiiy.k("execSQL: ".concat(str));
        try {
            this.b.execSQL(str, ecnvVar.b);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(String str) throws InterruptedException {
        f();
        eieu eieuVarK = eiiy.k("execSQL: ".concat(str));
        try {
            this.b.execSQL(str);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

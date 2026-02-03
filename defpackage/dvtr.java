package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvtr {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"name"};

    public static Uri a(String str, String str2, String str3, String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(str);
        builder.appendEncodedPath(str2);
        builder.appendEncodedPath(str3);
        for (int i = 0; i < strArr.length; i = 1) {
            builder.appendEncodedPath(strArr[0]);
        }
        return builder.build();
    }

    public static String b(String str, String str2) {
        return a.q(str2, str, ".");
    }

    public static String c(int i) {
        if (i >= 0) {
            return TextUtils.join(",", Collections.nCopies(i, "?"));
        }
        dvhv.c("TableUtils", a.g(i, "Invalid size for list placeholder: "));
        return "";
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", b, "type='view'", null, null, null, null);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(0);
                    try {
                        sQLiteDatabase.execSQL(a.v(string, "DROP VIEW IF EXISTS "));
                    } catch (SQLiteException e) {
                        dvhv.d("TableUtils", a.v(string, "View drop failure"), e);
                    }
                } finally {
                }
            }
            cursorQuery.close();
        }
        cursorQuery = sQLiteDatabase.query("sqlite_master", b, "type='index'", null, null, null, null);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    String string2 = cursorQuery.getString(0);
                    try {
                        sQLiteDatabase.execSQL(a.v(string2, "DROP INDEX IF EXISTS "));
                    } catch (SQLiteException e2) {
                        dvhv.g("TableUtils", a.v(string2, "Index drop failure"), e2);
                    }
                } finally {
                }
            }
        }
        cursorQuery = sQLiteDatabase.query("sqlite_master", b, "type='table'", null, null, null, null);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    String string3 = cursorQuery.getString(0);
                    if (!string3.startsWith("android_") && !string3.startsWith("sqlite_")) {
                        e(sQLiteDatabase, string3);
                    }
                } finally {
                }
            }
        }
    }

    public static void e(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(a.v(str, "DROP TABLE IF EXISTS "));
        } catch (SQLiteException e) {
            dvhv.d("TableUtils", "Table drop failure ".concat(String.valueOf(str)), e);
        }
    }

    public static void f(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        String strF;
        StringBuilder sb = new StringBuilder("ALTER TABLE ");
        sb.append(str);
        sb.append(" RENAME TO ");
        String strConcat = str.concat("_backup");
        sb.append(strConcat);
        sQLiteDatabase.execSQL(sb.toString());
        sQLiteDatabase.execSQL(str2);
        if (strArr == null) {
            strF = "*";
        } else {
            ejwc ejwcVar = new ejwc(", ");
            strF = new ejvz(ejwcVar, ejwcVar).f(strArr);
        }
        sQLiteDatabase.execSQL("INSERT INTO " + str + (strArr == null ? "" : a.a(strF, " (", ")")) + " SELECT " + strF + " FROM " + strConcat);
        sQLiteDatabase.execSQL("DROP TABLE ".concat(strConcat));
    }

    public static void g(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        f(sQLiteDatabase, str, str2, null);
    }

    public static String[] h(String[]... strArr) {
        int i = 0;
        int length = 0;
        while (true) {
            if (i >= strArr.length) {
                break;
            }
            length += strArr[i].length;
            i++;
        }
        String[] strArr2 = new String[length];
        int i2 = 0;
        for (String[] strArr3 : strArr) {
            int length2 = strArr3.length;
            System.arraycopy(strArr3, 0, strArr2, i2, length2);
            i2 += length2;
        }
        return strArr2;
    }

    public static String[] i(String str, String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = b(str, strArr[i]);
        }
        return strArr2;
    }
}

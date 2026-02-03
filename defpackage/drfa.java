package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.geller.portable.GellerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drfa {
    public static final ekrg a = ekrg.c("com/google/android/libraries/geller/portable/database/GellerDatabaseUtil");

    static String a(ejwi ejwiVar) {
        if (!ejwiVar.g()) {
            return "";
        }
        ejwiVar.c();
        return String.format("(%s IS NULL)", "delete_status");
    }

    static String b(String str, String str2, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        Iterator it = iterable.iterator();
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            sb.append(true != z ? ", " : "(");
            if (next instanceof Number) {
                sb.append(next);
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, String.valueOf(next));
            }
            z = false;
        }
        if (z) {
            sb.append("(");
        }
        sb.append(")");
        return sb.toString();
    }

    static List c(List list) {
        return list.isEmpty() ? ekgb.r("") : list;
    }

    static List d(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr, ejwi ejwiVar, ejwi ejwiVar2) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = sQLiteDatabase.query(true, str, new String[]{str2}, str3, strArr, null, null, (String) ejwiVar.f(), ejwiVar2.g() ? ((Integer) ejwiVar2.c()).toString() : null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str2)));
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (IllegalArgumentException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseUtil", "readStringFromTable", '=', "GellerDatabaseUtil.java")).q("Column doesn't exist");
            return arrayList;
        }
    }

    static void e(ewad ewadVar, eway ewayVar) throws GellerException {
        if (ewadVar.b.size() == 0 && ewadVar.c.size() == 0 && ewayVar.d) {
            throw new GellerException("Deleting all data via an empty deletion selection is no longer supported. Please use delete_all instead.");
        }
    }

    static String f(ewad ewadVar, eway ewayVar) {
        if (ewadVar.b.size() == 0 && ewadVar.c.size() == 0 && ewayVar.d) {
            throw new UnsupportedOperationException("Deleting all data via an empty deletion selection is no longer supported. Please use delete_all instead.");
        }
        String strConcat = ewadVar.b.size() != 0 ? "".concat(b("timestamp_micro", "IN", ewadVar.b)) : "";
        if (ewadVar.c.size() == 0) {
            return strConcat;
        }
        if (!strConcat.isEmpty()) {
            strConcat = strConcat.concat(" AND ");
        }
        return strConcat.concat(b("key", "IN", ewadVar.c));
    }

    static String g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            evzo evzoVar = (evzo) it.next();
            if (!evzoVar.d.isEmpty() || evzoVar.c != 0) {
                ArrayList arrayList2 = new ArrayList();
                if ((evzoVar.b & 1) != 0) {
                    long j = evzoVar.c;
                    if (j >= 0) {
                        arrayList2.add(b("timestamp_micro", "=", ekgb.r(Long.valueOf(j))));
                    }
                }
                if (!evzoVar.d.isEmpty()) {
                    arrayList2.add(b("key", "=", ekgb.r(evzoVar.d)));
                }
                arrayList.add(String.format("(%s)", new ejwc(" AND ").b(arrayList2)));
            }
        }
        return String.format("(%s)", new ejwc(" OR ").b(arrayList));
    }

    static List h(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ekjz.e(list, 100).iterator();
        while (it.hasNext()) {
            arrayList.add(g((List) it.next()));
        }
        return arrayList;
    }

    static String i(List list, List list2) {
        String strConcat = list.isEmpty() ? "" : "".concat(b("timestamp_micro", "IN", list));
        if (list2.isEmpty()) {
            return strConcat;
        }
        if (!strConcat.isEmpty()) {
            strConcat = strConcat.concat(" AND ");
        }
        return strConcat.concat(b("key", "IN", list2));
    }
}

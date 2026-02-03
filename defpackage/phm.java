package defpackage;

import android.database.Cursor;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phm {
    public static final int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int b(Cursor cursor, String str) {
        String strS;
        int iA = a(cursor, str);
        if (iA >= 0) {
            return iA;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            strS = fcur.S(columnNames, null, null, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strS = "unknown";
        }
        throw new IllegalArgumentException(a.n(strS, str, "column '", "' does not exist. Available columns: "));
    }
}

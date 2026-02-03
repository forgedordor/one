package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngj {
    public static final Integer a(Cursor cursor, String str) {
        Integer numValueOf = Integer.valueOf(cursor.getColumnIndex(str));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return Integer.valueOf(cursor.getInt(numValueOf.intValue()));
        }
        return null;
    }

    public static final Long b(Cursor cursor, String str) {
        Integer numValueOf = Integer.valueOf(cursor.getColumnIndex(str));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return Long.valueOf(cursor.getLong(numValueOf.intValue()));
        }
        return null;
    }

    public static final String c(Cursor cursor, String str) {
        Integer numValueOf = Integer.valueOf(cursor.getColumnIndex(str));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return cursor.getString(numValueOf.intValue());
        }
        return null;
    }
}

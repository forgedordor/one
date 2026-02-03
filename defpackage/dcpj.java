package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpj {
    public static final String a(Cursor cursor) {
        try {
            return cursor.getString(cursor.getColumnIndexOrThrow("data1"));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}

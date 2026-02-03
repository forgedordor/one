package defpackage;

import android.database.Cursor;

/* compiled from: PG */
@fdac
/* loaded from: classes5.dex */
public final class egrr {
    public final Cursor a;

    public static final int a(Cursor cursor, String str) {
        return cursor.getColumnIndex(str);
    }

    public static final String b(Cursor cursor, int i) {
        String string = cursor.getString(i);
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof egrr) && fdbq.f(this.a, ((egrr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReadOnlyCursor(cursor=" + this.a + ")";
    }
}

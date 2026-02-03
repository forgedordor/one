package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cqjb {
    public static final cqjb a;
    public static final String[] b;

    static {
        cqin cqinVar = new cqin();
        cqinVar.b(0L);
        a = cqinVar.a();
        b = new String[]{"_id", "displayName"};
    }

    public static cqjb c(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("displayName"));
        cqin cqinVar = new cqin();
        cqinVar.b(j);
        cqinVar.a = string;
        return cqinVar.a();
    }

    public static cqjb d() {
        cqin cqinVar = new cqin();
        cqinVar.b(1000000000L);
        return cqinVar.a();
    }

    public static ekgb e() {
        return ekgb.u(0L, 1L, 1000000000L, 1000000001L);
    }

    public abstract long a();

    public abstract String b();
}

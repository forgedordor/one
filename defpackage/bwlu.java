package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwlu {
    public final fcsu a;

    public bwlu(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final void a() {
        ((dqsy) this.a.b()).h().endTransaction();
    }

    public final boolean b() {
        SQLiteDatabase sQLiteDatabaseH = ((dqsy) this.a.b()).h();
        return sQLiteDatabaseH != null && sQLiteDatabaseH.isOpen();
    }
}

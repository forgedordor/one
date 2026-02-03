package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpeo {
    private static final cqce a = cqce.g("Bugle", "MemoryReclaimerImpl");
    private final fcsu b;
    private final fcsu c;

    public cpeo(fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public final void a(int i, int i2) {
        cqce cqceVar = a;
        cqceVar.q("Reclaiming memory");
        Iterator it = ((Set) this.b.b()).iterator();
        while (it.hasNext()) {
            ((cqci) it.next()).i(i);
        }
        cqceVar.q("MemoryReclaimerImpl.reclaimMemory:SQLiteDatabase.releaseMemory freed " + SQLiteDatabase.releaseMemory() + " bytes");
        if (i2 == 1) {
            System.gc();
        } else if (i2 == 2) {
            ((ains) this.c.b()).e("Bugle.App.OnTrimMemory.Count", i);
        }
    }
}

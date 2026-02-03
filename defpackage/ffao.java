package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffao {
    public final long a;
    public final fezx b;
    public final ffan c;
    public final ConcurrentLinkedQueue d;

    public ffao(ffaa ffaaVar, TimeUnit timeUnit) {
        ffaaVar.getClass();
        this.a = timeUnit.toNanos(5L);
        this.b = ffaaVar.a();
        this.c = new ffan(this, String.valueOf(fezr.e).concat(" ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(fexe fexeVar, ffaj ffajVar, List list, boolean z) {
        Iterator it = this.d.iterator();
        it.getClass();
        while (it.hasNext()) {
            ffam ffamVar = (ffam) it.next();
            ffamVar.getClass();
            synchronized (ffamVar) {
                if (z) {
                    if (!ffamVar.i()) {
                        continue;
                    }
                }
                if (ffamVar.h(fexeVar, list)) {
                    ffajVar.i(ffamVar);
                    return true;
                }
            }
        }
        return false;
    }
}

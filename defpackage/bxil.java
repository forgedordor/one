package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxil implements Closeable {
    public final eksp a = eksp.c("BugleJobs");
    public final List b = new ArrayList();
    private final fcsu c;

    public bxil(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    final void a() {
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        byco bycoVar = (byco) this.c.b();
        bycp bycpVar = (bycp) bycq.a.createBuilder();
        bycpVar.copyOnWrite();
        bycq bycqVar = (bycq) bycpVar.instance;
        evtg evtgVar = bycqVar.c;
        if (!evtgVar.c()) {
            bycqVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(list, bycqVar.c);
        bycpVar.copyOnWrite();
        ((bycq) bycpVar.instance).b = 11;
        ((cazj) bycoVar.a.b()).a(cbcu.f("icing_index_update_handler", (bycq) bycpVar.build()));
        list.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }
}

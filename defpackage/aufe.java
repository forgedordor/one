package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aufe extends evsf implements evui {
    public aufe() {
        super(aufh.b);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        aufh aufhVar = (aufh) this.instance;
        evsy evsyVar = aufh.a;
        aufhVar.b();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aufhVar.q.h(((aufg) it.next()).e);
        }
    }

    public final void b(aubs aubsVar) {
        copyOnWrite();
        aufh aufhVar = (aufh) this.instance;
        aubt aubtVar = (aubt) aubsVar.build();
        evsy evsyVar = aufh.a;
        aubtVar.getClass();
        aufhVar.a();
        aufhVar.m.add(aubtVar);
    }

    public final void c(aubt aubtVar) {
        copyOnWrite();
        aufh aufhVar = (aufh) this.instance;
        evsy evsyVar = aufh.a;
        aubtVar.getClass();
        aufhVar.a();
        aufhVar.m.add(aubtVar);
    }

    public final void d(aufg aufgVar) {
        copyOnWrite();
        aufh aufhVar = (aufh) this.instance;
        evsy evsyVar = aufh.a;
        aufgVar.getClass();
        aufhVar.b();
        aufhVar.q.h(aufgVar.e);
    }
}

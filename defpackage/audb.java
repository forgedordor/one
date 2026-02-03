package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class audb extends evsf implements evui {
    public audb() {
        super(audc.c);
    }

    public final void a(aubq aubqVar) {
        copyOnWrite();
        audc audcVar = (audc) this.instance;
        evsy evsyVar = audc.a;
        aubqVar.getClass();
        audcVar.a();
        audcVar.g.add(aubqVar);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        audc audcVar = (audc) this.instance;
        evsy evsyVar = audc.a;
        evsx evsxVar = audcVar.i;
        if (!evsxVar.c()) {
            audcVar.i = evsn.mutableCopy(evsxVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            audcVar.i.h(((aucp) it.next()).g);
        }
    }

    public final void c(Iterable iterable) {
        copyOnWrite();
        audc audcVar = (audc) this.instance;
        evsy evsyVar = audc.a;
        audcVar.a();
        evpz.addAll(iterable, audcVar.g);
    }

    public final void d(Iterable iterable) {
        copyOnWrite();
        audc audcVar = (audc) this.instance;
        evsy evsyVar = audc.a;
        evsx evsxVar = audcVar.j;
        if (!evsxVar.c()) {
            audcVar.j = evsn.mutableCopy(evsxVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            audcVar.j.h(((aucp) it.next()).g);
        }
    }

    public final void e(Iterable iterable) {
        copyOnWrite();
        audc audcVar = (audc) this.instance;
        evsy evsyVar = audc.a;
        audcVar.b();
        evpz.addAll(iterable, audcVar.h);
    }

    public final void f(aubq aubqVar) {
        copyOnWrite();
        audc audcVar = (audc) this.instance;
        evsy evsyVar = audc.a;
        aubqVar.getClass();
        audcVar.b();
        audcVar.h.add(aubqVar);
    }
}

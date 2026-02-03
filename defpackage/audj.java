package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class audj extends evsf implements evui {
    public audj() {
        super(audk.b);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        audk audkVar = (audk) this.instance;
        evsy evsyVar = audk.a;
        audkVar.a();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            audkVar.g.h(((aucp) it.next()).g);
        }
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        audk audkVar = (audk) this.instance;
        evsy evsyVar = audk.a;
        evtg evtgVar = audkVar.h;
        if (!evtgVar.c()) {
            audkVar.h = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, audkVar.h);
    }

    public final void c(aucp aucpVar) {
        copyOnWrite();
        audk audkVar = (audk) this.instance;
        evsy evsyVar = audk.a;
        aucpVar.getClass();
        audkVar.a();
        audkVar.g.h(aucpVar.g);
    }
}

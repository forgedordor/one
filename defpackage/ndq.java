package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ndq extends ndd {
    private final HashMap d = new HashMap();
    private Handler e;
    private min f;

    protected ndq() {
    }

    @Override // defpackage.ndd
    protected final void g() {
        for (ndp ndpVar : this.d.values()) {
            ndpVar.a.f(ndpVar.b);
        }
    }

    @Override // defpackage.ndd
    protected final void i() {
        for (ndp ndpVar : this.d.values()) {
            ndpVar.a.h(ndpVar.b);
        }
    }

    @Override // defpackage.ndd
    protected void k(min minVar) {
        this.f = minVar;
        this.e = mgb.E();
    }

    @Override // defpackage.ndd
    protected void n() {
        HashMap map = this.d;
        for (ndp ndpVar : map.values()) {
            nep nepVar = ndpVar.a;
            nepVar.m(ndpVar.b);
            ndo ndoVar = ndpVar.c;
            nepVar.p(ndoVar);
            nepVar.o(ndoVar);
        }
        map.clear();
    }

    @Override // defpackage.nep
    public void t() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((ndp) it.next()).a.t();
        }
    }

    protected nen x(Object obj, nen nenVar) {
        throw null;
    }

    protected abstract void y(Object obj, nep nepVar, mcl mclVar);

    protected final void z(final Object obj, nep nepVar) {
        HashMap map = this.d;
        mee.a(!map.containsKey(obj));
        neo neoVar = new neo() { // from class: ndn
            @Override // defpackage.neo
            public final void a(nep nepVar2, mcl mclVar) {
                this.a.y(obj, nepVar2, mclVar);
            }
        };
        ndo ndoVar = new ndo(this, obj);
        map.put(obj, new ndp(nepVar, neoVar, ndoVar));
        Handler handler = this.e;
        mee.f(handler);
        nepVar.e(handler, ndoVar);
        Handler handler2 = this.e;
        mee.f(handler2);
        nepVar.d(handler2, ndoVar);
        nepVar.j(neoVar, this.f, J());
        if (this.a.isEmpty()) {
            nepVar.f(neoVar);
        }
    }

    protected void A(Object obj) {
    }

    protected void B(Object obj) {
    }
}

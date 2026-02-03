package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgr extends fbnd {
    public final String b;
    final /* synthetic */ fcgx c;
    public final AtomicReference a = new AtomicReference(fcgx.e);
    private final fbnd d = new fcgj(this);

    public fcgr(fcgx fcgxVar, String str) {
        this.c = fcgxVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.fbnd
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar) {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        fbpk fbpkVar = fcgx.e;
        if (obj != fbpkVar) {
            return c(fbrkVar, fbncVar);
        }
        fcgx fcgxVar = this.c;
        fcgl fcglVar = new fcgl(this);
        fbtk fbtkVar = fcgxVar.m;
        fbtkVar.execute(fcglVar);
        if (atomicReference.get() != fbpkVar) {
            return c(fbrkVar, fbncVar);
        }
        if (fcgxVar.B.get()) {
            return new fcgm();
        }
        fcgq fcgqVar = new fcgq(this, fbog.k(), fbrkVar, fbncVar);
        fbtkVar.execute(new fcgn(this, fcgqVar));
        return fcgqVar;
    }

    @Override // defpackage.fbnd
    public final String b() {
        return this.b;
    }

    public final fbnh c(fbrk fbrkVar, fbnc fbncVar) {
        fbpk fbpkVar = (fbpk) this.a.get();
        if (fbpkVar == null) {
            return this.d.a(fbrkVar, fbncVar);
        }
        if (!(fbpkVar instanceof fchj)) {
            return new fcfz(fbpkVar, this.d, this.c.k, fbrkVar, fbncVar);
        }
        fchi fchiVarB = ((fchj) fbpkVar).b.b(fbrkVar);
        if (fchiVarB != null) {
            fbncVar = fbncVar.f(fchi.a, fchiVarB);
        }
        return this.d.a(fbrkVar, fbncVar);
    }

    final void d(fbpk fbpkVar) {
        Collection collection;
        AtomicReference atomicReference = this.a;
        fbpk fbpkVar2 = (fbpk) atomicReference.get();
        atomicReference.set(fbpkVar);
        if (fbpkVar2 != fcgx.e || (collection = this.c.x) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((fcgq) it.next()).j();
        }
    }
}

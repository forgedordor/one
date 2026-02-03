package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjd extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dod e;
    final /* synthetic */ hje f;
    final /* synthetic */ fdap g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjd(dod dodVar, hje hjeVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = dodVar;
        this.f = hjeVar;
        this.g = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hjd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [feav, int] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        hje hjeVar;
        fdap fdapVar;
        hjb hjbVar;
        feav feavVar;
        hje hjeVar2;
        Throwable th;
        feav feavVar2;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    fctl.b(obj);
                    fdjx fdjxVar = (fdjx) this.h;
                    dod dodVar = this.e;
                    fcyf fcyfVar = fdjxVar.hE().get(fdlr.c);
                    fcyfVar.getClass();
                    hjb hjbVar2 = new hjb(dodVar, (fdlr) fcyfVar);
                    hjeVar = this.f;
                    while (true) {
                        AtomicReference atomicReference = hjeVar.a;
                        hjb hjbVar3 = (hjb) atomicReference.get();
                        if (hjbVar3 != null && hjbVar2.a.compareTo(hjbVar3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference.compareAndSet(hjbVar3, hjbVar2)) {
                            if (atomicReference.get() != hjbVar3) {
                                break;
                            }
                        }
                        if (hjbVar3 != null) {
                            hjbVar3.b.t(null);
                        }
                        feav feavVar3 = hjeVar.b;
                        fdapVar = this.g;
                        this.h = hjbVar2;
                        this.a = feavVar3;
                        this.b = fdapVar;
                        this.c = hjeVar;
                        this.d = 1;
                        if (feavVar3.b(this) != fcylVar) {
                            hjbVar = hjbVar2;
                            feavVar = feavVar3;
                        }
                    }
                } else {
                    if (r1 != 1) {
                        hjeVar2 = (hje) this.b;
                        Object obj2 = this.a;
                        hjbVar = (hjb) this.h;
                        try {
                            fctl.b(obj);
                            feavVar2 = obj2;
                            hjc.a(hjeVar2.a, hjbVar);
                            feavVar2.d();
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            hjc.a(hjeVar2.a, hjbVar);
                            throw th;
                        }
                    }
                    Object obj3 = this.c;
                    fdap fdapVar2 = (fdap) this.b;
                    Object obj4 = this.a;
                    hjb hjbVar4 = (hjb) this.h;
                    fctl.b(obj);
                    fdapVar = fdapVar2;
                    hjbVar = hjbVar4;
                    hjeVar = obj3;
                    feavVar = obj4;
                }
                this.h = hjbVar;
                this.a = feavVar;
                this.b = hjeVar;
                this.c = null;
                this.d = 2;
                Object objInvoke = fdapVar.invoke(this);
                if (objInvoke != fcylVar) {
                    hjeVar2 = hjeVar;
                    obj = objInvoke;
                    feavVar2 = feavVar;
                    hjc.a(hjeVar2.a, hjbVar);
                    feavVar2.d();
                    return obj;
                }
                return fcylVar;
            } catch (Throwable th3) {
                hjeVar2 = hjeVar;
                th = th3;
                hjc.a(hjeVar2.a, hjbVar);
                throw th;
            }
        } catch (Throwable th4) {
            r1.d();
            throw th4;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hjd hjdVar = new hjd(this.e, this.f, this.g, fcxyVar);
        hjdVar.h = obj;
        return hjdVar;
    }
}

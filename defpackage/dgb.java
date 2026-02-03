package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgb extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dfx e;
    final /* synthetic */ dgc f;
    final /* synthetic */ fdap g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgb(dfx dfxVar, dgc dgcVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = dfxVar;
        this.f = dgcVar;
        this.g = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [feav, int] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dgc dgcVar;
        fdap fdapVar;
        dfz dfzVar;
        feav feavVar;
        dgc dgcVar2;
        Throwable th;
        feav feavVar2;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    fctl.b(obj);
                    fdjx fdjxVar = (fdjx) this.h;
                    dfx dfxVar = this.e;
                    fcyf fcyfVar = fdjxVar.hE().get(fdlr.c);
                    fcyfVar.getClass();
                    dfz dfzVar2 = new dfz(dfxVar, (fdlr) fcyfVar);
                    dgcVar = this.f;
                    while (true) {
                        AtomicReference atomicReference = dgcVar.a;
                        dfz dfzVar3 = (dfz) atomicReference.get();
                        if (dfzVar3 != null && dfzVar2.a.compareTo(dfzVar3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference.compareAndSet(dfzVar3, dfzVar2)) {
                            if (atomicReference.get() != dfzVar3) {
                                break;
                            }
                        }
                        if (dfzVar3 != null) {
                            dfzVar3.b.t(new dfy());
                        }
                        feav feavVar3 = dgcVar.b;
                        fdapVar = this.g;
                        this.h = dfzVar2;
                        this.a = feavVar3;
                        this.b = fdapVar;
                        this.c = dgcVar;
                        this.d = 1;
                        if (feavVar3.b(this) != fcylVar) {
                            dfzVar = dfzVar2;
                            feavVar = feavVar3;
                        }
                    }
                } else {
                    if (r1 != 1) {
                        dgcVar2 = (dgc) this.b;
                        Object obj2 = this.a;
                        dfzVar = (dfz) this.h;
                        try {
                            fctl.b(obj);
                            feavVar2 = obj2;
                            dga.a(dgcVar2.a, dfzVar);
                            feavVar2.d();
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            dga.a(dgcVar2.a, dfzVar);
                            throw th;
                        }
                    }
                    Object obj3 = this.c;
                    fdap fdapVar2 = (fdap) this.b;
                    Object obj4 = this.a;
                    dfz dfzVar4 = (dfz) this.h;
                    fctl.b(obj);
                    fdapVar = fdapVar2;
                    dfzVar = dfzVar4;
                    dgcVar = obj3;
                    feavVar = obj4;
                }
                this.h = dfzVar;
                this.a = feavVar;
                this.b = dgcVar;
                this.c = null;
                this.d = 2;
                Object objInvoke = fdapVar.invoke(this);
                if (objInvoke != fcylVar) {
                    dgcVar2 = dgcVar;
                    obj = objInvoke;
                    feavVar2 = feavVar;
                    dga.a(dgcVar2.a, dfzVar);
                    feavVar2.d();
                    return obj;
                }
                return fcylVar;
            } catch (Throwable th3) {
                dgcVar2 = dgcVar;
                th = th3;
                dga.a(dgcVar2.a, dfzVar);
                throw th;
            }
        } catch (Throwable th4) {
            r1.d();
            throw th4;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dgb dgbVar = new dgb(this.e, this.f, this.g, fcxyVar);
        dgbVar.h = obj;
        return dgbVar;
    }
}

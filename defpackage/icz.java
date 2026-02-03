package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class icz extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdap b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ fdat d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icz(fdap fdapVar, AtomicReference atomicReference, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdapVar;
        this.c = atomicReference;
        this.d = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((icz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        icx icxVar;
        icx icxVar2;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
            if (i == 0) {
                fctl.b(obj);
                fdjx fdjxVar = (fdjx) this.e;
                icxVar = new icx(fdlw.c(fdjxVar.hE()), this.b.invoke(fdjxVar));
                icx icxVar3 = (icx) this.c.getAndSet(icxVar);
                if (icxVar3 != null) {
                    this.e = icxVar;
                    this.a = 1;
                    if (fdlw.a(icxVar3.a, this) != fcylVar) {
                    }
                    return fcylVar;
                }
            } else {
                if (i != 1) {
                    icxVar2 = (icx) this.e;
                    try {
                        fctl.b(obj);
                        icy.a(this.c, icxVar2);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        icy.a(this.c, icxVar2);
                        throw th;
                    }
                }
                icxVar = (icx) this.e;
                fctl.b(obj);
            }
            fdat fdatVar = this.d;
            Object obj2 = icxVar.b;
            this.e = icxVar;
            this.a = 2;
            obj = fdatVar.a(obj2, this);
            if (obj != fcylVar) {
                icxVar2 = icxVar;
                icy.a(this.c, icxVar2);
                return obj;
            }
            return fcylVar;
        } catch (Throwable th2) {
            th = th2;
            icxVar2 = icxVar;
            icy.a(this.c, icxVar2);
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        icz iczVar = new icz(this.b, this.c, this.d, fcxyVar);
        iczVar.e = obj;
        return iczVar;
    }
}

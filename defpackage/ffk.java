package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffk extends fcyz implements fdat {
    final /* synthetic */ ffl a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffk(ffl fflVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fflVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.b;
        ffl fflVar = this.a;
        AtomicReference atomicReference = fflVar.b;
        fdlr fdlrVarD = fdil.d(fdjxVar, null, null, new ffj((fdlr) atomicReference.getAndSet(null), fflVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, fdlrVarD)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ffk ffkVar = new ffk(this.a, fcxyVar);
        ffkVar.b = obj;
        return ffkVar;
    }
}

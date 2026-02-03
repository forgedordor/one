package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahuw extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahwd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahuw(ahwd ahwdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahwdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahuw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ahwd ahwdVar = this.b;
        this.a = 1;
        Object objI = ahwdVar.i(this);
        return objI == fcylVar ? fcylVar : objI;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahuw(this.b, fcxyVar);
    }
}

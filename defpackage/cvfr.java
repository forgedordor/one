package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvfr extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvfu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvfr(cvfu cvfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvfr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        csjm csjmVar = (csjm) this.b.e.b();
        this.a = 1;
        Object objA = csjmVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvfr(this.b, fcxyVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvfj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvfj(cvfm cvfmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvfmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvfj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        csei cseiVar = (csei) this.b.f.b();
        this.a = 1;
        Object objB = cseiVar.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvfj(this.b, fcxyVar);
    }
}

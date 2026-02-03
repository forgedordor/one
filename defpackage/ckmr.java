package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckmr extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckms b;
    final /* synthetic */ String c;
    final /* synthetic */ ckmb d;
    final /* synthetic */ ckmc e;
    final /* synthetic */ epes f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckmr(ckms ckmsVar, String str, ckmb ckmbVar, ckmc ckmcVar, epes epesVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckmsVar;
        this.c = str;
        this.d = ckmbVar;
        this.e = ckmcVar;
        this.f = epesVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckmr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ckms ckmsVar = this.b;
        String str = this.c;
        ckmb ckmbVar = this.d;
        ckmc ckmcVar = this.e;
        epes epesVar = this.f;
        this.a = 1;
        Object objA = ckmsVar.a.a(str, ckmbVar, ckmcVar, epesVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckmr(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}

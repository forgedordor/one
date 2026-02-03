package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akav extends fcyz implements fdat {
    int a;
    final /* synthetic */ akbc b;
    final /* synthetic */ awjl c;
    final /* synthetic */ ajsm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akav(akbc akbcVar, awjl awjlVar, ajsm ajsmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akbcVar;
        this.c = awjlVar;
        this.d = ajsmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        akbc akbcVar = this.b;
        awjl awjlVar = this.c;
        ajsm ajsmVar = this.d;
        this.a = 1;
        Object objG = akbcVar.g(awjlVar, ajsmVar, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akav(this.b, this.c, this.d, fcxyVar);
    }
}

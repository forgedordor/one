package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akat extends fcyz implements fdat {
    int a;
    final /* synthetic */ akbc b;
    final /* synthetic */ awjl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akat(akbc akbcVar, awjl awjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akbcVar;
        this.c = awjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akat) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        this.a = 1;
        Object objD = akbcVar.d(awjlVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akat(this.b, this.c, fcxyVar);
    }
}

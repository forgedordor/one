package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqq extends fcyz implements fdat {
    int a;
    final /* synthetic */ csrb b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csqq(fcxy fcxyVar, csrb csrbVar, boolean z) {
        super(2, fcxyVar);
        this.b = csrbVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csqq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        csrb csrbVar = this.b;
        boolean z = this.c;
        this.a = 1;
        Object objG = csrbVar.g(z, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csqq csqqVar = new csqq(fcxyVar, this.b, this.c);
        csqqVar.d = obj;
        return csqqVar;
    }
}

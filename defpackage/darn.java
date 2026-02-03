package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class darn extends fcyz implements fdat {
    int a;
    final /* synthetic */ darp b;
    final /* synthetic */ ctba c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public darn(fcxy fcxyVar, darp darpVar, ctba ctbaVar) {
        super(2, fcxyVar);
        this.b = darpVar;
        this.c = ctbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((darn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4 A[Catch: Exception -> 0x011e, InvalidParameterException -> 0x0122, TryCatch #6 {InvalidParameterException -> 0x0122, Exception -> 0x011e, blocks: (B:26:0x00d7, B:28:0x00f4, B:29:0x00fa), top: B:47:0x00d7 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.darn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        darn darnVar = new darn(fcxyVar, this.b, this.c);
        darnVar.i = obj;
        return darnVar;
    }
}

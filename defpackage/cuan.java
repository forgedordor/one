package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuan extends fcyz implements fdat {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ cuap c;
    Object d;
    final /* synthetic */ cudx e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuan(fcxy fcxyVar, cudx cudxVar, String str, cuap cuapVar) {
        super(2, fcxyVar);
        this.e = cudxVar;
        this.b = str;
        this.c = cuapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuan) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0145, code lost:
    
        if (r2 != r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023d A[RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuan.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cuan cuanVar = new cuan(fcxyVar, this.e, this.b, this.c);
        cuanVar.f = obj;
        return cuanVar;
    }
}

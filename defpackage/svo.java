package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svo extends fcyz implements fdat {
    int a;
    final /* synthetic */ svu b;
    final /* synthetic */ aoog c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svo(fcxy fcxyVar, svu svuVar, aoog aoogVar) {
        super(2, fcxyVar);
        this.b = svuVar;
        this.c = aoogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((svo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        if (defpackage.fdin.a(r3, r4, r9) == r0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        svo svoVar = new svo(fcxyVar, this.b, this.c);
        svoVar.d = obj;
        return svoVar;
    }
}

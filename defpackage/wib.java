package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wib extends fcyz implements fdat {
    int a;
    final /* synthetic */ dltd b;
    final /* synthetic */ wiq c;
    final /* synthetic */ wig d;
    final /* synthetic */ vvl e;
    boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wib(fcxy fcxyVar, dltd dltdVar, wiq wiqVar, wig wigVar, vvl vvlVar) {
        super(2, fcxyVar);
        this.b = dltdVar;
        this.c = wiqVar;
        this.d = wigVar;
        this.e = vvlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wib) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r0 != r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
    
        if (r2 != r6) goto L35;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wib.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wib wibVar = new wib(fcxyVar, this.b, this.c, this.d, this.e);
        wibVar.g = obj;
        return wibVar;
    }
}

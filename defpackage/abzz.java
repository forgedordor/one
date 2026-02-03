package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzz extends fcyz implements fdat {
    int a;
    final /* synthetic */ acaa b;
    final /* synthetic */ efwo c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abzz(fcxy fcxyVar, acaa acaaVar, efwo efwoVar, String str) {
        super(2, fcxyVar);
        this.b = acaaVar;
        this.c = efwoVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abzz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r7 == r0) goto L52;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        abzz abzzVar = new abzz(fcxyVar, this.b, this.c, this.d);
        abzzVar.e = obj;
        return abzzVar;
    }
}

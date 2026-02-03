package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqx extends fcyz implements fdat {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ csrb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csqx(fcxy fcxyVar, String str, csrb csrbVar) {
        super(2, fcxyVar);
        this.b = str;
        this.c = csrbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csqx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csqx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csqx csqxVar = new csqx(fcxyVar, this.b, this.c);
        csqxVar.d = obj;
        return csqxVar;
    }
}

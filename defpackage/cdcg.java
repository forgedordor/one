package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdcg extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdcf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdcg(fcxy fcxyVar, cdcf cdcfVar) {
        super(2, fcxyVar);
        this.b = cdcfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdcg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[Catch: egdj -> 0x0022, PHI: r11
      0x009d: PHI (r11v27 java.lang.Object) = (r11v26 java.lang.Object), (r11v0 java.lang.Object) binds: [B:24:0x009a, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {egdj -> 0x0022, blocks: (B:7:0x0018, B:29:0x00ae, B:8:0x001d, B:26:0x009d, B:23:0x0086), top: B:35:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdcg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdcg cdcgVar = new cdcg(fcxyVar, this.b);
        cdcgVar.c = obj;
        return cdcgVar;
    }
}

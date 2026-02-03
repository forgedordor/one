package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhi extends fcyy implements fdat {
    Object a;
    Object b;
    long c;
    int d;
    final /* synthetic */ fdjx e;
    final /* synthetic */ hcj f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhi(fdjx fdjxVar, hcj hcjVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.e = fdjxVar;
        this.f = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hhi) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #4 {all -> 0x001c, blocks: (B:7:0x0017, B:35:0x00be, B:37:0x00c2), top: B:48:0x0017 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hhi hhiVar = new hhi(this.e, this.f, fcxyVar);
        hhiVar.g = obj;
        return hhiVar;
    }
}

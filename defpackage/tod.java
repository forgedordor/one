package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tod extends fcyz implements fdat {
    int a;
    final /* synthetic */ tof b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tod(tof tofVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tofVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tod) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r4.a(r3) == r0) goto L17;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L44
        Ld:
            tof r4 = r3.b
            fcsu r4 = r4.b
            java.lang.Object r4 = r4.b()
            cobl r4 = (defpackage.cobl) r4
            r3.a = r2
            java.lang.Object r4 = r4.g(r3)
            if (r4 == r0) goto L47
        L1f:
            int r4 = r3.c
            int r4 = r4 + (-1)
            if (r4 == 0) goto L31
            tof r4 = r3.b
            autx r4 = r4.a
            aurx r4 = r4.a
            autt r1 = defpackage.autt.INITIAL_BACKUP_NEEDS_RETRY
            r4.ab(r1)
            goto L38
        L31:
            tof r4 = r3.b
            autx r4 = r4.a
            r4.g()
        L38:
            tof r4 = r3.b
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.a(r3)
            if (r4 != r0) goto L44
            goto L47
        L44:
            fctx r4 = defpackage.fctx.a
            return r4
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tod.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tod(this.b, this.c, fcxyVar);
    }
}

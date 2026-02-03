package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvow extends fcyz implements fdat {
    int a;
    final /* synthetic */ efwo b;
    final /* synthetic */ bvot c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvow(efwo efwoVar, bvot bvotVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = efwoVar;
        this.c = bvotVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvow) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r8 == r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            java.lang.String r2 = "Bugle.Gaia.Pairing.Disabled.When.Turning.On.Fi.Failure.Count"
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 == r3) goto Lf
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            goto L45
        Lf:
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            goto L30
        L13:
            r8 = move-exception
            goto L64
        L15:
            r8 = move-exception
            goto L6a
        L17:
            defpackage.fctl.b(r8)
            bvpo r8 = defpackage.bvpp.a     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            efwo r1 = r7.b     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            bvov r4 = new bvov     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            bvot r5 = r7.c     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            r6 = 0
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            r7.a = r3     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            r3 = 4
            java.lang.Object r8 = r8.a(r1, r3, r4, r7)     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            if (r8 != r0) goto L30
            goto L44
        L30:
            bvot$a r8 = (bvot.a) r8     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            bvmv r8 = r8.aI()     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            r1 = 5
            eiju r8 = r8.j(r1)     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            r1 = 2
            r7.a = r1     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            if (r8 != r0) goto L45
        L44:
            return r0
        L45:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            if (r8 == 0) goto L6f
            bvot r8 = r7.c     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            fcsu r0 = r8.c     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            ains r0 = (defpackage.ains) r0     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            java.lang.String r1 = "Bugle.Gaia.Pairing.Disabled.When.Turning.On.Fi.Success.Count"
            r0.c(r1)     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            cqce r8 = r8.e     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            java.lang.String r0 = "Successfully disabled Gaia device pairing"
            r8.p(r0)     // Catch: java.lang.Throwable -> L13 defpackage.bvpp -> L15
            goto L6f
        L64:
            bvot r0 = r7.c
            r0.h(r2, r8)
            goto L6f
        L6a:
            bvot r0 = r7.c
            r0.g(r2, r8)
        L6f:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvow.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvow(this.b, this.c, fcxyVar);
    }
}

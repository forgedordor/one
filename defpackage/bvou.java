package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvou extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ bvot c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvou(bvot bvotVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bvotVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvou) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r1.f(r5, r4) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.b
            java.lang.String r2 = "Bugle.Gaia.Pairing.Disabled.When.Setting.Up.Qr.Failure.Count"
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            defpackage.fctl.b(r5)     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            goto L58
        Lf:
            r5 = move-exception
            goto L7b
        L11:
            r5 = move-exception
            goto L81
        L14:
            java.lang.Object r1 = r4.a
            defpackage.fctl.b(r5)     // Catch: java.lang.Throwable -> L1a
            goto L3e
        L1a:
            r5 = move-exception
            goto L74
        L1c:
            defpackage.fctl.b(r5)
            bvpp r1 = new bvpp     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            r5 = 6
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            bvot r5 = r4.c     // Catch: java.lang.Throwable -> L1a
            fcsu r5 = r5.a     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L1a
            bvll r5 = (defpackage.bvll) r5     // Catch: java.lang.Throwable -> L1a
            eiju r5 = r5.e()     // Catch: java.lang.Throwable -> L1a
            r4.a = r1     // Catch: java.lang.Throwable -> L1a
            r4.b = r3     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)     // Catch: java.lang.Throwable -> L1a
            if (r5 != r0) goto L3e
            goto L57
        L3e:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L68
            int r1 = r5.length()     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            if (r1 != 0) goto L49
            goto L68
        L49:
            bvot r1 = r4.c     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            r3 = 0
            r4.a = r3     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            r3 = 2
            r4.b = r3     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            java.lang.Object r5 = r1.f(r5, r4)     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            if (r5 != r0) goto L58
        L57:
            return r0
        L58:
            bvot r5 = r4.c     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            fcsu r5 = r5.c     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            ains r5 = (defpackage.ains) r5     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            java.lang.String r0 = "Bugle.Gaia.Pairing.Disabled.When.Setting.Up.Qr.Success.Count"
            r5.c(r0)     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            goto L86
        L68:
            bvot r5 = r4.c     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            cqce r5 = r5.e     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            java.lang.String r0 = "Gaia pairing already inactive"
            r5.p(r0)     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            fctx r5 = defpackage.fctx.a     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            return r5
        L74:
            bvpp r1 = (defpackage.bvpp) r1     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            java.lang.Throwable r5 = r1.initCause(r5)     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
            throw r5     // Catch: java.lang.Throwable -> Lf defpackage.bvpp -> L11
        L7b:
            bvot r0 = r4.c
            r0.h(r2, r5)
            goto L86
        L81:
            bvot r0 = r4.c
            r0.g(r2, r5)
        L86:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvou.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvou(this.c, fcxyVar);
    }
}

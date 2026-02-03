package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckax extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;
    final /* synthetic */ dggn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckax(ckbk ckbkVar, dggn dggnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
        this.c = dggnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckax) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r7 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L11
            defpackage.fctl.b(r7)
            if (r1 == r4) goto L20
            if (r1 == r2) goto L42
            goto L76
        L11:
            defpackage.fctl.b(r7)
            ckbk r7 = r6.b
            dggn r1 = r6.c
            r6.a = r4
            java.lang.Object r7 = r7.s(r1, r6)
            if (r7 == r0) goto L7c
        L20:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            ckbk r1 = r6.b
            dggn r5 = r6.c
            int r7 = r7 + r4
            r6.a = r2
            fcyh r2 = r1.d
            fcyh r2 = defpackage.eicg.a(r2)
            ckaz r4 = new ckaz
            r4.<init>(r3, r1, r5, r7)
            java.lang.Object r7 = defpackage.fdin.a(r2, r4, r6)
            if (r7 == r0) goto L40
            fctx r7 = defpackage.fctx.a
        L40:
            if (r7 == r0) goto L7c
        L42:
            ckbk r7 = r6.b
            dggn r1 = r6.c
            fcsu r2 = r7.j
            java.lang.Object r2 = r2.b()
            cogw r2 = (defpackage.cogw) r2
            j$.time.Instant r2 = r2.f()
            long r4 = r2.toEpochMilli()
            evvp r2 = defpackage.evxc.c(r4)
            r2.getClass()
            r4 = 3
            r6.a = r4
            fcyh r4 = r7.d
            fcyh r4 = defpackage.eicg.a(r4)
            ckbb r5 = new ckbb
            r5.<init>(r3, r7, r1, r2)
            java.lang.Object r7 = defpackage.fdin.a(r4, r5, r6)
            if (r7 == r0) goto L73
            fctx r7 = defpackage.fctx.a
        L73:
            if (r7 != r0) goto L76
            goto L7c
        L76:
            ckbk r7 = r6.b
            r7.l()
            return r3
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckax.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckax(this.b, this.c, fcxyVar);
    }
}

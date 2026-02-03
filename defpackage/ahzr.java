package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahzr extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ahzs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzr(ahzs ahzsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ahzsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahzr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        if (r2.a(r8, r7) != r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L10
            defpackage.fctl.b(r8)
            goto L7d
        L10:
            java.lang.Object r1 = r7.a
            defpackage.fctl.b(r8)
            goto L58
        L16:
            defpackage.fctl.b(r8)
            goto L2f
        L1a:
            defpackage.fctl.b(r8)
            ahzs r8 = r7.c
            fcsu r8 = r8.a
            java.lang.Object r8 = r8.b()
            ahwd r8 = (defpackage.ahwd) r8
            r7.b = r3
            java.lang.Object r8 = r8.k(r7)
            if (r8 == r0) goto L80
        L2f:
            ahzs r1 = r7.c
            java.util.List r8 = (java.util.List) r8
            int r3 = r8.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            ahzu r3 = r1.c
            java.lang.String r5 = "Found %d executions waiting for app update after package replaced"
            r3.b(r5, r4)
            fcsu r1 = r1.a
            java.lang.Object r1 = r1.b()
            ahwd r1 = (defpackage.ahwd) r1
            r7.a = r8
            r7.b = r2
            java.lang.Object r1 = r1.l(r7)
            if (r1 == r0) goto L80
            r6 = r1
            r1 = r8
            r8 = r6
        L58:
            ahzs r2 = r7.c
            java.util.List r8 = (java.util.List) r8
            int r3 = r8.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            ahzu r3 = r2.c
            java.lang.String r5 = "Found %d executions waiting for reprompt after package replaced"
            r3.b(r5, r4)
            java.util.List r8 = defpackage.fcva.ah(r1, r8)
            r1 = 0
            r7.a = r1
            r1 = 3
            r7.b = r1
            java.lang.Object r8 = r2.a(r8, r7)
            if (r8 != r0) goto L7d
            goto L80
        L7d:
            fctx r8 = defpackage.fctx.a
            return r8
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahzr(this.c, fcxyVar);
    }
}

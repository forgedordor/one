package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctre extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ctrg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctre(ctrg ctrgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ctrgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctre) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r8.fO(r1, r7) != r0) goto L23;
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
            int r1 = r7.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            if (r1 == r2) goto L13
            java.lang.Object r0 = r7.d
            ekgb r0 = (defpackage.ekgb) r0
            defpackage.fctl.b(r8)
            goto L7b
        L13:
            java.lang.Object r1 = r7.a
            java.lang.Object r2 = r7.d
            fdpm r2 = (defpackage.fdpm) r2
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L1d
            goto L59
        L1d:
            r8 = move-exception
            goto L81
        L1f:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.d
            fdpm r8 = (defpackage.fdpm) r8
            cczv r1 = defpackage.ctif.j
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L39
            int r1 = defpackage.ekgb.d
            ekgb r1 = defpackage.ekoe.a
            goto L6a
        L39:
            ctrg r1 = r7.c
            dzuc r4 = r1.c
            dzub r4 = r4.d()
            ajoy r1 = r1.b     // Catch: java.lang.Throwable -> L7f
            eiju r1 = r1.e()     // Catch: java.lang.Throwable -> L7f
            r1.getClass()     // Catch: java.lang.Throwable -> L7f
            r7.d = r8     // Catch: java.lang.Throwable -> L7f
            r7.a = r4     // Catch: java.lang.Throwable -> L7f
            r7.b = r2     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = defpackage.fdxs.c(r1, r7)     // Catch: java.lang.Throwable -> L7f
            if (r1 == r0) goto L7e
            r2 = r8
            r8 = r1
            r1 = r4
        L59:
            ekgb r8 = (defpackage.ekgb) r8     // Catch: java.lang.Throwable -> L1d
            ctrg r4 = r7.c
            dzuc r4 = r4.c
            dzfh r5 = defpackage.cqjd.g
            dzua r6 = defpackage.dzua.SUCCESS
            dzub r1 = (defpackage.dzub) r1
            r4.f(r1, r5, r3, r6)
            r1 = r8
            r8 = r2
        L6a:
            r1.getClass()
            r7.d = r1
            r7.a = r3
            r2 = 2
            r7.b = r2
            java.lang.Object r8 = r8.fO(r1, r7)
            if (r8 != r0) goto L7b
            goto L7e
        L7b:
            fctx r8 = defpackage.fctx.a
            return r8
        L7e:
            return r0
        L7f:
            r8 = move-exception
            r1 = r4
        L81:
            ctrg r0 = r7.c
            dzuc r0 = r0.c
            dzfh r2 = defpackage.cqjd.g
            dzua r4 = defpackage.dzua.SUCCESS
            dzub r1 = (defpackage.dzub) r1
            r0.f(r1, r2, r3, r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctre.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctre ctreVar = new ctre(this.c, fcxyVar);
        ctreVar.d = obj;
        return ctreVar;
    }
}

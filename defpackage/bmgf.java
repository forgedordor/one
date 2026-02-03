package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bmgf extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dqwl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmgf(dqwl dqwlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dqwlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bmgf) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (defpackage.fdor.b(r3, r5, r6) != r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Type inference failed for: r1v1, types: [bmge, dqpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [dqwl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [fdob, fdos, java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            defpackage.fctl.b(r7)
            goto L59
        L11:
            java.lang.Object r0 = r6.d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.fctl.b(r7)
            goto L77
        L19:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.d
            fdos r3 = (defpackage.fdos) r3
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L23
            goto L43
        L23:
            r7 = move-exception
            goto L5f
        L25:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.d
            fdos r7 = (defpackage.fdos) r7
            bmge r1 = new bmge
            r1.<init>(r7)
            dqwl r5 = r6.c
            r5.M(r1)
            r6.d = r7     // Catch: java.lang.Throwable -> L5c
            r6.a = r1     // Catch: java.lang.Throwable -> L5c
            r6.b = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r3 = r7.a(r5, r6)     // Catch: java.lang.Throwable -> L5c
            if (r3 == r0) goto L75
            r3 = r7
        L43:
            dqwl r7 = r6.c
            bmgd r5 = new bmgd
            bmge r1 = (defpackage.bmge) r1
            r5.<init>()
            r6.d = r4
            r6.a = r4
            r6.b = r2
            java.lang.Object r7 = defpackage.fdor.b(r3, r5, r6)
            if (r7 != r0) goto L59
            goto L75
        L59:
            fctx r7 = defpackage.fctx.a
            return r7
        L5c:
            r2 = move-exception
            r3 = r7
            r7 = r2
        L5f:
            dqwl r2 = r6.c
            bmgd r5 = new bmgd
            bmge r1 = (defpackage.bmge) r1
            r5.<init>()
            r6.d = r7
            r6.a = r4
            r1 = 3
            r6.b = r1
            java.lang.Object r1 = defpackage.fdor.b(r3, r5, r6)
            if (r1 != r0) goto L76
        L75:
            return r0
        L76:
            r0 = r7
        L77:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmgf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bmgf bmgfVar = new bmgf(this.c, fcxyVar);
        bmgfVar.d = obj;
        return bmgfVar;
    }
}

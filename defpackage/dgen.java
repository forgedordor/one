package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgen extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgen(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "ReconfigurationRequiredState";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(android.os.Message r6) {
        /*
            r5 = this;
            int r0 = r6.what
            r1 = 4
            r2 = 1
            if (r0 == r1) goto L63
            r1 = 17
            if (r0 == r1) goto L57
            r1 = 7
            if (r0 == r1) goto L23
            r1 = 8
            if (r0 == r1) goto L16
            boolean r6 = super.e(r6)
            return r6
        L16:
            dgfg r0 = r5.b
            java.lang.Object r6 = r6.obj
            r0.N(r6)
            dgdq r6 = r0.W
            r0.w(r6)
            return r2
        L23:
            dfny r6 = defpackage.dgfg.g
            java.lang.Object r6 = r6.a()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4f
            dgfg r6 = r5.b
            dgch r0 = r6.G
            long r0 = r0.a()
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4f
            dhip r0 = r6.m
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Wait for backoff timer before starting registration."
            defpackage.dhja.d(r0, r3, r1)
            dgdq r0 = r6.ak
            r6.w(r0)
            goto L63
        L4f:
            dgfg r6 = r5.b
            dgdq r0 = r6.X
            r6.w(r0)
            goto L63
        L57:
            dgfg r6 = r5.b
            dezf r0 = defpackage.dezf.SIM_REMOVED
            r6.N(r0)
            dgdq r0 = r6.aj
            r6.w(r0)
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgen.e(android.os.Message):boolean");
    }
}

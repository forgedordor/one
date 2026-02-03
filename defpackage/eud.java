package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eud implements dvj {
    public final etv a;
    private final dzo b;

    public eud(dzo dzoVar, etv etvVar) {
        this.b = dzoVar;
        this.a = etvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dvj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dwy r6, float r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.euc
            if (r0 == 0) goto L13
            r0 = r8
            euc r0 = (defpackage.euc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            euc r0 = new euc
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            dzo r8 = r5.b
            eub r2 = new eub
            r2.<init>()
            r0.c = r3
            java.lang.Object r8 = r8.b(r6, r7, r2, r0)
            if (r8 == r1) goto L97
        L41:
            java.lang.Number r8 = (java.lang.Number) r8
            float r6 = r8.floatValue()
            etv r7 = r5.a
            float r8 = r7.c()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L53
            goto L88
        L53:
            float r8 = r7.c()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L88
            int r8 = r7.j()
            boolean r1 = r7.i()
            if (r1 == 0) goto L83
            hox r1 = r7.n
            java.lang.Object r1 = r1.a()
            etd r1 = (defpackage.etd) r1
            fdjx r1 = r1.o
            ets r2 = new ets
            r3 = 0
            r2.<init>(r7, r3)
            r4 = 3
            defpackage.fdil.d(r1, r3, r3, r2, r4)
        L83:
            r1 = 0
            r7.u(r8, r0, r1)
            goto L91
        L88:
            float r7 = r7.c()
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
        L91:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r6)
            return r7
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eud.a(dwy, float, fcxy):java.lang.Object");
    }
}

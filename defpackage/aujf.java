package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aujf implements auji {
    private final awhr a;
    private final fdjx b;

    public aujf(awhr awhrVar, fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = awhrVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.auji
    public final eiju a(aujk aujkVar) {
        aujkVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new auje(this, aujkVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aujk r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aujd
            if (r0 == 0) goto L13
            r0 = r6
            aujd r0 = (defpackage.aujd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aujd r0 = new aujd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            r5.getClass()
            awhr r6 = r4.a
            aujc r5 = (defpackage.aujc) r5
            aubq r5 = r5.a
            eiju r5 = r6.d(r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            assi r6 = (defpackage.assi) r6
            aujh r5 = defpackage.aujh.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aujf.b(aujk, fcxy):java.lang.Object");
    }
}

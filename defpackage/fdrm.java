package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdrm implements fdpm {
    final /* synthetic */ fdcg a;
    final /* synthetic */ int b;
    final /* synthetic */ fdpm c;

    public fdrm(fdcg fdcgVar, int i, fdpm fdpmVar) {
        this.a = fdcgVar;
        this.b = i;
        this.c = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fdrl
            if (r0 == 0) goto L13
            r0 = r7
            fdrl r0 = (defpackage.fdrl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdrl r0 = new fdrl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fdcg r7 = r5.a
            int r2 = r5.b
            int r4 = r7.a
            if (r4 < r2) goto L48
            fdpm r7 = r5.c
            r0.c = r3
            java.lang.Object r6 = r7.fO(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            fctx r6 = defpackage.fctx.a
            return r6
        L48:
            int r4 = r4 + r3
            r7.a = r4
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdrm.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

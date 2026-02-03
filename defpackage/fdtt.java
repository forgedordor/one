package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdtt implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ fdcg b;

    public fdtt(fdpm fdpmVar, fdcg fdcgVar) {
        this.a = fdpmVar;
        this.b = fdcgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.fdts
            if (r0 == 0) goto L13
            r0 = r9
            fdts r0 = (defpackage.fdts) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdts r0 = new fdts
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L4c
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            fdcg r2 = r7.b
            fcvv r4 = new fcvv
            int r5 = r2.a
            int r6 = r5 + 1
            r2.a = r6
            if (r5 < 0) goto L4f
            r4.<init>(r5, r8)
            r0.c = r3
            java.lang.Object r8 = r9.fO(r4, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            fctx r8 = defpackage.fctx.a
            return r8
        L4f:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "Index overflow has happened"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdtt.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

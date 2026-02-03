package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdry implements fdpm {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdpm b;

    public fdry(fdat fdatVar, fdpm fdpmVar) {
        this.a = fdatVar;
        this.b = fdpmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r7.fO(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fdrx
            if (r0 == 0) goto L13
            r0 = r7
            fdrx r0 = (defpackage.fdrx) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdrx r0 = new fdrx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.d
            defpackage.fctl.b(r7)
            goto L47
        L38:
            defpackage.fctl.b(r7)
            fdat r7 = r5.a
            r0.d = r6
            r0.b = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 == r1) goto L66
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L60
            fdpm r7 = r5.b
            r2 = 0
            r0.d = r2
            r0.b = r3
            java.lang.Object r6 = r7.fO(r6, r0)
            if (r6 != r1) goto L5d
            goto L66
        L5d:
            fctx r6 = defpackage.fctx.a
            return r6
        L60:
            fdvn r6 = new fdvn
            r6.<init>(r5)
            throw r6
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdry.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

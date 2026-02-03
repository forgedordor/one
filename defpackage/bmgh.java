package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmgh implements fdpm {
    final /* synthetic */ fdpm a;

    public bmgh(fdpm fdpmVar) {
        this.a = fdpmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r7.fO(r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bmgg
            if (r0 == 0) goto L13
            r0 = r8
            bmgg r0 = (defpackage.bmgg) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bmgg r0 = new bmgg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L71
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.c
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L38
            goto L55
        L38:
            r8 = move-exception
            goto L5c
        L3a:
            defpackage.fctl.b(r8)
            fdpm r8 = r6.a
            dqwl r7 = (defpackage.dqwl) r7
            eiju r7 = r7.x()     // Catch: java.lang.Throwable -> L58
            r7.getClass()     // Catch: java.lang.Throwable -> L58
            r0.c = r8     // Catch: java.lang.Throwable -> L58
            r0.b = r4     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)     // Catch: java.lang.Throwable -> L58
            if (r7 == r1) goto L70
            r5 = r8
            r8 = r7
            r7 = r5
        L55:
            ekgb r8 = (defpackage.ekgb) r8     // Catch: java.lang.Throwable -> L38
            goto L60
        L58:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L5c:
            java.lang.Object r8 = defpackage.fctl.a(r8)
        L60:
            fctk r2 = new fctk
            r2.<init>(r8)
            r8 = 0
            r0.c = r8
            r0.b = r3
            java.lang.Object r7 = r7.fO(r2, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmgh.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

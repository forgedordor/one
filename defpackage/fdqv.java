package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqv implements fdpl {
    final /* synthetic */ fdpl a;
    final /* synthetic */ fdat b;

    public fdqv(fdpl fdplVar, fdat fdatVar) {
        this.a = fdplVar;
        this.b = fdatVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [fdpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [fdxb] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v7, types: [fdxb] */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fdqu
            if (r0 == 0) goto L13
            r0 = r8
            fdqu r0 = (defpackage.fdqu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdqu r0 = new fdqu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.d
            fdxb r7 = (defpackage.fdxb) r7
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L7b
        L2e:
            r8 = move-exception
            goto L7f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            fdce r7 = r0.e
            java.lang.Object r2 = r0.d
            defpackage.fctl.b(r8)
            goto L5f
        L40:
            defpackage.fctl.b(r8)
            fdce r8 = new fdce
            r8.<init>()
            r8.a = r4
            fdpl r2 = r6.a
            fdqx r5 = new fdqx
            r5.<init>(r8, r7)
            r0.d = r7
            r0.e = r8
            r0.b = r4
            java.lang.Object r2 = r2.a(r5, r0)
            if (r2 == r1) goto L86
            r2 = r7
            r7 = r8
        L5f:
            boolean r7 = r7.a
            if (r7 == 0) goto L83
            fdxb r7 = new fdxb
            fcyh r8 = r0.u()
            r7.<init>(r2, r8)
            fdat r8 = r6.b     // Catch: java.lang.Throwable -> L2e
            r0.d = r7     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            r0.e = r2     // Catch: java.lang.Throwable -> L2e
            r0.b = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.a(r7, r0)     // Catch: java.lang.Throwable -> L2e
            if (r8 == r1) goto L86
        L7b:
            r7.f()
            goto L83
        L7f:
            r7.f()
            throw r8
        L83:
            fctx r7 = defpackage.fctx.a
            return r7
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdqv.a(fdpm, fcxy):java.lang.Object");
    }
}

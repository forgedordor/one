package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdrw implements fdpl {
    final /* synthetic */ fdpl a;
    final /* synthetic */ fdat b;

    public fdrw(fdpl fdplVar, fdat fdatVar) {
        this.a = fdplVar;
        this.b = fdatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fdrv
            if (r0 == 0) goto L13
            r0 = r7
            fdrv r0 = (defpackage.fdrv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdrv r0 = new fdrv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fdry r6 = r0.d
            defpackage.fctl.b(r7)     // Catch: defpackage.fdvn -> L29
            goto L57
        L29:
            r7 = move-exception
            goto L4d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            fdpl r7 = r5.a
            fdat r2 = r5.b
            fdry r4 = new fdry
            r4.<init>(r2, r6)
            r0.d = r4     // Catch: defpackage.fdvn -> L4a
            r0.b = r3     // Catch: defpackage.fdvn -> L4a
            java.lang.Object r6 = r7.a(r4, r0)     // Catch: defpackage.fdvn -> L4a
            if (r6 != r1) goto L57
            return r1
        L4a:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L4d:
            defpackage.fdwu.a(r7, r6)
            fcyh r6 = r0.u()
            defpackage.fdlw.f(r6)
        L57:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdrw.a(fdpm, fcxy):java.lang.Object");
    }
}

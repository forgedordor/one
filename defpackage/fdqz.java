package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqz implements fdpl {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdpl b;

    public fdqz(fdat fdatVar, fdpl fdplVar) {
        this.a = fdatVar;
        this.b = fdplVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r7.a(r2, r0) != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fdqy
            if (r0 == 0) goto L13
            r0 = r8
            fdqy r0 = (defpackage.fdqy) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdqy r0 = new fdqy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L6b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            fdxb r7 = r0.e
            java.lang.Object r2 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L3a
            goto L58
        L3a:
            r8 = move-exception
            goto L73
        L3c:
            defpackage.fctl.b(r8)
            fdxb r8 = new fdxb
            fcyh r2 = r0.u()
            r8.<init>(r7, r2)
            fdat r2 = r6.a     // Catch: java.lang.Throwable -> L6f
            r0.d = r7     // Catch: java.lang.Throwable -> L6f
            r0.e = r8     // Catch: java.lang.Throwable -> L6f
            r0.b = r4     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r2.a(r8, r0)     // Catch: java.lang.Throwable -> L6f
            if (r2 == r1) goto L6e
            r2 = r7
            r7 = r8
        L58:
            r7.f()
            fdpl r7 = r6.b
            r8 = 0
            r0.d = r8
            r0.e = r8
            r0.b = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L6b
            goto L6e
        L6b:
            fctx r7 = defpackage.fctx.a
            return r7
        L6e:
            return r1
        L6f:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L73:
            r7.f()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdqz.a(fdpm, fcxy):java.lang.Object");
    }
}

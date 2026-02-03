package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdvj implements fdpm {
    private final fdpm a;
    private final fdat b;

    public fdvj(fdpm fdpmVar, fdat fdatVar) {
        this.a = fdpmVar;
        this.b = fdatVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (((defpackage.fdvj) r7).b(r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fdxb] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fdvi
            if (r0 == 0) goto L13
            r0 = r7
            fdvi r0 = (defpackage.fdvi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdvi r0 = new fdvi
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            fdxb r2 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L38
            goto L54
        L38:
            r7 = move-exception
            goto L6f
        L3a:
            defpackage.fctl.b(r7)
            fdpm r7 = r6.a
            fdxb r2 = new fdxb
            fcyh r5 = r0.u()
            r2.<init>(r7, r5)
            fdat r7 = r6.b     // Catch: java.lang.Throwable -> L38
            r0.d = r2     // Catch: java.lang.Throwable -> L38
            r0.c = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L38
            if (r7 == r1) goto L6e
        L54:
            r2.f()
            fdpm r7 = r6.a
            boolean r2 = r7 instanceof defpackage.fdvj
            if (r2 == 0) goto L6b
            fdvj r7 = (defpackage.fdvj) r7
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L6b
            goto L6e
        L6b:
            fctx r7 = defpackage.fctx.a
            return r7
        L6e:
            return r1
        L6f:
            r2.f()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdvj.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) {
        return this.a.fO(obj, fcxyVar);
    }
}

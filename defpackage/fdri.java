package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdri implements fdpl {
    final /* synthetic */ fdpl a;
    final /* synthetic */ fdav b;

    public fdri(fdpl fdplVar, fdav fdavVar) {
        this.a = fdplVar;
        this.b = fdavVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r11 != r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[PHI: r6 r10 r11
      0x0042: PHI (r6v1 long) = (r6v2 long), (r6v6 long) binds: [B:19:0x005a, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r10v1 fdpm) = (r10v15 fdpm), (r10v16 fdpm) binds: [B:19:0x005a, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r11v2 java.lang.Object) = (r11v8 java.lang.Object), (r11v1 java.lang.Object) binds: [B:19:0x005a, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [fdav] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0075 -> B:25:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0087 -> B:31:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.fdrh
            if (r0 == 0) goto L13
            r0 = r11
            fdrh r0 = (defpackage.fdrh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdrh r0 = new fdrh
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            long r6 = r0.f
            java.lang.Object r10 = r0.e
            java.lang.Object r2 = r0.d
            defpackage.fctl.b(r11)
            goto L77
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            int r10 = r0.g
            long r6 = r0.f
            java.lang.Object r10 = r0.d
            defpackage.fctl.b(r11)
        L42:
            r2 = r10
            goto L5d
        L44:
            defpackage.fctl.b(r11)
            r6 = 0
        L49:
            r0.d = r10
            r11 = 0
            r0.e = r11
            r0.f = r6
            r0.g = r3
            r0.b = r5
            fdpl r11 = r9.a
            java.lang.Object r11 = defpackage.fdrj.a(r11, r10, r0)
            if (r11 == r1) goto L8f
            goto L42
        L5d:
            r10 = r11
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L87
            fdav r11 = r9.b
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            r0.d = r2
            r0.e = r10
            r0.f = r6
            r0.b = r4
            java.lang.Object r11 = r11.a(r2, r10, r8, r0)
            if (r11 == r1) goto L8f
        L77:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L84
            r10 = 1
            long r6 = r6 + r10
            r11 = r5
            goto L88
        L84:
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            throw r10
        L87:
            r11 = r3
        L88:
            r10 = r2
            if (r11 == 0) goto L8c
            goto L49
        L8c:
            fctx r10 = defpackage.fctx.a
            return r10
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdri.a(fdpm, fcxy):java.lang.Object");
    }
}

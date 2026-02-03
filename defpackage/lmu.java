package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmu implements lmg {
    private final feav a = new feaz();
    private final ljp b = new ljp();
    private final fdpl c = new fdui(new lmt(null));

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [fdap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [feav] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.lmg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdap r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.lmr
            if (r0 == 0) goto L13
            r0 = r7
            lmr r0 = (defpackage.lmr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lmr r0 = new lmr
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.a
            feav r6 = (defpackage.feav) r6
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r7 = move-exception
            goto L6a
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            feaz r6 = r0.e
            java.lang.Object r2 = r0.a
            fdap r2 = (defpackage.fdap) r2
            defpackage.fctl.b(r7)
            goto L58
        L42:
            defpackage.fctl.b(r7)
            feav r7 = r5.a
            r0.a = r6
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L6e
            r2 = r6
            r6 = r7
        L58:
            r0.a = r6     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r0.e = r7     // Catch: java.lang.Throwable -> L2e
            r0.d = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != r1) goto L66
            goto L6e
        L66:
            r6.d()
            return r7
        L6a:
            r6.d()
            throw r7
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmu.a(fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.lmg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fdat r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.lms
            if (r0 == 0) goto L13
            r0 = r8
            lms r0 = (defpackage.lms) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lms r0 = new lms
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r7 = r0.a
            feaz r0 = r0.e
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r8 = move-exception
            goto L5f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            feav r8 = r6.a
            boolean r2 = r8.c()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L5b
            r5 = r8
            feaz r5 = (defpackage.feaz) r5     // Catch: java.lang.Throwable -> L5b
            r0.e = r5     // Catch: java.lang.Throwable -> L5b
            r0.a = r2     // Catch: java.lang.Throwable -> L5b
            r0.d = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r7.a(r4, r0)     // Catch: java.lang.Throwable -> L5b
            if (r7 == r1) goto L5a
            r0 = r8
            r8 = r7
            r7 = r2
        L54:
            if (r7 == 0) goto L59
            r0.d()
        L59:
            return r8
        L5a:
            return r1
        L5b:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5f:
            if (r7 == 0) goto L64
            r0.d()
        L64:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmu.b(fdat, fcxy):java.lang.Object");
    }

    @Override // defpackage.lmg
    public final fdpl c() {
        return this.c;
    }

    @Override // defpackage.lmg
    public final Object d() {
        return new Integer(this.b.a());
    }

    @Override // defpackage.lmg
    public final Object e() {
        return new Integer(this.b.a.incrementAndGet());
    }
}

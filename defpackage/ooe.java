package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ooe implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ oog b;

    public ooe(fdpm fdpmVar, oog oogVar) {
        this.b = oogVar;
        this.a = fdpmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r8.fO(r2, r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[PHI: r2 r8
      0x0082: PHI (r2v4 opc) = (r2v2 opc), (r2v3 opc), (r2v6 opc) binds: [B:26:0x0081, B:24:0x007e, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r8v10 fdpm) = (r8v6 fdpm), (r8v16 fdpm), (r8v17 fdpm) binds: [B:26:0x0081, B:24:0x007e, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ood
            if (r0 == 0) goto L13
            r0 = r9
            ood r0 = (defpackage.ood) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ood r0 = new ood
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r9)
            goto L8f
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.d
            opc r2 = r0.e
            defpackage.fctl.b(r9)
            goto L82
        L3e:
            java.lang.Object r8 = r0.d
            opc r2 = r0.e
            defpackage.fctl.b(r9)
            goto L6b
        L46:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            r2 = r8
            opc r2 = (defpackage.opc) r2
            oog r8 = r7.b
            fduf r8 = r8.d
            java.lang.Object r8 = r8.c()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L81
            r0.e = r2
            r0.d = r9
            r0.b = r5
            java.lang.Object r8 = defpackage.fdnh.a(r0)
            if (r8 == r1) goto L8e
            r8 = r9
        L6b:
            oog r9 = r7.b
            onz r5 = new onz
            r5.<init>(r6)
            r0.e = r2
            r0.d = r8
            r0.b = r4
            fduf r9 = r9.d
            java.lang.Object r9 = defpackage.fdtc.d(r9, r5, r0)
            if (r9 == r1) goto L8e
            goto L82
        L81:
            r8 = r9
        L82:
            r0.e = r6
            r0.d = r6
            r0.b = r3
            java.lang.Object r8 = r8.fO(r2, r0)
            if (r8 != r1) goto L8f
        L8e:
            return r1
        L8f:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooe.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

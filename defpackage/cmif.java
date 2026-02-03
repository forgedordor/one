package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmif implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ cmio b;

    public cmif(fdpm fdpmVar, cmio cmioVar) {
        this.a = fdpmVar;
        this.b = cmioVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r7.fO(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cmie
            if (r0 == 0) goto L13
            r0 = r8
            cmie r0 = (defpackage.cmie) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cmie r0 = new cmie
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L5d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.c
            defpackage.fctl.b(r8)
            goto L51
        L38:
            defpackage.fctl.b(r8)
            fdpm r8 = r6.a
            bubz r7 = (defpackage.bubz) r7
            cmio r2 = r6.b
            r7.getClass()
            r0.c = r8
            r0.b = r4
            java.lang.Object r7 = r2.t(r7, r0)
            if (r7 == r1) goto L60
            r5 = r8
            r8 = r7
            r7 = r5
        L51:
            r2 = 0
            r0.c = r2
            r0.b = r3
            java.lang.Object r7 = r7.fO(r8, r0)
            if (r7 != r1) goto L5d
            goto L60
        L5d:
            fctx r7 = defpackage.fctx.a
            return r7
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmif.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

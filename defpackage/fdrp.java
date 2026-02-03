package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdrp implements fdpm {
    final /* synthetic */ fdce a;
    final /* synthetic */ fdpm b;
    final /* synthetic */ fdat c;

    public fdrp(fdce fdceVar, fdpm fdpmVar, fdat fdatVar) {
        this.a = fdceVar;
        this.b = fdpmVar;
        this.c = fdatVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r8.fO(r7, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r8.fO(r7, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fdro
            if (r0 == 0) goto L13
            r0 = r8
            fdro r0 = (defpackage.fdro) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fdro r0 = new fdro
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L38
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L5c
        L38:
            defpackage.fctl.b(r8)
            goto L76
        L3c:
            defpackage.fctl.b(r8)
            fdce r8 = r6.a
            boolean r8 = r8.a
            if (r8 == 0) goto L50
            fdpm r8 = r6.b
            r0.d = r5
            java.lang.Object r7 = r8.fO(r7, r0)
            if (r7 != r1) goto L76
            goto L79
        L50:
            fdat r8 = r6.c
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 == r1) goto L79
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L76
            fdce r8 = r6.a
            r8.a = r5
            fdpm r8 = r6.b
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r8.fO(r7, r0)
            if (r7 != r1) goto L76
            goto L79
        L76:
            fctx r7 = defpackage.fctx.a
            return r7
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdrp.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

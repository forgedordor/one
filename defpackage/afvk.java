package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afvk implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ afvn b;

    public afvk(fdpm fdpmVar, afvn afvnVar) {
        this.a = fdpmVar;
        this.b = afvnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r9.fO(r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.afvj
            if (r0 == 0) goto L13
            r0 = r10
            afvj r0 = (defpackage.afvj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            afvj r0 = new afvj
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r10)
            goto L65
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.c
            defpackage.fctl.b(r10)
            goto L5a
        L39:
            defpackage.fctl.b(r10)
            fdpm r10 = r8.a
            java.lang.String r9 = (java.lang.String) r9
            afvn r2 = r8.b
            r0.c = r10
            r0.b = r5
            fcyh r5 = r2.b
            fcyh r5 = defpackage.eicg.a(r5)
            afvi r6 = new afvi
            r6.<init>(r3, r9, r2)
            java.lang.Object r9 = defpackage.fdin.a(r5, r6, r0)
            if (r9 == r1) goto L68
            r7 = r10
            r10 = r9
            r9 = r7
        L5a:
            r0.c = r3
            r0.b = r4
            java.lang.Object r9 = r9.fO(r10, r0)
            if (r9 != r1) goto L65
            goto L68
        L65:
            fctx r9 = defpackage.fctx.a
            return r9
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afvk.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

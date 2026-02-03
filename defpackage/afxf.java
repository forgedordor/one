package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afxf implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ afvt b;

    public afxf(fdpm fdpmVar, afvt afvtVar) {
        this.a = fdpmVar;
        this.b = afvtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.afxe
            if (r0 == 0) goto L13
            r0 = r9
            afxe r0 = (defpackage.afxe) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            afxe r0 = new afxe
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L70
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            java.util.List r8 = (java.util.List) r8
            afvt r2 = r7.b
            boolean r4 = r8 instanceof java.util.Collection
            r5 = 0
            if (r4 == 0) goto L44
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L44
            goto L63
        L44:
            java.util.Iterator r8 = r8.iterator()
        L48:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L63
            java.lang.String r4 = r2.a
            java.lang.Object r6 = r8.next()
            eji r6 = (defpackage.eji) r6
            java.lang.Object r6 = r6.d
            java.lang.String r6 = r6.toString()
            boolean r4 = defpackage.fdbq.f(r6, r4)
            if (r4 == 0) goto L48
            r5 = r3
        L63:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r0.b = r3
            java.lang.Object r8 = r9.fO(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxf.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

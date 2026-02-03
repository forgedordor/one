package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctsn implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ ctsy b;

    public ctsn(fdpm fdpmVar, ctsy ctsyVar) {
        this.a = fdpmVar;
        this.b = ctsyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r2.fO(r7, r0) == r1) goto L28;
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
            boolean r0 = r8 instanceof defpackage.ctsm
            if (r0 == 0) goto L13
            r0 = r8
            ctsm r0 = (defpackage.ctsm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ctsm r0 = new ctsm
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L75
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.e
            java.lang.Object r2 = r0.c
            defpackage.fctl.b(r8)
            goto L52
        L3a:
            defpackage.fctl.b(r8)
            fdpm r2 = r6.a
            cudx r7 = (defpackage.cudx) r7
            ctsy r8 = r6.b
            r0.c = r2
            android.content.Context r5 = r8.c
            r0.e = r5
            r0.b = r4
            java.lang.Object r8 = defpackage.ctsy.l(r8, r7, r0)
            if (r8 == r1) goto L78
            r7 = r5
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r4 == r8) goto L5e
            r8 = 2132087501(0x7f1512cd, float:1.981526E38)
            goto L61
        L5e:
            r8 = 2132087502(0x7f1512ce, float:1.9815261E38)
        L61:
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r7 = r7.getString(r8)
            r8 = 0
            r0.c = r8
            r0.e = r8
            r0.b = r3
            java.lang.Object r7 = r2.fO(r7, r0)
            if (r7 != r1) goto L75
            goto L78
        L75:
            fctx r7 = defpackage.fctx.a
            return r7
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctsn.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

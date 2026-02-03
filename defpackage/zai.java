package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zai implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ zan b;
    final /* synthetic */ ajlt c;

    public zai(fdpm fdpmVar, zan zanVar, ajlt ajltVar) {
        this.a = fdpmVar;
        this.b = zanVar;
        this.c = ajltVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r8.fO(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.zah
            if (r0 == 0) goto L13
            r0 = r9
            zah r0 = (defpackage.zah) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zah r0 = new zah
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r9)
            goto L65
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.c
            defpackage.fctl.b(r9)
            goto L5a
        L39:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L58
            zan r8 = r7.b
            ajlt r2 = r7.c
            r0.c = r9
            r0.b = r5
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 == r1) goto L64
            r6 = r9
            r9 = r8
            r8 = r6
            goto L5a
        L58:
            r8 = r9
            r9 = r3
        L5a:
            r0.c = r3
            r0.b = r4
            java.lang.Object r8 = r8.fO(r9, r0)
            if (r8 != r1) goto L65
        L64:
            return r1
        L65:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

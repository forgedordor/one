package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdrf implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ fdci b;

    public fdrf(fdpm fdpmVar, fdci fdciVar) {
        this.a = fdpmVar;
        this.b = fdciVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fdre
            if (r0 == 0) goto L13
            r0 = r6
            fdre r0 = (defpackage.fdre) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdre r0 = new fdre
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fdpm r6 = r4.a     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r6.fO(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L3f
            return r1
        L3f:
            fctx r5 = defpackage.fctx.a
            return r5
        L42:
            fdci r6 = r4.b
            r6.a = r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdrf.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

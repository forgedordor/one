package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzd implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ vzk b;

    public vzd(fdpm fdpmVar, vzk vzkVar) {
        this.a = fdpmVar;
        this.b = vzkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r2.fO(r5, r0) != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.vzc
            if (r0 == 0) goto L13
            r0 = r12
            vzc r0 = (defpackage.vzc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            vzc r0 = new vzc
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r12)
            goto L8d
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            long r5 = r0.f
            int r11 = r0.e
            java.lang.Object r2 = r0.c
            defpackage.fctl.b(r12)
            goto L71
        L3d:
            defpackage.fctl.b(r12)
            fdpm r2 = r10.a
            ajlh r11 = (defpackage.ajlh) r11
            long r6 = r11.c()
            int r12 = r11.b()
            aoer r11 = r11.g()
            if (r11 == 0) goto L7c
            vzk r8 = r10.b
            fcyh r8 = r8.e
            fcyh r8 = defpackage.eicg.a(r8)
            vzf r9 = new vzf
            r9.<init>(r3, r11)
            r0.c = r2
            r0.e = r12
            r0.f = r6
            r0.b = r5
            java.lang.Object r11 = defpackage.fdin.a(r8, r9, r0)
            if (r11 == r1) goto L8c
            r5 = r12
            r12 = r11
            r11 = r5
            r5 = r6
        L71:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r7 = r12
            r12 = r11
            r11 = r7
            r6 = r5
            goto L7d
        L7c:
            r11 = 0
        L7d:
            vws r5 = new vws
            r5.<init>(r6, r12, r11)
            r0.c = r3
            r0.b = r4
            java.lang.Object r11 = r2.fO(r5, r0)
            if (r11 != r1) goto L8d
        L8c:
            return r1
        L8d:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzd.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}

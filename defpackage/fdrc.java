package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdrc implements fdpl {
    final /* synthetic */ fdpl a;
    final /* synthetic */ fdau b;

    public fdrc(fdpl fdplVar, fdau fdauVar) {
        this.a = fdplVar;
        this.b = fdauVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r2.a(r6, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fdrb
            if (r0 == 0) goto L13
            r0 = r7
            fdrb r0 = (defpackage.fdrb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdrb r0 = new fdrb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.d
            defpackage.fctl.b(r7)
            goto L47
        L38:
            defpackage.fctl.b(r7)
            fdpl r7 = r5.a
            r0.d = r6
            r0.b = r4
            java.lang.Object r7 = defpackage.fdrj.a(r7, r6, r0)
            if (r7 == r1) goto L5c
        L47:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L59
            fdau r2 = r5.b
            r4 = 0
            r0.d = r4
            r0.b = r3
            java.lang.Object r6 = r2.a(r6, r7, r0)
            if (r6 != r1) goto L59
            goto L5c
        L59:
            fctx r6 = defpackage.fctx.a
            return r6
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdrc.a(fdpm, fcxy):java.lang.Object");
    }
}

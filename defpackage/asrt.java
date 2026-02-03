package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asrt implements asrp {
    private final awjh a;
    private final awnf b;

    public asrt(awjh awjhVar, awnf awnfVar) {
        awjhVar.getClass();
        awnfVar.getClass();
        this.a = awjhVar;
        this.b = awnfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.asrp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.asrg r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.asrs
            if (r0 == 0) goto L13
            r0 = r9
            asrs r0 = (defpackage.asrs) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            asrs r0 = new asrs
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.a
            awpx r8 = (defpackage.awpx) r8
            defpackage.fctl.b(r9)
            goto Lba
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.a
            asrg r8 = (defpackage.asrg) r8
            defpackage.fctl.b(r9)
            goto L7f
        L42:
            defpackage.fctl.b(r9)
            goto L60
        L46:
            defpackage.fctl.b(r9)
            boolean r9 = r8.d()
            if (r9 != 0) goto L69
            awjh r9 = r7.a
            aubq r8 = r8.a()
            r8.getClass()
            r0.d = r5
            java.lang.Object r9 = r9.c(r8, r0)
            if (r9 == r1) goto Lc2
        L60:
            awjl r9 = (defpackage.awjl) r9
            chbs r8 = new chbs
            r0 = 0
            r8.<init>(r9, r0)
            return r8
        L69:
            awnf r9 = r7.b
            audu r2 = r8.b()
            java.lang.String r2 = r2.c
            r2.getClass()
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r9.m(r2, r0)
            if (r9 != r1) goto L7f
            goto Lc2
        L7f:
            awpx r9 = (defpackage.awpx) r9
            boolean r2 = r8.b
            if (r2 != 0) goto L91
            awnf r8 = r7.b
            chbs r0 = new chbs
            awjl r8 = r8.a(r9)
            r0.<init>(r8, r9)
            return r0
        L91:
            ekgb r2 = r8.c()
            int r2 = r2.size()
            if (r2 != r5) goto Lc3
            awjh r2 = r7.a
            ekgb r8 = r8.c()
            r8.getClass()
            java.lang.Object r8 = defpackage.fcva.X(r8)
            r8.getClass()
            aubq r8 = (defpackage.aubq) r8
            r0.a = r9
            r0.d = r3
            java.lang.Object r8 = r2.c(r8, r0)
            if (r8 == r1) goto Lc2
            r6 = r9
            r9 = r8
            r8 = r6
        Lba:
            awjl r9 = (defpackage.awjl) r9
            chbs r0 = new chbs
            r0.<init>(r9, r8)
            return r0
        Lc2:
            return r1
        Lc3:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Extracting for multiple private endpoints within a group context is not supported."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asrt.a(asrg, fcxy):java.lang.Object");
    }
}

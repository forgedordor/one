package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmvd implements cmuv {
    public static final /* synthetic */ int d = 0;
    private static final eksp e = eksp.c("BugleMmsConfig");
    public final cebq a;
    public final cmuo b;
    public final fdjx c;
    private final cmlb f;
    private final fdjx g;

    public cmvd(cebq cebqVar, cmuo cmuoVar, cmlb cmlbVar, fdjx fdjxVar, fdjx fdjxVar2) {
        cebqVar.getClass();
        cmuoVar.getClass();
        cmlbVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.a = cebqVar;
        this.b = cmuoVar;
        this.f = cmlbVar;
        this.g = fdjxVar;
        this.c = fdjxVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cmva
            if (r0 == 0) goto L13
            r0 = r9
            cmva r0 = (defpackage.cmva) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmva r0 = new cmva
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r9)
            goto L68
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.fctl.b(r9)
            goto L42
        L37:
            defpackage.fctl.b(r9)
            r0.c = r5
            java.lang.Object r9 = r7.b(r8, r0)
            if (r9 == r1) goto L84
        L42:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L83
            int r8 = r9.length()
            if (r8 != 0) goto L4d
            goto L83
        L4d:
            fdjx r8 = r7.g
            fcyi r2 = defpackage.fcyi.a
            fdjz r5 = defpackage.fdjz.a
            fcyh r2 = defpackage.eicg.a(r2)
            cmuz r6 = new cmuz
            r6.<init>(r3, r7, r9)
            fdkf r8 = defpackage.fdin.b(r8, r2, r5, r6)
            r0.c = r4
            java.lang.Object r9 = r8.c(r0)
            if (r9 == r1) goto L84
        L68:
            j$.util.Optional r9 = (j$.util.Optional) r9
            boolean r8 = r9.isPresent()
            if (r8 == 0) goto L83
            java.lang.Object r8 = r9.get()
            etsc r8 = (defpackage.etsc) r8
            int r9 = r8.c
            r0 = 4
            if (r9 != r0) goto L80
            java.lang.Object r8 = r8.d
            etsn r8 = (defpackage.etsn) r8
            return r8
        L80:
            etsn r8 = defpackage.etsn.a
            return r8
        L83:
            return r3
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmvd.a(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cmvb
            if (r0 == 0) goto L13
            r0 = r6
            cmvb r0 = (defpackage.cmvb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cmvb r0 = new cmvb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.a
            defpackage.fctl.b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            cmlb r6 = r4.f
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.m(r5, r0)
            if (r6 == r1) goto L61
        L40:
            cmmh r6 = (defpackage.cmmh) r6
            r0 = 0
            if (r6 == 0) goto L48
            java.lang.String r6 = r6.c
            goto L49
        L48:
            r6 = r0
        L49:
            if (r6 == 0) goto L53
            int r1 = r6.length()
            if (r1 != 0) goto L52
            goto L53
        L52:
            return r6
        L53:
            eksp r6 = defpackage.cmvd.e
            ekrw r6 = r6.j()
            eksl r6 = (defpackage.eksl) r6
            java.lang.String r1 = "No simId found for subId %d"
            r6.r(r1, r5)
            return r0
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmvd.b(int, fcxy):java.lang.Object");
    }
}

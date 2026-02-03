package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cskp implements cscu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/rcs/RcsWithSpamHeaderProtection");
    private static final cczi b = cdag.h(cdag.b, "rcs_spam_protection_classify_despite_rejection", true);
    private final fcsu c;
    private final fcyh d;

    public cskp(fcsu fcsuVar, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcyhVar.getClass();
        this.c = fcsuVar;
        this.d = fcyhVar;
    }

    @Override // defpackage.cscu
    public final csdl a() {
        return csdl.d;
    }

    @Override // defpackage.cscu
    public final eieu b() {
        return eiiy.a("RcsWithSpamHeaderProtection.classify");
    }

    @Override // defpackage.cscu
    public final /* synthetic */ eieu c() {
        return csct.a();
    }

    @Override // defpackage.cscu
    public final Object d(csch cschVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new cskm(null, cschVar, this), fcxyVar);
    }

    @Override // defpackage.cscu
    public final /* synthetic */ Object e(csch cschVar, int i, fcxy fcxyVar) {
        return csct.b();
    }

    @Override // defpackage.cscu
    public final /* bridge */ /* synthetic */ boolean f() {
        return ((Boolean) b.e()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.csch r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cskn
            if (r0 == 0) goto L13
            r0 = r6
            cskn r0 = (defpackage.cskn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cskn r0 = new cskn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            r0.c = r3
            java.lang.Object r6 = r5.d(r0)
            if (r6 == r1) goto L57
        L3a:
            alqm r6 = (defpackage.alqm) r6
            if (r6 != 0) goto L44
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L44:
            fcsu r5 = r4.c
            java.lang.Object r5 = r5.b()
            cqka r5 = (defpackage.cqka) r5
            java.util.Set r5 = r5.b
            boolean r5 = r5.contains(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cskp.g(csch, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cskl r8, defpackage.fcxy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.csko
            if (r0 == 0) goto L13
            r0 = r9
            csko r0 = (defpackage.csko) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csko r0 = new csko
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r0 = r0.c
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L35
            defpackage.fctl.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r9 = 0
            if (r8 == 0) goto L30
            csdo r8 = defpackage.csdo.b
            goto L32
        L30:
            csdo r8 = defpackage.csdo.a
        L32:
            r2 = r8
            r8 = r9
            goto L4a
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            defpackage.fctl.b(r9)
            int r9 = r8.a
            if (r9 == r1) goto L47
            csdo r9 = defpackage.csdo.c
            goto L49
        L47:
            csdo r9 = defpackage.csdo.b
        L49:
            r2 = r9
        L4a:
            csdo r9 = defpackage.csdo.a
            boolean r9 = defpackage.fdbq.f(r2, r9)
            if (r9 == 0) goto L77
            ekrg r8 = defpackage.cskp.a
            ekrw r8 = r8.e()
            ekrz r9 = defpackage.eksq.a
            java.lang.String r0 = "BugleSpam"
            r8.X(r9, r0)
            r9 = 97
            java.lang.String r0 = "RcsWithSpamHeaderProtection.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/util/spam/rcs/RcsWithSpamHeaderProtection"
            java.lang.String r2 = "newImplementation"
            ekrw r8 = r8.h(r1, r2, r9, r0)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r9 = "No spam warning header in incoming message, skipping RCS enforcement."
            r8.q(r9)
            csdd r8 = defpackage.csdc.a()
            return r8
        L77:
            java.lang.String r3 = r8.b
            csdd r0 = new csdd
            eoff r1 = defpackage.eoff.SPAM
            r5 = 0
            r6 = 24
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cskp.h(cskl, fcxy):java.lang.Object");
    }
}

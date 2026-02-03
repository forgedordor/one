package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class autr implements autn {
    private static final cqce a = cqce.g("BugleCmsFolsom", "CmsUserEncryptionEligibilityCheckerImpl");
    private final fcsu b;
    private final Optional c;
    private final aurx d;
    private final cpgl e;

    public autr(fdjx fdjxVar, cpgn cpgnVar, fcsu fcsuVar, Optional optional, aurx aurxVar) {
        fdjxVar.getClass();
        cpgnVar.getClass();
        fcsuVar.getClass();
        aurxVar.getClass();
        this.b = fcsuVar;
        this.c = optional;
        this.d = aurxVar;
        this.e = cpgnVar.a(cpgm.c);
    }

    private final void d(ausn ausnVar) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.A("UserEncryptionEligibility", ausnVar.name());
        cqbdVarC.I(ausnVar == ausn.g ? "Device is eligible for user encrypted backup." : "Device is not eligible for user encrypted backup.");
        cqbdVarC.r();
        e(ausnVar);
    }

    private final void e(ausn ausnVar) {
        ((ains) this.b.b()).e("Bugle.Cms.Folsom.KeyManager.Eligibility.Count", ausnVar.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.autn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.auto
            if (r0 == 0) goto L13
            r0 = r5
            auto r0 = (defpackage.auto) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            auto r0 = new auto
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            if (r2 == 0) goto L38
            r0 = 1
            if (r2 == r0) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r5)
            return r5
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            defpackage.fctl.b(r5)
            ausn r5 = (defpackage.ausn) r5
            return r5
        L38:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.autr.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        if (r10 != r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0 A[Catch: dcff -> 0x0034, TRY_ENTER, TryCatch #0 {dcff -> 0x0034, blocks: (B:14:0x002f, B:51:0x00c0, B:93:0x0122, B:97:0x012b, B:98:0x0143, B:108:0x0160, B:112:0x016d, B:90:0x011a, B:95:0x0126, B:85:0x010e, B:80:0x0103, B:75:0x00f7, B:96:0x0129, B:70:0x00ed, B:64:0x00df, B:66:0x00e5, B:59:0x00d2, B:61:0x00d8, B:54:0x00c5, B:56:0x00cb, B:49:0x00b0), top: B:122:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.autr.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.autq
            if (r0 == 0) goto L13
            r0 = r5
            autq r0 = (defpackage.autq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            autq r0 = new autq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            aurx r5 = r4.d
            eiju r5 = r5.q()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.autr.c(fcxy):java.lang.Object");
    }
}

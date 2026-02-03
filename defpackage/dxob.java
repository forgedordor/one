package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxob implements dxml {
    private static final eksp b = eksp.c("GnpSdk");
    public final long a;
    private final fcsu c;
    private final dxgy d;
    private final dxmn e;
    private final String f;
    private final dxpd g;

    public dxob(fcsu fcsuVar, dxgy dxgyVar, dxpd dxpdVar, dxmn dxmnVar) {
        fcsuVar.getClass();
        dxmnVar.getClass();
        this.c = fcsuVar;
        this.d = dxgyVar;
        this.g = dxpdVar;
        this.e = dxmnVar;
        this.f = "GNP_PERIODIC_REGISTRATION";
        this.a = ((dxgw) dxgyVar).g * 86400 * 1000;
    }

    @Override // defpackage.dxml
    public final int a() {
        return 17;
    }

    @Override // defpackage.dxml
    public final long b() {
        return this.a;
    }

    @Override // defpackage.dxml
    public final Long c() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r6.b(17, r5) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dxml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.os.Bundle r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r6 instanceof defpackage.dxoa
            if (r5 == 0) goto L13
            r5 = r6
            dxoa r5 = (defpackage.dxoa) r5
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.c = r0
            goto L18
        L13:
            dxoa r5 = new dxoa
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L36
            if (r1 == r2) goto L32
            if (r1 != r3) goto L2a
            defpackage.fctl.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.fctl.b(r6)
            goto L76
        L36:
            defpackage.fctl.b(r6)
            eksp r6 = defpackage.dxob.b
            ekrw r6 = r6.o()
            java.lang.String r1 = "Executing GnpPeriodicRegistrationJob"
            r6.q(r1)
            dxpd r6 = r4.g
            int r6 = r6.f()
            if (r6 != r3) goto L69
            dxgy r6 = r4.d
            dxgw r6 = (defpackage.dxgw) r6
            int r6 = r6.g
            if (r6 != 0) goto L55
            goto L69
        L55:
            fcsu r6 = r4.c
            java.lang.Object r6 = r6.b()
            dxvy r6 = (defpackage.dxvy) r6
            evjz r1 = defpackage.evjz.PERIODIC_REGISTRATION
            r5.c = r3
            java.lang.Object r5 = defpackage.dxvx.a(r6, r1, r5)
            if (r5 != r0) goto L68
            goto L75
        L68:
            return r5
        L69:
            dxmn r6 = r4.e
            r5.c = r2
            r1 = 17
            java.lang.Object r5 = defpackage.dxmm.a(r6, r1, r5)
            if (r5 != r0) goto L76
        L75:
            return r0
        L76:
            dxfx r5 = new dxfx
            fctx r6 = defpackage.fctx.a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxob.d(android.os.Bundle, fcxy):java.lang.Object");
    }

    @Override // defpackage.dxml
    public final String e() {
        return this.f;
    }

    @Override // defpackage.dxml
    public final boolean f() {
        return true;
    }

    @Override // defpackage.dxml
    public final boolean g() {
        return true;
    }

    @Override // defpackage.dxml
    public final int h() {
        return 1;
    }
}

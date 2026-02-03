package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chmt implements chmd {
    public static final String a = new String();
    public final ecjh b;
    public final eosd c;
    private final fcyh d;

    public chmt(ecjh ecjhVar, eosd eosdVar, fcyh fcyhVar) {
        ecjhVar.getClass();
        eosdVar.getClass();
        fcyhVar.getClass();
        this.b = ecjhVar;
        this.c = eosdVar;
        this.d = fcyhVar;
    }

    @Override // defpackage.chmd
    public final Object a(String str, String str2, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new chme(null, this, str, str2), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chmd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.chmh
            if (r0 == 0) goto L13
            r0 = r6
            chmh r0 = (defpackage.chmh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chmh r0 = new chmh
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.d
            fcyh r6 = defpackage.eicg.a(r6)
            chmg r2 = new chmg
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chmt.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.chmd
    public final Object c(fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new chmi(null, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.chmd
    public final Object d(fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new chmk(null, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.chmd
    public final Object e(String str, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new chmm(null, this, str), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.chmd
    public final Object f(evvp evvpVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new chmp(null, this, evvpVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.chmd
    public final Object g(String str, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new chmr(null, this, str), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addx implements addt {
    public final efwo a;
    public final egbf b;
    public final egej c;
    private final fdjx d;
    private final fcyh e;
    private final fdkf f;
    private final fdkf g;

    public addx(efwo efwoVar, egbf egbfVar, egej egejVar, fdjx fdjxVar, fcyh fcyhVar) {
        efwoVar.getClass();
        egbfVar.getClass();
        egejVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        this.a = efwoVar;
        this.b = egbfVar;
        this.c = egejVar;
        this.d = fdjxVar;
        this.e = fcyhVar;
        fdjz fdjzVar = fdjz.a;
        this.f = fdin.b(fdjxVar, eicg.a(fcyhVar), fdjzVar, new addv(null, this));
        this.g = fdin.b(fdjxVar, eicg.a(fcyhVar), fdjzVar, new addw(null, this));
    }

    @Override // defpackage.addt
    public final Object a(fcxy fcxyVar) {
        return this.f.c(fcxyVar);
    }

    @Override // defpackage.addt
    public final Object b(fcxy fcxyVar) {
        return this.g.c(fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.addt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.addu
            if (r0 == 0) goto L13
            r0 = r5
            addu r0 = (defpackage.addu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            addu r0 = new addu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 == r1) goto L52
        L3a:
            egbs r5 = (defpackage.egbs) r5
            r0 = 0
            if (r5 == 0) goto L4c
            java.lang.String r5 = r5.k
            if (r5 == 0) goto L4c
            java.lang.String r1 = "pseudonymous"
            boolean r5 = defpackage.fdbq.f(r5, r1)
            if (r5 != 0) goto L4c
            goto L4d
        L4c:
            r3 = r0
        L4d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.addx.c(fcxy):java.lang.Object");
    }
}

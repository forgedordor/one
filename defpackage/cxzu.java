package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzu extends fcyz implements fdap {
    int a;
    final /* synthetic */ cxze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxzu(cxze cxzeVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cxzeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r4 == r0) goto L16;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L3f
        Ld:
            cxze r4 = r3.b
            r3.a = r2
            fdkf r4 = r4.e
            java.lang.Object r4 = r4.c(r3)
            if (r4 == r0) goto L4f
        L19:
            cpmc r4 = (defpackage.cpmc) r4
            evrw r1 = defpackage.evrw.a
            evsf r1 = r1.createBuilder()
            evrv r1 = (defpackage.evrv) r1
            java.lang.String r2 = "create_time"
            r1.a(r2)
            evsn r1 = r1.build()
            evrw r1 = (defpackage.evrw) r1
            eiju r4 = r4.k(r1)
            r4.getClass()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 != r0) goto L3f
            goto L4f
        L3f:
            eqiz r4 = (defpackage.eqiz) r4
            evvp r4 = r4.h
            if (r4 != 0) goto L47
            evvp r4 = defpackage.evvp.a
        L47:
            r4.getClass()
            j$.time.Instant r4 = defpackage.evxd.d(r4)
            return r4
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxzu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cxzu(this.b, (fcxy) obj).b(fctx.a);
    }
}

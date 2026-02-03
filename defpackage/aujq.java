package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aujq extends fcyz implements fdat {
    int a;
    final /* synthetic */ aujs b;
    final /* synthetic */ aujk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aujq(fcxy fcxyVar, aujs aujsVar, aujk aujkVar) {
        super(2, fcxyVar);
        this.b = aujsVar;
        this.c = aujkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aujq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (defpackage.fdxs.c(r5, r4) == r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)     // Catch: java.lang.Throwable -> L11
            goto L5b
        Ld:
            defpackage.fctl.b(r5)     // Catch: java.lang.Throwable -> L11
            goto L46
        L11:
            r5 = move-exception
            goto L69
        L13:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.d
            fdjx r5 = (defpackage.fdjx) r5
            aujk r5 = r4.c
            boolean r1 = r5 instanceof defpackage.aujp
            if (r1 == 0) goto L93
            aujp r5 = (defpackage.aujp) r5
            aubq r5 = r5.a
            java.lang.String r1 = r5.d
            r1.getClass()
            int r1 = r1.length()
            if (r1 <= 0) goto L8b
            aujs r1 = r4.b     // Catch: java.lang.Throwable -> L11
            cejj r1 = r1.c     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = r5.d     // Catch: java.lang.Throwable -> L11
            r3 = 5
            eiju r5 = r1.e(r5, r3)     // Catch: java.lang.Throwable -> L11
            r5.getClass()     // Catch: java.lang.Throwable -> L11
            r4.a = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)     // Catch: java.lang.Throwable -> L11
            if (r5 != r0) goto L46
            goto L5a
        L46:
            cejg r5 = (defpackage.cejg) r5     // Catch: java.lang.Throwable -> L11
            cedo r1 = defpackage.cedo.FORCE_REFRESH     // Catch: java.lang.Throwable -> L11
            eiju r5 = r5.m(r1)     // Catch: java.lang.Throwable -> L11
            r5.getClass()     // Catch: java.lang.Throwable -> L11
            r1 = 2
            r4.a = r1     // Catch: java.lang.Throwable -> L11
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)     // Catch: java.lang.Throwable -> L11
            if (r5 != r0) goto L5b
        L5a:
            return r0
        L5b:
            eksp r5 = defpackage.aujs.a     // Catch: java.lang.Throwable -> L11
            ekrw r5 = r5.n()     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = "Recovering by register refresh succeeds."
            r5.q(r0)     // Catch: java.lang.Throwable -> L11
            aujh r5 = defpackage.aujh.a     // Catch: java.lang.Throwable -> L11
            return r5
        L69:
            boolean r0 = defpackage.cems.d(r5)
            if (r0 == 0) goto L7d
            eksp r0 = defpackage.aujs.a
            ekrw r0 = r0.j()
            java.lang.String r1 = "Recovering by register refresh but fails with a transient error."
            defpackage.a.N(r0, r1, r5)
            aujh r5 = defpackage.aujh.c
            goto L8a
        L7d:
            eksp r0 = defpackage.aujs.a
            ekrw r0 = r0.j()
            java.lang.String r1 = "Recovering by register refresh but fails with a permanent error."
            defpackage.a.N(r0, r1, r5)
            aujh r5 = defpackage.aujh.d
        L8a:
            return r5
        L8b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Recovering by register refresh but empty chat endpoint is found."
            r5.<init>(r0)
            throw r5
        L93:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aujq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aujq aujqVar = new aujq(fcxyVar, this.b, this.c);
        aujqVar.d = obj;
        return aujqVar;
    }
}

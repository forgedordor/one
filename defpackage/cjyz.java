package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjyz extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cjzf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjyz(cjzf cjzfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cjzfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjyz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r7 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r1 = r6.a
            defpackage.fctl.b(r7)
            goto L47
        Lf:
            defpackage.fctl.b(r7)
            goto L41
        L13:
            defpackage.fctl.b(r7)
            ekrg r7 = defpackage.cjzf.a
            ekrw r7 = r7.e()
            r1 = 313(0x139, float:4.39E-43)
            java.lang.String r3 = "CarrierTosDataServiceImpl.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/rcsdata/carriertos/CarrierTosDataServiceImpl$resetCarrierTosConsentForAllSimsFuture$1"
            java.lang.String r5 = "invokeSuspend"
            ekrw r7 = r7.h(r4, r5, r1, r3)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r1 = "Resetting explicit carrier tos consent all sims"
            r7.q(r1)
            cjzf r7 = r6.c
            fcsu r7 = r7.f
            java.lang.Object r7 = r7.b()
            cmlb r7 = (defpackage.cmlb) r7
            r6.b = r2
            java.lang.Object r7 = r7.t()
            if (r7 == r0) goto L63
        L41:
            java.util.Set r7 = (java.util.Set) r7
            java.util.Iterator r1 = r7.iterator()
        L47:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L61
            java.lang.Object r7 = r1.next()
            dggn r7 = (defpackage.dggn) r7
            cjzf r2 = r6.c
            r6.a = r1
            r3 = 2
            r6.b = r3
            java.lang.Object r7 = r2.o(r7, r6)
            if (r7 != r0) goto L47
            goto L63
        L61:
            r7 = 0
            return r7
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjyz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjyz(this.c, fcxyVar);
    }
}

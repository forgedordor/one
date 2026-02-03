package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class davd extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dave e;
    final /* synthetic */ egbe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public davd(dave daveVar, egbe egbeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = daveVar;
        this.f = egbeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((davd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L13
            java.lang.Object r0 = r6.c
            java.lang.Object r1 = r6.b
            java.lang.Object r2 = r6.a
            defpackage.fctl.b(r7)
            goto L71
        L13:
            java.lang.Object r1 = r6.b
            java.lang.Object r2 = r6.a
            defpackage.fctl.b(r7)
            goto L4f
        L1b:
            defpackage.fctl.b(r7)
            dave r7 = r6.e
            egbe r1 = r6.f
            fcsu r3 = r7.c
            java.lang.Object r3 = r3.b()
            askd r3 = (defpackage.askd) r3
            boolean r3 = r3.a()
            fduf r4 = r7.d
            if (r3 == 0) goto L52
            fcsu r7 = r7.b
            java.lang.Object r7 = r7.b()
            egej r7 = (defpackage.egej) r7
            efwo r3 = r1.a()
            com.google.common.util.concurrent.ListenableFuture r7 = r7.a(r3)
            r6.a = r4
            r6.b = r1
            r6.d = r2
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 == r0) goto L86
            r2 = r4
        L4f:
            android.accounts.Account r7 = (android.accounts.Account) r7
            goto L54
        L52:
            r7 = 0
            r2 = r4
        L54:
            dave r3 = r6.e
            fcsu r3 = r3.a
            java.lang.Object r3 = r3.b()
            dauv r3 = (defpackage.dauv) r3
            egbe r4 = r6.f
            r6.a = r2
            r6.b = r1
            r6.c = r7
            r5 = 2
            r6.d = r5
            java.lang.Object r3 = r3.a(r4, r6)
            if (r3 == r0) goto L86
            r0 = r7
            r7 = r3
        L71:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            dauy r3 = new dauy
            egbe r1 = (defpackage.egbe) r1
            android.accounts.Account r0 = (android.accounts.Account) r0
            r3.<init>(r1, r0, r7)
            r2.f(r3)
            fctx r7 = defpackage.fctx.a
            return r7
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.davd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new davd(this.e, this.f, fcxyVar);
    }
}

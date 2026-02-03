package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afgr implements afgn {
    private final fcsu a;
    private final fcsu b;
    private final fdjx c;

    public afgr(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, cogw cogwVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        cogwVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fdjxVar;
    }

    @Override // defpackage.afgn
    public final eiju a(efwo efwoVar) {
        return auvw.c(this.c, fcyi.a, fdjz.a, new afgp(this, efwoVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.efwo r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.afgo
            if (r0 == 0) goto L13
            r0 = r7
            afgo r0 = (defpackage.afgo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afgo r0 = new afgo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.fctl.b(r7)
            goto L3e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.fctl.b(r7)
            if (r6 == 0) goto L46
            r0.c = r4
            java.lang.Object r7 = r5.c(r6, r0)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L55
        L46:
            fcsu r6 = r5.b
            java.lang.Object r6 = r6.b()
            crqx r6 = (defpackage.crqx) r6
            boolean r6 = r6.e()
            if (r6 == 0) goto L55
            r3 = r4
        L55:
            fcsu r6 = r5.b
            java.lang.Object r6 = r6.b()
            crqx r6 = (defpackage.crqx) r6
            boolean r6 = r6.i(r3)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgr.b(efwo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.efwo r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.afgq
            if (r0 == 0) goto L13
            r0 = r6
            afgq r0 = (defpackage.afgq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afgq r0 = new afgq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.a
            java.lang.Object r6 = r6.b()
            abzv r6 = (defpackage.abzv) r6
            etfr r2 = defpackage.etfx.a
            java.lang.String r2 = r2.a
            eiju r5 = r6.a(r5, r2)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L5b
        L4a:
            abzu r6 = (defpackage.abzu) r6
            abzu r5 = defpackage.abzu.YES
            if (r6 == r5) goto L56
            abzu r5 = defpackage.abzu.SKIPPED_PSEUDONYMOUS_ACCOUNT
            if (r6 != r5) goto L55
            goto L56
        L55:
            r3 = 0
        L56:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgr.c(efwo, fcxy):java.lang.Object");
    }
}

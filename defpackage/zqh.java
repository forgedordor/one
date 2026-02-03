package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqh implements zqe, vwm {
    private final ajmh a;
    private final fdjx b;
    private final fdue c;
    private final fduj d;

    public zqh(ajmh ajmhVar, fdjx fdjxVar) {
        ajmhVar.getClass();
        fdjxVar.getClass();
        this.a = ajmhVar;
        this.b = fdjxVar;
        fdue fdueVarE = fdun.e(1, 0, 2, 2);
        this.c = fdueVarE;
        this.d = fdueVarE;
    }

    @Override // defpackage.vwm
    public final void a(vvw vvwVar) {
        auvw.k(this.b, null, null, new zqf(this, null), 3);
    }

    @Override // defpackage.zqe
    public final Object b(int i, fcxy fcxyVar) {
        Object objFO = this.c.fO(new Integer(i), fcxyVar);
        return objFO == fcyl.a ? objFO : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r6.fO(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.zqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.MessageId r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.zqg
            if (r0 == 0) goto L13
            r0 = r7
            zqg r0 = (defpackage.zqg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zqg r0 = new zqg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4e
        L36:
            defpackage.fctl.b(r7)
            ajmh r7 = r5.a
            ajma r7 = r7.e()
            eiju r6 = r7.d(r6)
            r6.getClass()
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L61
        L4e:
            fdue r6 = r5.c
            java.lang.Integer r7 = (java.lang.Integer) r7
            r7.getClass()
            r0.c = r3
            java.lang.Object r6 = r6.fO(r7, r0)
            if (r6 != r1) goto L5e
            goto L61
        L5e:
            fctx r6 = defpackage.fctx.a
            return r6
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqh.c(com.google.android.apps.messaging.shared.api.messaging.MessageId, fcxy):java.lang.Object");
    }

    @Override // defpackage.zqe
    public final fduj d() {
        return this.d;
    }
}

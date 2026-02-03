package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajcb implements ajbu {
    public final lkb a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fcsu f;

    public ajcb(fdjx fdjxVar, lkb lkbVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        lkbVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.e = fdjxVar;
        this.a = lkbVar;
        this.f = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ajbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ajbw
            if (r0 == 0) goto L13
            r0 = r8
            ajbw r0 = (defpackage.ajbw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajbw r0 = new ajbw
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.Integer r0 = r0.d
            defpackage.fctl.b(r8)
            goto L6e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.fctl.b(r8)
            goto L53
        L39:
            defpackage.fctl.b(r8)
            fdjx r8 = r7.e
            fcyh r8 = r8.hE()
            fcyh r8 = defpackage.eicg.a(r8)
            ajbv r2 = new ajbv
            r2.<init>(r3, r7)
            r0.c = r5
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 == r1) goto L92
        L53:
            fcsu r2 = r7.f
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r2 = r2.b()
            egbf r2 = (defpackage.egbf) r2
            com.google.common.util.concurrent.ListenableFuture r2 = r2.e()
            r0.d = r8
            r0.c = r4
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto L92
            r6 = r0
            r0 = r8
            r8 = r6
        L6e:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L77:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r8.next()
            r2 = r1
            efwo r2 = (defpackage.efwo) r2
            int r2 = r2.a()
            if (r0 == 0) goto L77
            int r4 = r0.intValue()
            if (r2 != r4) goto L77
            return r1
        L91:
            return r3
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcb.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.ajbu
    public final void b(efwo efwoVar) {
        auvw.k(this.e, null, null, new ajca(this, efwoVar, null), 3);
    }

    @Override // defpackage.ajbu
    public final void c() {
        auvw.k(this.e, null, null, new ajby(this, null), 3);
    }
}

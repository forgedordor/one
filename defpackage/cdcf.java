package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdcf implements cdbt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/fcm/impl/GaiaDittoPingRefreshHandler");
    public final eygg b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;
    private final fcyh f;
    private final fdjx g;

    /* compiled from: PG */
    public interface a {
        fcsu hG();
    }

    public cdcf(fcsu fcsuVar, eygg eyggVar, fcsu fcsuVar2, fcsu fcsuVar3, fcyh fcyhVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        eyggVar.getClass();
        fcsuVar2.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.e = fcsuVar;
        this.b = eyggVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.f = fcyhVar;
        this.g = fdjxVar;
    }

    @Override // defpackage.cdbt
    public final eiju a() {
        return auvw.c(this.g, fcyi.a, fdjz.a, new cdci(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cdch
            if (r0 == 0) goto L13
            r0 = r6
            cdch r0 = (defpackage.cdch) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdch r0 = new cdch
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
            fcyh r6 = r5.f
            fcyh r6 = defpackage.eicg.a(r6)
            cdcg r2 = new cdcg
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdcf.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.efwo r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cdcj
            if (r0 == 0) goto L13
            r0 = r6
            cdcj r0 = (defpackage.cdcj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdcj r0 = new cdcj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L5e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.e
            java.lang.Object r6 = r6.b()
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Class<cdcf$a> r2 = cdcf.a.class
            java.lang.Object r5 = defpackage.ehlh.a(r6, r2, r5)
            cdcf$a r5 = (cdcf.a) r5
            fcsu r5 = r5.hG()
            java.lang.Object r5 = r5.b()
            ceff r5 = (defpackage.ceff) r5
            cedo r6 = defpackage.cedo.FORCE_REFRESH
            eiju r5 = r5.m(r6)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdcf.c(efwo, fcxy):java.lang.Object");
    }
}

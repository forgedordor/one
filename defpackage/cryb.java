package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cryb {
    private static final cczi a = cdag.h(cdag.b, "enable_spam_clearcut_logging", true);
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final cogw e;
    private final fdjx f;

    public cryb(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cogwVar.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = cogwVar;
        this.f = fdjxVar;
    }

    private static final long c(long j) {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.eoeb r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.crya
            if (r0 == 0) goto L13
            r0 = r6
            crya r0 = (defpackage.crya) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crya r0 = new crya
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            eoeb r5 = r0.d
            defpackage.fctl.b(r6)
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            cczi r6 = defpackage.cryb.a
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L9a
            fcsu r6 = r4.d
            java.lang.Object r6 = r6.b()
            aisn r6 = (defpackage.aisn) r6
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5e
            goto L9a
        L5e:
            fcsu r6 = r4.c
            java.lang.Object r6 = r6.b()
            dbyl r6 = (defpackage.dbyl) r6
            fcsu r0 = r4.b
            java.lang.Object r0 = r0.b()
            android.content.Context r0 = (android.content.Context) r0
            eoec r1 = new eoec
            r1.<init>()
            dbzz r0 = defpackage.dqnz.b(r0, r1)
            dbyk r5 = r6.k(r5, r0)
            cogw r6 = r4.e
            j$.time.Instant r0 = r6.f()
            long r0 = r0.toEpochMilli()
            long r0 = c(r0)
            long r2 = r6.a()
            long r2 = c(r2)
            r5.k(r0, r2)
            r5.c()
            fctx r5 = defpackage.fctx.a
            return r5
        L9a:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cryb.a(eoeb, fcxy):java.lang.Object");
    }

    public final void b(eoeb eoebVar) {
        auvw.k(this.f, null, null, new crxz(this, eoebVar, null), 3);
    }
}

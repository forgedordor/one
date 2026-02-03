package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteGaiaTachyonTickleHandlerOverride");
    public final abfq b;
    public final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public abfd(fcsu fcsuVar, abfq abfqVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        abfqVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.d = fcsuVar;
        this.b = abfqVar;
        this.e = fcsuVar2;
        this.c = fcsuVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.abfb
            if (r0 == 0) goto L13
            r0 = r10
            abfb r0 = (defpackage.abfb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abfb r0 = new abfb
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "shouldHandleTickle"
            java.lang.String r5 = "com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteGaiaTachyonTickleHandlerOverride"
            java.lang.String r6 = "DittoSatellite"
            r7 = 1
            java.lang.String r8 = "SatelliteGaiaTachyonTickleHandlerOverride.kt"
            if (r2 == 0) goto L38
            if (r2 != r7) goto L30
            defpackage.fctl.b(r10)
            goto L89
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            defpackage.fctl.b(r10)
            fcsu r10 = r9.d
            java.lang.Object r2 = r10.b()
            abjz r2 = (defpackage.abjz) r2
            boolean r2 = r2.b()
            if (r2 == 0) goto L66
            ekrg r10 = defpackage.abfd.a
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r6)
            r0 = 36
            ekrw r10 = r10.h(r5, r4, r0, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Is wifi-only device, should handle GAIA FCM tickle"
            r10.q(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            return r10
        L66:
            java.lang.Object r10 = r10.b()
            abjz r10 = (defpackage.abjz) r10
            boolean r10 = r10.a()
            if (r10 == 0) goto Lb2
            fcsu r10 = r9.e
            java.lang.Object r10 = r10.b()
            abgm r10 = (defpackage.abgm) r10
            eiju r10 = r10.b()
            r10.getClass()
            r0.c = r7
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)
            if (r10 == r1) goto Lb1
        L89:
            abgx r10 = (defpackage.abgx) r10
            abgx r0 = defpackage.abgx.REMOTE
            if (r10 != r0) goto Lac
            ekrg r10 = defpackage.abfd.a
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r6)
            r0 = 43
            ekrw r10 = r10.h(r5, r4, r0, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Satellite is in Remote Mode, should handle GAIA FCM tickle"
            r10.q(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            return r10
        Lac:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        Lb1:
            return r1
        Lb2:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abfd.a(fcxy):java.lang.Object");
    }
}

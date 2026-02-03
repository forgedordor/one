package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tna implements tnq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/cloudstore/cmsrpc/deviceonboarding/CancelPairingDelegate");
    private final fdjx b;
    private final fcsu c;
    private final cecr d;

    public tna(fdjx fdjxVar, fcsu fcsuVar, cecr cecrVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        cecrVar.getClass();
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = cecrVar;
    }

    @Override // defpackage.tnq
    public final eiju a(String str, long j, evqs evqsVar, epms epmsVar) {
        return auvw.c(this.b, fcyi.a, fdjz.a, new tmz(epmsVar, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.epna r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.tmy
            if (r0 == 0) goto L13
            r0 = r9
            tmy r0 = (defpackage.tmy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tmy r0 = new tmy
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r9)
            goto Lb8
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.fctl.b(r9)
            java.lang.String r8 = r8.b
            cecr r9 = r7.d
            java.util.concurrent.atomic.AtomicReference r9 = r9.a
            java.lang.Object r9 = r9.get()
            boolean r8 = defpackage.fdbq.f(r8, r9)
            java.lang.String r9 = "getCancelPairingResponse"
            java.lang.String r2 = "com/google/android/apps/messaging/cloudstore/cmsrpc/deviceonboarding/CancelPairingDelegate"
            java.lang.String r4 = "BugleAlphaverse"
            java.lang.String r5 = "CancelPairingDelegate.kt"
            if (r8 != 0) goto L89
            ekrg r8 = defpackage.tna.a
            ekrw r8 = r8.h()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r4)
            r0 = 67
            ekrw r8 = r8.h(r2, r9, r0, r5)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r9 = "Pairing attempt id doesn't match. Ignore cancel pairing request."
            r8.q(r9)
            epms r8 = defpackage.epms.a
            evsf r8 = r8.createBuilder()
            epmq r8 = (defpackage.epmq) r8
            r8.getClass()
            epnc r9 = defpackage.epnc.a
            evsf r9 = r9.createBuilder()
            epnb r9 = (defpackage.epnb) r9
            r9.getClass()
            r0 = 0
            defpackage.epnd.b(r0, r9)
            epnc r9 = defpackage.epnd.a(r9)
            defpackage.epmt.b(r9, r8)
            epms r8 = defpackage.epmt.a(r8)
            return r8
        L89:
            ekrg r8 = defpackage.tna.a
            ekrw r8 = r8.e()
            ekrz r6 = defpackage.eksq.a
            r8.X(r6, r4)
            r4 = 72
            ekrw r8 = r8.h(r2, r9, r4, r5)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r9 = "Cancel gaia pairing."
            r8.q(r9)
            fcsu r8 = r7.c
            java.lang.Object r8 = r8.b()
            bvqv r8 = (defpackage.bvqv) r8
            bvqq r9 = defpackage.bvqq.ERROR_USER_CANCELED_VERIFICATION_FROM_DITTO
            eiju r8 = r8.g(r9)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 != r1) goto Lb8
            return r1
        Lb8:
            epms r8 = defpackage.epms.a
            evsf r8 = r8.createBuilder()
            epmq r8 = (defpackage.epmq) r8
            r8.getClass()
            epnc r9 = defpackage.epnc.a
            evsf r9 = r9.createBuilder()
            epnb r9 = (defpackage.epnb) r9
            r9.getClass()
            defpackage.epnd.b(r3, r9)
            epnc r9 = defpackage.epnd.a(r9)
            defpackage.epmt.b(r9, r8)
            epms r8 = defpackage.epmt.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tna.b(epna, fcxy):java.lang.Object");
    }
}

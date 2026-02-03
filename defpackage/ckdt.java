package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdt implements ckdw {
    private final fcyh a;
    private final cogw b;

    public ckdt(fcyh fcyhVar, cogw cogwVar) {
        fcyhVar.getClass();
        cogwVar.getClass();
        this.a = fcyhVar;
        this.b = cogwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.MessageId r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ckdr
            if (r0 == 0) goto L13
            r0 = r7
            ckdr r0 = (defpackage.ckdr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckdr r0 = new ckdr
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
            goto L52
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.fctl.b(r7)
            r6.getClass()
            amgc r6 = (defpackage.amgc) r6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6 = r6.c()
            r6.getClass()
            r0.c = r4
            fcyh r7 = r5.a
            fcyh r7 = defpackage.eicg.a(r7)
            ckdo r2 = new ckdo
            r2.<init>(r3, r6)
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 == r1) goto L62
        L52:
            j$.time.Instant r7 = (j$.time.Instant) r7
            if (r7 == 0) goto L61
            cogw r6 = r5.b
            j$.time.Instant r6 = r6.f()
            j$.time.Duration r6 = j$.time.Duration.between(r7, r6)
            return r6
        L61:
            return r3
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckdt.a(com.google.android.apps.messaging.shared.api.messaging.MessageId, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ckdw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ckdu r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ckds
            if (r0 == 0) goto L13
            r0 = r6
            ckds r0 = (defpackage.ckds) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckds r0 = new ckds
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r5.a
            r0.c = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 == r1) goto L7a
        L3c:
            j$.time.Duration r6 = (j$.time.Duration) r6
            if (r6 != 0) goto L42
            j$.time.Duration r6 = j$.time.Duration.ZERO
        L42:
            emvw r5 = defpackage.emvw.a
            evsf r5 = r5.createBuilder()
            emvv r5 = (defpackage.emvv) r5
            r5.getClass()
            defpackage.enui.b(r3, r5)
            r6.getClass()
            evrj r6 = defpackage.evxd.a(r6)
            defpackage.enui.c(r6, r5)
            emvy r6 = defpackage.emvy.a
            evsf r6 = r6.createBuilder()
            emvx r6 = (defpackage.emvx) r6
            r6.getClass()
            defpackage.enuj.c(r3, r6)
            defpackage.enuj.b(r3, r6)
            defpackage.enuj.d(r3, r6)
            emvy r6 = defpackage.enuj.a(r6)
            defpackage.enui.d(r6, r5)
            emvw r5 = defpackage.enui.a(r5)
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckdt.b(ckdu, fcxy):java.lang.Object");
    }
}

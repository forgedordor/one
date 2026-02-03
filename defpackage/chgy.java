package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chgy implements cgxk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/rcs/send/report/SendRcsReportMlsSigningInterceptor");
    private final fcsu b;
    private final fcsu c;
    private final cgxm d;

    public chgy(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar3;
        this.d = new cgxm("SendRcsReportMlsSigningInterceptor");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.chhb r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof defpackage.chgx
            if (r7 == 0) goto L13
            r7 = r8
            chgx r7 = (defpackage.chgx) r7
            int r0 = r7.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.c = r0
            goto L18
        L13:
            chgx r7 = new chgx
            r7.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r7.a
            int r7 = r7.c
            java.lang.String r0 = "execute"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/pipeline/rcs/send/report/SendRcsReportMlsSigningInterceptor"
            java.lang.String r2 = "BugleSending"
            java.lang.String r3 = "SendRcsReportMlsSigningInterceptor.kt"
            if (r7 == 0) goto L83
            r4 = 1
            r5 = 0
            if (r7 == r4) goto L4d
            r4 = 2
            if (r7 == r4) goto L47
            r4 = 3
            if (r7 == r4) goto L41
            r4 = 4
            if (r7 == r4) goto L3b
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            defpackage.fctl.b(r8)     // Catch: defpackage.ccsn -> L6f
            eyga r8 = (defpackage.eyga) r8     // Catch: defpackage.ccsn -> L6f
            goto L4c
        L41:
            defpackage.fctl.b(r8)     // Catch: defpackage.ccsn -> L6f
            asrg r8 = (defpackage.asrg) r8     // Catch: defpackage.ccsn -> L6f
            throw r5     // Catch: defpackage.ccsn -> L6f
        L47:
            defpackage.fctl.b(r8)     // Catch: defpackage.ccsn -> L6f
            eyga r8 = (defpackage.eyga) r8     // Catch: defpackage.ccsn -> L6f
        L4c:
            throw r5
        L4d:
            defpackage.fctl.b(r8)
            if (r8 != 0) goto L5a
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        L5a:
            alqm r8 = (defpackage.alqm) r8
            j$.util.Optional r7 = r8.e()
            java.lang.Object r7 = r7.get()
            aubq r7 = (defpackage.aubq) r7
            fcsu r7 = r6.b     // Catch: defpackage.ccsn -> L6f
            java.lang.Object r7 = r7.b()     // Catch: defpackage.ccsn -> L6f
            ccso r7 = (defpackage.ccso) r7     // Catch: defpackage.ccsn -> L6f
            throw r5     // Catch: defpackage.ccsn -> L6f
        L6f:
            ekrg r7 = defpackage.chgy.a
            ekrw r7 = r7.j()
            ekrz r8 = defpackage.eksq.a
            r7.X(r8, r2)
            r8 = 104(0x68, float:1.46E-43)
            ekrw r7 = r7.h(r1, r0, r8, r3)
            ekrd r7 = (defpackage.ekrd) r7
            throw r5
        L83:
            defpackage.fctl.b(r8)
            fcsu r7 = r6.c
            java.lang.Object r7 = r7.b()
            apwn r7 = (defpackage.apwn) r7
            ekrg r7 = defpackage.chgy.a
            ekrw r7 = r7.g()
            ekrz r8 = defpackage.eksq.a
            r7.X(r8, r2)
            r8 = 47
            ekrw r7 = r7.h(r1, r0, r8, r3)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "SendRcsReportMlsSigningInterceptor skipping because no MLS"
            r7.q(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chgy.b(chhb, fcxy):void");
    }

    @Override // defpackage.cgxk
    public final /* bridge */ /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chhb chhbVar = (chhb) obj;
        b(chhbVar, fcxyVar);
        return chhbVar;
    }
}

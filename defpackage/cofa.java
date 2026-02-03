package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cofa extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler");
    public final cogi b;
    public final fcsu c;
    private final fdjx d;
    private final fcsu e;

    public cofa(fdjx fdjxVar, cogi cogiVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.d = fdjxVar;
        this.b = cogiVar;
        this.c = fcsuVar;
        this.e = fcsuVar2;
    }

    private static final cbcw m(String str, fdae fdaeVar) {
        try {
            fdaeVar.invoke();
            return cbcw.i();
        } catch (coer e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleTelephony");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler", "runTelephonyDatabaseUpdateWork", 132, "TelephonyDatabaseUpdateWorkItemHandler.kt")).t("Telephony Database update failed due to insufficient permissions. Cancelling work: %s", str);
            return cbcw.k();
        } catch (Exception e2) {
            ekrw ekrwVarJ2 = a.j();
            ekrwVarJ2.X(eksq.a, "BugleTelephony");
            ((ekrd) ((ekrd) ekrwVarJ2).g(e2).h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler", "runTelephonyDatabaseUpdateWork", 141, "TelephonyDatabaseUpdateWorkItemHandler.kt")).t("Telephony Database update failed. Scheduling retry for work: %s", str);
            return cbcw.m();
        }
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(1);
        caxzVarL.f(pza.b);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("TelephonyDatabaseUpdateWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = ewtf.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ewtf ewtfVar = (ewtf) evuhVar;
        ewtfVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new coez(ewtfVar, this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (r9.d(r2) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler"
            java.lang.String r1 = "BugleTelephony"
            boolean r2 = r9 instanceof defpackage.coex
            java.lang.String r3 = "TelephonyDatabaseUpdateWorkItemHandler.kt"
            if (r2 == 0) goto L19
            r2 = r9
            coex r2 = (defpackage.coex) r2
            int r4 = r2.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r2.c = r4
            goto L1e
        L19:
            coex r2 = new coex
            r2.<init>(r8, r9)
        L1e:
            java.lang.Object r9 = r2.a
            fcyl r4 = defpackage.fcyl.a
            int r5 = r2.c
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L3e
            if (r5 == r7) goto L38
            if (r5 != r6) goto L30
            defpackage.fctl.b(r9)
            goto L90
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            caxq r0 = r2.d
            defpackage.fctl.b(r9)
            return r0
        L3e:
            defpackage.fctl.b(r9)
            fcsu r9 = r8.e
            java.lang.Object r9 = r9.b()
            asfe r9 = (defpackage.asfe) r9
            boolean r9 = r9.a()
            java.lang.String r5 = "attemptTextPartCharsetUpdate"
            if (r9 == 0) goto L7a
            coev r9 = new coev
            r9.<init>()
            cbcw r9 = m(r5, r9)
            cbcw r0 = defpackage.cbcw.i()
            boolean r0 = defpackage.fdbq.f(r9, r0)
            if (r0 == 0) goto L79
            fcsu r0 = r8.c
            java.lang.Object r0 = r0.b()
            cogm r0 = (defpackage.cogm) r0
            r1 = r9
            caxq r1 = (defpackage.caxq) r1
            r2.d = r1
            r2.c = r7
            java.lang.Object r0 = r0.d(r2)
            if (r0 == r4) goto L8f
        L79:
            return r9
        L7a:
            cogi r9 = r8.b     // Catch: java.lang.Exception -> L95 defpackage.coer -> Lb9
            r9.o()     // Catch: java.lang.Exception -> L95 defpackage.coer -> Lb9
            fcsu r9 = r8.c
            java.lang.Object r9 = r9.b()
            cogm r9 = (defpackage.cogm) r9
            r2.c = r6
            java.lang.Object r9 = r9.d(r2)
            if (r9 != r4) goto L90
        L8f:
            return r4
        L90:
            cbcw r9 = defpackage.cbcw.i()
            return r9
        L95:
            r9 = move-exception
            ekrg r2 = defpackage.cofa.a
            ekrw r2 = r2.j()
            ekrz r4 = defpackage.eksq.a
            r2.X(r4, r1)
            ekrd r2 = (defpackage.ekrd) r2
            ekrw r9 = r2.g(r9)
            r1 = 96
            ekrw r9 = r9.h(r0, r5, r1, r3)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Telephony Database update failed. Scheduling retry."
            r9.q(r0)
            cbcw r9 = defpackage.cbcw.m()
            return r9
        Lb9:
            r9 = move-exception
            ekrg r2 = defpackage.cofa.a
            ekrw r2 = r2.j()
            ekrz r4 = defpackage.eksq.a
            r2.X(r4, r1)
            ekrd r2 = (defpackage.ekrd) r2
            ekrw r9 = r2.g(r9)
            r1 = 93
            ekrw r9 = r9.h(r0, r5, r1, r3)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Telephony Database update failed due to insufficient permissions. Cancelling work."
            r9.q(r0)
            cbcw r9 = defpackage.cbcw.k()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cofa.k(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.coey
            if (r0 == 0) goto L13
            r0 = r6
            coey r0 = (defpackage.coey) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coey r0 = new coey
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            caxq r0 = r0.d
            defpackage.fctl.b(r6)
            return r0
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            coew r6 = new coew
            r6.<init>()
            java.lang.String r2 = "attemptUpdateForMessagesInThreadZero"
            cbcw r6 = m(r2, r6)
            cbcw r2 = defpackage.cbcw.i()
            boolean r2 = defpackage.fdbq.f(r6, r2)
            if (r2 == 0) goto L60
            fcsu r2 = r5.c
            java.lang.Object r2 = r2.b()
            cogm r2 = (defpackage.cogm) r2
            r4 = r6
            caxq r4 = (defpackage.caxq) r4
            r0.d = r4
            r0.c = r3
            java.lang.Object r0 = r2.c(r0)
            if (r0 == r1) goto L5f
            goto L60
        L5f:
            return r1
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cofa.l(fcxy):java.lang.Object");
    }
}

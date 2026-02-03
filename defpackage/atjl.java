package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atjl implements athk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep");
    public final athe b;
    public final athh c;
    public fdis d;
    private final fdjx e;
    private final fcsu f;
    private final fdkf g;
    private final atjr h = atjr.b;

    public atjl(fdjx fdjxVar, athe atheVar, fcsu fcsuVar, athh athhVar) {
        this.e = fdjxVar;
        this.b = atheVar;
        this.f = fcsuVar;
        this.c = athhVar;
        this.g = fdil.c(fdjxVar, null, new atjf(this, null), 3);
    }

    @Override // defpackage.athk
    public final atjr a() {
        return this.h;
    }

    @Override // defpackage.athk
    public final Object b(fcxy fcxyVar) {
        fdis fdisVar = this.d;
        if (fdbq.f(fdisVar != null ? Boolean.valueOf(fdisVar.h(new CancellationException("Waiting step was cancelled."))) : null, true)) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleFileTransfer");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(coie.j, this.c);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep", "cancel", 117, "WaitingStep.kt")).q("Waiting step was cancelled.");
        } else {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleFileTransfer");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ;
            ekrdVar2.X(coie.j, this.c);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep", "cancel", 122, "WaitingStep.kt")).q("Failed to cancel waiting step!");
        }
        return fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.atjg
            if (r0 == 0) goto L13
            r0 = r7
            atjg r0 = (defpackage.atjg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atjg r0 = new atjg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r7)     // Catch: defpackage.fdmx -> L27
            goto L56
        L27:
            r7 = move-exception
            goto L5c
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.fctl.b(r7)
            fcsu r7 = r6.f     // Catch: defpackage.fdmx -> L27
            java.lang.Object r7 = r7.b()     // Catch: defpackage.fdmx -> L27
            r7.getClass()     // Catch: defpackage.fdmx -> L27
            evrj r7 = (defpackage.evrj) r7     // Catch: defpackage.fdmx -> L27
            j$.time.Duration r7 = defpackage.evxd.c(r7)     // Catch: defpackage.fdmx -> L27
            long r4 = r7.toMillis()     // Catch: defpackage.fdmx -> L27
            atjj r7 = new atjj     // Catch: defpackage.fdmx -> L27
            r2 = 0
            r7.<init>(r6, r2)     // Catch: defpackage.fdmx -> L27
            r0.c = r3     // Catch: defpackage.fdmx -> L27
            java.lang.Object r7 = defpackage.fdna.a(r4, r7, r0)     // Catch: defpackage.fdmx -> L27
            if (r7 != r1) goto L56
            return r1
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: defpackage.fdmx -> L27
            r7.booleanValue()     // Catch: defpackage.fdmx -> L27
            return r7
        L5c:
            ekrg r0 = defpackage.atjl.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleFileTransfer"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            athh r1 = r6.c
            ekrz r2 = defpackage.coie.j
            r0.X(r2, r1)
            ekrw r0 = r0.g(r7)
            r1 = 84
            java.lang.String r2 = "WaitingStep.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep"
            java.lang.String r4 = "awaitCallback"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Timeout waiting for file transfer to process."
            r0.q(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjl.c(fcxy):java.lang.Object");
    }

    @Override // defpackage.athk
    public final Object g(fcxy fcxyVar) {
        return fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.athk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.atha r4, defpackage.atii r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r6 instanceof defpackage.atjk
            if (r4 == 0) goto L13
            r4 = r6
            atjk r4 = (defpackage.atjk) r4
            int r0 = r4.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.c = r0
            goto L18
        L13:
            atjk r4 = new atjk
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r4.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            atii r5 = r4.d
            defpackage.fctl.b(r6)     // Catch: java.util.concurrent.CancellationException -> L47
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fctl.b(r6)
            fdkf r6 = r3.g     // Catch: java.util.concurrent.CancellationException -> L47
            r4.d = r5     // Catch: java.util.concurrent.CancellationException -> L47
            r4.c = r2     // Catch: java.util.concurrent.CancellationException -> L47
            java.lang.Object r6 = r6.c(r4)     // Catch: java.util.concurrent.CancellationException -> L47
            if (r6 != r0) goto L41
            return r0
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.util.concurrent.CancellationException -> L47
            r6.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L47
            return r5
        L47:
            r4 = move-exception
            ekrg r5 = defpackage.atjl.a
            ekrw r5 = r5.j()
            ekrz r6 = defpackage.eksq.a
            java.lang.String r0 = "BugleFileTransfer"
            r5.X(r6, r0)
            ekrd r5 = (defpackage.ekrd) r5
            athh r6 = r3.c
            ekrz r0 = defpackage.coie.j
            r5.X(r0, r6)
            ekrw r4 = r5.g(r4)
            r5 = 100
            java.lang.String r6 = "WaitingStep.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep"
            java.lang.String r1 = "start"
            ekrw r4 = r4.h(r0, r1, r5, r6)
            ekrd r4 = (defpackage.ekrd) r4
            java.lang.String r5 = "Waiting for the MessageCoreData creation was cancelled."
            r4.q(r5)
            atij r4 = defpackage.atij.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjl.h(atha, atii, fcxy):java.lang.Object");
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.athk
    public final boolean k() {
        fdis fdisVar = this.d;
        if (fdisVar != null) {
            return fdisVar.j();
        }
        return false;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean l() {
        return false;
    }
}

package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avmk implements egsc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncPeriodicWorker");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public avmk(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar6.getClass();
        this.d = fdjxVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.b = fcsuVar5;
        this.c = fcsuVar6;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new avmi(this, workerParameters, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(j$.time.Instant r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.avmh
            if (r0 == 0) goto L13
            r0 = r7
            avmh r0 = (defpackage.avmh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avmh r0 = new avmh
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            j$.time.Instant r6 = r0.d
            defpackage.fctl.b(r7)
            goto L46
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.g
            java.lang.Object r7 = r7.b()
            cmfo r7 = (defpackage.cmfo) r7
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto La8
        L46:
            avde r7 = (defpackage.avde) r7
            evvp r7 = r7.i
            if (r7 != 0) goto L4e
            evvp r7 = defpackage.evvp.a
        L4e:
            r7.getClass()
            j$.time.Instant r7 = defpackage.evxd.d(r7)
            j$.time.Duration r6 = defpackage.eooc.a(r6, r7)
            j$.time.Instant r0 = j$.time.Instant.EPOCH
            boolean r7 = defpackage.fdbq.f(r7, r0)
            if (r7 != 0) goto L7c
            fcsu r7 = r5.h
            java.lang.Object r7 = r7.b()
            r7.getClass()
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            j$.time.Duration r7 = j$.time.Duration.ofHours(r0)
            int r6 = r6.compareTo(r7)
            if (r6 <= 0) goto L7b
            goto L7c
        L7b:
            r3 = 0
        L7c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r6.getClass()
            ekrg r7 = defpackage.avmk.a
            ekrw r7 = r7.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleWorkContactsSync"
            r7.X(r0, r1)
            r0 = 97
            java.lang.String r1 = "WorkProfileContactsSyncPeriodicWorker.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncPeriodicWorker"
            java.lang.String r4 = "shouldPerformFullSync"
            ekrw r7 = r7.h(r2, r4, r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "ShouldPerformFullSync = %s"
            r7.t(r1, r0)
            return r6
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmk.d(j$.time.Instant, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.avmj
            if (r0 == 0) goto L13
            r0 = r9
            avmj r0 = (defpackage.avmj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avmj r0 = new avmj
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r9)
            goto L8d
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            defpackage.fctl.b(r9)
            goto L4b
        L38:
            defpackage.fctl.b(r9)
            fcsu r9 = r8.e
            java.lang.Object r9 = r9.b()
            avlr r9 = (defpackage.avlr) r9
            r0.d = r4
            java.lang.Object r9 = r9.b(r0)
            if (r9 == r1) goto L94
        L4b:
            r2 = r9
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L93
            ekrg r2 = defpackage.avmk.a
            ekrw r2 = r2.h()
            ekrz r4 = defpackage.eksq.a
            java.lang.String r5 = "BugleWorkContactsSync"
            r2.X(r4, r5)
            r4 = 80
            java.lang.String r5 = "WorkProfileContactsSyncPeriodicWorker.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncPeriodicWorker"
            java.lang.String r7 = "validateSyncEligibility"
            ekrw r2 = r2.h(r6, r7, r4, r5)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r4 = "Not eligible for sync. Cancelling work and finishing."
            r2.q(r4)
            fcsu r2 = r8.f
            java.lang.Object r2 = r2.b()
            egsh r2 = (defpackage.egsh) r2
            java.lang.String r4 = "WorkProfileContactsPeriodicSync"
            com.google.common.util.concurrent.ListenableFuture r2 = r2.a(r4)
            r0.a = r9
            r0.d = r3
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto L94
            r0 = r9
        L8d:
            qao r9 = new qao
            r9.<init>()
            return r0
        L93:
            return r9
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmk.e(fcxy):java.lang.Object");
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}

package defpackage;

import j$.time.Instant;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobl implements cnyi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer");
    public final coaw b;
    public final cnyh c;
    public final fdjx d;
    public final fdjx e;
    public final eizx f;
    public final AtomicReference g;
    private final Set h;
    private final cnry i;
    private final ains j;

    public cobl(coaw coawVar, cnyh cnyhVar, Set set, cnry cnryVar, ains ainsVar, fdjx fdjxVar, fdjx fdjxVar2) {
        coawVar.getClass();
        cnyhVar.getClass();
        set.getClass();
        ainsVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.b = coawVar;
        this.c = cnyhVar;
        this.h = set;
        this.i = cnryVar;
        this.j = ainsVar;
        this.d = fdjxVar;
        this.e = fdjxVar2;
        this.f = new eizx();
        this.g = new AtomicReference(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f4, code lost:
    
        if (defpackage.fdxs.c(r9, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0103, code lost:
    
        if (r11.a(r9, r10, r0) != r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cnyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cnyz r9, defpackage.enqq r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cobl.a(cnyz, enqq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r10.c(r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cnyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cnxb r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cobg
            if (r0 == 0) goto L13
            r0 = r11
            cobg r0 = (defpackage.cobg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cobg r0 = new cobg
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4c
            if (r2 == r7) goto L46
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            defpackage.fctl.b(r11)
            goto Lc1
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            goto La6
        L40:
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            goto L6d
        L46:
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            goto L59
        L4c:
            defpackage.fctl.b(r11)
            r0.a = r10
            r0.d = r7
            java.lang.Object r11 = r9.e(r0)
            if (r11 == r1) goto Lcc
        L59:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto Lc4
            cnyh r11 = r9.c
            r0.a = r10
            r0.d = r6
            java.lang.Object r11 = r11.c(r0)
            if (r11 == r1) goto Lcc
        L6d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La6
            ekrg r11 = defpackage.cobl.a
            ekrw r11 = r11.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r6 = "BugleTelephony"
            r11.X(r2, r6)
            r2 = 171(0xab, float:2.4E-43)
            java.lang.String r6 = "PausingForwardSyncWorkOrganizer.kt"
            java.lang.String r7 = "com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer"
            java.lang.String r8 = "processBatches"
            ekrw r11 = r11.h(r7, r8, r2, r6)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "processBatches is paused"
            r11.q(r2)
            ains r11 = r9.j
            java.lang.String r2 = "Bugle.Telephony.ForwardSync.Unlatched"
            r11.c(r2)
            r0.a = r10
            r0.d = r5
            java.lang.Object r11 = r9.g(r0)
            if (r11 == r1) goto Lcc
        La6:
            java.util.concurrent.atomic.AtomicReference r11 = r9.g
            coaz r2 = new coaz
            r2.<init>()
            java.lang.Object r10 = j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(r11, r2)
            fdkf r10 = (defpackage.fdkf) r10
            r10.getClass()
            r0.a = r3
            r0.d = r4
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r1) goto Lc1
            goto Lcc
        Lc1:
            fctx r10 = defpackage.fctx.a
            return r10
        Lc4:
            cnxw r10 = new cnxw
            java.lang.String r11 = "Forward Sync is paused"
            r10.<init>(r11, r3)
            throw r10
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cobl.b(cnxb, fcxy):java.lang.Object");
    }

    @Override // defpackage.cnyi
    public final void c(Instant instant) {
        this.b.c(instant);
    }

    @Override // defpackage.cnyi
    public final boolean d() {
        return this.b.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.cobb
            if (r0 == 0) goto L13
            r0 = r11
            cobb r0 = (defpackage.cobb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cobb r0 = new cobb
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r11)
            goto L6f
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2f:
            defpackage.fctl.b(r11)
            java.util.Set r11 = r10.h
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.fcva.p(r11, r4)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L43:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r11.next()
            cnxx r4 = (defpackage.cnxx) r4
            fdjx r5 = r10.e
            fcyi r6 = defpackage.fcyi.a
            fdjz r7 = defpackage.fdjz.a
            fcyh r6 = defpackage.eicg.a(r6)
            cobc r8 = new cobc
            r9 = 0
            r8.<init>(r9, r4)
            fdkf r4 = defpackage.fdin.b(r5, r6, r7, r8)
            r2.add(r4)
            goto L43
        L67:
            r0.c = r3
            java.lang.Object r11 = defpackage.fdii.a(r2, r0)
            if (r11 == r1) goto L9c
        L6f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r0 = r11 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L81
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L81
        L7f:
            r3 = r1
            goto L97
        L81:
            java.util.Iterator r11 = r11.iterator()
        L85:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r11.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L85
        L97:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cobl.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.cobe
            if (r0 == 0) goto L13
            r0 = r9
            cobe r0 = (defpackage.cobe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cobe r0 = new cobe
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "pause"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer"
            java.lang.String r5 = "BugleTelephony"
            r6 = 1
            java.lang.String r7 = "PausingForwardSyncWorkOrganizer.kt"
            if (r2 == 0) goto L37
            if (r2 != r6) goto L2f
            defpackage.fctl.b(r9)
            goto L5c
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            defpackage.fctl.b(r9)
            ekrg r9 = defpackage.cobl.a
            ekrw r9 = r9.h()
            ekrz r2 = defpackage.eksq.a
            r9.X(r2, r5)
            r2 = 63
            ekrw r9 = r9.h(r4, r3, r2, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r2 = "Pausing forward sync"
            r9.q(r2)
            cnyh r9 = r8.c
            r0.c = r6
            java.lang.Object r9 = r9.e(r6, r0)
            if (r9 == r1) goto L97
        L5c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L7f
            ekrg r9 = defpackage.cobl.a
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r5)
            r0 = 65
            ekrw r9 = r9.h(r4, r3, r0, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Sync already paused"
            r9.q(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L7f:
            ains r9 = r8.j
            java.lang.String r0 = "Bugle.Telephony.ForwardSync.Paused"
            r9.c(r0)
            java.util.concurrent.atomic.AtomicReference r9 = r8.g
            r0 = 0
            java.lang.Object r9 = r9.getAndSet(r0)
            fdkf r9 = (defpackage.fdkf) r9
            if (r9 == 0) goto L94
            defpackage.fdlp.a(r9)
        L94:
            fctx r9 = defpackage.fctx.a
            return r9
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cobl.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if (f(r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cobl.g(fcxy):java.lang.Object");
    }

    public final void h() {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleTelephony");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer", "pauseInTransaction", 74, "PausingForwardSyncWorkOrganizer.kt")).q("Pausing forward sync");
        final fdci fdciVar = new fdci();
        fdciVar.a = new AtomicBoolean(false);
        final cnyh cnyhVar = this.c;
        if (!((AtomicBoolean) fdciVar.a).get()) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleTelephony");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer", "pauseInTransaction", 76, "PausingForwardSyncWorkOrganizer.kt")).q("Sync already paused");
        } else {
            this.j.c("Bugle.Telephony.ForwardSync.Paused");
            fdkf fdkfVar = (fdkf) this.g.getAndSet(null);
            if (fdkfVar != null) {
                fdkfVar.t(null);
            }
        }
    }
}

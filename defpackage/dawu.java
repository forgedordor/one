package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawu implements egsc {
    public static final dawo a = new dawo();
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/welcome/v1/consent/VerificationWorker");
    private final fdjx c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;

    public dawu(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = fcsuVar8;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new dawr(this, workerParameters, null));
    }

    public final qap d(WorkerParameters workerParameters) {
        fcsu fcsuVar = this.e;
        long jLongValue = ((Number) fcsuVar.b()).longValue();
        int i = workerParameters.e;
        if (i < jLongValue) {
            dawo.b(a.g(i, "Marking for retry. Current attempt count is "));
            return new qan();
        }
        dawo.b("Max attempt count " + fcsuVar.b() + " reached. Failing");
        return new qam();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dawp
            if (r0 == 0) goto L13
            r0 = r5
            dawp r0 = (defpackage.dawp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dawp r0 = new dawp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.d
            java.lang.Object r5 = r5.b()
            ctcm r5 = (defpackage.ctcm) r5
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L5c
        L42:
            j$.time.Instant r5 = (j$.time.Instant) r5
            if (r5 == 0) goto L5a
            fcsu r0 = r4.k
            java.lang.Object r0 = r0.b()
            cogw r0 = (defpackage.cogw) r0
            j$.time.Instant r0 = r0.f()
            r0.getClass()
            j$.time.Duration r5 = defpackage.eooc.a(r0, r5)
            return r5
        L5a:
            r5 = 0
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawu.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dawq
            if (r0 == 0) goto L13
            r0 = r8
            dawq r0 = (defpackage.dawq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dawq r0 = new dawq
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            j$.time.Instant r0 = r0.d
            defpackage.fctl.b(r8)
            return r0
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            defpackage.fctl.b(r8)
            goto L66
        L3b:
            defpackage.fctl.b(r8)
            goto L52
        L3f:
            defpackage.fctl.b(r8)
            fcsu r8 = r7.d
            java.lang.Object r8 = r8.b()
            ctcm r8 = (defpackage.ctcm) r8
            r0.c = r5
            java.lang.Object r8 = r8.f(r0)
            if (r8 == r1) goto Lb7
        L52:
            j$.time.Instant r8 = (j$.time.Instant) r8
            if (r8 != 0) goto Lb6
            fcsu r8 = r7.f
            java.lang.Object r8 = r8.b()
            dghj r8 = (defpackage.dghj) r8
            r0.c = r4
            java.lang.Object r8 = r8.j(r0)
            if (r8 == r1) goto Lb7
        L66:
            java.util.Set r8 = (java.util.Set) r8
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L70
            r8 = 0
            return r8
        L70:
            fcsu r2 = r7.k
            java.lang.Object r2 = r2.b()
            cogw r2 = (defpackage.cogw) r2
            j$.time.Instant r2 = r2.f()
            fcsu r4 = r7.d
            java.lang.Object r4 = r4.b()
            ctcm r4 = (defpackage.ctcm) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.fcva.p(r8, r6)
            r5.<init>(r6)
            java.util.Iterator r8 = r8.iterator()
        L93:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r8.next()
            dggk r6 = (defpackage.dggk) r6
            java.lang.String r6 = r6.toString()
            r5.add(r6)
            goto L93
        La7:
            ekhx r8 = defpackage.ekfv.f(r5)
            r0.d = r2
            r0.c = r3
            java.lang.Object r8 = r4.i(r8, r2, r0)
            if (r8 == r1) goto Lb7
            return r2
        Lb6:
            return r8
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawu.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.daws
            if (r0 == 0) goto L13
            r0 = r6
            daws r0 = (defpackage.daws) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            daws r0 = new daws
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r5.i
            java.lang.Object r6 = r6.b()
            dcoc r6 = (defpackage.dcoc) r6
            dcop r2 = new dcop
            r2.<init>()
            java.lang.String r4 = "am_profiles"
            r2.a = r4
            r2.e = r3
            com.google.android.gms.constellation.VerifyPhoneNumberRequest r2 = r2.a()
            defn r6 = r6.a(r2)
            r0.c = r3
            java.lang.Object r6 = defpackage.auwr.a(r6, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            com.google.android.gms.constellation.VerifyPhoneNumberResponse r6 = (com.google.android.gms.constellation.VerifyPhoneNumberResponse) r6
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawu.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r3.a((defpackage.egsh) r5, r9, r1) != r2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawu.h(fcxy):java.lang.Object");
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}

package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawk implements egrw {
    public static final dawh a = new dawh();
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/welcome/v1/consent/ProfilesConsentWorker");
    public final efwo c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final fdjx k;
    private final fcsu l;
    private final fcsu m;

    public dawk(efwo efwoVar, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        efwoVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        this.c = efwoVar;
        this.k = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.l = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.m = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fcsuVar9;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egrw, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        return auvw.c(this.k, fcyi.a, fdjz.a, new dawj(this, workerParameters, null));
    }

    public final qap d(WorkerParameters workerParameters) {
        fcsu fcsuVar = this.l;
        long jLongValue = ((Number) fcsuVar.b()).longValue();
        int i = workerParameters.e;
        if (i < jLongValue) {
            dawh.c(a.g(i, "Marking for retry. Current attempt count is "));
            return new qan();
        }
        dawh.c("Max attempt count " + fcsuVar.b() + " reached. Failing");
        davn davnVar = (davn) this.j.b();
        Object objB = davnVar.a.b();
        objB.getClass();
        auvw.k((fdjx) objB, null, null, new davj(davnVar, null), 3);
        return new qam();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r7.i((defpackage.ekhx) r2, r4, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dawi
            if (r0 == 0) goto L13
            r0 = r7
            dawi r0 = (defpackage.dawi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dawi r0 = new dawi
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r7)
            goto Lbb
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r7)
            goto L8c
        L3c:
            defpackage.fctl.b(r7)
            goto L53
        L40:
            defpackage.fctl.b(r7)
            fcsu r7 = r6.m
            java.lang.Object r7 = r7.b()
            dghj r7 = (defpackage.dghj) r7
            r0.d = r5
            java.lang.Object r7 = r7.j(r0)
            if (r7 == r1) goto Lbe
        L53:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.fcva.p(r7, r5)
            r2.<init>(r5)
            java.util.Iterator r7 = r7.iterator()
        L64:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r7.next()
            dggk r5 = (defpackage.dggk) r5
            java.lang.String r5 = r5.a
            r2.add(r5)
            goto L64
        L76:
            ekhx r2 = defpackage.ekfv.f(r2)
            fcsu r7 = r6.d
            java.lang.Object r7 = r7.b()
            ctcm r7 = (defpackage.ctcm) r7
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.e(r0)
            if (r7 == r1) goto Lbe
        L8c:
            ekhx r7 = (defpackage.ekhx) r7
            boolean r7 = defpackage.fdbq.f(r7, r2)
            if (r7 != 0) goto Lbb
            java.lang.String r7 = "Caching RCS provisioning data"
            defpackage.dawh.c(r7)
            fcsu r7 = r6.d
            java.lang.Object r7 = r7.b()
            ctcm r7 = (defpackage.ctcm) r7
            fcsu r4 = r6.h
            java.lang.Object r4 = r4.b()
            cogw r4 = (defpackage.cogw) r4
            j$.time.Instant r4 = r4.f()
            r5 = 0
            r0.a = r5
            r0.d = r3
            ekhx r2 = (defpackage.ekhx) r2
            java.lang.Object r7 = r7.i(r2, r4, r0)
            if (r7 != r1) goto Lbb
            goto Lbe
        Lbb:
            fctx r7 = defpackage.fctx.a
            return r7
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawk.e(fcxy):java.lang.Object");
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}

package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmkw implements egsc {
    public static final eksp a = eksp.c("BugleSimStateTracker");
    public final cmjl b;
    private final fdjx c;
    private final fcyh d;

    public cmkw(fdjx fdjxVar, fcyh fcyhVar, cmjl cmjlVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        cmjlVar.getClass();
        this.c = fdjxVar;
        this.d = fcyhVar;
        this.b = cmjlVar;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new cmku(this, workerParameters, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.eoaz r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cmkq
            if (r0 == 0) goto L13
            r0 = r6
            cmkq r0 = (defpackage.cmkq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmkq r0 = new cmkq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmjl r6 = r4.b
            fdkf r5 = r6.c(r5)
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            qao r5 = new qao
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmkw.d(eoaz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pzs r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cmkr
            if (r0 == 0) goto L13
            r0 = r10
            cmkr r0 = (defpackage.cmkr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmkr r0 = new cmkr
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r10)
            goto L99
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            defpackage.fctl.b(r10)
            java.util.Map r9 = r9.b
            java.lang.String r10 = "unstable_subscription_id_list"
            java.lang.Object r9 = r9.get(r10)
            boolean r10 = r9 instanceof java.lang.Object[]
            r2 = 0
            r4 = 0
            if (r10 == 0) goto L66
            r10 = r9
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            boolean r5 = r10 instanceof java.lang.Object[]
            if (r5 == 0) goto L66
            int r10 = r10.length
            pzq r5 = new pzq
            r5.<init>(r9)
            int[] r9 = new int[r10]
            r6 = r2
        L51:
            if (r6 >= r10) goto L67
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r5.invoke(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r9[r6] = r7
            int r6 = r6 + 1
            goto L51
        L66:
            r9 = r4
        L67:
            if (r9 == 0) goto L7f
            java.util.ArrayList r4 = new java.util.ArrayList
            int r10 = r9.length
            r4.<init>(r10)
        L6f:
            int r10 = r9.length
            if (r2 >= r10) goto L7f
            r10 = r9[r2]
            dggr r5 = new dggr
            r5.<init>(r10)
            r4.add(r5)
            int r2 = r2 + 1
            goto L6f
        L7f:
            if (r4 == 0) goto L9f
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L88
            goto L9f
        L88:
            cmjl r9 = r8.b
            eoaz r10 = defpackage.eoaz.UPDATE_TRIGGER_UNSTABLE_SUBSCRIPTION
            fdkf r9 = r9.b(r4, r10)
            r0.c = r3
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L99
            return r1
        L99:
            qao r9 = new qao
            r9.<init>()
            return r9
        L9f:
            eksp r9 = defpackage.cmkw.a
            ekrw r9 = r9.n()
            java.lang.String r10 = "No unstable subscription Ids provided."
            r9.q(r10)
            qam r9 = new qam
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmkw.e(pzs, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.eoaz r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cmkt
            if (r0 == 0) goto L13
            r0 = r7
            cmkt r0 = (defpackage.cmkt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmkt r0 = new cmkt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.d
            fcyh r7 = defpackage.eicg.a(r7)
            cmks r2 = new cmks
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmkw.f(eoaz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        if (r12 != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c7, code lost:
    
        if (r12 != r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d5, code lost:
    
        if (r12 != r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc A[Catch: IllegalArgumentException -> 0x00db, TryCatch #0 {IllegalArgumentException -> 0x00db, blocks: (B:13:0x0029, B:59:0x00be, B:17:0x0036, B:63:0x00c9, B:18:0x003b, B:67:0x00d7, B:28:0x006d, B:54:0x00b1, B:57:0x00b6, B:61:0x00c1, B:65:0x00cc, B:50:0x00a8, B:51:0x00ad), top: B:72:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(androidx.work.WorkerParameters r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmkw.g(androidx.work.WorkerParameters, fcxy):java.lang.Object");
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}

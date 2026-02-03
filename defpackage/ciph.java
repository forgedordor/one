package defpackage;

import android.content.Context;
import android.os.BatteryManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciph implements ehwh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeSynclet");
    public final fcsu b;
    public final ains c;
    public final crnp d;
    public final ecjh e;
    public final cogw f;
    public final fcsu g;
    public final fcsu h;
    public final fctc i;
    private final fdjx j;
    private final fcyh k;
    private final cinr l;
    private final aofc m;
    private final fcsu n;
    private final cqba o;

    public ciph(fdjx fdjxVar, fcyh fcyhVar, cqba cqbaVar, cinr cinrVar, fcsu fcsuVar, final Context context, ains ainsVar, crnp crnpVar, aofc aofcVar, ecjh ecjhVar, cogw cogwVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        cqbaVar.getClass();
        cinrVar.getClass();
        fcsuVar.getClass();
        context.getClass();
        ainsVar.getClass();
        crnpVar.getClass();
        aofcVar.getClass();
        ecjhVar.getClass();
        cogwVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.j = fdjxVar;
        this.k = fcyhVar;
        this.o = cqbaVar;
        this.l = cinrVar;
        this.b = fcsuVar;
        this.c = ainsVar;
        this.d = crnpVar;
        this.m = aofcVar;
        this.e = ecjhVar;
        this.f = cogwVar;
        this.n = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fctd.a(new fdae() { // from class: cior
            @Override // defpackage.fdae
            public final Object invoke() {
                Object systemService = context.getSystemService("batterymanager");
                systemService.getClass();
                return (BatteryManager) systemService;
            }
        });
    }

    @Override // defpackage.ehwh
    public final /* bridge */ /* synthetic */ ListenableFuture a() throws IOException {
        eieu eieuVarH = eiiy.h("MmsGroupUpgradeSynclet#sync");
        try {
            eiju eijuVarC = auvw.c(this.j, fcyi.a, fdjz.a, new cipg(this, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciph.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cipa
            if (r0 == 0) goto L13
            r0 = r5
            cipa r0 = (defpackage.cipa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cipa r0 = new cipa
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            ecjh r5 = r4.e
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L78
        L43:
            cipj r5 = (defpackage.cipj) r5
            evvp r5 = r5.d
            if (r5 != 0) goto L4b
            evvp r5 = defpackage.evvp.a
        L4b:
            r5.getClass()
            fcsu r0 = r4.n
            j$.time.Instant r5 = defpackage.evxd.d(r5)
            java.lang.Object r0 = r0.b()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            j$.time.Duration r0 = defpackage.eoob.f(r0)
            j$.time.Instant r5 = r5.plus(r0)
            cogw r0 = r4.f
            j$.time.Instant r0 = r0.f()
            boolean r5 = r5.isBefore(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciph.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cipb
            if (r0 == 0) goto L13
            r0 = r6
            cipb r0 = (defpackage.cipb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cipb r0 = new cipb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r0 = r0.a
            defpackage.fctl.b(r6)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.fctl.b(r6)
            goto L4c
        L38:
            defpackage.fctl.b(r6)
            ecjh r6 = r5.e
            com.google.common.util.concurrent.ListenableFuture r6 = r6.a()
            r6.getClass()
            r0.d = r4
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L69
        L4c:
            cipj r6 = (defpackage.cipj) r6
            int r6 = r6.c
            int r6 = r6 + r4
            ecjh r2 = r5.e
            cioo r4 = new cioo
            r4.<init>()
            r0.a = r6
            r0.d = r3
            java.lang.Object r0 = defpackage.crrj.b(r2, r4, r0)
            if (r0 == r1) goto L69
            r0 = r6
        L63:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            return r6
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciph.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0088 -> B:28:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cipe
            if (r0 == 0) goto L13
            r0 = r7
            cipe r0 = (defpackage.cipe) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cipe r0 = new cipe
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r7)
            goto L8a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.fctl.b(r7)
            goto L51
        L39:
            defpackage.fctl.b(r7)
            aofc r7 = r6.m
            anpj r7 = r7.a()
            eiju r7 = r7.b()
            r7.getClass()
            r0.d = r5
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L98
        L51:
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L64
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L64
            goto L93
        L64:
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L69:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L93
            java.lang.Object r7 = r2.next()
            aoer r7 = (defpackage.aoer) r7
            anpj r7 = r7.f()
            eiju r7 = r7.b()
            r7.getClass()
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L98
        L8a:
            aoio r7 = (defpackage.aoio) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L69
            r3 = r5
        L93:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciph.e(fcxy):java.lang.Object");
    }
}

package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbkq {
    public final cogw d;
    public final cbhp e;
    public final egsh f;
    public final cbbl g;
    public final fdjx h;
    private final cbcz j;
    private final fcsu k;
    public static final cbjv a = new cbjv();
    private static final cqce i = cqce.g("BugleWorkQueue", "WorkQueueWorkManagerTableJanitorTask");
    public static final cczv b = cdag.i(cdag.b, "thorough_pwq_check_frequency", 0.0f);
    public static final Set c = fcwm.d(qbo.a, qbo.b, qbo.e);

    public cbkq(cogw cogwVar, cbcz cbczVar, cbhp cbhpVar, egsh egshVar, cbbl cbblVar, fcsu fcsuVar, fdjx fdjxVar, fdjx fdjxVar2) {
        cogwVar.getClass();
        cbczVar.getClass();
        cbhpVar.getClass();
        egshVar.getClass();
        cbblVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.d = cogwVar;
        this.j = cbczVar;
        this.e = cbhpVar;
        this.f = egshVar;
        this.g = cbblVar;
        this.k = fcsuVar;
        this.h = fdjxVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbka
            if (r0 == 0) goto L13
            r0 = r6
            cbka r0 = (defpackage.cbka) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbka r0 = new cbka
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            cbjv r6 = defpackage.cbkq.a
            cbkd r2 = new cbkd
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 == r1) goto L6d
        L42:
            r0 = r6
            cbjx r0 = (defpackage.cbjx) r0
            java.util.Set r0 = r0.a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L55
            cqce r0 = defpackage.cbkq.i
            java.lang.String r1 = "No queues have failed workmanager tasks"
            r0.p(r1)
            return r6
        L55:
            cqce r1 = defpackage.cbkq.i
            cqbd r1 = r1.b()
            java.lang.String r2 = "Identified queues with failed workmanager tasks"
            r1.I(r2)
            int r0 = r0.size()
            java.lang.String r2 = "count"
            r1.y(r2, r0)
            r1.r()
            return r6
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbkq.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbke
            if (r0 == 0) goto L13
            r0 = r6
            cbke r0 = (defpackage.cbke) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbke r0 = new cbke
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            cbjv r6 = defpackage.cbkq.a
            cbkg r2 = new cbkg
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 == r1) goto L6d
        L42:
            r0 = r6
            cbjx r0 = (defpackage.cbjx) r0
            java.util.Set r0 = r0.a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L55
            cqce r0 = defpackage.cbkq.i
            java.lang.String r1 = "No queues are missing from the work_queue_work_manager table"
            r0.p(r1)
            return r6
        L55:
            cqce r1 = defpackage.cbkq.i
            cqbd r1 = r1.b()
            java.lang.String r2 = "Identified queues missing from the work_queue_work_manager table"
            r1.I(r2)
            int r0 = r0.size()
            java.lang.String r2 = "count"
            r1.y(r2, r0)
            r1.r()
            return r6
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbkq.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbkh
            if (r0 == 0) goto L13
            r0 = r6
            cbkh r0 = (defpackage.cbkh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbkh r0 = new cbkh
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            cbjv r6 = defpackage.cbkq.a
            cbkk r2 = new cbkk
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 == r1) goto L6d
        L42:
            r0 = r6
            cbjx r0 = (defpackage.cbjx) r0
            java.util.Set r0 = r0.a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L55
            cqce r0 = defpackage.cbkq.i
            java.lang.String r1 = "No queues have null workmanager uuids"
            r0.p(r1)
            return r6
        L55:
            cqce r1 = defpackage.cbkq.i
            cqbd r1 = r1.b()
            java.lang.String r2 = "Identified queues with null workmanager uuids"
            r1.I(r2)
            int r0 = r0.size()
            java.lang.String r2 = "count"
            r1.y(r2, r0)
            r1.r()
            return r6
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbkq.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cbjy r17, defpackage.fcxy r18) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbkq.d(cbjy, fcxy):java.lang.Object");
    }
}

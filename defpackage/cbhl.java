package defpackage;

import j$.util.DesugarDate;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhl implements cbcz {
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerScheduler");
    public final cbaz a;
    public final egsh b;
    public final cbhp c;
    public final fdjx d;
    private final cogw f;
    private final fcsu g;
    private final fcsu h;
    private final dqsn i;
    private final fcsu j;
    private final byeq k;

    public cbhl(byeq byeqVar, cogw cogwVar, cbaz cbazVar, fcsu fcsuVar, fcsu fcsuVar2, egsh egshVar, dqsn dqsnVar, cbhp cbhpVar, caxe caxeVar, fcsu fcsuVar3, fdjx fdjxVar, fdjx fdjxVar2) {
        byeqVar.getClass();
        cogwVar.getClass();
        cbazVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        egshVar.getClass();
        dqsnVar.getClass();
        cbhpVar.getClass();
        caxeVar.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.k = byeqVar;
        this.f = cogwVar;
        this.a = cbazVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.b = egshVar;
        this.i = dqsnVar;
        this.c = cbhpVar;
        this.j = fcsuVar3;
        this.d = fdjxVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object j(defpackage.cbhl r7, defpackage.cbdg r8, java.lang.Runnable r9, defpackage.caya r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.cbgq
            if (r0 == 0) goto L13
            r0 = r11
            cbgq r0 = (defpackage.cbgq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cbgq r0 = new cbgq
            r0.<init>(r7, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.b
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            java.lang.Object r8 = r6.a
            defpackage.fctl.b(r11)     // Catch: defpackage.cblt -> L58
            goto L55
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.fctl.b(r11)
            fcsu r7 = r7.g     // Catch: defpackage.cblt -> L58
            java.lang.Object r7 = r7.b()     // Catch: defpackage.cblt -> L58
            r1 = r7
            cbmh r1 = (defpackage.cbmh) r1     // Catch: defpackage.cblt -> L58
            r7 = r2
            java.lang.String r2 = r8.q()     // Catch: defpackage.cblt -> L58
            r2.getClass()     // Catch: defpackage.cblt -> L58
            cblu r3 = defpackage.cblu.b     // Catch: defpackage.cblt -> L58
            r6.a = r8     // Catch: defpackage.cblt -> L58
            r6.d = r7     // Catch: defpackage.cblt -> L58
            r4 = r9
            r5 = r10
            java.lang.Object r11 = r1.e(r2, r3, r4, r5, r6)     // Catch: defpackage.cblt -> L58
            if (r11 != r0) goto L55
            return r0
        L55:
            qap r11 = (defpackage.qap) r11     // Catch: defpackage.cblt -> L58
            goto L85
        L58:
            ekrg r7 = defpackage.cbhl.e
            ekrw r7 = r7.g()
            ekrz r9 = defpackage.eksq.a
            java.lang.String r10 = "BugleWorkQueue"
            r7.X(r9, r10)
            ekrd r7 = (defpackage.ekrd) r7
            ekrz r9 = defpackage.cbpp.b
            cbdg r8 = (defpackage.cbdg) r8
            java.lang.String r8 = r8.q()
            r7.X(r9, r8)
            r8 = 150(0x96, float:2.1E-43)
            java.lang.String r9 = "WorkQueueWorkManagerScheduler.kt"
            java.lang.String r10 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerScheduler"
            java.lang.String r11 = "eagerlyLaunch"
            ekrw r7 = r7.h(r10, r11, r8, r9)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "Queue is already eagerly evaluating"
            r7.q(r8)
        L85:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbhl.j(cbhl, cbdg, java.lang.Runnable, caya, fcxy):java.lang.Object");
    }

    @Override // defpackage.cbcz
    public final eiju a(cbdg cbdgVar) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cbgx(cbdgVar, this, null));
    }

    @Override // defpackage.cbcz
    public final eiju b(cbdg cbdgVar) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cbgy(this, cbdgVar, null));
    }

    @Override // defpackage.cbcz
    public final Optional c(cbdg cbdgVar) {
        fdkf fdkfVarI = i(cbdgVar);
        fdjz fdjzVar = fdjz.b;
        return Optional.of(fdin.b(this.d, eicg.a(fcyi.a), fdjzVar, new cbhc(null, fdkfVarI, this, cbdgVar)));
    }

    @Override // defpackage.cbcz
    public final boolean d(String str, cbcy cbcyVar, UUID uuid) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r8.c(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [cbdg] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eoqw] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final defpackage.cbdg r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cbha
            if (r0 == 0) goto L13
            r0 = r8
            cbha r0 = (defpackage.cbha) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cbha r0 = new cbha
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            fdkf r7 = (defpackage.fdkf) r7
            defpackage.fctl.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L80
        L2e:
            r8 = move-exception
            goto L73
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.a
            eiju r7 = (defpackage.eiju) r7
            defpackage.fctl.b(r8)     // Catch: java.util.concurrent.CancellationException -> L79
            goto L60
        L40:
            defpackage.fctl.b(r8)
            if (r7 == 0) goto L80
            byeq r8 = r6.k
            cbgn r2 = new cbgn
            r2.<init>()
            java.lang.String r7 = "launchToWorkManager"
            eiju r7 = r8.a(r7, r2)
            r7.getClass()     // Catch: java.util.concurrent.CancellationException -> L79
            r0.a = r7     // Catch: java.util.concurrent.CancellationException -> L79
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L79
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L79
            if (r8 != r1) goto L60
            goto L6e
        L60:
            fdkf r8 = (defpackage.fdkf) r8     // Catch: java.util.concurrent.CancellationException -> L79
            if (r8 == 0) goto L80
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L6f
            r0.d = r3     // Catch: java.util.concurrent.CancellationException -> L6f
            java.lang.Object r7 = r8.c(r0)     // Catch: java.util.concurrent.CancellationException -> L6f
            if (r7 != r1) goto L80
        L6e:
            return r1
        L6f:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L73:
            if (r7 == 0) goto L80
            r7.t(r8)
            goto L80
        L79:
            r8 = 0
            r7.cancel(r8)
            qay r7 = defpackage.qba.a
            return r7
        L80:
            qay r7 = defpackage.qba.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbhl.e(cbdg, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(final java.lang.String r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cbhb
            if (r0 == 0) goto L13
            r0 = r6
            cbhb r0 = (defpackage.cbhb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbhb r0 = new cbhb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            byeq r6 = r4.k
            cbgk r2 = new cbgk
            r2.<init>()
            java.lang.String r5 = "WorkQueueWorkManagerScheduler#removeQueueAssociation"
            eiju r5 = r6.b(r5, r2)
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            fcsu r5 = r4.j
            java.lang.Object r5 = r5.b()
            ains r5 = (defpackage.ains) r5
            java.lang.String r6 = "Bugle.Pwq.ScheduledWorkManagerItems.Count"
            int r0 = defpackage.cbgp.a()
            r5.e(r6, r0)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbhl.f(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0178, code lost:
    
        if (r0 != r3) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c2 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:15:0x003e, B:62:0x01be, B:64:0x01c2, B:65:0x01fd, B:66:0x01ff, B:20:0x004d, B:74:0x0225), top: B:82:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r18v0, types: [cbhl] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cbdg r19, defpackage.cazg r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbhl.g(cbdg, cazg, fcxy):java.lang.Object");
    }

    public final Object h(cazg cazgVar, cbdg cbdgVar, caze cazeVar, fcxy fcxyVar) {
        if (cbdgVar.s().getTime() > this.f.f().toEpochMilli() || cazeVar == caze.WORKMANAGER_ONLY) {
            return false;
        }
        cban cbanVar = (cban) this.h.b();
        pzj pzjVar = ((caxl) cazgVar.a()).a;
        if (pzjVar == null) {
            pzjVar = pzj.a;
        }
        return cbanVar.a(pzjVar, fcxyVar);
    }

    public final fdkf i(cbdg cbdgVar) {
        int i;
        dqsn dqsnVar = this.i;
        if (!dqsnVar.i()) {
            throw new IllegalStateException("launchToWorkManagerInTransaction called outside a transaction");
        }
        cazg cazgVarC = this.a.c(cbdgVar.r());
        pzj pzjVar = ((caxl) cazgVarC.a()).a;
        String strQ = cbdgVar.q();
        strQ.getClass();
        Date dateS = cbdgVar.s();
        String[] strArr = cbjq.a;
        cbjl cbjlVar = new cbjl(cbjq.a);
        cbjlVar.A("work_queue_work_manager_ids.queryOnQueue");
        cbjlVar.q();
        cbjp cbjpVar = new cbjp();
        cbjpVar.b(strQ);
        cbjlVar.k(new cbjo(cbjpVar));
        if (((cbht) dqru.c(cbjlVar.b())) != null) {
            i = 2;
        } else {
            if (!dqsnVar.i()) {
                throw new IllegalStateException("Check failed.");
            }
            cbhy cbhyVar = new cbhy();
            cbhyVar.c(strQ);
            cbhyVar.j(Optional.empty());
            cbhyVar.i(DesugarDate.from(this.f.f()));
            if (dateS != null) {
                cbhyVar.b(dateS);
            }
            if (pzjVar != null) {
                cbhyVar.g(pzjVar.j - 1);
                cbhyVar.e(pzjVar.c);
                cbhyVar.f(pzjVar.d);
                cbhyVar.d(pzjVar.e);
                cbhyVar.h(pzjVar.f);
            }
            cbht cbhtVarA = cbhyVar.a(new Supplier() { // from class: cbhw
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new cbhu();
                }
            });
            final dqsy dqsyVarA = cbjq.a();
            dqru.b(cbjq.a(), "work_queue_work_manager_ids", cbhtVarA, new Function() { // from class: cbhr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarA.P("work_queue_work_manager_ids", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: cbhs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((ains) this.j.b()).e("Bugle.Pwq.ScheduledWorkManagerItems.Count", cbgp.a());
            cbhp cbhpVar = this.c;
            synchronized (cbhpVar.a) {
                List list = cbhpVar.b;
                if (list.isEmpty()) {
                    fdkf fdkfVar = cbhpVar.d;
                    if (fdkfVar != null) {
                        fdkfVar.t(null);
                    }
                    cbhpVar.d = null;
                }
                list.add(strQ);
            }
            i = 1;
        }
        if (i - 1 == 0) {
            return fdin.b(this.d, eicg.a(fcyi.a), fdjz.b, new cbgz(null, this, cbdgVar, cazgVarC));
        }
        ekrw ekrwVarG = e.g();
        ekrwVarG.X(eksq.a, "BugleWorkQueue");
        ekrd ekrdVar = (ekrd) ekrwVarG;
        ekrdVar.X(cbpp.d, cbdgVar.r());
        ekrdVar.X(cbpp.b, cbdgVar.q());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerScheduler", "launchToWorkManagerInTransaction$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_datamodel_workqueue_work_queue_work_manager_scheduler_AUTO_DEPS_ORIGINAL", 280, "WorkQueueWorkManagerScheduler.kt")).q("Not launching WM work: Queue already has a scheduled task");
        return null;
    }
}

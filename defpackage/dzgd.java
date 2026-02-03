package defpackage;

import android.content.Context;
import com.google.android.gms.learning.InAppTrainerOptions;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgd implements dzfx {
    private final Context a;
    private final Executor b;

    public dzgd(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public static /* synthetic */ defn d(dzgd dzgdVar, String str, String str2, int i, deeq deeqVar) {
        ddje ddjeVar = new ddje();
        ddjeVar.b(str);
        ddjeVar.d(str2);
        ddjeVar.c(i);
        InAppTrainerOptions inAppTrainerOptionsA = ddjeVar.a();
        Context context = dzgdVar.a;
        Executor executor = dzgdVar.b;
        return ddlc.c(context, executor, inAppTrainerOptionsA).c(executor, deeqVar);
    }

    static /* synthetic */ fgvl h(evqs evqsVar, evqs evqsVar2) {
        fgvk fgvkVar = (fgvk) fgvl.a.createBuilder();
        fgvo fgvoVar = (fgvo) fgvq.a.createBuilder();
        fgvn fgvnVar = fgvn.a;
        fgvm fgvmVar = (fgvm) fgvnVar.createBuilder();
        fgvj fgvjVar = fgvj.a;
        fgvi fgviVar = (fgvi) fgvjVar.createBuilder();
        fgviVar.a(evqsVar2);
        fgvj fgvjVar2 = (fgvj) fgviVar.build();
        fgvmVar.copyOnWrite();
        fgvn fgvnVar2 = (fgvn) fgvmVar.instance;
        fgvjVar2.getClass();
        fgvnVar2.c = fgvjVar2;
        fgvnVar2.b = 1;
        fgvoVar.a("token", (fgvn) fgvmVar.build());
        fgvm fgvmVar2 = (fgvm) fgvnVar.createBuilder();
        fgvi fgviVar2 = (fgvi) fgvjVar.createBuilder();
        fgviVar2.a(evqsVar);
        fgvj fgvjVar3 = (fgvj) fgviVar2.build();
        fgvmVar2.copyOnWrite();
        fgvn fgvnVar3 = (fgvn) fgvmVar2.instance;
        fgvjVar3.getClass();
        fgvnVar3.c = fgvjVar3;
        fgvnVar3.b = 1;
        fgvoVar.a("application_package", (fgvn) fgvmVar2.build());
        fgvq fgvqVar = (fgvq) fgvoVar.build();
        fgvkVar.copyOnWrite();
        fgvl fgvlVar = (fgvl) fgvkVar.instance;
        fgvqVar.getClass();
        fgvlVar.c = fgvqVar;
        fgvlVar.b |= 1;
        return (fgvl) fgvkVar.build();
    }

    private final void i(final String str, final deeq deeqVar) {
        final int iIntValue = erxf.a(str).intValue();
        eork.m(new Callable() { // from class: dzga
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dzgd.d(this.a, str, str, iIntValue, deeqVar);
            }
        }, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r3.schedule(r1) == 1) goto L15;
     */
    @Override // defpackage.dzfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(final java.lang.String r11, java.util.List<defpackage.evqs> r12) {
        /*
            r10 = this;
            android.content.Context r0 = r10.a
            java.lang.String r1 = r0.getPackageName()
            evqs r1 = defpackage.evqs.A(r1)
            ddjt r0 = defpackage.dzgg.a(r0)
            dzfy r2 = new dzfy
            r2.<init>()
            java.util.List r12 = defpackage.ekjz.g(r12, r2)
            ddjr r1 = new ddjr
            r1.<init>()
            java.util.List r12 = defpackage.ekjz.g(r12, r1)
            defpackage.ddjt.a(r11)
            android.content.Context r1 = r0.a
            java.lang.Class r2 = r0.d
            long r3 = defpackage.ddjk.a
            r3 = 3
            java.lang.String r4 = "ExampleStrDataTtlSvc"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L37
            java.lang.String r3 = "maybeScheduleExampleDataTtl"
            android.util.Log.d(r4, r3)
        L37:
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r3 = r1.getSystemService(r3)
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            if (r3 == 0) goto L9b
            r5 = 216934020(0xcee2684, float:3.6692887E-31)
            android.app.job.JobInfo r6 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m(r3, r5)
            android.content.ComponentName r7 = new android.content.ComponentName
            r7.<init>(r1, r2)
            android.app.job.JobInfo$Builder r1 = new android.app.job.JobInfo$Builder
            r1.<init>(r5, r7)
            r2 = 1
            android.app.job.JobInfo$Builder r1 = r1.setPersisted(r2)
            android.app.job.JobInfo$Builder r1 = r1.setRequiresCharging(r2)
            long r7 = defpackage.ddjk.a
            android.app.job.JobInfo$Builder r1 = r1.setPeriodic(r7)
            android.app.job.JobInfo r1 = r1.build()
            if (r6 == 0) goto L79
            boolean r5 = r6.isRequireCharging()
            boolean r9 = r1.isRequireCharging()
            if (r5 != r9) goto L79
            long r5 = r6.getIntervalMillis()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L7f
        L79:
            int r1 = r3.schedule(r1)     // Catch: java.lang.IllegalArgumentException -> L95
            if (r1 != r2) goto L9b
        L7f:
            ddjy r0 = r0.b
            ddjq r1 = new ddjq
            r1.<init>()
            com.google.common.util.concurrent.ListenableFuture r11 = r0.a(r1)
            dzgc r12 = new dzgc
            r12.<init>()
            java.util.concurrent.Executor r0 = r10.b
            defpackage.eork.r(r11, r12, r0)
            return
        L95:
            r11 = move-exception
            java.lang.String r12 = "Buggy schedule() implementation!"
            android.util.Log.e(r4, r12, r11)
        L9b:
            ddjs r11 = new ddjs
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzgd.a(java.lang.String, java.util.List):void");
    }

    @Override // defpackage.dzfx
    public void b(String str) {
        i(str, new deeq() { // from class: dzfz
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                return ((ddjd) defnVar.i()).a();
            }
        });
    }

    @Override // defpackage.dzfx
    public void c(String str) {
        i(str, new deeq() { // from class: dzgb
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                return ((ddjd) defnVar.i()).b();
            }
        });
    }
}

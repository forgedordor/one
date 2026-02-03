package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qee extends qbr {
    public Context c;
    public pzd d;
    public WorkDatabase e;
    public List f;
    public qcu g;
    public qlj h;
    public boolean i = false;
    public BroadcastReceiver.PendingResult j;
    public volatile qmy k;
    public final qhw l;
    public qmg m;
    private final fdjx p;
    public static final String a = qas.d("WorkManagerImpl");
    private static qee n = null;
    private static qee o = null;
    public static final Object b = new Object();

    public qee(Context context, final pzd pzdVar, qmg qmgVar, WorkDatabase workDatabase, final List list, qcu qcuVar, qhw qhwVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        qar qarVar = new qar(pzdVar.h);
        synchronized (qas.b) {
            if (qas.c == null) {
                qas.c = qarVar;
            }
        }
        this.c = applicationContext;
        this.m = qmgVar;
        this.e = workDatabase;
        this.g = qcuVar;
        this.l = qhwVar;
        this.d = pzdVar;
        this.f = list;
        qmgVar.getClass();
        fdjq fdjqVar = qmgVar.b;
        fdjqVar.getClass();
        fdjx fdjxVarB = fdjy.b(fdjqVar);
        this.p = fdjxVarB;
        final WorkDatabase workDatabase2 = this.e;
        this.h = new qlj(workDatabase2);
        qcu qcuVar2 = this.g;
        final qlo qloVar = qmgVar.a;
        String str = qcz.a;
        qcuVar2.c(new qcg() { // from class: qcx
            @Override // defpackage.qcg
            public final void a(final qiw qiwVar, boolean z) {
                String str2 = qcz.a;
                final pzd pzdVar2 = pzdVar;
                final List list2 = list;
                final WorkDatabase workDatabase3 = workDatabase2;
                qloVar.execute(new Runnable() { // from class: qcy
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = qcz.a;
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((qcw) it.next()).b(qiwVar.a);
                        }
                        qcz.a(pzdVar2, workDatabase3, list3);
                    }
                });
            }
        });
        this.m.a(new ForceStopRunnable(applicationContext, this));
        Context context2 = this.c;
        String str2 = qdj.a;
        context2.getClass();
        if (qlk.a(context2, pzdVar)) {
            qkk qkkVar = (qkk) workDatabase.D();
            final qkb qkbVar = new qkb(qkkVar, pff.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0));
            fdap fdapVar = new fdap() { // from class: pdh
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((pgz) obj).getClass();
                    return ((qkb) qkbVar).call();
                }
            };
            pex pexVar = qkkVar.a;
            pdz pdzVarB = pexVar.b();
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
            strArr.getClass();
            pgn pgnVar = pdzVarB.b;
            fcti fctiVarF = pgnVar.f(strArr);
            String[] strArr2 = (String[]) fctiVarF.a;
            int[] iArr = (int[]) fctiVarF.b;
            strArr2.getClass();
            iArr.getClass();
            fdui fduiVar = new fdui(new pgd(pgnVar, iArr, strArr2, null));
            peb pebVar = pdzVarB.h;
            fdpy.d(new fdtm(fdqq.a(fdqc.a(new fdri(new pgt(fdqc.a(fduiVar), pexVar, fdapVar), new qdh(null)))), new qdi(context2, null)), fdjxVarB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qee m(Context context) {
        qee qeeVarM;
        Object obj = b;
        synchronized (obj) {
            synchronized (obj) {
                qeeVarM = n;
                if (qeeVarM == null) {
                    qeeVarM = o;
                }
            }
            return qeeVarM;
        }
        if (qeeVarM == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof pzc)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            n(applicationContext, ((pzc) applicationContext).a());
            qeeVarM = m(applicationContext);
        }
        return qeeVarM;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    public static void n(Context context, pzd pzdVar) {
        peu peuVarA;
        synchronized (b) {
            qee qeeVar = n;
            if (qeeVar != null && o != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (qeeVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (o == null) {
                    applicationContext.getClass();
                    qmg qmgVar = new qmg(pzdVar.c);
                    final Context applicationContext2 = applicationContext.getApplicationContext();
                    applicationContext2.getClass();
                    qlo qloVar = qmgVar.a;
                    qloVar.getClass();
                    if (applicationContext.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
                        peuVarA = new peu(applicationContext2, WorkDatabase.class, null);
                        peuVarA.d = true;
                    } else {
                        peuVarA = pej.a(applicationContext2, WorkDatabase.class, "androidx.work.workdb");
                        peuVarA.c = new pjs() { // from class: qdm
                            @Override // defpackage.pjs
                            public final pjt a(pjr pjrVar) {
                                return new pkj().a(pjq.a(applicationContext2, pjrVar.b, pjrVar.c, true, true));
                            }
                        };
                    }
                    peuVarA.e(qloVar);
                    peuVarA.a.add(new qce());
                    peuVarA.b(qcl.c);
                    peuVarA.b(new qcv(applicationContext2, 2, 3));
                    peuVarA.b(qcm.c);
                    peuVarA.b(qcn.c);
                    peuVarA.b(new qcv(applicationContext2, 5, 6));
                    peuVarA.b(qco.c);
                    peuVarA.b(qcp.c);
                    peuVarA.b(qcq.c);
                    peuVarA.b(new qeh(applicationContext2));
                    peuVarA.b(new qcv(applicationContext2, 10, 11));
                    peuVarA.b(qch.c);
                    peuVarA.b(qci.c);
                    peuVarA.b(qcj.c);
                    peuVarA.b(qck.c);
                    peuVarA.b(new qcv(applicationContext2, 21, 22));
                    peuVarA.f = false;
                    peuVarA.g = true;
                    WorkDatabase workDatabase = (WorkDatabase) peuVarA.a();
                    Context applicationContext3 = applicationContext.getApplicationContext();
                    applicationContext3.getClass();
                    Context applicationContext4 = applicationContext3.getApplicationContext();
                    applicationContext4.getClass();
                    qhh qhhVar = new qhh(applicationContext4, qmgVar);
                    Context applicationContext5 = applicationContext3.getApplicationContext();
                    applicationContext5.getClass();
                    qhj qhjVar = new qhj(applicationContext5, qmgVar);
                    Context applicationContext6 = applicationContext3.getApplicationContext();
                    applicationContext6.getClass();
                    String str = qht.a;
                    qhs qhsVar = new qhs(applicationContext6, qmgVar);
                    Context applicationContext7 = applicationContext3.getApplicationContext();
                    applicationContext7.getClass();
                    qhw qhwVar = new qhw(applicationContext3, qhhVar, qhjVar, qhsVar, new qhu(applicationContext7, qmgVar));
                    qcu qcuVar = new qcu(applicationContext.getApplicationContext(), pzdVar, qmgVar, workDatabase);
                    qef qefVar = qef.a;
                    workDatabase.getClass();
                    o = new qee(applicationContext.getApplicationContext(), pzdVar, qmgVar, workDatabase, qefVar.a(applicationContext, pzdVar, qmgVar, workDatabase, qhwVar, qcuVar), qcuVar, qhwVar);
                }
                n = o;
            }
        }
    }

    @Override // defpackage.qbr
    public final qba a(String str) {
        str.getClass();
        pzf pzfVar = this.d.m;
        qlo qloVar = this.m.a;
        qloVar.getClass();
        return qbe.a(pzfVar, "CancelWorkByTag_".concat(str), qloVar, new qkx(this, str));
    }

    @Override // defpackage.qbr
    public final qba b(String str) {
        str.getClass();
        pzf pzfVar = this.d.m;
        qlo qloVar = this.m.a;
        qloVar.getClass();
        return qbe.a(pzfVar, "CancelWorkByName_".concat(str), qloVar, new qkv(str, this));
    }

    @Override // defpackage.qbr
    public final qba c(UUID uuid) {
        return qky.a(uuid, this);
    }

    @Override // defpackage.qbr
    public final qba e(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new qdl(this, null, pzz.b, list, null).a();
    }

    @Override // defpackage.qbr
    public final qba f(String str, pzy pzyVar, qbh qbhVar) {
        if (pzyVar != pzy.c) {
            return new qdl(this, str, pzyVar == pzy.b ? pzz.b : pzz.a, Collections.singletonList(qbhVar)).a();
        }
        pzf pzfVar = this.d.m;
        qlo qloVar = this.m.a;
        qloVar.getClass();
        return qbe.a(pzfVar, "enqueueUniquePeriodic_".concat(str), qloVar, new qel(this, str, qbhVar));
    }

    @Override // defpackage.qbr
    public final qba h(String str, pzz pzzVar, List list) {
        return new qdl(this, str, pzzVar, list).a();
    }

    @Override // defpackage.qbr
    public final qba i() {
        WorkDatabase workDatabase = this.e;
        pzd pzdVar = this.d;
        qmg qmgVar = this.m;
        workDatabase.getClass();
        pzdVar.getClass();
        qmgVar.getClass();
        qlo qloVar = qmgVar.a;
        qloVar.getClass();
        return qbe.a(pzdVar.m, "PruneWork", qloVar, new qll(workDatabase));
    }

    @Override // defpackage.qbr
    public final qbk k(String str, pzz pzzVar, List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new qdl(this, str, pzzVar, list);
    }

    @Override // defpackage.qbr
    public final ListenableFuture l(qbs qbsVar) {
        WorkDatabase workDatabase = this.e;
        qmg qmgVar = this.m;
        workDatabase.getClass();
        qmgVar.getClass();
        return qlt.a(workDatabase, qmgVar, new qlr(qbsVar));
    }

    public final void o() {
        synchronized (b) {
            this.i = true;
            BroadcastReceiver.PendingResult pendingResult = this.j;
            if (pendingResult != null) {
                pendingResult.finish();
                this.j = null;
            }
        }
    }

    public final void p() throws Throwable {
        pzf pzfVar = this.d.m;
        fdae fdaeVar = new fdae() { // from class: qed
            @Override // defpackage.fdae
            public final Object invoke() {
                qee qeeVar = this.a;
                Context context = qeeVar.c;
                String str = qfx.a;
                if (Build.VERSION.SDK_INT >= 34) {
                    qfv.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                List listE = qfx.e(context, jobScheduler);
                if (listE != null && !listE.isEmpty()) {
                    Iterator it = listE.iterator();
                    while (it.hasNext()) {
                        qfx.f(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                qjo qjoVarD = qeeVar.e.D();
                qkk qkkVar = (qkk) qjoVarD;
                pex pexVar = qkkVar.a;
                pexVar.m();
                pkl pklVarD = qkkVar.h.d();
                try {
                    pexVar.n();
                    try {
                        pklVarD.a();
                        pexVar.q();
                        qkkVar.h.f(pklVarD);
                        qcz.a(qeeVar.d, qeeVar.e, qeeVar.f);
                        return fctx.a;
                    } finally {
                        ((qkk) qjoVarD).a.o();
                    }
                } catch (Throwable th) {
                    qkkVar.h.f(pklVarD);
                    throw th;
                }
            }
        };
        boolean zC = plm.c();
        if (zC) {
            try {
                plm.a("ReschedulingWork");
            } catch (Throwable th) {
                if (zC) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        fdaeVar.invoke();
        if (zC) {
            Trace.endSection();
        }
    }

    public final void q(qiw qiwVar, int i) {
        this.m.a(new qlu(this.g, new qda(qiwVar), true, i));
    }
}

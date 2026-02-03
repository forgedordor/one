package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfx implements qcw {
    public static final String a = qas.d("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final qfw d;
    private final WorkDatabase e;
    private final pzd f;

    public qfx(Context context, WorkDatabase workDatabase, pzd pzdVar) {
        JobScheduler jobSchedulerA = qfv.a(context);
        qfw qfwVar = new qfw(context);
        this.b = context;
        this.c = jobSchedulerA;
        this.d = qfwVar;
        this.e = workDatabase;
        this.f = pzdVar;
    }

    public static qiw a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new qiw(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = qfv.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            qas.c();
            Log.e(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.qcw
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.b;
        JobScheduler jobScheduler = this.c;
        List<JobInfo> listE = e(context, jobScheduler);
        if (listE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : listE) {
                qiw qiwVarA = a(jobInfo);
                if (qiwVarA != null && str.equals(qiwVarA.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(jobScheduler, ((Integer) it.next()).intValue());
        }
        qiq qiqVarA = this.e.A();
        qiu qiuVar = (qiu) qiqVarA;
        pex pexVar = qiuVar.a;
        pexVar.m();
        pkl pklVarD = qiuVar.c.d();
        pklVarD.g(1, str);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
            } finally {
                ((qiu) qiqVarA).a.o();
            }
        } finally {
            qiuVar.c.f(pklVarD);
        }
    }

    @Override // defpackage.qcw
    public final void c(qjn... qjnVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.e;
        final qld qldVar = new qld(workDatabase);
        for (qjn qjnVar : qjnVarArr) {
            workDatabase.n();
            try {
                qjo qjoVarD = workDatabase.D();
                String str = qjnVar.c;
                qjn qjnVarB = qjoVarD.b(str);
                if (qjnVarB == null) {
                    qas.c();
                    Log.w(a, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.q();
                } else if (qjnVarB.d != qbo.a) {
                    qas.c();
                    Log.w(a, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.q();
                } else {
                    qiw qiwVarA = qkl.a(qjnVar);
                    qio qioVarA = qip.a(workDatabase.A(), qiwVarA);
                    if (qioVarA != null) {
                        iIntValue = qioVarA.c;
                    } else {
                        pzd pzdVar = this.f;
                        final int i = pzdVar.i;
                        final int i2 = pzdVar.j;
                        Object objF = qldVar.a.f(new Callable() { // from class: qlc
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = qldVar.a;
                                int i3 = i;
                                int iA = qle.a(workDatabase2, "next_job_scheduler_id");
                                if (i3 > iA || iA > i2) {
                                    qle.b(workDatabase2, "next_job_scheduler_id", i3 + 1);
                                } else {
                                    i3 = iA;
                                }
                                return Integer.valueOf(i3);
                            }
                        });
                        objF.getClass();
                        iIntValue = ((Number) objF).intValue();
                    }
                    if (qioVarA == null) {
                        workDatabase.A().a(qiv.a(qiwVarA, iIntValue));
                    }
                    g(qjnVar, iIntValue);
                    workDatabase.q();
                }
                workDatabase.o();
            } catch (Throwable th) {
                this.e.o();
                throw th;
            }
        }
    }

    @Override // defpackage.qcw
    public final boolean d() {
        return true;
    }

    public final void g(qjn qjnVar, int i) {
        int i2;
        String str;
        pzj pzjVar = qjnVar.l;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = qjnVar.c;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", qjnVar.v);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", qjnVar.f());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.d.b).setRequiresCharging(pzjVar.c);
        boolean z = pzjVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        NetworkRequest networkRequestA = pzjVar.a();
        if (Build.VERSION.SDK_INT < 28 || networkRequestA == null) {
            int i3 = pzjVar.j;
            if (Build.VERSION.SDK_INT < 30 || i3 != 6) {
                int i4 = i3 - 1;
                if (i4 == 0) {
                    i2 = 0;
                } else if (i4 != 1) {
                    i2 = 2;
                    if (i4 != 2) {
                        i2 = 3;
                        if (i4 != 3) {
                            i2 = 4;
                            if (i4 != 4) {
                                qas qasVarC = qas.c();
                                String str3 = qfw.a;
                                Objects.toString(qat.a(i3));
                                qasVarC.a(str3, "API version too low. Cannot convert network type value ".concat(qat.a(i3)));
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z) {
            extras.setBackoffCriteria(qjnVar.o, qjnVar.n == pza.b ? 0 : 1);
        }
        long jMax = Math.max(qjnVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!qjnVar.s) {
            extras.setImportantWhileForeground(true);
        }
        if (pzjVar.b()) {
            for (pzi pziVar : pzjVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(pziVar.a, pziVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(pzjVar.g);
            extras.setTriggerContentMaxDelay(pzjVar.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(pzjVar.e);
        extras.setRequiresStorageNotLow(pzjVar.f);
        int i5 = qjnVar.m;
        if (Build.VERSION.SDK_INT >= 31 && qjnVar.s && i5 <= 0 && jMax <= 0) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str = qjnVar.z) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        qas qasVarC2 = qas.c();
        String str4 = a;
        qasVarC2.a(str4, a.B(i, str2, "Scheduling work ID ", "Job ID "));
        try {
            if (this.c.schedule(jobInfoBuild) == 0) {
                qas.c();
                Log.w(str4, "Unable to schedule work ID " + str2);
                if (qjnVar.s && qjnVar.t == qbf.a) {
                    qjnVar.s = false;
                    qas.c().a(str4, String.format("Scheduling a non-expedited job (work ID %s)", str2));
                    g(qjnVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.b;
            WorkDatabase workDatabase = this.e;
            int i6 = qfv.a;
            int size = workDatabase.D().d().size();
            String strAF = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler jobSchedulerA = qfv.a(context);
                List listB = qfv.b(jobSchedulerA);
                if (listB != null) {
                    List listE = e(context, jobSchedulerA);
                    int size2 = listE != null ? listB.size() - listE.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    List listE2 = e(context, (JobScheduler) systemService);
                    int size3 = listE2 != null ? listE2.size() : 0;
                    strAF = fcva.aF(fcur.K(new String[]{listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                List listE3 = e(context, qfv.a(context));
                if (listE3 != null) {
                    strAF = listE3.size() + " jobs from WorkManager";
                }
            }
            String str6 = "JobScheduler " + (Build.VERSION.SDK_INT >= 31 ? 150 : 100) + " job limit exceeded.\nIn JobScheduler there are " + strAF + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.";
            qas.c();
            Log.e(a, str6);
            throw new IllegalStateException(str6, e);
        } catch (Throwable th) {
            qas.c();
            String str7 = a;
            Objects.toString(qjnVar);
            Log.e(str7, "Unable to schedule ".concat(String.valueOf(qjnVar)), th);
        }
    }
}

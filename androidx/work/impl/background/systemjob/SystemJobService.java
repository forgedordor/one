package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.a;
import defpackage.qas;
import defpackage.qcd;
import defpackage.qcg;
import defpackage.qcu;
import defpackage.qda;
import defpackage.qdc;
import defpackage.qdd;
import defpackage.qec;
import defpackage.qee;
import defpackage.qiw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements qcg {
    private static final String a = qas.d("SystemJobService");
    private qee b;
    private final Map c = new HashMap();
    private final qdd d = qdc.a(false);
    private qec e;

    private static qiw b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new qiw(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.a(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.qcg
    public final void a(qiw qiwVar, boolean z) {
        c("onExecuted");
        qas.c().a(a, qiwVar.a.concat(" executed on JobScheduler"));
        JobParameters jobParameters = (JobParameters) this.c.remove(qiwVar);
        this.d.a(qiwVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            qee qeeVarM = qee.m(getApplicationContext());
            this.b = qeeVarM;
            qcu qcuVar = qeeVarM.g;
            this.e = new qec(qcuVar, qeeVarM.m);
            qcuVar.c(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            qas.c();
            Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        qee qeeVar = this.b;
        if (qeeVar != null) {
            qeeVar.g.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        c("onStartJob");
        if (this.b == null) {
            qas.c().a(a, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        qiw qiwVarB = b(jobParameters);
        if (qiwVarB == null) {
            qas.c();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        Map map = this.c;
        if (map.containsKey(qiwVarB)) {
            qas qasVarC = qas.c();
            String str = a;
            Objects.toString(qiwVarB);
            qasVarC.a(str, "Job is already being executed by SystemJobService: ".concat(qiwVarB.toString()));
            return false;
        }
        qas qasVarC2 = qas.c();
        String str2 = a;
        Objects.toString(qiwVarB);
        qasVarC2.a(str2, "onStartJob for ".concat(qiwVarB.toString()));
        map.put(qiwVarB, jobParameters);
        qcd qcdVar = new qcd();
        if (jobParameters.getTriggeredContentUris() != null) {
            qcdVar.a = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            jobParameters.getNetwork();
        }
        this.e.b(this.d.b(qiwVarB), qcdVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        c("onStopJob");
        if (this.b == null) {
            qas.c().a(a, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        qiw qiwVarB = b(jobParameters);
        if (qiwVarB == null) {
            qas.c();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        qas qasVarC = qas.c();
        String str = a;
        Objects.toString(qiwVarB);
        qasVarC.a(str, "onStopJob for ".concat(qiwVarB.toString()));
        this.c.remove(qiwVarB);
        qda qdaVarA = this.d.a(qiwVarB);
        if (qdaVarA != null) {
            int i = -512;
            if (Build.VERSION.SDK_INT >= 31) {
                int stopReason = jobParameters.getStopReason();
                switch (stopReason) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i = stopReason;
                        break;
                }
            }
            this.e.c(qdaVarA, i);
        }
        qcu qcuVar = this.b.g;
        String str2 = qiwVarB.a;
        synchronized (qcuVar.j) {
            zContains = qcuVar.h.contains(str2);
        }
        return !zContains;
    }
}

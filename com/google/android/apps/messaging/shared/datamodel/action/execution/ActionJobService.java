package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.app.job.JobParameters;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionJobService;
import defpackage.auvh;
import defpackage.aymh;
import defpackage.ayoe;
import defpackage.ayoq;
import defpackage.cqce;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eijx;
import defpackage.fcsu;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ActionJobService extends ayoq {
    public static final cqce a = cqce.g("BugleDataModel", "ActionJobService");
    public ayoe b;
    public eigp c;
    public fcsu d;
    public fcsu e;

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        eieh eiehVarC = this.c.c("ActionJobService::StartJob", "com/google/android/apps/messaging/shared/datamodel/action/execution/ActionJobService", "onStartJob", 42);
        try {
            eijx.g(new Callable() { // from class: ayng
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final ActionJobService actionJobService = this.a;
                    final JobParameters jobParameters2 = jobParameters;
                    Action actionD = actionJobService.b.d(jobParameters2.getExtras());
                    boolean z = false;
                    if (actionD == null) {
                        actionJobService.jobFinished(jobParameters2, false);
                        cqaz.c("failed to unparcel scheduled Action");
                    } else {
                        aymq aymqVar = new aymq() { // from class: aynf
                            @Override // defpackage.aymq
                            public final void a() {
                                actionJobService.jobFinished(jobParameters2, false);
                            }
                        };
                        aymr aymrVar = new aymr(actionD.u, jobParameters2.getJobId(), aymqVar, null, true);
                        aymrVar.b = actionJobService.toString();
                        try {
                            ((aymh) actionJobService.d.b()).a(aymrVar, actionD);
                            z = true;
                        } catch (RuntimeException e) {
                            ActionJobService.a.o("RuntimeException when starting job.", e);
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }, (Executor) this.e.b()).k(auvh.b(), (Executor) this.e.b());
            eiehVarC.close();
            return true;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        eieh eiehVarC = this.c.c("ActionJobService::StopJob", "com/google/android/apps/messaging/shared/datamodel/action/execution/ActionJobService", "onStopJob", 78);
        try {
            ((aymh) this.d.b()).c(jobParameters.getJobId());
            eiehVarC.close();
            return false;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

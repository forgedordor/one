package com.google.android.ims.metrics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.dfdr;
import defpackage.dfxt;
import defpackage.dhja;
import defpackage.eosc;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PeriodicMetricsJobService extends JobService {
    public static final /* synthetic */ int d = 0;
    public fcsu a;
    public fcsu b;
    fcsu c;

    @Override // android.app.Service
    public final void onCreate() {
        dfxt dfxtVar = new dfxt(dfdr.a(this));
        this.a = dfxtVar.b;
        this.b = dfxtVar.c;
        this.c = dfxtVar.d;
        super.onCreate();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        dhja.o("Reporting periodic metrics.", new Object[0]);
        if (jobParameters.getJobId() != 30000) {
            dhja.q("Periodic metrics service started with unexpected job ID! Ignoring!", new Object[0]);
            jobFinished(jobParameters, false);
            return false;
        }
        ((eosc) this.c.b()).submit(new Runnable() { // from class: dfxu
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:109:0x020a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dfxu.run():void");
            }
        });
        jobFinished(jobParameters, false);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

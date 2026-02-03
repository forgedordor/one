package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.Log;
import j$.time.Instant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddjk extends JobService {
    public static final long a = TimeUnit.DAYS.toMillis(1);

    protected abstract ddjt a(Context context);

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (Log.isLoggable("ExampleStrDataTtlSvc", 3)) {
            Log.d("ExampleStrDataTtlSvc", "onStartJob");
        }
        ddjt ddjtVarA = a(this);
        final long millis = TimeUnit.DAYS.toMillis(30L);
        eork.r(ddjtVarA.b.a(new ejvr() { // from class: ddjp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ddjx ddjxVar = (ddjx) obj;
                diep diepVar = ddjxVar.b;
                long epochMilli = Instant.now().toEpochMilli() - millis;
                ddjy.b(String.format("Cleared %s records older than %s", Integer.valueOf(ddjxVar.a.delete("collections", a.u(epochMilli, "time< "), new String[0])), SimpleDateFormat.getDateTimeInstance().format(new Date(epochMilli))));
                return null;
            }
        }), new ddjj(this, jobParameters), eoqg.a);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (!Log.isLoggable("ExampleStrDataTtlSvc", 3)) {
            return true;
        }
        Log.d("ExampleStrDataTtlSvc", "onStopJob");
        return true;
    }
}

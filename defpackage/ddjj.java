package defpackage;

import android.app.job.JobParameters;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddjj implements eora {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ ddjk b;

    public ddjj(ddjk ddjkVar, JobParameters jobParameters) {
        this.a = jobParameters;
        this.b = ddjkVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.jobFinished(this.a, false);
    }

    @Override // defpackage.eora
    public final void hi(final Throwable th) {
        if (!(th instanceof ddjz)) {
            ddjk ddjkVar = this.b;
            ddjkVar.a(ddjkVar.getApplicationContext()).c.execute(new Runnable() { // from class: ddji
                @Override // java.lang.Runnable
                public final void run() {
                    throw new eotd(th);
                }
            });
        } else if (Log.isLoggable("ExampleStrDataTtlSvc", 4)) {
            Log.i("ExampleStrDataTtlSvc", "Unactionable SQLite exception", th);
        }
    }
}

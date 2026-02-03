package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneSchedulerWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhqu extends qbx {
    private final dhqm a;
    private final ahnb b;

    public dhqu(dhqm dhqmVar, ahnb ahnbVar) {
        dhqmVar.getClass();
        ahnbVar.getClass();
        this.a = dhqmVar;
        this.b = ahnbVar;
    }

    @Override // defpackage.qbx
    public final qaq a(Context context, String str, WorkerParameters workerParameters) {
        if (fdbq.f(str, PersephoneDownloadWorker.class.getName())) {
            return this.a.a(context, workerParameters);
        }
        if (fdbq.f(str, PersephoneSchedulerWorker.class.getName())) {
            return new PersephoneSchedulerWorker(context, workerParameters, this.b.a.a.dx());
        }
        return null;
    }
}

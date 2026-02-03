package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chzx {
    public final Context a;

    public chzx(Context context) {
        this.a = context;
    }

    public final void a() {
        qbr qbrVarA = qbq.a(this.a);
        pzy pzyVar = pzy.b;
        qbg qbgVar = new qbg(RcsAvailabilityLogWorker.class, 6L, TimeUnit.HOURS, 3L, TimeUnit.HOURS);
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        pzhVar.c = true;
        qbgVar.g(pzhVar.a());
        qbgVar.f(pza.b, 60L, TimeUnit.MINUTES);
        qbrVarA.f("com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker", pzyVar, (qbh) qbgVar.b());
    }
}

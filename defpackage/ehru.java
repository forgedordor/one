package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehru implements eyif {
    public static ebcg a(Context context, final long j) {
        final Application application = (Application) context;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final ehrs ehrsVar = new ehrs(atomicBoolean, application);
        return new ebcg() { // from class: ehrr
            @Override // defpackage.ebcg
            public final void a() {
                Application application2 = application;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = ehrsVar;
                application2.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                ecem.e(new ehrt(atomicBoolean, application2, activityLifecycleCallbacks, j));
            }
        };
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}

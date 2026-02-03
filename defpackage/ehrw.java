package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehrw {
    public final econ a;
    private final ecom b;
    private final ejxr c = ejxx.a(new ejxr() { // from class: ehrv
        @Override // defpackage.ejxr
        public final Object get() {
            ecog ecogVarD = this.a.a.d("/client_streamz/tiktok/logger_config/per_event_sampling_rate", new ecoi("app_package", String.class), new ecoi("sampling_rate_present", String.class));
            ecogVarD.c();
            return ecogVarD;
        }
    });

    public ehrw(ScheduledExecutorService scheduledExecutorService, ecod ecodVar, Application application) {
        econ econVarE = econ.e("tiktok");
        this.a = econVarE;
        ecom ecomVar = econVarE.c;
        if (ecomVar == null) {
            this.b = ecoq.c(ecodVar, scheduledExecutorService, econVarE, application);
        } else {
            this.b = ecomVar;
            ((ecoq) ecomVar).f = ecodVar;
        }
    }

    public final void a(double d, String str, String str2) {
        ((ecog) this.c.get()).b(d, str, str2);
    }
}

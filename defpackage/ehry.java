package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehry {
    public final econ a;
    public final ejxr b = ejxx.a(new ejxr() { // from class: ehrx
        @Override // defpackage.ejxr
        public final Object get() {
            ecog ecogVarD = this.a.a.d("/client_streamz/tiktok/grpc/global/duration", new ecoi("app_package", String.class), new ecoi("status", Integer.class));
            ecogVarD.c();
            return ecogVarD;
        }
    });
    private final ecom c;

    public ehry(ScheduledExecutorService scheduledExecutorService, ecod ecodVar, Application application) {
        econ econVarE = econ.e("tiktok");
        this.a = econVarE;
        ecom ecomVar = econVarE.c;
        if (ecomVar == null) {
            this.c = ecoq.c(ecodVar, scheduledExecutorService, econVarE, application);
        } else {
            this.c = ecomVar;
            ((ecoq) ecomVar).f = ecodVar;
        }
    }
}

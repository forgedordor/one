package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehsc {
    public final econ a;
    private final ecom b;
    private final ejxr c = ejxx.a(new ejxr() { // from class: ehsa
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/tiktok/sync/synclet/count", new ecoi("app_package", String.class), new ecoi("synclet_key_name", String.class), new ecoi("status", String.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });
    private final ejxr d = ejxx.a(new ejxr() { // from class: ehsb
        @Override // defpackage.ejxr
        public final Object get() {
            ecog ecogVarD = this.a.a.d("/client_streamz/tiktok/sync/synclet/duration", new ecoi("app_package", String.class), new ecoi("synclet_key_name", String.class), new ecoi("status", String.class));
            ecogVarD.c();
            return ecogVarD;
        }
    });

    public ehsc(ScheduledExecutorService scheduledExecutorService, ecod ecodVar, Application application) {
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

    public final void a(String str, String str2, String str3) {
        ((ecoe) this.c.get()).a(str, str2, str3);
    }

    public final void b(double d, String str, String str2, String str3) {
        ((ecog) this.d.get()).b(d, str, str2, str3);
    }
}

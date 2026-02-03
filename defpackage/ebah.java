package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebah {
    public final econ a;
    private final ecom c;
    private final ejxr d = ejxx.a(new ejxr() { // from class: ebad
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/tq_cobalt/worker/log_writer/error_count", new ecoi("customer_id", Integer.class), new ecoi("project_id", Integer.class), new ecoi("error_type", String.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });
    private final ejxr e = ejxx.a(new ejxr() { // from class: ebae
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/tq_cobalt/worker/log_uploader/error_count", new ecoi("customer_id", Integer.class), new ecoi("project_id", Integer.class), new ecoi("error_type", String.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });
    public final ejxr b = ejxx.a(new ejxr() { // from class: ebaf
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/tq_cobalt/worker/log_uploader/start", new ecoi("customer_id", Integer.class), new ecoi("project_id", Integer.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });
    private final ejxr f = ejxx.a(new ejxr() { // from class: ebag
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/tq_cobalt/worker/log_uploader/finish", new ecoi("customer_id", Integer.class), new ecoi("project_id", Integer.class), new ecoi("result", String.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });

    public ebah(ScheduledExecutorService scheduledExecutorService, ecod ecodVar) {
        econ econVarE = econ.e("tq_cobalt");
        this.a = econVarE;
        ecom ecomVar = econVarE.c;
        if (ecomVar == null) {
            this.c = ecoq.c(ecodVar, scheduledExecutorService, econVarE, null);
        } else {
            this.c = ecomVar;
            ((ecoq) ecomVar).f = ecodVar;
        }
    }

    public final void a(int i, int i2, String str) {
        ((ecoe) this.e.get()).a(Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    public final void b(int i, int i2, String str) {
        ((ecoe) this.f.get()).a(Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    public final void c(int i, int i2, String str) {
        ((ecoe) this.d.get()).a(Integer.valueOf(i), Integer.valueOf(i2), str);
    }
}

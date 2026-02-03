package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqrc {
    private static final ekrg b = ekrg.c("com/google/android/libraries/databaseannotations/support/D26rDatabaseInterfaceOverrider");
    public final ConcurrentMap a = new ConcurrentHashMap();
    private final fcsu c;

    public dqrc(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    public final void a() {
        dqsy dqsyVar = (dqsy) this.a.remove("backup");
        if (dqsyVar != null) {
            dqsyVar.t();
        }
    }

    public final void b() {
        this.a.remove("backup");
    }

    public final synchronized void c(String str) {
        if (dqru.y()) {
            ConcurrentMap concurrentMap = this.a;
            dqsy dqsyVar = (dqsy) concurrentMap.get("backup");
            if (dqsyVar != null) {
                if (!((dqom) dqsyVar.j()).a.equals(str)) {
                    throw new IllegalStateException("Attempting to set new override for db handle [backup], which is already set");
                }
                if (((dqom) dqsyVar.j()).a.equals(str)) {
                    ((ekrd) ((ekrd) b.h()).h("com/google/android/libraries/databaseannotations/support/D26rDatabaseInterfaceOverrider", "setStorageFileName", 56, "D26rDatabaseInterfaceOverrider.java")).t("Override already set for db handle [%s]", "backup");
                    return;
                }
            }
            dqrs dqrsVarJ = dqru.e("backup").j();
            int i = ((dqom) dqrsVarJ).c;
            dqrq dqrqVarI = dqrs.i();
            dqrqVarI.b(i);
            ((dqol) dqrqVarI).a = ((dqom) dqrsVarJ).b;
            dqrqVarI.g(((dqom) dqrsVarJ).d);
            dqrqVarI.f(str);
            dqrqVarI.c(true);
            dqrqVarI.d(((dqom) dqrsVarJ).f);
            dqrqVarI.e(((dqom) dqrsVarJ).g);
            dqrs dqrsVarA = dqrqVarI.a();
            bxhg bxhgVar = (bxhg) this.c.b();
            bxhgVar.getClass();
            concurrentMap.put("backup", bxhgVar.a(dqrsVarA));
        }
    }
}

package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class egsj {
    public abstract egsn a();

    public abstract void b(ejwi ejwiVar);

    public abstract void c(ejwi ejwiVar);

    public abstract void d(pzj pzjVar);

    public abstract void e(egsk egskVar);

    public abstract void f(Set set);

    public abstract void g(egsm egsmVar);

    public final egsn h() {
        egsn egsnVarA = a();
        if (((egry) egsnVarA).l.g()) {
            ejwl.b(!((String) r1.c()).contains(":"), "Worker target process must either be a custom process like 'my_process' or the empty String '' for the Android default process.");
        }
        return egsnVarA;
    }

    public final void i(pza pzaVar, egsl egslVar) {
        b(ejwi.j(egslVar));
        c(ejwi.j(pzaVar));
    }
}

package defpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class egsn {
    public static egsj n(Class cls) {
        egrx egrxVar = new egrx();
        egrxVar.a = cls;
        egrxVar.d(pzj.a);
        egrxVar.c = new egsa(0L, TimeUnit.SECONDS);
        egrxVar.f(ekon.a);
        egrxVar.e = new pzn().a();
        return egrxVar;
    }

    public abstract pzj a();

    public abstract pzs b();

    public abstract egsj c();

    public abstract egsl d();

    public abstract ejwi e();

    public abstract ejwi f();

    public abstract ejwi g();

    public abstract ejwi h();

    public abstract ejwi i();

    public abstract ejwi j();

    public abstract ejwi k();

    public abstract ekhx l();

    public abstract Class m();

    public final egsn o(Set set) {
        egsj egsjVarC = c();
        egsjVarC.f(ekpg.d(l(), set));
        return egsjVarC.h();
    }
}

package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzs implements cldy, cldt {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/restore/listeners/RestoreAfterAppUpdateBootAndPackageReplacedListener");
    public final fcsu a;
    public final Context b;
    public final ahzu c;
    private final fcsu e;
    private final fcsu f;
    private final fdjx g;

    public ahzs(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar, Context context, ahzv ahzvVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        context.getClass();
        ahzvVar.getClass();
        this.e = fcsuVar;
        this.a = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fdjxVar;
        this.b = context;
        this.c = ahzvVar.a(d, null, null);
    }

    public final Object a(List list, fcxy fcxyVar) {
        if (!list.isEmpty()) {
            this.c.h("Requesting a restore for %d executions", new Integer(list.size()));
            Object objI = ((ahwe) this.f.b()).i(list, fcxyVar);
            if (objI == fcyl.a) {
                return objI;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.cldt
    public final void b() {
        if (((apve) this.e.b()).a()) {
            this.c.a("RestoreAfterAppUpdate#onBootComplete called");
            auvw.k(this.g, null, null, new ahzq(this, null), 3);
        }
    }

    @Override // defpackage.cldy
    public final void c() {
        if (((apve) this.e.b()).a()) {
            this.c.a("RestoreAfterAppUpdate#onPackageReplaced called");
            auvw.k(this.g, null, null, new ahzr(this, null), 3);
        }
    }
}

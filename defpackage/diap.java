package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diap {
    public final dbjq a;
    public final Context b;
    public final diag c;
    public ekgb d;
    public final ekgb e;
    public final ekgp f;
    public final dian g;
    public final boolean h;
    public final boolean i;

    public diap(diao diaoVar) {
        this.a = diaoVar.a;
        Context context = diaoVar.b;
        context.getClass();
        this.b = context;
        diag diagVar = diaoVar.c;
        diagVar.getClass();
        this.c = diagVar;
        this.d = diaoVar.d;
        this.e = diaoVar.e;
        this.f = ekgp.j(diaoVar.f);
        this.g = diaoVar.g;
        this.h = diaoVar.h;
        this.i = diaoVar.i;
    }

    public final diak a(dbjt dbjtVar) {
        diak diakVar = (diak) this.f.get(dbjtVar);
        return diakVar == null ? new diak(dbjtVar, 2) : diakVar;
    }

    public final ekgb b() {
        ekgb ekgbVar = this.d;
        if (ekgbVar != null) {
            return ekgbVar;
        }
        dias diasVar = new dias(this.b);
        try {
            ekgb ekgbVarN = ekgb.n((List) ((eooi) eooq.f(diasVar.a.a(), new ejvr() { // from class: diaq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ((dibv) obj).b;
                }
            }, diasVar.b)).q());
            this.d = ekgbVarN;
            return ekgbVarN == null ? ekoe.a : ekgbVarN;
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Retrieval of recent fix data failed", e);
        }
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("entry_point", this.a);
        ejwfVarB.b("context", this.b);
        ejwfVarB.b("appDoctorLogger", this.c);
        ejwfVarB.b("recentFixes", this.d);
        ejwfVarB.b("fixesExecutedThisIteration", this.e);
        ejwfVarB.b("fixStatusesExecutedThisIteration", this.f);
        ejwfVarB.b("currentFixer", this.g);
        ejwfVarB.h("processRestartNeeded", this.h);
        ejwfVarB.h("appRestartNeeded", this.i);
        return ejwfVarB.toString();
    }
}

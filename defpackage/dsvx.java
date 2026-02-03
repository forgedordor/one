package defpackage;

import android.app.Activity;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvx {
    private final dsxb a;

    public dsvx(dsxb dsxbVar) {
        this.a = dsxbVar;
    }

    public static final void g(Activity activity) {
        ecem.c();
        dsvd dsvdVarC = dsvu.c(dsvu.a(activity));
        if (dsvdVarC != null) {
            new dsvw().b(dsvdVarC);
        } else if (Log.isLoggable("GIL", 3)) {
            Log.d("GIL", "Not resetting VE state (no root CVE)");
        }
    }

    @Deprecated
    public final dsuy a(int i) {
        return new dsuy(dsvc.a(i), new ejvr() { // from class: dsvv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                throw new UnsupportedOperationException("Do not call attach()");
            }
        }, this.a, this);
    }

    public final dsvd b(View view, dsuy dsuyVar) {
        ecem.c();
        dsxb dsxbVar = this.a;
        dsvd dsvdVarE = dsuyVar.e(dsxbVar);
        dsvd dsvdVarC = dsvu.c(view);
        if (dsvdVarC == null) {
            dsvu.s(view, dsvdVarE);
            return dsvdVarE;
        }
        if (!dsvdVarC.e()) {
            dsvdVarC.d(dsvdVarE);
            return dsvdVarC;
        }
        if (dsvdVarC.f()) {
            dsxbVar.d(new IllegalStateException("CVE is already impressed and cannot be replaced."));
            return dsvdVarC;
        }
        dsxbVar.d(new IllegalStateException("CVE is already attached and cannot be replaced."));
        return dsvdVarC;
    }

    public final void c(View view) {
        ecem.c();
        dsvd dsvdVarC = dsvu.c(view);
        if (dsvdVarC == null) {
            this.a.d(new NullPointerException("Tried to unbind a view without an associated CVE. This indicates a GIL instrumentation error. Is `ViewVisualElements#unbind` being invoked unconditionally when `ViewVisualElements#bind` is invoked conditionally?"));
        } else {
            dsvdVarC.c();
        }
    }

    public final void d(View view, dsuy dsuyVar) {
        dsvd dsvdVarC = dsvu.c(view);
        if (dsvdVarC == null) {
            b(view, dsuyVar);
            return;
        }
        long j = dsvdVarC.a().h;
        dsvp dsvpVar = dsuyVar.a;
        if (j != ((dsvq) dsvpVar.instance).h) {
            throw new IllegalArgumentException("Disallowed Difference in CVE");
        }
        if (dsvdVarC.a().g != ((dsvq) dsvpVar.instance).g) {
            if (Log.isLoggable("GIL", 3)) {
                Log.d("GIL", "Resetting impression for: ".concat(dsvdVarC.toString()));
            }
            new dswa(dsvdVarC.e.e()).b(dsvdVarC);
            dsvdVarC.b();
            dsvdVarC.d(dsuyVar.e(this.a));
        }
    }

    public final void e(View view, dsuy dsuyVar) {
        if (dsvu.c(view) == null) {
            b(view, dsuyVar);
        }
    }

    public final void f(Activity activity, dsuy dsuyVar) {
        b(dsvu.a(activity), dsuyVar);
    }
}

package defpackage;

import android.R;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtat {
    public static View a(dn dnVar, boolean z) {
        for (ea eaVar = dnVar.E; eaVar != null; eaVar = eaVar.E) {
            View view = eaVar.Q;
            if (view != null && (!z || dsvu.c(view) != null)) {
                return view;
            }
        }
        return dsvu.a(dnVar.G());
    }

    public static View b(dn dnVar) {
        d(dnVar);
        return dnVar.d.getWindow().findViewById(R.id.content);
    }

    public static void c(dn dnVar) {
        dsvd dsvdVarC = dsvu.c(b(dnVar));
        dsvdVarC.getClass();
        dsvd dsvdVarC2 = dsvu.c(a(dnVar, false));
        ejwl.m(dsvdVarC2 != null, "Parent fragment/activity must be instrumented");
        dtam.a(dsvdVarC, dsvdVarC2);
    }

    static void d(dn dnVar) {
        ejwl.b(dnVar.d != null, "Wrap OnShowListener with SyntheticDialogs#whileDialogExists");
    }
}

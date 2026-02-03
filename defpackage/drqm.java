package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqm implements drqr {
    final /* synthetic */ drqt a;

    public drqm(drqt drqtVar) {
        this.a = drqtVar;
    }

    @Override // defpackage.drpj
    public final void a(drti drtiVar) {
        throw null;
    }

    @Override // defpackage.drpj
    public final void b(drti drtiVar) {
        throw null;
    }

    @Override // defpackage.drqr
    public final void c(int i, int i2) {
        drrl drrlVar;
        int iG;
        int i3;
        drqt drqtVar = this.a;
        drrb drrbVar = drqtVar.y;
        if (drrbVar != null && (iG = drqt.g(i)) <= drrbVar.a() - 1 && iG != (i3 = drrbVar.d)) {
            drrbVar.d = iG;
            if (i3 != -1) {
                drrbVar.r(i3, false);
            }
            drrbVar.r(drrbVar.d, true);
        }
        RecyclerView recyclerView = drqtVar.w;
        if (recyclerView != null && (drrlVar = drqtVar.d) != null && drrlVar.l()) {
            recyclerView.aj(drqt.g(i));
        }
        if (i == 0) {
            drqtVar.d();
        }
        drqr drqrVar = drqtVar.c;
        if (drqrVar == null || i2 != 3) {
            return;
        }
        dpuq dpuqVar = (dpuq) ((dnrz) drqrVar).a.g.invoke();
        if (dpuqVar.a() == dpuv.b) {
            dpuqVar.c(dpuv.a);
        } else {
            dpuqVar.b(false);
        }
    }

    @Override // defpackage.drpj
    public final void d(View view) {
        throw null;
    }
}

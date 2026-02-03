package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqbc implements wd {
    final /* synthetic */ dobt a;

    public dqbc(dobt dobtVar) {
        this.a = dobtVar;
    }

    @Override // defpackage.wd
    public final void c(View view) {
        view.getClass();
        if (this.a.a.r().c(view) == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            yh yhVar = layoutParams instanceof yh ? (yh) layoutParams : null;
            if (yhVar != null) {
                yhVar.b = true;
            }
        }
    }

    @Override // defpackage.wd
    public final void d(View view) {
        view.getClass();
    }
}

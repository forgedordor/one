package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eedd implements Runnable {
    final /* synthetic */ eede a;
    private final CoordinatorLayout b;
    private final View c;

    public eedd(eede eedeVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = eedeVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eede eedeVar;
        OverScroller overScroller;
        View view = this.c;
        if (view == null || (overScroller = (eedeVar = this.a).b) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            eedeVar.C(this.b, view);
        } else {
            eedeVar.H(this.b, view, eedeVar.b.getCurrY());
            view.postOnAnimation(this);
        }
    }
}

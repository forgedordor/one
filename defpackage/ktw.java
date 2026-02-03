package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktw implements ldn {
    final /* synthetic */ CoordinatorLayout a;

    public ktw(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        CoordinatorLayout coordinatorLayout = this.a;
        if (!Objects.equals(coordinatorLayout.f, lgtVar)) {
            coordinatorLayout.f = lgtVar;
            boolean z = lgtVar.d() > 0;
            coordinatorLayout.g = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!lgtVar.u()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    int[] iArr = ley.a;
                    if (childAt.getFitsSystemWindows() && ((kub) childAt.getLayoutParams()).a != null && lgtVar.u()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return lgtVar;
    }
}

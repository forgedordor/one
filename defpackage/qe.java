package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qe implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ActivityChooserView a;

    public qe(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ActivityChooserView activityChooserView = this.a;
        if (activityChooserView.c()) {
            if (!activityChooserView.isShown()) {
                activityChooserView.a().m();
                return;
            }
            activityChooserView.a().v();
            lco lcoVar = activityChooserView.h;
            if (lcoVar != null) {
                lcoVar.subUiVisibilityChanged(true);
            }
        }
    }
}

package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjd implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ drje a;

    public drjd(drje drjeVar) {
        this.a = drjeVar;
    }

    public final void a(int i) {
        drje drjeVar = this.a;
        if (drjeVar.S) {
            int scrollY = drjeVar.ak.getScrollY();
            int bottom = drjeVar.aj.getBottom();
            int scrollY2 = drjeVar.ak.getScrollY() + i;
            boolean z = drjeVar.aj.getBottom() > i;
            if (!z || scrollY == 0) {
                drjeVar.ah.setElevation(0.0f);
                if (z) {
                }
                drjeVar.ai.setElevation(0.0f);
            }
            drjeVar.ah.setElevation(drjeVar.B().getDimensionPixelSize(R.dimen.hats_lib_question_view_elevation));
            if (bottom != scrollY2) {
                drjeVar.ai.setElevation(drjeVar.B().getDimensionPixelSize(R.dimen.hats_lib_survey_controls_view_elevation));
                return;
            }
            drjeVar.ai.setElevation(0.0f);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        a(this.a.ak.getHeight());
    }
}

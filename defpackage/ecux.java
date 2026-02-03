package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecux implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ ecuy a;

    public ecux(ecuy ecuyVar) {
        this.a = ecuyVar;
    }

    private static final void b(View view, float f) {
        if (view != null) {
            view.setElevation(f);
        }
    }

    public final void a(int i) {
        ecuy ecuyVar = this.a;
        if (ecuyVar.S) {
            int scrollY = ecuyVar.aj.getScrollY();
            int bottom = ecuyVar.ai.getBottom();
            int scrollY2 = ecuyVar.aj.getScrollY() + i;
            boolean z = ecuyVar.ai.getBottom() > i;
            if (!z || scrollY == 0) {
                b(ecuyVar.ag, 0.0f);
                if (z) {
                }
                b(ecuyVar.ah, 0.0f);
            }
            b(ecuyVar.ag, ecuyVar.B().getDimensionPixelSize(R.dimen.survey_question_view_elevation));
            if (bottom != scrollY2) {
                b(ecuyVar.ah, ecuyVar.B().getDimensionPixelSize(R.dimen.survey_controls_view_elevation));
                return;
            }
            b(ecuyVar.ah, 0.0f);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.b(fblh.c(ecrz.b)) || this.a.aV()) {
            a(this.a.aj.getHeight());
        }
    }
}

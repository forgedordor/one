package defpackage;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkx extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ dtli a;

    public dtkx(dtli dtliVar) {
        this.a = dtliVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) throws Resources.NotFoundException {
        dtli dtliVar = this.a;
        if (!dtliVar.A) {
            return false;
        }
        if (!dtliVar.w) {
            dtliVar.w = true;
            dtliVar.x = new LinearInterpolator();
            dtliVar.y = dtliVar.c(dtliVar.x);
            Animator animator = dtliVar.q;
            if (animator != null) {
                animator.cancel();
            }
            dtliVar.s.d();
        }
        dtliVar.u = dtlq.a(motionEvent2.getX(), motionEvent2.getY(), motionEvent.getX(), motionEvent.getY());
        float fMin = Math.min(1.0f, dtliVar.u / dtliVar.getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_max_transition_distance));
        dtliVar.v = fMin;
        float interpolation = dtliVar.x.getInterpolation(fMin);
        float f3 = 1.0f - interpolation;
        Rect rect = dtliVar.a;
        dtlm dtlmVar = dtliVar.e;
        float fExactCenterX = (rect.exactCenterX() - dtlmVar.h) * interpolation;
        float fExactCenterY = interpolation * (rect.exactCenterY() - dtlmVar.i);
        dtlmVar.setScale(f3);
        int i = (int) (255.0f * f3);
        dtlmVar.setAlpha(i);
        dtlmVar.setTranslationX(fExactCenterX);
        dtlmVar.setTranslationY(fExactCenterY);
        dtlk dtlkVar = dtliVar.f;
        dtlkVar.setAlpha(i);
        dtlkVar.setScale(f3);
        if (dtliVar.q()) {
            dtliVar.p.setElevation(f3 * dtliVar.h.getElevation());
        }
        dtliVar.g.a().setAlpha(1.0f - dtliVar.y.getInterpolation(dtliVar.v));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        dtli dtliVar = this.a;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (dtliVar.D != null && dtliVar.G.isTouchExplorationEnabled() && dtliVar.D.c == 5) {
            dtliVar.d(0);
            return true;
        }
        if (!dtliVar.B) {
            return true;
        }
        if (dtliVar.o(x, y) && dtliVar.e.e(x, y)) {
            return true;
        }
        dtliVar.d(0);
        return true;
    }
}

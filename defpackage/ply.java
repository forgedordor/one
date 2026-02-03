package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ply extends pnw {
    public ply() {
    }

    private static float P(pnh pnhVar, float f) {
        Float f2;
        return (pnhVar == null || (f2 = (Float) pnhVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator Q(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        pnn.c(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) pnn.b, f2);
        plx plxVar = new plx(view);
        objectAnimatorOfFloat.addListener(plxVar);
        j().F(plxVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.pnw, defpackage.pmx
    public final void c(pnh pnhVar) {
        pnw.O(pnhVar);
        Float fValueOf = (Float) pnhVar.b.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = pnhVar.b.getVisibility() == 0 ? Float.valueOf(pnn.a(pnhVar.b)) : Float.valueOf(0.0f);
        }
        pnhVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.pmx
    public final boolean d() {
        return true;
    }

    @Override // defpackage.pnw
    public final Animator f(ViewGroup viewGroup, View view, pnh pnhVar, pnh pnhVar2) {
        pno pnoVar = pnn.a;
        Animator animatorQ = Q(view, P(pnhVar, 1.0f), 0.0f);
        if (animatorQ == null) {
            pnn.c(view, P(pnhVar2, 1.0f));
        }
        return animatorQ;
    }

    @Override // defpackage.pnw
    public final Animator g(ViewGroup viewGroup, View view, pnh pnhVar) {
        pno pnoVar = pnn.a;
        return Q(view, P(pnhVar, 0.0f), 1.0f);
    }

    public ply(int i) {
        this.v = i;
    }
}

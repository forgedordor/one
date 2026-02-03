package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemf extends pmx {
    private static final void f(pnh pnhVar) {
        View view = pnhVar.b;
        if (view instanceof TextView) {
            pnhVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.pmx
    public final Animator a(ViewGroup viewGroup, pnh pnhVar, pnh pnhVar2) {
        if (pnhVar == null || pnhVar2 == null || !(pnhVar.b instanceof TextView)) {
            return null;
        }
        View view = pnhVar2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = pnhVar.a;
        Map map2 = pnhVar2.a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new eeme(textView));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.pmx
    public final void b(pnh pnhVar) {
        f(pnhVar);
    }

    @Override // defpackage.pmx
    public final void c(pnh pnhVar) {
        f(pnhVar);
    }
}

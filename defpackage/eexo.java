package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexo implements eexq {
    private final int a;

    public eexo(int i) {
        this.a = i;
    }

    private static Animator c(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new eexn(view, f3));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static boolean d(View view) {
        return view.getLayoutDirection() == 1;
    }

    private static final int e(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    @Override // defpackage.eexq
    public final Animator a(ViewGroup viewGroup, View view) {
        int iE = e(view.getContext());
        float translationX = view.getTranslationX();
        view.getTranslationY();
        int i = this.a;
        if (i == 8388611) {
            float f = iE;
            return c(view, d(viewGroup) ? f + translationX : translationX - f, translationX, translationX);
        }
        if (i != 8388613) {
            throw new IllegalArgumentException(a.g(i, "Invalid slide direction: "));
        }
        float f2 = iE;
        return c(view, d(viewGroup) ? translationX - f2 : translationX + f2, translationX, translationX);
    }

    @Override // defpackage.eexq
    public final Animator b(ViewGroup viewGroup, View view) {
        int iE = e(view.getContext());
        float translationX = view.getTranslationX();
        view.getTranslationY();
        int i = this.a;
        if (i == 8388611) {
            float f = iE;
            return c(view, translationX, d(viewGroup) ? translationX - f : translationX + f, translationX);
        }
        if (i != 8388613) {
            throw new IllegalArgumentException(a.g(i, "Invalid slide direction: "));
        }
        float f2 = iE;
        return c(view, translationX, d(viewGroup) ? f2 + translationX : translationX - f2, translationX);
    }
}

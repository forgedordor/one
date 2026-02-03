package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eels implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int a = 0;
    private final eelr b;
    private final View[] c;

    public eels(eelr eelrVar, View... viewArr) {
        this.b = eelrVar;
        this.c = viewArr;
    }

    public static eels a(View... viewArr) {
        return new eels(new eelr() { // from class: eelq
            @Override // defpackage.eelr
            public final void a(ValueAnimator valueAnimator, View view) {
                int i = eels.a;
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }, viewArr);
    }

    public static eels b(View... viewArr) {
        return new eels(new eelr() { // from class: eeln
            @Override // defpackage.eelr
            public final void a(ValueAnimator valueAnimator, View view) {
                int i = eels.a;
                view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }, viewArr);
    }

    public static eels c(View... viewArr) {
        return new eels(new eelr() { // from class: eelp
            @Override // defpackage.eelr
            public final void a(ValueAnimator valueAnimator, View view) {
                int i = eels.a;
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }, viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i >= viewArr.length) {
                return;
            }
            this.b.a(valueAnimator, viewArr[i]);
            i++;
        }
    }
}

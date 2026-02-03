package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeug implements Runnable {
    final /* synthetic */ BaseTransientBottomBar a;

    public eeug(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        eeul eeulVar = baseTransientBottomBar.j;
        if (eeulVar == null) {
            return;
        }
        if (eeulVar.getParent() != null) {
            eeulVar.setVisibility(0);
        }
        if (eeulVar.c == 1) {
            ValueAnimator valueAnimatorC = baseTransientBottomBar.c(0.0f, 1.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.g);
            valueAnimatorOfFloat.addUpdateListener(new eetu(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorC, valueAnimatorOfFloat);
            animatorSet.setDuration(baseTransientBottomBar.c);
            animatorSet.addListener(new eeuh(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int iB = baseTransientBottomBar.b();
        eeulVar.setTranslationY(iB);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iB, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f);
        valueAnimator.setDuration(baseTransientBottomBar.e);
        valueAnimator.addListener(new eetv(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new eetw(baseTransientBottomBar));
        valueAnimator.start();
    }
}

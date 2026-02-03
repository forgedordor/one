package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adei implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ adem b;

    public adei(View view, adem ademVar) {
        this.a = view;
        this.b = ademVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view.getWidth();
        view.getHeight();
        ImageView imageView = this.b.e;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 1.8f);
        objectAnimatorOfFloat.setInterpolator(new lud());
        objectAnimatorOfFloat.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, 1.8f);
        objectAnimatorOfFloat2.setInterpolator(new lud());
        objectAnimatorOfFloat2.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, 720.0f);
        objectAnimatorOfFloat3.setDuration(900L);
        objectAnimatorOfFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat3.setStartDelay(120L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 1.0f);
        objectAnimatorOfFloat4.setInterpolator(new lud());
        objectAnimatorOfFloat4.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, 1.0f);
        objectAnimatorOfFloat5.setInterpolator(new lud());
        objectAnimatorOfFloat5.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        animatorSet.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).after(objectAnimatorOfFloat3);
        animatorSet.setStartDelay(250L);
        animatorSet.start();
    }
}

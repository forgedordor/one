package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvnw {
    public AnimatorSet a;
    public View b;
    public final cvmt c;
    private AnimatorSet d;
    private AnimatorSet e;
    private ObjectAnimator f;

    public cvnw(cvmt cvmtVar) {
        this.c = cvmtVar;
    }

    public final AnimatorSet a(View view, View view2, View view3) throws Resources.NotFoundException {
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            return animatorSet;
        }
        ObjectAnimator objectAnimatorB = cvmt.b(view2, view.getResources().getFraction(R.fraction.audio_button_animation_start_size, 1, 1), view.getResources().getFraction(R.fraction.audio_button_animation_end_size, 1, 1), view.getResources().getInteger(R.integer.audio_button_background_animation_duration_millis));
        objectAnimatorB.setRepeatMode(1);
        objectAnimatorB.setInterpolator(new cvms(view.getResources().getFraction(R.fraction.audio_button_background_zooming_animation_interplator_mid_point, 1, 1)));
        ObjectAnimator duration = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view.getResources().getFraction(R.fraction.audio_button_pressed_indicator_alpha, 1, 1), 0.0f).setDuration(view.getResources().getInteger(R.integer.audio_button_pressed_indicator_animation_duration_millis));
        duration.setRepeatCount(-1);
        duration.setStartDelay(view.getResources().getInteger(R.integer.audio_button_pressed_indicator_animation_delay_millis));
        ObjectAnimator objectAnimatorB2 = cvmt.b(view3, view.getResources().getFraction(R.fraction.audio_button_pressed_indicator_animation_start_size, 1, 1), view.getResources().getFraction(R.fraction.audio_button_pressed_indicator_animation_end_size, 1, 1), view.getResources().getInteger(R.integer.audio_button_pressed_indicator_animation_duration_millis));
        objectAnimatorB2.setRepeatMode(1);
        objectAnimatorB2.setStartDelay(view.getResources().getInteger(R.integer.audio_button_pressed_indicator_animation_delay_millis));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) cvns.a, 1.0f, view.getResources().getFraction(R.fraction.audio_button_animation_start_size, 1, 1)).setDuration(view.getResources().getInteger(R.integer.audio_button_background_transition_animation_duration_millis));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.play(objectAnimatorB).with(duration).with(objectAnimatorB2).after(duration2);
        return this.e;
    }

    public final AnimatorSet b(View view, View view2) {
        if (this.d == null) {
            ObjectAnimator objectAnimatorB = cvmt.b(view2, this.b.getResources().getFraction(R.fraction.audio_timer_dot_zooming_animation_min_scale, 1, 1), this.b.getResources().getFraction(R.fraction.audio_timer_dot_zooming_animation_max_scale, 1, 1), this.b.getResources().getInteger(R.integer.audio_timer_dot_zooming_animation_duration_millis));
            objectAnimatorB.setInterpolator(new cvmr(this.b.getResources().getFraction(R.fraction.audio_timer_dot_zooming_animation_interplator_shift, 1, 1)));
            ObjectAnimator objectAnimatorA = cvmt.a(view, false, this.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            ObjectAnimator objectAnimatorA2 = cvmt.a(view2, false, this.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            AnimatorSet animatorSet = new AnimatorSet();
            this.d = animatorSet;
            animatorSet.addListener(new cvnu(view, view2));
            this.d.play(objectAnimatorA).with(objectAnimatorA2).before(objectAnimatorB);
        }
        return this.d;
    }

    public final ObjectAnimator c(View view) {
        if (this.f == null) {
            this.f = cvmt.a(view, false, this.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
        }
        return this.f;
    }
}

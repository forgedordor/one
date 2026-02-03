package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czoq {
    public final Context a;
    public final cogw b;
    public final Vibrator c;
    public final LottieAnimationView d;
    public Rect e;
    public final ebtj j;
    public long f = Long.MAX_VALUE;
    public int h = R.fraction.invisible_progress;
    public int i = R.fraction.invisible_progress;
    public boolean g = false;

    public czoq(Context context, cogw cogwVar, Vibrator vibrator, LottieAnimationView lottieAnimationView, ebtj ebtjVar) {
        this.a = context;
        this.b = cogwVar;
        this.c = vibrator;
        this.d = lottieAnimationView;
        this.j = ebtjVar;
        lottieAnimationView.c.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: czop
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) throws Throwable {
                Rect rect;
                czoq czoqVar = this.a;
                if (czoqVar.i == R.fraction.large_progress) {
                    if (Math.abs(czoqVar.d.a() - czoqVar.f(R.fraction.large_progress)) <= czoqVar.a.getResources().getFraction(R.fraction.half_frame_progress, 1, 1)) {
                        czoqVar.c.vibrate(VibrationEffect.createOneShot(r1.getResources().getInteger(R.integer.haptic_duration_ms), -1));
                        if (czoqVar.g || (rect = czoqVar.e) == null) {
                            return;
                        }
                        czoqVar.j.a(rect.left, czoqVar.e.top, czoqVar.e.width(), czoqVar.e.height());
                        czoqVar.g = true;
                    }
                }
            }
        });
    }

    public final void a() {
        if (this.h == this.i) {
            return;
        }
        LottieAnimationView lottieAnimationView = this.d;
        float fA = lottieAnimationView.a();
        float f = f(this.i);
        lottieAnimationView.n(f < fA ? -1.0f : 1.0f);
        lottieAnimationView.c.p(f < fA ? fA : f);
        if (f < fA) {
            fA = f;
        }
        lottieAnimationView.j(fA);
        lottieAnimationView.e();
    }

    public final void b() {
        if (this.g) {
            this.j.a(0, 0, 0, 0);
            this.g = false;
        }
    }

    public final void c(boolean z, float f, float f2) {
        if (this.b.f().toEpochMilli() < this.f) {
            return;
        }
        this.h = this.i;
        this.i = R.fraction.invisible_progress;
        if (z && this.g && e(f, f2)) {
            this.i = R.fraction.delete_progress;
        }
        b();
        a();
        this.f = Long.MAX_VALUE;
    }

    public final void d() {
        this.f = this.b.f().toEpochMilli() + this.a.getResources().getInteger(R.integer.animation_delay_ms);
        if (this.i != R.fraction.invisible_progress) {
            LottieAnimationView lottieAnimationView = this.d;
            lottieAnimationView.j(f(R.fraction.invisible_progress));
            lottieAnimationView.k(f(R.fraction.invisible_progress), true);
            this.h = R.fraction.invisible_progress;
            this.i = R.fraction.invisible_progress;
        }
    }

    public final boolean e(float f, float f2) {
        Rect rect = this.e;
        if (rect == null) {
            return false;
        }
        return rect.contains((int) f, (int) f2);
    }

    public final float f(int i) {
        return this.a.getResources().getFraction(i, 1, 1);
    }
}

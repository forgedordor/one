package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnh implements qoh {
    final /* synthetic */ LottieAnimationView a;

    public qnh(LottieAnimationView lottieAnimationView) {
        this.a = lottieAnimationView;
    }

    @Override // defpackage.qoh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th = (Throwable) obj;
        LottieAnimationView lottieAnimationView = this.a;
        int i = lottieAnimationView.b;
        if (i != 0) {
            lottieAnimationView.setImageResource(i);
        }
        LottieAnimationView.a.a(th);
    }
}

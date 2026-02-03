package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acxw implements View.OnAttachStateChangeListener {
    final /* synthetic */ acxy a;

    public acxw(acxy acxyVar) {
        this.a = acxyVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        acxy acxyVar = this.a;
        acxx acxxVar = new acxx(acxyVar);
        LottieAnimationView lottieAnimationView = acxyVar.s;
        lottieAnimationView.c.b.addListener(acxxVar);
        lottieAnimationView.d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        acxy acxyVar = this.a;
        LottieAnimationView lottieAnimationView = acxyVar.s;
        if (lottieAnimationView.o()) {
            lottieAnimationView.c();
        }
        LottieAnimationView lottieAnimationView2 = acxyVar.t;
        if (lottieAnimationView2.o()) {
            lottieAnimationView2.c();
        }
    }
}

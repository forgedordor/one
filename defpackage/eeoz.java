package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeoz extends lnx {
    @Override // defpackage.lnx
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = eepa.h;
        return ((eepa) obj).b() * 10000.0f;
    }

    @Override // defpackage.lnx
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        final eepa eepaVar = (eepa) obj;
        int i = eepa.h;
        eepaVar.d(f / 10000.0f);
        if (eepaVar.j.c(true)) {
            if (eepaVar.d == null) {
                Context context = eepaVar.i;
                TimeInterpolator timeInterpolator = eecd.a;
                eepaVar.f = eenh.a(context, R.attr.motionEasingStandardInterpolator, timeInterpolator);
                eepaVar.g = eenh.a(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
                eepaVar.d = new ValueAnimator();
                eepaVar.d.setDuration(500L);
                eepaVar.d.setFloatValues(0.0f, 1.0f);
                eepaVar.d.setInterpolator(null);
                eepaVar.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eeox
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        eepa eepaVar2 = eepaVar;
                        eepaVar2.b.e = eepaVar2.e.getInterpolation(eepaVar2.d.getAnimatedFraction());
                    }
                });
            }
            float fA = eepaVar.a((int) f);
            if (fA == eepaVar.c) {
                if (eepaVar.d.isRunning()) {
                    return;
                }
                eepaVar.c(fA);
                return;
            }
            if (eepaVar.d.isRunning()) {
                eepaVar.d.cancel();
            }
            eepaVar.c = fA;
            if (fA == 1.0f) {
                eepaVar.e = eepaVar.f;
                eepaVar.d.start();
            } else {
                eepaVar.e = eepaVar.g;
                eepaVar.d.reverse();
            }
        }
    }
}

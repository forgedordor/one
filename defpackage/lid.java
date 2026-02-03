package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lid implements Runnable {
    final /* synthetic */ lie a;

    public lid(lie lieVar) {
        this.a = lieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lie lieVar = this.a;
        if (lieVar.e) {
            if (lieVar.c) {
                lieVar.c = false;
                lic licVar = lieVar.a;
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                licVar.e = jCurrentAnimationTimeMillis;
                licVar.g = -1L;
                licVar.f = jCurrentAnimationTimeMillis;
                licVar.h = 0.5f;
            }
            lic licVar2 = lieVar.a;
            if ((licVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > licVar2.g + licVar2.i) || !lieVar.c()) {
                lieVar.e = false;
                return;
            }
            if (lieVar.d) {
                lieVar.d = false;
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                lieVar.b.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            if (licVar2.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float fA = licVar2.a(jCurrentAnimationTimeMillis2);
            long j = jCurrentAnimationTimeMillis2 - licVar2.f;
            licVar2.f = jCurrentAnimationTimeMillis2;
            lieVar.d((int) (j * (((-4.0f) * fA * fA) + (fA * 4.0f)) * licVar2.d));
            View view = lieVar.b;
            int[] iArr = ley.a;
            view.postOnAnimation(this);
        }
    }
}

package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tt implements Runnable {
    final /* synthetic */ tu a;

    public tt(tu tuVar) {
        this.a = tuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tu tuVar = this.a;
        tuVar.d();
        View view = tuVar.c;
        if (view.isEnabled() && !view.isLongClickable() && tuVar.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            tuVar.d = true;
        }
    }
}

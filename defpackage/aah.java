package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aah extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ aam b;

    public aah(aam aamVar) {
        this.b = aamVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        aam aamVar;
        View viewE;
        wv wvVarJ;
        if (!this.a || (viewE = (aamVar = this.b).e(motionEvent)) == null || (wvVarJ = aamVar.m.j(viewE)) == null) {
            return;
        }
        aag aagVar = aamVar.j;
        if (aagVar.j(aamVar.m, wvVarJ)) {
            int pointerId = motionEvent.getPointerId(0);
            int i = aamVar.i;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                aamVar.c = x;
                aamVar.d = y;
                aamVar.f = 0.0f;
                aamVar.e = 0.0f;
                if (aagVar.l()) {
                    aamVar.m(wvVarJ, 2);
                }
            }
        }
    }
}

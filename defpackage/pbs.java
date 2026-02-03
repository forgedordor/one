package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbs implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private final pcz a;

    public pbs() {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener();
        lcg.a(true);
        this.a = new pcz(simpleOnGestureListener);
    }

    public final void a(pda pdaVar, GestureDetector.OnGestureListener onGestureListener) {
        this.a.b(pdaVar, onGestureListener);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.a.a(motionEvent))).onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.a.a(motionEvent))).onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener) this.a.a(motionEvent)).onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return ((GestureDetector.OnGestureListener) this.a.a(motionEvent2)).onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener) this.a.a(motionEvent)).onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return ((GestureDetector.OnGestureListener) this.a.a(motionEvent2)).onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener) this.a.a(motionEvent)).onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.a.a(motionEvent))).onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener) this.a.a(motionEvent)).onSingleTapUp(motionEvent);
    }
}

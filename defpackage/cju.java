package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cju extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ cjv a;

    public cju(cjv cjvVar) {
        this.a = cjvVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        motionEvent.getClass();
        cjv cjvVar = this.a;
        cjvVar.m = motionEvent.getX();
        cjvVar.n = motionEvent.getY();
        cjvVar.o = 1;
        return true;
    }
}

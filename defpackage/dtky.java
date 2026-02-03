package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtky extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ dtli a;

    public dtky(dtli dtliVar) {
        this.a = dtliVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.e();
        return true;
    }
}

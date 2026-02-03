package defpackage;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class donq extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ donr a;
    final /* synthetic */ dohs b;
    final /* synthetic */ donn c;

    public donq(donr donrVar, dohs dohsVar, donn donnVar) {
        this.a = donrVar;
        this.b = dohsVar;
        this.c = donnVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        ekrd ekrdVar = (ekrd) donr.s.h().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$gestureDetector$1", "onLongPress", 162, "MediaViewHolder.kt");
        String str = this.a.w;
        dohs dohsVar = this.b;
        ekrdVar.I("%s long clicked at offset=%s with media=%s", str, pointF, dohsVar);
        this.c.a(dohsVar, pointF);
    }
}

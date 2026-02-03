package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dycs extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ dycv a;

    public dycs(dycv dycvVar) {
        this.a = dycvVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.c = false;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (((defpackage.dyii) r0.e).p != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScroll(android.view.MotionEvent r9, android.view.MotionEvent r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dycs.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}

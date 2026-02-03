package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbr implements wf, pcl {
    private final GestureDetector a;
    private boolean b;

    public pbr(GestureDetector gestureDetector) {
        lcg.a(true);
        this.a = gestureDetector;
    }

    private final void a() {
        this.a.onTouchEvent(MotionEvent.obtain(0L, 1L, 3, 0.0f, 0.0f, 0));
    }

    @Override // defpackage.wf
    public final void c(boolean z) {
        if (z) {
            this.b = true;
            a();
        }
    }

    @Override // defpackage.pcl
    public final void g() {
        this.b = false;
        a();
    }

    @Override // defpackage.wf
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && pbz.b(motionEvent)) {
            this.b = false;
        }
        return !this.b && this.a.onTouchEvent(motionEvent);
    }

    @Override // defpackage.pcl
    public final boolean k() {
        return true;
    }

    @Override // defpackage.wf
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}

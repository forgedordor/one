package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.google.android.apps.messaging.ui.mediapicker.camera.camerafocus.RenderOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czki implements czks {
    public RenderOverlay a;
    public int b;
    public int c;
    public int d;
    public int e;
    protected boolean f;

    @Override // defpackage.czks
    public final void d(Canvas canvas) {
        if (this.f) {
            f(canvas);
        }
    }

    @Override // defpackage.czks
    public void e(int i, int i2, int i3, int i4) {
        throw null;
    }

    public abstract void f(Canvas canvas);

    public final void g(boolean z) {
        this.f = z;
        h();
    }

    protected final void h() {
        RenderOverlay renderOverlay = this.a;
        if (renderOverlay != null) {
            renderOverlay.a.invalidate();
        }
    }

    @Override // defpackage.czks
    public boolean i(MotionEvent motionEvent) {
        throw null;
    }
}

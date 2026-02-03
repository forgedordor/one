package defpackage;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeca extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ ZoomableImageView a;

    public eeca(ZoomableImageView zoomableImageView) {
        this.a = zoomableImageView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ZoomableImageView zoomableImageView = this.a;
        if (zoomableImageView.g == null || zoomableImageView.h()) {
            return false;
        }
        float f = zoomableImageView.g.c;
        float f2 = 10.0f * f;
        float f3 = f * 0.7f;
        Matrix matrix = zoomableImageView.e;
        eecb eecbVar = new eecb(matrix);
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f4 = eecbVar.c * scaleFactor;
        eecbVar.c = f4;
        if (f4 < f3 || f4 >= f2) {
            return true;
        }
        matrix.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        zoomableImageView.b(matrix);
        zoomableImageView.setImageMatrix(matrix);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ZoomableImageView zoomableImageView = this.a;
        if (zoomableImageView.g == null || zoomableImageView.h() || new eecb(zoomableImageView.e).c >= zoomableImageView.g.c) {
            return;
        }
        zoomableImageView.f(zoomableImageView.d);
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView.FlingAnimationHelper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eebz extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ZoomableImageView a;

    public eebz(ZoomableImageView zoomableImageView) {
        this.a = zoomableImageView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ZoomableImageView zoomableImageView = this.a;
        if (zoomableImageView.h()) {
            return false;
        }
        if (zoomableImageView.g()) {
            zoomableImageView.f(zoomableImageView.d);
            return true;
        }
        if (zoomableImageView.getDrawable() == null) {
            return true;
        }
        float f = zoomableImageView.a;
        PointF pointF = new PointF(motionEvent.getX(0), motionEvent.getY(0));
        Matrix matrix = new Matrix(zoomableImageView.e);
        matrix.postScale(f, f, pointF.x, pointF.y);
        zoomableImageView.f(matrix);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ZoomableImageView zoomableImageView = this.a;
        if (!zoomableImageView.g() || zoomableImageView.h()) {
            return false;
        }
        float f3 = zoomableImageView.b;
        float f4 = (f2 / 1000.0f) * f3;
        float f5 = (f / 1000.0f) * f3;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
        float f6 = zoomableImageView.c;
        Matrix matrix = zoomableImageView.e;
        eecb eecbVar = new eecb(matrix);
        eecb eecbVar2 = new eecb(matrix);
        float f7 = (-fSqrt) / f6;
        eecbVar2.a = eecbVar.a + (f5 * f7);
        eecbVar2.b = eecbVar.b + (f4 * f7);
        ZoomableImageView.FlingAnimationHelper flingAnimationHelper = zoomableImageView.new FlingAnimationHelper();
        zoomableImageView.i = new AnimatorSet();
        zoomableImageView.i.play(ObjectAnimator.ofFloat(flingAnimationHelper, "matrixTranslateX", eecbVar.a, eecbVar2.a)).with(ObjectAnimator.ofFloat(flingAnimationHelper, "matrixTranslateY", eecbVar.b, eecbVar2.b));
        zoomableImageView.i.setDuration((int) f7);
        zoomableImageView.i.setInterpolator(new DecelerateInterpolator());
        zoomableImageView.i.start();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ZoomableImageView zoomableImageView = this.a;
        if (!zoomableImageView.g() || zoomableImageView.h()) {
            return false;
        }
        AnimatorSet animatorSet = zoomableImageView.h;
        if (animatorSet != null && animatorSet.isRunning()) {
            return true;
        }
        float f3 = -f;
        float f4 = -f2;
        Matrix matrix = zoomableImageView.e;
        matrix.postTranslate(f3, f4);
        zoomableImageView.b(matrix);
        zoomableImageView.setImageMatrix(matrix);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ZoomableImageView zoomableImageView = this.a;
        View.OnClickListener onClickListener = zoomableImageView.f;
        if (onClickListener == null) {
            return true;
        }
        onClickListener.onClick(zoomableImageView);
        return true;
    }
}

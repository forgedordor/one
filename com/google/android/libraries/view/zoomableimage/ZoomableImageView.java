package com.google.android.libraries.view.zoomableimage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import defpackage.czle;
import defpackage.czls;
import defpackage.eeby;
import defpackage.eebz;
import defpackage.eeca;
import defpackage.eecb;
import defpackage.einf;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ZoomableImageView extends AppCompatImageView {
    public final float a;
    public final float b;
    public final float c;
    public final Matrix d;
    public final Matrix e;
    public View.OnClickListener f;
    public eecb g;
    public AnimatorSet h;
    public AnimatorSet i;
    public czls j;
    private final long k;
    private final long l;
    private final GestureDetector m;
    private final ScaleGestureDetector n;
    private final Matrix o;
    private Size p;
    private RectF q;
    private Insets r;
    private Path s;
    private float t;

    /* compiled from: PG */
    public class FlingAnimationHelper {
        public FlingAnimationHelper() {
        }

        public void setMatrixTranslateX(float f) {
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            Matrix matrix = zoomableImageView.e;
            matrix.postTranslate(f - new eecb(matrix).a, 0.0f);
            zoomableImageView.b(matrix);
            zoomableImageView.setImageMatrix(matrix);
        }

        public void setMatrixTranslateY(float f) {
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            Matrix matrix = zoomableImageView.e;
            matrix.postTranslate(0.0f, f - new eecb(matrix).b);
            zoomableImageView.b(matrix);
            zoomableImageView.setImageMatrix(matrix);
        }
    }

    /* compiled from: PG */
    public class ZoomWithAnimationHelper {
        public final PointF a = new PointF();

        public ZoomWithAnimationHelper() {
        }

        public void setMatrixScale(float f) {
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            Matrix matrix = zoomableImageView.e;
            float f2 = f / new eecb(matrix).c;
            PointF pointF = this.a;
            matrix.postScale(f2, f2, pointF.x, pointF.y);
            zoomableImageView.setImageMatrix(matrix);
        }
    }

    public ZoomableImageView(Context context) {
        this(context, null);
    }

    private final RectF i(Matrix matrix) {
        eecb eecbVar = new eecb(matrix);
        float f = eecbVar.a;
        return new RectF(f, eecbVar.b, (eecbVar.c * this.p.getWidth()) + f, eecbVar.b + (eecbVar.c * this.p.getHeight()));
    }

    private final void j() {
        if (getWidth() == 0 || getHeight() == 0 || getDrawable() == null) {
            return;
        }
        Size size = new Size(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        this.p = size;
        if (size.getWidth() == 0 || this.p.getHeight() == 0) {
            return;
        }
        float width = getWidth();
        float width2 = this.p.getWidth();
        float height = getHeight();
        float height2 = this.p.getHeight();
        Matrix matrix = this.e;
        float fMin = Math.min(width / width2, height / height2);
        matrix.setScale(fMin, fMin);
        b(matrix);
        Matrix matrix2 = this.o;
        matrix2.set(matrix);
        this.d.set(matrix2);
        c();
        this.q = new RectF(getDrawable().copyBounds());
        this.g = new eecb(matrix2);
        czls czlsVar = this.j;
        if (czlsVar != null) {
            czle czleVar = new czle(a());
            View view = czlsVar.a.g.Q;
            view.getClass();
            einf.g(czleVar, view);
        }
    }

    private final void k() {
        RectF rectF = new RectF();
        this.e.mapRect(rectF, this.q);
        this.s.reset();
        Path path = this.s;
        float f = this.t;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    private final void l(Matrix matrix, long j) {
        PointF pointF;
        b(matrix);
        Matrix matrix2 = this.e;
        RectF rectFI = i(matrix2);
        RectF rectFI2 = i(matrix);
        if (new eecb(matrix2).equals(new eecb(matrix))) {
            pointF = new PointF(rectFI.centerX(), rectFI.centerY());
        } else {
            pointF = new PointF(((rectFI.left * rectFI2.right) - (rectFI.right * rectFI2.left)) / (((rectFI.left - rectFI.right) + rectFI2.right) - rectFI2.left), ((rectFI.top * rectFI2.bottom) - (rectFI.bottom * rectFI2.top)) / (((rectFI.top - rectFI.bottom) + rectFI2.bottom) - rectFI2.top));
        }
        eecb eecbVar = new eecb(matrix2);
        eecb eecbVar2 = new eecb(matrix);
        ZoomWithAnimationHelper zoomWithAnimationHelper = new ZoomWithAnimationHelper();
        zoomWithAnimationHelper.a.set(pointF);
        if (h()) {
            this.h.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.play(ObjectAnimator.ofFloat(zoomWithAnimationHelper, "matrixScale", eecbVar.c, eecbVar2.c));
        this.h.setDuration(j);
        this.h.setInterpolator(new DecelerateInterpolator());
        this.h.start();
    }

    private static final float m(float f, float f2, int i, int i2) {
        float f3 = i2 - (f2 * i);
        if (f3 >= 0.0f) {
            f3 /= 2.0f;
        } else if (f >= f3) {
            f3 = f > 0.0f ? 0.0f : f;
        }
        return f3 - f;
    }

    public final Rect a() {
        if (getDrawable() == null) {
            return new Rect();
        }
        RectF rectF = new RectF();
        this.d.mapRect(rectF, this.q);
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    public final void b(Matrix matrix) {
        eecb eecbVar = new eecb(matrix);
        matrix.postTranslate(m(eecbVar.a, eecbVar.c, this.p.getWidth(), getWidth()), m(eecbVar.b, eecbVar.c, this.p.getHeight(), getHeight()));
    }

    public final void c() {
        int width = (getWidth() - this.r.left) - this.r.right;
        int height = (getHeight() - this.r.top) - this.r.bottom;
        if (width <= 0 || height <= 0 || getDrawable() == null || this.p.getWidth() == 0 || this.p.getHeight() == 0) {
            return;
        }
        float width2 = this.p.getWidth();
        float height2 = this.p.getHeight();
        Matrix matrix = this.o;
        float fMin = Math.min(width / width2, height / height2);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.setScale(fMin, fMin);
        b(matrix2);
        Matrix matrix3 = this.d;
        matrix3.set(matrix2);
        l(matrix3, this.l);
    }

    public final void d(int i) {
        this.s = new Path();
        this.t = i;
        k();
    }

    public final void e(int i, int i2, int i3, int i4) {
        this.r = Insets.of(i, i2, i3, i4);
    }

    public final void f(Matrix matrix) {
        l(matrix, this.k);
    }

    public final boolean g() {
        eecb eecbVar = this.g;
        if (eecbVar != null) {
            return eecbVar.c < new eecb(this.e).c;
        }
        return false;
    }

    public final boolean h() {
        AnimatorSet animatorSet = this.h;
        return animatorSet != null && animatorSet.isRunning();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.t > 0.0f) {
            canvas.clipPath(this.s);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(g());
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.i.cancel();
        }
        return super.onTouchEvent(motionEvent) | this.m.onTouchEvent(motionEvent) | this.n.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (getDrawable() != null) {
            j();
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (getDrawable() != null) {
            j();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        if (this.t > 0.0f) {
            k();
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        if (getDrawable() == null) {
            j();
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = null;
        this.p = new Size(0, 0);
        this.q = new RectF();
        this.r = Insets.NONE;
        this.s = new Path();
        setScaleType(ImageView.ScaleType.MATRIX);
        setClickable(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, eeby.a, 0, 0);
        try {
            this.a = typedArrayObtainStyledAttributes.getFloat(4, 5.0f);
            this.k = typedArrayObtainStyledAttributes.getInt(3, 300);
            this.l = typedArrayObtainStyledAttributes.getInt(2, 165);
            this.b = typedArrayObtainStyledAttributes.getFloat(0, 0.5f);
            this.c = typedArrayObtainStyledAttributes.getFloat(1, -0.002f);
            typedArrayObtainStyledAttributes.recycle();
            this.m = new GestureDetector(context, new eebz(this));
            this.n = new ScaleGestureDetector(context, new eeca(this));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}

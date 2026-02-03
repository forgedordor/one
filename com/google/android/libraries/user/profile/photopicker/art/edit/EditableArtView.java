package com.google.android.libraries.user.profile.photopicker.art.edit;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;
import defpackage.dsvh;
import defpackage.eczx;
import defpackage.edai;
import defpackage.edaj;
import defpackage.edak;
import defpackage.edap;
import defpackage.edaq;
import defpackage.edar;
import defpackage.etxh;
import defpackage.etxi;
import defpackage.eygk;
import defpackage.fbgs;
import defpackage.fbgv;
import defpackage.ley;
import defpackage.lud;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class EditableArtView extends edap {
    private Paint A;
    private Paint B;
    private Paint C;
    private int D;
    private final Matrix E;
    private final Matrix F;
    private final Matrix G;
    private boolean H;
    private boolean I;
    private final Path J;
    private float K;
    private ValueAnimator L;
    private final RectF M;
    private final float[] N;
    private int O;
    private int P;
    private int Q;
    private int R;
    public final List a;
    public final Matrix b;
    public final Rect c;
    public final Rect d;
    public final Path e;
    public final Path f;
    float g;
    GestureDetector h;
    public boolean i;
    boolean j;
    public int k;
    public boolean l;
    public float m;
    public boolean n;
    public long o;
    public boolean p;
    public final RectF q;
    public final RectF r;
    public edar s;
    public dsvh t;
    public ScaleGestureDetector u;
    final ScaleGestureDetector.OnScaleGestureListener v;
    final GestureDetector.SimpleOnGestureListener w;
    public int x;
    public eczx y;

    public EditableArtView(Context context) {
        super(context);
        this.a = new ArrayList();
        this.b = new Matrix();
        this.E = new Matrix();
        this.F = new Matrix();
        this.G = new Matrix();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Path();
        this.f = new Path();
        this.J = new Path();
        this.k = 0;
        this.l = false;
        this.x = 1;
        this.q = new RectF();
        this.M = new RectF();
        this.r = new RectF();
        this.N = new float[9];
        this.v = new edai(this);
        this.w = new edaj(this);
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v() {
        Context context = getContext();
        if (!this.z) {
            ((eygk) context).ab().a(this);
        }
        Resources resources = context.getApplicationContext().getResources();
        this.D = resources.getColor(R.color.photo_picker_edit_background);
        Paint paint = new Paint();
        this.A = paint;
        paint.setAntiAlias(true);
        this.A.setColor(resources.getColor(R.color.photo_picker_edit_crop_dim));
        this.A.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.B = paint2;
        paint2.setAntiAlias(true);
        this.B.setColor(resources.getColor(R.color.photo_picker_edit_crop_highlight));
        this.B.setStyle(Paint.Style.STROKE);
        this.B.setStrokeWidth(resources.getDimension(R.dimen.photo_picker_edit_image_border_stroke_width));
        Paint paint3 = new Paint();
        this.C = paint3;
        paint3.setAntiAlias(true);
        this.C.setColor(resources.getColor(R.color.photo_picker_edit_crop_frame));
        this.C.setStyle(Paint.Style.STROKE);
        this.C.setStrokeWidth(resources.getDimension(R.dimen.photo_picker_edit_image_frame_stroke_width));
        this.h = new GestureDetector(context, this.w, null, !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct"));
        this.u = new ScaleGestureDetector(context, this.v);
        setContentDescription(getResources().getString(R.string.op3_edit_photo_a11y_label, Float.valueOf(fbgv.j() ? b() : a())));
    }

    private final void w(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, edaq.b, 0, 0);
        try {
            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0) + typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final float a() {
        float f = -this.s.k;
        Rect rect = this.c;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        Matrix matrix = this.b;
        matrix.postRotate(f, fCenterX, fCenterY);
        float[] fArr = this.N;
        matrix.getValues(fArr);
        float f2 = fArr[0];
        matrix.postRotate(this.s.k, rect.centerX(), rect.centerY());
        return f2;
    }

    public final float b() {
        if (this.m != 0.0f) {
            return a() / this.m;
        }
        return 1.0f;
    }

    public final int c() {
        return ((Drawable) this.a.get(0)).getIntrinsicHeight();
    }

    public final int d() {
        return ((Drawable) this.a.get(0)).getIntrinsicWidth();
    }

    public final void f(Rect rect) {
        float f = rect.top;
        RectF rectF = this.r;
        float fWidth = (f - rectF.top) / rectF.width();
        float fWidth2 = (rect.left - rectF.left) / rectF.width();
        float fWidth3 = rect.width() / rectF.width();
        float fWidth4 = rect.width() / rectF.width();
        etxh etxhVar = (etxh) etxi.a.createBuilder();
        etxhVar.copyOnWrite();
        etxi etxiVar = (etxi) etxhVar.instance;
        etxiVar.b |= 1;
        etxiVar.c = fWidth2;
        etxhVar.copyOnWrite();
        etxi etxiVar2 = (etxi) etxhVar.instance;
        etxiVar2.b |= 2;
        etxiVar2.d = fWidth;
        etxhVar.copyOnWrite();
        etxi etxiVar3 = (etxi) etxhVar.instance;
        etxiVar3.b |= 8;
        etxiVar3.f = fWidth + fWidth3;
        etxhVar.copyOnWrite();
        etxi etxiVar4 = (etxi) etxhVar.instance;
        etxiVar4.b |= 4;
        etxiVar4.e = fWidth2 + fWidth4;
        g((etxi) etxhVar.build());
    }

    public final void g(etxi etxiVar) {
        RectF rectF = this.r;
        float f = rectF.right - rectF.left;
        float f2 = (etxiVar.c * f) + rectF.left;
        float f3 = (etxiVar.e * f) + rectF.left;
        Rect rect = this.c;
        int i = rect.right - rect.left;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        Matrix matrix = this.b;
        float f4 = i / (f3 - f2);
        matrix.postScale(f4, f4, fCenterX, fCenterY);
        setContentDescription(getResources().getString(R.string.op3_edit_photo_a11y_label, Float.valueOf(fbgv.j() ? b() : a())));
        rectF.set(this.q);
        matrix.mapRect(rectF);
        float f5 = rectF.right - rectF.left;
        matrix.postTranslate(rect.left - ((etxiVar.c * f5) + rectF.left), rect.top - ((etxiVar.d * f5) + rectF.top));
        invalidate();
        s();
    }

    public final void h() {
        List list = this.a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Drawable) it.next()).setCallback(null);
            }
        }
        list.clear();
    }

    public final void i(boolean z) {
        List list = this.a;
        if (list.isEmpty() || !this.H) {
            return;
        }
        int iD = d();
        int iC = c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setBounds(0, 0, iD, iC);
        }
        if (this.I || z || (this.m == 0.0f && !list.isEmpty() && this.H)) {
            int iD2 = d();
            int iC2 = c();
            Rect rect = this.c;
            int i = rect.right - rect.left;
            int i2 = rect.bottom - rect.top;
            this.I = false;
            RectF rectF = this.q;
            float f = iD2;
            float f2 = iC2;
            rectF.set(0.0f, 0.0f, f, f2);
            float f3 = f2 / f;
            this.g = f3;
            float f4 = i2;
            float f5 = i;
            if (f3 > f4 / f5) {
                this.M.set(rect.left, r8 - r0, rect.right, ((rect.top + rect.bottom) / 2) + (Math.round(f5 * this.g) / 2));
            } else {
                this.M.set(r0 - r8, rect.top, ((rect.right + rect.left) / 2) + (Math.round(f4 / this.g) / 2), rect.bottom);
            }
            Matrix matrix = this.b;
            matrix.setRectToRect(rectF, this.M, Matrix.ScaleToFit.CENTER);
            float[] fArr = this.N;
            matrix.getValues(fArr);
            float f6 = fArr[0];
            this.m = f6;
            this.K = f6 * ((float) fbgs.a());
            Matrix matrix2 = this.E;
            matrix2.set(matrix);
            matrix2.invert(this.F);
            matrix.preConcat(this.s.l);
        }
    }

    public final void j(Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).draw(canvas);
        }
    }

    public final void k(boolean z) {
        this.j = z;
        invalidate();
    }

    public final void l() {
        this.b.set(this.E);
        if (fbgs.g()) {
            this.s.k = 0.0f;
        }
        invalidate();
        s();
    }

    public final void m(float f) {
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            final Matrix matrix = new Matrix(this.b);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
            this.L = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(new lud());
            this.L.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: edah
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    EditableArtView editableArtView = this.a;
                    Matrix matrix2 = editableArtView.b;
                    matrix2.set(matrix);
                    Rect rect = editableArtView.c;
                    matrix2.postRotate(fFloatValue, rect.centerX(), rect.centerY());
                    editableArtView.invalidate();
                    editableArtView.s();
                }
            });
            this.L.addListener(new edak(this, matrix, f));
            this.L.setDuration(fbgv.c());
            this.L.start();
        }
    }

    public final void n(int i, float f) {
        double d = f;
        float fCos = (float) Math.cos(Math.toRadians(d));
        float fSin = (float) Math.sin(Math.toRadians(d));
        float f2 = (fCos * (-0.715f)) + 0.715f;
        float f3 = ((-0.072f) * fCos) + 0.072f;
        float f4 = ((-0.213f) * fCos) + 0.213f;
        ((Drawable) this.a.get(i)).setColorFilter(new ColorMatrixColorFilter(new float[]{(0.787f * fCos) + 0.213f + (fSin * (-0.213f)), ((-0.715f) * fSin) + f2, (fSin * 0.928f) + f3, 0.0f, 0.0f, (0.143f * fSin) + f4, (0.285f * fCos) + 0.715f + (0.14f * fSin), f3 + ((-0.283f) * fSin), 0.0f, 0.0f, f4 + ((-0.787f) * fSin), f2 + (0.715f * fSin), (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        invalidate();
    }

    public final void o(float f, float f2, float f3) {
        float fMin = Math.min(Math.max(f, this.m), this.K) / a();
        this.b.postScale(fMin, fMin, f2, f3);
        r();
        invalidate();
        s();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.D);
        List list = this.a;
        if (list.isEmpty()) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        Matrix matrix = this.b;
        canvas.concat(matrix);
        j(canvas);
        canvas.restoreToCount(saveCount);
        RectF rectF = this.r;
        rectF.set(((Drawable) list.get(0)).getBounds());
        matrix.mapRect(rectF);
        int saveCount2 = canvas.getSaveCount();
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.A);
        canvas.save();
        canvas.clipPath(this.f);
        canvas.concat(matrix);
        j(canvas);
        canvas.restoreToCount(saveCount2);
        Rect rect = this.d;
        canvas.drawRect(rect, this.B);
        if (this.j) {
            if (this.x != 1) {
                int iWidth = rect.width() / 3;
                canvas.drawLine(rect.left, rect.top + iWidth, rect.right, rect.top + iWidth, this.B);
                canvas.drawLine(rect.left, rect.bottom - iWidth, rect.right, rect.bottom - iWidth, this.B);
                canvas.drawLine(rect.left + iWidth, rect.top, rect.left + iWidth, rect.bottom, this.B);
                canvas.drawLine(rect.right - iWidth, rect.top, rect.right - iWidth, rect.bottom, this.B);
            }
            int iWidth2 = rect.width() / 9;
            Path path = this.J;
            path.reset();
            path.moveTo(rect.left, rect.top + iWidth2);
            float f = -iWidth2;
            path.rLineTo(0.0f, f);
            float f2 = iWidth2;
            path.rLineTo(f2, 0.0f);
            path.moveTo(rect.right - iWidth2, rect.top);
            path.rLineTo(f2, 0.0f);
            path.rLineTo(0.0f, f2);
            path.moveTo(rect.right, rect.bottom - iWidth2);
            path.rLineTo(0.0f, f2);
            path.rLineTo(f, 0.0f);
            path.moveTo(rect.left + iWidth2, rect.bottom);
            path.rLineTo(f, 0.0f);
            path.rLineTo(0.0f, f);
            canvas.drawPath(path, this.C);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.H = true;
        int width = getWidth();
        int height = getHeight();
        int i5 = (width - this.O) - this.P;
        int i6 = (height - this.Q) - this.R;
        int iMin = Math.min(i5, i6);
        int i7 = i5 - iMin;
        int i8 = i6 - iMin;
        int[] iArr = ley.a;
        int i9 = (getLayoutDirection() == 0 ? this.O : this.P) + (i7 / 2);
        int i10 = this.Q + (i8 / 2);
        Rect rect = this.c;
        rect.set(i9, i10, i9 + iMin, iMin + i10);
        this.d.set(rect);
        Path path = this.e;
        path.reset();
        path.addCircle(rect.centerX(), rect.centerY(), rect.width() / 2.0f, Path.Direction.CCW);
        this.f.set(path);
        i(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i) {
        this.Q = i;
        this.I = true;
        requestLayout();
        invalidate();
    }

    public final void q(int i, Bitmap bitmap) {
        List list = this.a;
        ((Drawable) list.get(i)).setCallback(null);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        bitmapDrawable.setCallback(this);
        list.set(i, bitmapDrawable);
        requestLayout();
        invalidate();
    }

    public final void r() {
        RectF rectF = this.r;
        rectF.set(this.q);
        Matrix matrix = this.b;
        matrix.mapRect(rectF);
        Rect rect = this.c;
        float f = rect.left;
        float f2 = rect.right;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = f2 - f;
        float f6 = 0.0f;
        float f7 = f4 - f3 < f5 ? f + ((f5 - (f4 + f3)) / 2.0f) : f3 > f ? f - f3 : f4 < f2 ? f2 - f4 : 0.0f;
        float f8 = rect.top;
        float f9 = rect.bottom;
        float f10 = rectF.top;
        float f11 = rectF.bottom;
        float f12 = f9 - f8;
        if (f11 - f10 < f12) {
            f6 = f8 + ((f12 - (f11 + f10)) / 2.0f);
        } else if (f10 > f8) {
            f6 = f8 - f10;
        } else if (f11 < f9) {
            f6 = f9 - f11;
        }
        matrix.postTranslate(f7, f6);
    }

    public final void s() {
        Matrix matrix = this.G;
        matrix.setConcat(this.F, this.b);
        this.s.l = matrix;
    }

    public EditableArtView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new Matrix();
        this.E = new Matrix();
        this.F = new Matrix();
        this.G = new Matrix();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Path();
        this.f = new Path();
        this.J = new Path();
        this.k = 0;
        this.l = false;
        this.x = 1;
        this.q = new RectF();
        this.M = new RectF();
        this.r = new RectF();
        this.N = new float[9];
        this.v = new edai(this);
        this.w = new edaj(this);
        w(context, attributeSet);
        v();
    }

    public EditableArtView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.b = new Matrix();
        this.E = new Matrix();
        this.F = new Matrix();
        this.G = new Matrix();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Path();
        this.f = new Path();
        this.J = new Path();
        this.k = 0;
        this.l = false;
        this.x = 1;
        this.q = new RectF();
        this.M = new RectF();
        this.r = new RectF();
        this.N = new float[9];
        this.v = new edai(this);
        this.w = new edaj(this);
        w(context, attributeSet);
        v();
    }
}

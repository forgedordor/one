package com.google.android.libraries.user.profile.photopicker.edit;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import com.google.android.apps.messaging.R;
import defpackage.dsvh;
import defpackage.ednp;
import defpackage.ednq;
import defpackage.ednw;
import defpackage.ednx;
import defpackage.edoa;
import defpackage.eygk;
import defpackage.fbgv;
import defpackage.ley;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class EditablePhotoView extends ednw {
    private final Matrix A;
    private final Matrix B;
    private boolean C;
    private final Path D;
    private final RectF E;
    private final float[] F;
    private int G;
    private int H;
    private int I;
    private int J;
    public Drawable a;
    public final Matrix b;
    public final Rect c;
    float d;
    GestureDetector e;
    public boolean f;
    public int g;
    public boolean h;
    public float i;
    public float j;
    public boolean k;
    public long l;
    public ValueAnimator m;
    public boolean n;
    public final RectF o;
    public final RectF p;
    public edoa q;
    public dsvh r;
    public ScaleGestureDetector s;
    final ScaleGestureDetector.OnScaleGestureListener t;
    final GestureDetector.SimpleOnGestureListener u;
    private Paint w;
    private Paint x;
    private int y;
    private final Matrix z;

    public EditablePhotoView(Context context) {
        super(context);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = new ednp(this);
        this.u = new ednq(this);
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i() {
        Context context = getContext();
        if (!this.v) {
            ((eygk) context).ab().a(this);
        }
        Resources resources = context.getApplicationContext().getResources();
        this.y = resources.getColor(R.color.photo_picker_edit_background);
        Paint paint = new Paint();
        this.w = paint;
        paint.setAntiAlias(true);
        this.w.setColor(resources.getColor(R.color.photo_picker_edit_crop_dim));
        this.w.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.x = paint2;
        paint2.setAntiAlias(true);
        this.x.setColor(resources.getColor(R.color.photo_picker_edit_crop_highlight));
        this.x.setStyle(Paint.Style.STROKE);
        this.x.setStrokeWidth(resources.getDimension(R.dimen.photo_picker_edit_image_border_stroke_width));
        this.e = new GestureDetector(context, this.u, null, !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct"));
        this.s = new ScaleGestureDetector(context, this.t);
        setContentDescription(getResources().getString(R.string.op3_edit_photo_a11y_label, Float.valueOf(fbgv.j() ? b() : a())));
    }

    private final void j(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ednx.a, 0, 0);
        try {
            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0) + typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final float a() {
        float f = -this.q.k;
        Rect rect = this.c;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        Matrix matrix = this.b;
        matrix.postRotate(f, fCenterX, fCenterY);
        float[] fArr = this.F;
        matrix.getValues(fArr);
        float f2 = fArr[0];
        matrix.postRotate(this.q.k, rect.centerX(), rect.centerY());
        return f2;
    }

    public final float b() {
        if (this.i != 0.0f) {
            return a() / this.i;
        }
        return 1.0f;
    }

    public final void c() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.a = null;
        this.f = false;
    }

    public final void d(boolean z) {
        Drawable drawable = this.a;
        if (drawable == null || !this.C) {
            return;
        }
        this.a.setBounds(0, 0, drawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
        if (z || (this.i == 0.0f && this.a != null && this.C)) {
            int intrinsicWidth = this.a.getIntrinsicWidth();
            int intrinsicHeight = this.a.getIntrinsicHeight();
            Rect rect = this.c;
            int i = rect.right - rect.left;
            int i2 = rect.bottom - rect.top;
            RectF rectF = this.o;
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            rectF.set(0.0f, 0.0f, f, f2);
            float f3 = f2 / f;
            this.d = f3;
            float f4 = i2;
            float f5 = i;
            if (f3 > f4 / f5) {
                this.E.set(rect.left, r8 - r0, rect.right, ((rect.top + rect.bottom) / 2) + (Math.round(f5 * this.d) / 2));
            } else {
                this.E.set(r0 - r8, rect.top, ((rect.right + rect.left) / 2) + (Math.round(f4 / this.d) / 2), rect.bottom);
            }
            Matrix matrix = this.b;
            matrix.setRectToRect(rectF, this.E, Matrix.ScaleToFit.CENTER);
            float[] fArr = this.F;
            matrix.getValues(fArr);
            float f6 = fArr[0];
            this.i = f6;
            this.j = f6 * ((float) fbgv.a.get().a());
            Matrix matrix2 = this.z;
            matrix2.set(matrix);
            matrix2.invert(this.A);
            matrix.preConcat(this.q.l);
        }
    }

    public final void f() {
        Matrix matrix = this.B;
        matrix.setConcat(this.A, this.b);
        this.q.l = matrix;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.y);
        if (this.a == null) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        Matrix matrix = this.b;
        canvas.concat(matrix);
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount);
        RectF rectF = this.p;
        rectF.set(this.a.getBounds());
        matrix.mapRect(rectF);
        int saveCount2 = canvas.getSaveCount();
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.w);
        canvas.save();
        canvas.clipPath(this.D);
        canvas.concat(matrix);
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount2);
        canvas.drawRect(this.c, this.x);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.C = true;
        int width = getWidth();
        int height = getHeight();
        int i5 = (width - this.G) - this.H;
        int iMin = Math.min(i5, (height - this.I) - this.J);
        int i6 = i5 - iMin;
        int[] iArr = ley.a;
        int i7 = (getLayoutDirection() == 0 ? this.G : this.H) + (i6 / 2);
        int i8 = this.I;
        this.c.set(i7, i8, i7 + iMin, iMin + i8);
        Path path = this.D;
        path.reset();
        path.addCircle(r1.centerX(), r1.centerY(), r1.width() / 2.0f, Path.Direction.CCW);
        d(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.ScaleGestureDetector r0 = r6.s
            r1 = 1
            if (r0 == 0) goto L61
            android.view.GestureDetector r2 = r6.e
            if (r2 != 0) goto La
            goto L61
        La:
            boolean r2 = r6.f
            if (r2 == 0) goto L61
            r0.onTouchEvent(r7)
            android.view.GestureDetector r0 = r6.e
            r0.onTouchEvent(r7)
            int r0 = r7.getActionMasked()
            if (r0 == 0) goto L5b
            if (r0 == r1) goto L25
            r2 = 5
            if (r0 == r2) goto L5b
            r2 = 6
            if (r0 == r2) goto L25
            goto L61
        L25:
            int r0 = r6.g
            int r2 = r7.getPointerCount()
            int r2 = r2 + (-1)
            int r0 = r0 - r2
            r6.g = r0
            int r0 = r7.getPointerCount()
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L41
            long r4 = r7.getEventTime()
            r6.l = r4
            r6.h = r3
            goto L4b
        L41:
            int r7 = r7.getPointerCount()
            if (r7 != r1) goto L4b
            r4 = 0
            r6.l = r4
        L4b:
            boolean r7 = r6.n
            if (r7 == 0) goto L61
            dsvh r7 = r6.r
            dsvg r0 = defpackage.dsvg.c()
            r7.a(r0, r6)
            r6.n = r3
            goto L61
        L5b:
            int r7 = r7.getPointerCount()
            r6.g = r7
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public EditablePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = new ednp(this);
        this.u = new ednq(this);
        j(context, attributeSet);
        i();
    }

    public EditablePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = new ednp(this);
        this.u = new ednq(this);
        j(context, attributeSet);
        i();
    }
}

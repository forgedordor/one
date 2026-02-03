package com.google.android.apps.xeno.libraries.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.dbgf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CircularImageView extends ImageView {
    private static final ImageView.ScaleType a = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
    private final RectF c;
    private final RectF d;
    private final Matrix e;
    private final Paint f;
    private final Paint g;
    private int h;
    private int i;
    private Bitmap j;
    private BitmapShader k;
    private int l;
    private int m;
    private float n;
    private float o;
    private ColorFilter p;
    private boolean q;
    private boolean r;
    private boolean s;

    public CircularImageView(Context context) {
        super(context);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Matrix();
        this.f = new Paint();
        this.g = new Paint();
        this.h = -16777216;
        this.i = 0;
        a();
    }

    private final void a() {
        super.setScaleType(a);
        this.q = true;
        if (this.r) {
            b();
            this.r = false;
        }
    }

    private final void b() {
        float fWidth;
        float fHeight;
        if (!this.q) {
            this.r = true;
            return;
        }
        Bitmap bitmap = this.j;
        if (bitmap == null) {
            return;
        }
        this.k = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = this.f;
        paint.setAntiAlias(true);
        paint.setShader(this.k);
        Paint paint2 = this.g;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.h);
        paint2.setStrokeWidth(this.i);
        this.m = this.j.getHeight();
        this.l = this.j.getWidth();
        RectF rectF = this.d;
        float fWidth2 = 0.0f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        this.o = Math.min((rectF.height() - this.i) / 2.0f, (rectF.width() - this.i) / 2.0f);
        RectF rectF2 = this.c;
        rectF2.set(rectF);
        if (!this.s) {
            float f = this.i;
            rectF2.inset(f, f);
        }
        this.n = Math.min(rectF2.height() / 2.0f, rectF2.width() / 2.0f);
        Matrix matrix = this.e;
        matrix.set(null);
        if (this.l * rectF2.height() > rectF2.width() * this.m) {
            fWidth = rectF2.height() / this.m;
            fHeight = 0.0f;
            fWidth2 = (rectF2.width() - (this.l * fWidth)) * 0.5f;
        } else {
            fWidth = rectF2.width() / this.l;
            fHeight = (rectF2.height() - (this.m * fWidth)) * 0.5f;
        }
        matrix.setScale(fWidth, fWidth);
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF2.left, ((int) (fHeight + 0.5f)) + rectF2.top);
        this.k.setLocalMatrix(matrix);
        invalidate();
    }

    private static final Bitmap c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, b) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), b);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // android.widget.ImageView
    public final ImageView.ScaleType getScaleType() {
        return a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.n, this.f);
        if (this.i != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.o, this.g);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override // android.widget.ImageView
    public final void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.p) {
            return;
        }
        this.p = colorFilter;
        this.f.setColorFilter(colorFilter);
        invalidate();
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.j = bitmap;
        b();
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.j = c(drawable);
        b();
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        this.j = c(getDrawable());
        b();
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.j = c(getDrawable());
        b();
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != a) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Matrix();
        this.f = new Paint();
        this.g = new Paint();
        this.h = -16777216;
        this.i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbgf.a, i, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.h = typedArrayObtainStyledAttributes.getColor(0, -16777216);
        this.s = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}

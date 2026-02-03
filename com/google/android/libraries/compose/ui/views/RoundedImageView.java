package com.google.android.libraries.compose.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.messaging.R;
import defpackage.dofn;
import defpackage.dpzw;
import defpackage.dpzx;
import defpackage.dpzy;
import defpackage.dpzz;
import defpackage.dqaa;
import defpackage.fdbq;
import defpackage.fdbv;
import defpackage.fdcj;
import defpackage.fdcz;
import defpackage.fdeh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class RoundedImageView extends AppCompatImageView {
    static final /* synthetic */ fdeh[] a;
    public float b;
    private final fdcz c;
    private RectF d;
    private final Path e;
    private final Paint f;
    private int g;

    static {
        fdbv fdbvVar = new fdbv(RoundedImageView.class, "aspectRatio", "getAspectRatio()Lcom/google/android/libraries/compose/media/AspectRatio;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context) {
        super(context);
        context.getClass();
        this.c = new dpzy(this);
        this.e = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
    }

    private final void d(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dpzw.a, 0, 0);
        Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        boolean z = fValueOf.floatValue() > 0.0f;
        Boolean.valueOf(z).getClass();
        if (true != z) {
            fValueOf = null;
        }
        c(fValueOf != null ? new dofn(fValueOf.floatValue()) : null);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.g = typedArrayObtainStyledAttributes.getColor(3, getContext().getColor(R.color.rounded_image_view_default_background_fill));
        typedArrayObtainStyledAttributes.recycle();
        b();
    }

    public final void a() {
        this.f.setColor(0);
    }

    public final void b() {
        this.f.setColor(this.g);
    }

    public final void c(dofn dofnVar) {
        this.c.d(a[0], dofnVar);
    }

    @Override // android.view.View
    public final ViewOutlineProvider getOutlineProvider() {
        return new dpzx(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.getClass();
        RectF rectF = this.d;
        RectF rectF2 = null;
        if (rectF == null) {
            fdbq.c("dimensionsRect");
            rectF = null;
        }
        float f = this.b;
        canvas.drawRoundRect(rectF, f, f, this.f);
        Path path = this.e;
        path.reset();
        RectF rectF3 = this.d;
        if (rectF3 == null) {
            fdbq.c("dimensionsRect");
        } else {
            rectF2 = rectF3;
        }
        float f2 = this.b;
        path.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        dofn dofnVar = (dofn) this.c.c(a[0]);
        if (dofnVar != null) {
            if (size > 0 && size2 > 0) {
                int iA = dofnVar.a(size);
                if (iA <= size2) {
                    size2 = iA;
                } else {
                    size = dofnVar.b(size2);
                }
            } else if (size > 0) {
                size2 = dofnVar.a(size);
            } else if (size2 > 0) {
                size = dofnVar.b(size2);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        RectF rectF = this.d;
        if (rectF == null) {
            this.d = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        rectF.right = getMeasuredWidth();
        RectF rectF2 = this.d;
        if (rectF2 == null) {
            fdbq.c("dimensionsRect");
            rectF2 = null;
        }
        rectF2.bottom = getMeasuredHeight();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.d;
        float f = i;
        float f2 = i2;
        if (rectF == null) {
            this.d = new RectF(0.0f, 0.0f, f, f2);
            return;
        }
        rectF.right = f;
        RectF rectF2 = this.d;
        if (rectF2 == null) {
            fdbq.c("dimensionsRect");
            rectF2 = null;
        }
        rectF2.bottom = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.c = new dpzz(this);
        this.e = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
        if (attributeSet != null) {
            d(attributeSet);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.c = new dqaa(this);
        this.e = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
        if (attributeSet != null) {
            d(attributeSet);
        }
    }
}

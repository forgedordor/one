package com.google.android.apps.messaging.shared.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import defpackage.cpau;
import defpackage.cqaz;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.ekrz;
import defpackage.eksq;
import defpackage.eonc;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class RoundedImageView extends ImageView {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/ui/RoundedImageView");
    protected final RectF A;
    protected final int B;
    protected final boolean C;
    public int v;
    protected final Path w;
    protected int x;
    protected int y;
    protected int z;

    public RoundedImageView(Context context) {
        super(context);
        this.A = new RectF();
        this.w = new Path();
        this.v = 0;
        this.z = 0;
        this.B = 0;
        this.C = false;
    }

    private static int b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return eonc.e(i, size, i2);
        }
        if (mode == 0) {
            return Math.min(i, i2);
        }
        if (mode != 1073741824) {
            cqaz.c("Unreachable");
        }
        return size;
    }

    protected static final int m(int i, int i2) {
        return Math.min((int) Math.ceil(i2 * 1.7777778f), i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.v <= 0) {
            try {
                super.onDraw(canvas);
                return;
            } catch (RuntimeException e) {
                ekrg ekrgVar = a;
                ekrw ekrwVarI = ekrgVar.i();
                ekrz ekrzVar = eksq.a;
                ekrwVarI.X(ekrzVar, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/ui/RoundedImageView", "onDraw", (char) 137, "RoundedImageView.java")).q("AsyncImageView: Got runtime exception ");
                ekrw ekrwVarE = ekrgVar.e();
                ekrwVarE.X(ekrzVar, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/ui/RoundedImageView", "onDraw", 138, "RoundedImageView.java")).t("AsyncImageView: AsyncImageView.getParent() %s", getParent());
                return;
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.x != width || this.y != height) {
            RectF rectF = this.A;
            rectF.set(getPaddingLeft(), getPaddingTop(), width - getPaddingRight(), height - getPaddingBottom());
            Path path = this.w;
            path.reset();
            float f = this.v;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            this.x = width;
            this.y = height;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipPath(this.w);
        canvas.drawColor(this.z);
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e2) {
            ekrg ekrgVar2 = a;
            ekrw ekrwVarI2 = ekrgVar2.i();
            ekrz ekrzVar2 = eksq.a;
            ekrwVarI2.X(ekrzVar2, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(e2)).h("com/google/android/apps/messaging/shared/ui/RoundedImageView", "onDraw", '{', "RoundedImageView.java")).q("AsyncImageView: Got runtime exception ");
            ekrw ekrwVarE2 = ekrgVar2.e();
            ekrwVarE2.X(ekrzVar2, "Bugle");
            ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/ui/RoundedImageView", "onDraw", 124, "RoundedImageView.java")).t("AsyncImageView: AsyncImageView.getParent() %s", getParent());
        }
        if (isSelected()) {
            canvas.drawColor(this.B);
        }
        canvas.restoreToCount(saveCount);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        try {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (getAdjustViewBounds()) {
                if (this.C) {
                    int iM = m(measuredWidth, measuredHeight);
                    measuredHeight = m(measuredHeight, measuredWidth);
                    measuredWidth = iM;
                } else if (measuredWidth < getMinimumWidth() && measuredHeight < getMinimumHeight()) {
                }
                int mode = View.MeasureSpec.getMode(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                if (mode != 1073741824 || mode2 != 1073741824) {
                    int iB = b(getMinimumWidth(), getMaxWidth(), i);
                    int iB2 = b(getMinimumHeight(), getMaxHeight(), i2);
                    float f = measuredWidth / measuredHeight;
                    if (f != 0.0f) {
                        if (measuredWidth < iB) {
                            measuredHeight = b((int) (iB / f), getMaxHeight(), i2);
                            measuredWidth = (int) (measuredHeight * f);
                        }
                        if (measuredHeight < iB2) {
                            measuredWidth = b((int) (iB2 * f), getMaxWidth(), i);
                            measuredHeight = (int) (measuredWidth / f);
                        }
                        setMeasuredDimension(measuredWidth, measuredHeight);
                    }
                }
            }
        } finally {
            a();
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new RectF();
        this.w = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpau.c, 0, 0);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.z = typedArrayObtainStyledAttributes.getColor(2, 0);
        this.B = typedArrayObtainStyledAttributes.getColor(6, 0);
        this.C = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected void a() {
    }
}

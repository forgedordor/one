package com.google.android.libraries.inputmethod.emoji.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.drjt;
import defpackage.drjz;
import defpackage.drlv;
import defpackage.drsz;
import defpackage.drta;
import defpackage.drtb;
import defpackage.drtd;
import defpackage.drtf;
import defpackage.drti;
import defpackage.drtp;
import defpackage.drue;
import defpackage.druf;
import defpackage.drug;
import defpackage.drxl;
import defpackage.ekgb;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.eork;
import defpackage.raw;
import defpackage.rbg;
import defpackage.rii;
import defpackage.rvk;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EmojiView extends View {
    private static final ekrg f = ekrg.c("com/google/android/libraries/inputmethod/emoji/view/EmojiView");
    public drta a;
    public ekgb b;
    public drti c;
    public Drawable d;
    public Typeface e;
    private final rii g;
    private final drtf h;
    private final float i;
    private float j;
    private drtb k;
    private Paint l;
    private drtd m;

    public EmojiView(Context context) {
        this(context, null);
    }

    private final Paint d() {
        if (this.l == null) {
            this.l = new Paint(3);
        }
        return this.l;
    }

    private final void e() {
        a();
        drta drtaVar = this.a;
        final Paint paintD = d();
        final drta drtaVar2 = this.a;
        final drtf drtfVar = this.h;
        ListenableFuture listenableFutureM = eork.m(new Callable() { // from class: drte
            @Override // java.util.concurrent.Callable
            public final Object call() throws InterruptedException {
                drtf drtfVar2 = drtfVar;
                TextPaint textPaint = drtfVar2.b;
                textPaint.set(paintD);
                drsl drslVar = drsl.instance;
                lok lokVarA = drslVar.a();
                drsj drsjVar = drslVar.j;
                drta drtaVar3 = drtaVar2;
                CharSequence charSequenceD = drtaVar3.b;
                if (lokVarA != null && drsjVar.a()) {
                    int length = charSequenceD.length();
                    charSequenceD = lok.b().d(charSequenceD, 0, length, length, true != drsjVar.d ? 2 : 1);
                }
                if (charSequenceD instanceof Spanned) {
                    StaticLayout staticLayoutC = drtf.c(charSequenceD, textPaint);
                    int width = staticLayoutC.getWidth();
                    int height = staticLayoutC.getHeight();
                    int i = drtaVar3.c;
                    int iB = drtf.b(i, width);
                    int i2 = drtaVar3.d;
                    int iB2 = drtf.b(i2, height);
                    float textSize = textPaint.getTextSize();
                    while (textSize > drtfVar2.e && (width > iB || height > iB2)) {
                        textSize = drtfVar2.a(textSize, Math.min(iB / width, iB2 / height));
                        textPaint.setTextSize(textSize);
                        staticLayoutC = drtf.c(charSequenceD, textPaint);
                        width = staticLayoutC.getWidth();
                        height = staticLayoutC.getHeight();
                        iB = drtf.b(i, width);
                        iB2 = drtf.b(i2, height);
                    }
                    Bitmap bitmapA = drtfVar2.d.a(iB, iB2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = drtfVar2.a;
                    canvas.setBitmap(bitmapA);
                    staticLayoutC.draw(canvas);
                    canvas.setBitmap(null);
                    drtfVar2.g = iB;
                    return new drtd(drtaVar3, bitmapA);
                }
                textPaint.setTextAlign(Paint.Align.CENTER);
                String string = charSequenceD.toString();
                int length2 = string.length();
                Rect rect = drtfVar2.f;
                textPaint.getTextBounds(string, 0, length2, rect);
                int i3 = drtaVar3.c;
                int iWidth = rect.width();
                int iHeight = rect.height();
                int iB3 = drtf.b(i3, iWidth);
                int i4 = drtaVar3.d;
                int iB4 = drtf.b(i4, iHeight);
                float textSize2 = textPaint.getTextSize();
                while (textSize2 > drtfVar2.e && (iWidth > iB3 || iHeight > iB4)) {
                    drtf.d();
                    textSize2 = drtfVar2.a(textSize2, Math.min(iB3 / iWidth, iB4 / iHeight));
                    textPaint.setTextSize(textSize2);
                    textPaint.getTextBounds(string, 0, string.length(), rect);
                    iWidth = rect.width();
                    iHeight = rect.height();
                    iB3 = drtf.b(i3, iWidth);
                    iB4 = drtf.b(i4, iHeight);
                }
                float fExactCenterY = (iB4 / 2.0f) - rect.exactCenterY();
                drtf.d();
                Bitmap bitmapA2 = drtfVar2.d.a(iB3, iB4, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = drtfVar2.a;
                canvas2.setBitmap(bitmapA2);
                canvas2.drawText(string, iB3 / 2, (int) fExactCenterY, textPaint);
                canvas2.setBitmap(null);
                drtfVar2.g = iB3;
                return new drtd(drtaVar3, bitmapA2);
            }
        }, drtfVar.c);
        drue drueVar = new drue();
        drueVar.b.h(new Consumer() { // from class: drtc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.b((drtd) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        drueVar.a = drlv.b;
        this.k = drtb.e(drtaVar, listenableFutureM, drueVar.a());
    }

    public final void a() {
        this.k.close();
        this.k = drtb.b;
    }

    public final void b(drtd drtdVar) {
        drtd drtdVar2 = this.m;
        if (drtdVar2 != null) {
            this.g.d(drtdVar2.b);
        }
        this.m = drtdVar;
        invalidate();
    }

    public final void c(drti drtiVar) {
        this.c = drtiVar;
        setSelected(drtiVar.h);
        String str = drtiVar.b;
        String string = str == null ? "" : str.toString();
        if (!TextUtils.equals(this.a.b, string)) {
            this.a = this.a.a(string);
            a();
            b(null);
            if (!TextUtils.isEmpty(string)) {
                e();
            }
        }
        drjt.e(this, getContext().getString(R.string.emoji_content_description, str));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        drtd drtdVar = this.m;
        if (drtdVar == null) {
            return;
        }
        if (!this.k.d() || ((drsz) this.k).a.b.equals(drtdVar.a.b)) {
            Bitmap bitmap = drtdVar.b;
            Paint paintD = d();
            int width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float f2 = width;
            float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (f2 < width2 && height < height2) {
                canvas.drawBitmap(bitmap, Math.round((width2 - f2) / 2.0f) + getPaddingLeft(), Math.round((height2 - height) / 2.0f) + getPaddingTop(), paintD);
                return;
            }
            float fMax = Math.max(this.i / this.j, Math.min(width2 / f2, height2 / height));
            canvas.save();
            canvas.translate((width2 / 2.0f) + getPaddingLeft(), (height2 / 2.0f) + getPaddingTop());
            canvas.scale(fMax, fMax);
            canvas.translate((-width) / 2.0f, (-r3) / 2.0f);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paintD);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a.b.isEmpty()) {
            return;
        }
        if (this.k.d() && !((drsz) this.k).a.b(this.a)) {
            e();
            return;
        }
        drtd drtdVar = this.m;
        if (drtdVar != null) {
            if (!drtdVar.a.b(this.a)) {
                e();
                return;
            }
        }
        if (this.m != null || this.k.d()) {
            return;
        }
        e();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE && size != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(size, this.h.g), 1073741824), i2);
            return;
        }
        if (drxl.a) {
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 0 || mode2 == 0) {
                ((ekrd) ((ekrd) f.i()).h("com/google/android/libraries/inputmethod/emoji/view/EmojiView", "onMeasure", 126, "EmojiView.java")).q("MeasureSpec.UNSPECIFIED is not supported yet");
            }
        }
        setMeasuredDimension(size, size2);
        drta drtaVar = this.a;
        int iMax = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int i3 = drtaVar.c;
        int iMax2 = Math.max(0, measuredHeight);
        if (iMax != i3 || iMax2 != drtaVar.d) {
            drtaVar = new drta(drtaVar.b, iMax, iMax2);
        }
        this.a = drtaVar;
    }

    public EmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = drta.a;
        this.k = drtb.b;
        this.m = null;
        this.c = drti.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, drtp.a);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.i = dimensionPixelSize;
        float fApplyDimension = TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics());
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, ((int) (fApplyDimension + (fApplyDimension >= 0.0f ? 0.5f : -0.5f))) == 0 ? (int) Math.signum(30.0f) : r3);
        Paint paintD = d();
        paintD.setTextSize(this.j);
        paintD.setColor(typedArrayObtainStyledAttributes.getColor(1, -16777216));
        typedArrayObtainStyledAttributes.recycle();
        AtomicBoolean atomicBoolean = druf.a;
        if (drjz.b()) {
            AtomicBoolean atomicBoolean2 = druf.a;
            if (!atomicBoolean2.get()) {
                drjz.a();
                atomicBoolean2.set(true);
                raw rawVarB = raw.b(context);
                rii riiVar = rawVarB.a;
                if (riiVar instanceof drug) {
                    throw null;
                }
                rbg rbgVar = rbg.NORMAL;
                rvk.j();
                rawVarB.b.f(rbgVar.d);
                rawVarB.a.e(rbgVar.d);
                rbg rbgVar2 = rawVarB.f;
                rawVarB.f = rbgVar;
            }
        }
        rii riiVar2 = raw.b(context).a;
        this.g = riiVar2;
        this.h = new drtf(riiVar2, dimensionPixelSize);
    }
}

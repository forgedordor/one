package com.google.android.apps.messaging.shared.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.babw;
import defpackage.bxfw;
import defpackage.bxga;
import defpackage.bxgd;
import defpackage.bxgf;
import defpackage.bxgh;
import defpackage.bxgl;
import defpackage.bxgr;
import defpackage.bxhb;
import defpackage.cpah;
import defpackage.cpai;
import defpackage.cpar;
import defpackage.cpau;
import defpackage.cpci;
import defpackage.cqdq;
import defpackage.cqei;
import defpackage.eidm;
import defpackage.eifp;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public class AsyncImageView extends cpar {
    private static final ekrg h = ekrg.c("com/google/android/apps/messaging/shared/ui/AsyncImageView");
    public final babw a;
    public bxgh b;
    public bxgf c;
    public cpai d;
    public cqei e;
    public bxgr f;
    public eidm g;
    private final boolean i;
    private final boolean j;
    private final Drawable k;
    private final Runnable l;
    private boolean m;
    private final int n;
    private int o;

    public AsyncImageView(Context context) {
        super(context);
        this.l = new cpah(this);
        this.m = false;
        this.a = new babw();
        this.k = null;
        this.i = true;
        this.j = false;
        this.n = 0;
        this.o = 0;
    }

    private final void g() {
        this.m = false;
        invalidate();
    }

    @Override // com.google.android.apps.messaging.shared.ui.RoundedImageView
    protected final void a() {
        Throwable th;
        if (this.m) {
            return;
        }
        babw babwVar = this.a;
        if (!babwVar.g() || getDrawable() == null) {
            return;
        }
        this.m = true;
        bxgl bxglVarD = ((bxfw) babwVar.a()).d();
        if (bxglVarD instanceof bxhb) {
            bxgh bxghVar = this.b;
            if ((bxghVar instanceof bxgd) || (bxghVar instanceof bxga) || (th = ((bxhb) bxglVarD).m) == null) {
                return;
            }
            int dimension = (int) getResources().getDimension(R.dimen.async_image_view_slop);
            boolean z = getMeasuredWidth() > 0 && getDrawable().getIntrinsicWidth() > getMeasuredWidth() + dimension;
            if ((getMeasuredHeight() <= 0 || getDrawable().getIntrinsicHeight() <= getMeasuredHeight() + dimension) && !z) {
                return;
            }
            ekrw ekrwVarE = h.e();
            ekrwVarE.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarE).g(th)).h("com/google/android/apps/messaging/shared/ui/AsyncImageView", "logIfTooLarge", 388, "AsyncImageView.java")).J("loaded image at %dx%d instead of %dx%d", Integer.valueOf(getDrawable().getIntrinsicWidth()), Integer.valueOf(getDrawable().getIntrinsicHeight()), Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
        }
    }

    public final void b() {
        Drawable drawable = getDrawable();
        if (drawable instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
            frameSequenceDrawable.stop();
            frameSequenceDrawable.destroy();
        }
        bxgh bxghVar = this.b;
        if (bxghVar != null) {
            bxghVar.q();
            this.b = null;
        }
        setImageDrawable(null);
        setBackground(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.bxgh r10, boolean r11) {
        /*
            r9 = this;
            r9.b()
            android.os.Handler r0 = defpackage.cqdq.a
            java.lang.Runnable r1 = r9.l
            r0.removeCallbacks(r1)
            if (r10 != 0) goto L10
            r9.g()
            return
        L10:
            android.content.res.Resources r0 = r9.getResources()     // Catch: defpackage.bxgg -> L76
            android.graphics.drawable.Drawable r0 = r10.f(r0)     // Catch: defpackage.bxgg -> L76
            r9.b = r10
            r10.p()
            r9.setImageDrawable(r0)
            boolean r10 = r0 instanceof android.support.rastermill.FrameSequenceDrawable
            if (r10 == 0) goto L29
            android.support.rastermill.FrameSequenceDrawable r0 = (android.support.rastermill.FrameSequenceDrawable) r0
            r0.start()
        L29:
            int r10 = r9.getVisibility()
            if (r10 != 0) goto L71
            if (r11 != 0) goto L71
            boolean r10 = r9.j
            if (r10 == 0) goto L5a
            r10 = 4
            r9.setVisibility(r10)
            android.view.animation.Interpolator r5 = defpackage.cqei.b
            r10 = 0
            r11 = 0
            boolean r10 = defpackage.cqei.h(r9, r11, r10)
            if (r10 == 0) goto L71
            android.content.Context r10 = r9.getContext()
            cpay r0 = new cpay
            r0.<init>(r10)
            r10 = 1
            android.view.animation.Animation[] r7 = new android.view.animation.Animation[r10]
            r7[r11] = r0
            r2 = 0
            r3 = 100
            r6 = 0
            r1 = r9
            defpackage.cqei.e(r1, r2, r3, r5, r6, r7)
            goto L72
        L5a:
            r1 = r9
            boolean r10 = r1.i
            if (r10 == 0) goto L72
            r10 = 0
            r9.setAlpha(r10)
            android.view.ViewPropertyAnimator r10 = r9.animate()
            r11 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r10 = r10.alpha(r11)
            r10.start()
            goto L72
        L71:
            r1 = r9
        L72:
            r9.g()
            return
        L76:
            r0 = move-exception
            r1 = r9
            r10 = r0
            r8 = r10
            ekrg r10 = com.google.android.apps.messaging.shared.ui.AsyncImageView.h
            ekrw r2 = r10.i()
            ekrz r10 = defpackage.eksq.a
            java.lang.String r11 = "BugleDataModel"
            r2.X(r10, r11)
            r6 = 257(0x101, float:3.6E-43)
            java.lang.String r7 = "AsyncImageView.java"
            java.lang.String r3 = "Set image attempted with unsupported image type."
            java.lang.String r4 = "com/google/android/apps/messaging/shared/ui/AsyncImageView"
            java.lang.String r5 = "setImage"
            defpackage.a.o(r2, r3, r4, r5, r6, r7, r8)
            r9.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.ui.AsyncImageView.c(bxgh, boolean):void");
    }

    public final void d(bxgf bxgfVar) {
        Drawable drawable;
        int i;
        if (bxgfVar != null) {
            babw babwVar = this.a;
            if (babwVar.g() && TextUtils.equals(((bxfw) babwVar.a()).f(), bxgfVar.e())) {
                return;
            }
        }
        babw babwVar2 = this.a;
        if (babwVar2.g()) {
            e();
        }
        cpai cpaiVar = this.d;
        if (cpaiVar != null) {
            cpaiVar.c();
        }
        cpai cpaiVar2 = new cpai(this);
        f();
        clearAnimation();
        setAlpha(1.0f);
        if (bxgfVar != null && !TextUtils.isEmpty(bxgfVar.e())) {
            if (!TextUtils.isEmpty(bxgfVar.e()) && (drawable = this.k) != null) {
                int i2 = bxgfVar.e;
                if (i2 != -1 && (i = bxgfVar.f) != -1) {
                    int i3 = 0;
                    ColorDrawable colorDrawable = new ColorDrawable(0);
                    int i4 = cpci.a;
                    int intrinsicWidth = colorDrawable.getIntrinsicWidth();
                    int intrinsicHeight = colorDrawable.getIntrinsicHeight();
                    int i5 = (intrinsicWidth < 0 || intrinsicWidth > i2) ? 0 : (i2 - intrinsicWidth) / 2;
                    if (intrinsicHeight >= 0 && intrinsicHeight <= i) {
                        i3 = (i - intrinsicHeight) / 2;
                    }
                    int i6 = i3;
                    setImageDrawable(new cpci(colorDrawable, i5, i6, i5, i6, i2, i));
                }
                setBackground(drawable);
            }
            bxfw bxfwVarF = bxgfVar.f(getContext(), cpaiVar2);
            babwVar2.c(bxfwVarF);
            this.f.d(bxfwVarF);
        }
        this.d = cpaiVar2;
    }

    public final void e() {
        babw babwVar = this.a;
        if (babwVar.g()) {
            babwVar.f();
        }
    }

    public final void f() {
        c(null, false);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        bxgf bxgfVar;
        eifp eifpVarA = this.g.a("AsyncImageView#onAttachedToWindow");
        try {
            super.onAttachedToWindow();
            cqdq.a.removeCallbacks(this.l);
            if (this.i) {
                setAlpha(1.0f);
            }
            if (!this.a.g() && (bxgfVar = this.c) != null) {
                d(bxgfVar);
            }
            this.c = null;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cqdq.a.postDelayed(this.l, 100L);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.z = i;
        super.setBackgroundColor(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setSelected(boolean z) {
        if (z != isSelected()) {
            float width = 1.0f;
            if (z && this.o == 0) {
                int i = this.n;
                if (i != 0) {
                    if (getWidth() <= 0) {
                        width = 0.86f;
                    } else {
                        float f = i;
                        width = (getWidth() - (f + f)) / getWidth();
                    }
                }
                this.e.f(this, width);
                this.o = 1;
            } else if (!z) {
                this.e.f(this, 1.0f);
                this.o = 0;
            }
        }
        super.setSelected(z);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new cpah(this);
        this.m = false;
        this.a = new babw();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpau.a, 0, 0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.j = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.k = typedArrayObtainStyledAttributes.getDrawable(1);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.o = 0;
        typedArrayObtainStyledAttributes.recycle();
    }
}

package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import defpackage.eecd;
import defpackage.eegi;
import defpackage.eesi;
import defpackage.eesj;
import defpackage.eesu;
import defpackage.eesv;
import defpackage.eesx;
import defpackage.eesz;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaskableFrameLayout extends FrameLayout implements eegi, eesu {
    private float a;
    private final RectF b;
    private final Rect c;
    private eesj d;
    private final eesv e;
    private Boolean f;
    private View.OnHoverListener g;
    private boolean h;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.eegi
    public final void a(RectF rectF) {
        RectF rectF2 = this.b;
        rectF2.set(rectF);
        eesv eesvVar = this.e;
        eesvVar.c = rectF2;
        eesvVar.c();
        eesvVar.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        eesv eesvVar = this.e;
        if (eesvVar.d()) {
            Path path = eesvVar.d;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // defpackage.eesu
    public final void fx(eesj eesjVar) {
        eesj eesjVarE = eesjVar.e(new eesi() { // from class: eegj
            @Override // defpackage.eesi
            public final eeru a(eeru eeruVar) {
                return eeruVar instanceof eerr ? new eert(((eerr) eeruVar).a) : eeruVar;
            }
        });
        this.d = eesjVarE;
        eesv eesvVar = this.e;
        eesvVar.b = eesjVarE;
        eesvVar.c();
        eesvVar.a(this);
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        RectF rectF = this.b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f;
        if (bool != null) {
            this.e.b(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        eesv eesvVar = this.e;
        this.f = Boolean.valueOf(eesvVar.a);
        eesvVar.b(this, true);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHoverEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            android.graphics.RectF r1 = r7.b
            boolean r2 = r1.isEmpty()
            r3 = 9
            r4 = 7
            if (r2 != 0) goto L3a
            r2 = 10
            if (r0 == r3) goto L18
            if (r0 == r2) goto L18
            if (r0 != r4) goto L3a
            r0 = r4
        L18:
            float r5 = r8.getX()
            float r6 = r8.getY()
            boolean r1 = r1.contains(r5, r6)
            if (r1 != 0) goto L3a
            boolean r0 = r7.h
            if (r0 == 0) goto L36
            android.view.View$OnHoverListener r0 = r7.g
            if (r0 == 0) goto L36
            r8.setAction(r2)
            android.view.View$OnHoverListener r0 = r7.g
            r0.onHover(r7, r8)
        L36:
            r8 = 0
            r7.h = r8
            return r8
        L3a:
            android.view.View$OnHoverListener r1 = r7.g
            if (r1 == 0) goto L56
            boolean r1 = r7.h
            r2 = 1
            if (r1 != 0) goto L4b
            if (r0 != r4) goto L4b
            r8.setAction(r3)
            r7.h = r2
            r0 = r4
        L4b:
            if (r0 == r4) goto L4f
            if (r0 != r3) goto L51
        L4f:
            r7.h = r2
        L51:
            android.view.View$OnHoverListener r0 = r7.g
            r0.onHover(r7, r8)
        L56:
            boolean r8 = super.onHoverEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.MaskableFrameLayout.onHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Rect rect = this.c;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        if (getX() > 0.0f) {
            rect.left = (int) (rect.left + this.b.left);
        }
        if (getY() > 0.0f) {
            rect.top = (int) (rect.top + this.b.top);
        }
        RectF rectF = this.b;
        rect.right = rect.left + Math.round(rectF.width());
        rect.bottom = rect.top + Math.round(rectF.height());
        accessibilityNodeInfo.setBoundsInScreen(rect);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.b;
        if (rectF.isEmpty() || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.a;
        if (f == -1.0f || f == -1.0f) {
            return;
        }
        float fA = eecd.a(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.a);
        a(new RectF(fA, 0.0f, getWidth() - fA, getHeight()));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.b;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void setOnHoverListener(View.OnHoverListener onHoverListener) {
        this.g = onHoverListener;
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        eesv eesxVar;
        super(context, attributeSet, i);
        this.a = -1.0f;
        this.b = new RectF();
        this.c = new Rect();
        if (Build.VERSION.SDK_INT >= 33) {
            eesxVar = new eesz(this);
        } else {
            eesxVar = new eesx(this);
        }
        this.e = eesxVar;
        this.f = null;
        this.h = false;
        fx(new eesj(eesj.h(context, attributeSet, i, 0)));
    }
}

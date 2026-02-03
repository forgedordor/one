package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eedk extends Drawable implements eemc {
    public final WeakReference a;
    public final eedn b;
    public final int c;
    private final eesc d;
    private final eemd e;
    private final Rect f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private WeakReference l;
    private WeakReference m;

    public eedk(Context context, eedm eedmVar) {
        eeqc eeqcVar;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        eemh.d(context);
        this.f = new Rect();
        eemd eemdVar = new eemd(this);
        this.e = eemdVar;
        eemdVar.a.setTextAlign(Paint.Align.CENTER);
        eedn eednVar = new eedn(context, eedmVar);
        this.b = eednVar;
        eesc eescVar = new eesc(new eesj(eesj.b(context, o() ? eednVar.e() : eednVar.c(), o() ? eednVar.d() : eednVar.b())));
        this.d = eescVar;
        m();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && eemdVar.f != (eeqcVar = new eeqc(context2, eednVar.b.d.intValue()))) {
            eemdVar.c(eeqcVar, context2);
            n();
            g();
            invalidateSelf();
        }
        if (a() != -2) {
            this.c = ((int) Math.pow(10.0d, a() - 1.0d)) - 1;
        } else {
            this.c = eednVar.b.m;
        }
        eemdVar.e();
        g();
        invalidateSelf();
        eemdVar.e();
        m();
        g();
        invalidateSelf();
        l();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(eednVar.b.b.intValue());
        if (eescVar.D() != colorStateListValueOf) {
            eescVar.P(colorStateListValueOf);
            invalidateSelf();
        }
        n();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.m;
            f(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        g();
        setVisible(eednVar.b.t.booleanValue(), false);
    }

    private final String j() {
        if (!i()) {
            if (!h()) {
                return null;
            }
            int i = this.c;
            if (i == -2 || b() <= i) {
                return NumberFormat.getInstance(this.b.h()).format(b());
            }
            Context context = (Context) this.a.get();
            return context == null ? "" : String.format(this.b.h(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        String strD = d();
        int iA = a();
        if (iA == -2 || strD == null || strD.length() <= iA) {
            return strD;
        }
        Context context2 = (Context) this.a.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), strD.substring(0, iA - 1), "…");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    private final void k(View view, View view2) {
        float y;
        float x;
        View parent;
        FrameLayout frameLayoutC = c();
        if (frameLayoutC == null) {
            float y2 = view.getY();
            x = view.getX();
            parent = view.getParent();
            y = y2;
        } else {
            y = 0.0f;
            x = 0.0f;
            parent = frameLayoutC;
        }
        while (parent instanceof View) {
            if (parent != view2) {
                ViewParent parent2 = parent.getParent();
                if ((parent2 instanceof ViewGroup) && !((ViewGroup) parent2).getClipChildren()) {
                    View view3 = parent;
                    y += view3.getY();
                    x += view3.getX();
                    parent = parent.getParent();
                }
            }
            float f = (this.h - this.k) + y;
            float f2 = (this.g - this.j) + x;
            View view4 = parent;
            float height = ((this.h + this.k) - view4.getHeight()) + y;
            float width = ((this.g + this.j) - view4.getWidth()) + x;
            if (f < 0.0f) {
                this.h += Math.abs(f);
            }
            if (f2 < 0.0f) {
                this.g += Math.abs(f2);
            }
            if (height > 0.0f) {
                this.h -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.g -= Math.abs(width);
                return;
            }
            return;
        }
    }

    private final void l() {
        this.e.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    private final void m() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        this.d.fx(new eesj(eesj.b(context, o() ? this.b.e() : this.b.c(), o() ? this.b.d() : this.b.b())));
        invalidateSelf();
    }

    private final void n() {
        this.e.a.setColor(this.b.b.c.intValue());
        invalidateSelf();
    }

    private final boolean o() {
        return i() || h();
    }

    public final int a() {
        return this.b.b.l;
    }

    public final int b() {
        eedn eednVar = this.b;
        if (eednVar.i()) {
            return eednVar.b.k;
        }
        return 0;
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final String d() {
        return this.b.b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strJ;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.d.draw(canvas);
        if (!o() || (strJ = j()) == null) {
            return;
        }
        Rect rect = new Rect();
        eemd eemdVar = this.e;
        int length = strJ.length();
        TextPaint textPaint = eemdVar.a;
        textPaint.getTextBounds(strJ, 0, length, rect);
        float fExactCenterY = this.h - rect.exactCenterY();
        canvas.drawText(strJ, this.g, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), textPaint);
    }

    @Override // defpackage.eemc
    public final void e() {
        invalidateSelf();
    }

    public final void f(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        g();
        invalidateSelf();
    }

    public final void g() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        WeakReference weakReference = this.a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.l;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.m;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        float f11 = o() ? this.b.d : this.b.c;
        this.i = f11;
        if (f11 != -1.0f) {
            this.j = f11;
            this.k = f11;
        } else {
            this.j = Math.round((o() ? this.b.g : this.b.e) / 2.0f);
            this.k = Math.round((o() ? this.b.h : this.b.f) / 2.0f);
        }
        if (o()) {
            String strJ = j();
            float f12 = this.j;
            eemd eemdVar = this.e;
            float fA = eemdVar.a(strJ) / 2.0f;
            eedm eedmVar = this.b.b;
            this.j = Math.max(f12, fA + eedmVar.u.intValue());
            float f13 = this.k;
            if (eemdVar.d) {
                eemdVar.b(strJ);
                f10 = eemdVar.c;
            } else {
                f10 = eemdVar.c;
            }
            float fMax = Math.max(f13, (f10 / 2.0f) + eedmVar.v.intValue());
            this.k = fMax;
            this.j = Math.max(this.j, fMax);
        }
        eedn eednVar = this.b;
        eedm eedmVar2 = eednVar.b;
        int iIntValue = eedmVar2.x.intValue();
        if (o()) {
            iIntValue = eedmVar2.z.intValue();
            if (((Context) weakReference.get()) != null) {
                iIntValue = eecd.b(iIntValue, iIntValue - eedmVar2.C.intValue(), eecd.a(0.0f, 1.0f, 0.3f, 1.0f, r0.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        int i = eednVar.k;
        if (i == 0) {
            iIntValue -= Math.round(this.k);
            i = 0;
        }
        int iIntValue2 = iIntValue + eedmVar2.B.intValue();
        int iA = eednVar.a();
        if (iA == 8388691 || iA == 8388693) {
            this.h = rect3.bottom - iIntValue2;
        } else {
            this.h = rect3.top + iIntValue2;
        }
        int iIntValue3 = o() ? eedmVar2.y.intValue() : eednVar.g();
        if (i == 1) {
            iIntValue3 += o() ? eednVar.j : eednVar.i;
        }
        int iIntValue4 = iIntValue3 + eedmVar2.A.intValue();
        int iA2 = eednVar.a();
        float f14 = iIntValue4;
        if (iA2 == 8388659 || iA2 == 8388691) {
            if (eednVar.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f7 = rect3.left + this.j;
                    f8 = this.k;
                    f9 = f7 - ((f8 + f8) - f14);
                } else {
                    f5 = rect3.right - this.j;
                    f6 = this.k;
                    f9 = f5 + ((f6 + f6) - f14);
                }
            } else if (view.getLayoutDirection() == 0) {
                f3 = rect3.left;
                f4 = this.j;
                f9 = (f3 - f4) + f14;
            } else {
                f = rect3.right;
                f2 = this.j;
                f9 = (f + f2) - f14;
            }
        } else if (eednVar.l == 0) {
            if (view.getLayoutDirection() == 0) {
                f = rect3.right;
                f2 = this.j;
                f9 = (f + f2) - f14;
            } else {
                f3 = rect3.left;
                f4 = this.j;
                f9 = (f3 - f4) + f14;
            }
        } else if (view.getLayoutDirection() == 0) {
            f5 = rect3.right - this.j;
            f6 = this.k;
            f9 = f5 + ((f6 + f6) - f14);
        } else {
            f7 = rect3.left + this.j;
            f8 = this.k;
            f9 = f7 - ((f8 + f8) - f14);
        }
        this.g = f9;
        if (eedmVar2.D.booleanValue()) {
            ViewParent viewParentC = c();
            if (viewParentC == null) {
                viewParentC = view.getParent();
            }
            if ((viewParentC instanceof View) && (viewParentC.getParent() instanceof View)) {
                k(view, (View) viewParentC.getParent());
            }
        } else {
            k(view, null);
        }
        float f15 = this.g;
        float f16 = this.h;
        float f17 = this.j;
        float f18 = this.k;
        rect2.set((int) (f15 - f17), (int) (f16 - f18), (int) (f15 + f17), (int) (f16 + f18));
        float f19 = this.i;
        if (f19 != -1.0f) {
            this.d.M(f19);
        }
        if (rect.equals(rect2)) {
            return;
        }
        this.d.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        eedn eednVar = this.b;
        return !eednVar.j() && eednVar.i();
    }

    public final boolean i() {
        return this.b.j();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, defpackage.eemc
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        eedn eednVar = this.b;
        eednVar.a.i = i;
        eednVar.b.i = i;
        l();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

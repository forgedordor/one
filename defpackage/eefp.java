package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefp {
    public static final Drawable a;
    private static final double u = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView b;
    public final eesc d;
    public final eesc e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public eesj n;
    public ColorStateList o;
    public Drawable p;
    public LayerDrawable q;
    public boolean s;
    private eesc v;
    private ValueAnimator w;
    private final TimeInterpolator x;
    private final int y;
    private final int z;
    public final Rect c = new Rect();
    public boolean r = false;
    public float t = 0.0f;

    static {
        a = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public eefp(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.b = materialCardView;
        eesc eescVar = new eesc(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.d = eescVar;
        eescVar.L(materialCardView.getContext());
        eescVar.S(-12303292);
        eesh eeshVar = new eesh(eescVar.H());
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, csf.a, i, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            eeshVar.i(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.e = new eesc();
        g(new eesj(eeshVar));
        this.x = eenh.a(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, eecd.a);
        this.y = eepx.a(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.z = eepx.a(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float p() {
        eerv eervVar = this.n.b;
        eesc eescVar = this.d;
        float fMax = Math.max(r(eervVar, eescVar.x()), r(this.n.c, eescVar.y()));
        eerv eervVar2 = this.n.d;
        float[] fArr = eescVar.z;
        float fR = r(eervVar2, fArr != null ? fArr[1] : eescVar.q.a.h.a(eescVar.E()));
        eerv eervVar3 = this.n.e;
        float[] fArr2 = eescVar.z;
        return Math.max(fMax, Math.max(fR, r(eervVar3, fArr2 != null ? fArr2[2] : eescVar.q.a.i.a(eescVar.E()))));
    }

    private final boolean q() {
        return this.d.Y();
    }

    private static final float r(eerv eervVar, float f) {
        if (eervVar instanceof eesg) {
            return (float) ((1.0d - u) * f);
        }
        if (eervVar instanceof eerw) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        return this.b.gO() + (n() ? p() : 0.0f);
    }

    public final float b() {
        return (this.b.gO() * 1.5f) + (n() ? p() : 0.0f);
    }

    public final Drawable c() {
        if (this.p == null) {
            this.v = new eesc(this.n);
            this.p = new RippleDrawable(this.l, null, this.v);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.e, this.k});
            this.q = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.q;
    }

    public final Drawable d(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.b.a) {
            iCeil2 = (int) Math.ceil(b());
            iCeil = (int) Math.ceil(a());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new eefo(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void e(ColorStateList colorStateList) {
        this.d.P(colorStateList);
    }

    public final void f(boolean z, boolean z2) {
        Drawable drawable = this.k;
        if (drawable != null) {
            float f = true != z ? 0.0f : 1.0f;
            if (!z2) {
                drawable.setAlpha(true == z ? 255 : 0);
                this.t = f;
                return;
            }
            float f2 = z ? 1.0f - this.t : this.t;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.t, f);
            this.w = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eefn
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    eefp eefpVar = this.a;
                    eefpVar.k.setAlpha((int) (255.0f * fFloatValue));
                    eefpVar.t = fFloatValue;
                }
            });
            this.w.setInterpolator(this.x);
            this.w.setDuration((long) ((z ? this.y : this.z) * f2));
            this.w.start();
        }
    }

    public final void g(eesj eesjVar) {
        this.n = eesjVar;
        eesc eescVar = this.d;
        eescVar.fx(eesjVar);
        eescVar.x = !eescVar.Y();
        this.e.fx(eesjVar);
        eesc eescVar2 = this.v;
        if (eescVar2 != null) {
            eescVar2.fx(eesjVar);
        }
    }

    public final void h() {
        Drawable drawable = this.j;
        Drawable drawableC = o() ? c() : this.e;
        this.j = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.b;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void i() {
        float fC = 0.0f;
        float fP = (m() || n()) ? p() : 0.0f;
        MaterialCardView materialCardView = this.b;
        if (materialCardView.b && materialCardView.a) {
            fC = (float) ((1.0d - u) * csh.c(materialCardView.f));
        }
        float f = fP - fC;
        Rect rect = this.c;
        int i = (int) f;
        materialCardView.c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        csh.d(materialCardView.f);
    }

    public final void j() {
        this.d.O(this.b.f.b.getElevation());
    }

    public final boolean k() {
        return (this.h & 80) == 80;
    }

    public final boolean l() {
        return (this.h & 8388613) == 8388613;
    }

    public final boolean m() {
        return this.b.b && !q();
    }

    public final boolean n() {
        MaterialCardView materialCardView = this.b;
        return materialCardView.b && q() && materialCardView.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View] */
    public final boolean o() {
        MaterialCardView materialCardView = this.b;
        boolean zIsClickable = materialCardView.isClickable();
        MaterialCardView materialCardView2 = materialCardView;
        if (zIsClickable) {
            return true;
        }
        while (materialCardView2.isDuplicateParentStateEnabled() && (materialCardView2.getParent() instanceof View)) {
            materialCardView2 = (View) materialCardView2.getParent();
        }
        return materialCardView2.isClickable();
    }
}

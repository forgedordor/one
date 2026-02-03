package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eerp {
    public final SearchView a;
    public final ClippableRoundedCornerLayout b;
    public final Toolbar c;
    public final EditText d;
    public final eene e;
    public AnimatorSet f;
    public SearchBar g;
    private final View h;
    private final FrameLayout i;
    private final FrameLayout j;
    private final Toolbar k;
    private final LinearLayout l;
    private final TextView m;
    private final ImageButton n;
    private final View o;
    private final TouchObserverFrameLayout p;

    public eerp(SearchView searchView) {
        this.a = searchView;
        this.h = searchView.a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.b;
        this.b = clippableRoundedCornerLayout;
        this.i = searchView.e;
        this.j = searchView.f;
        this.k = searchView.g;
        this.c = searchView.h;
        this.m = searchView.i;
        this.d = searchView.k;
        this.n = searchView.l;
        this.o = searchView.m;
        this.p = searchView.n;
        this.l = searchView.j;
        this.e = new eene(clippableRoundedCornerLayout);
    }

    private final int g(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int iJ = j(this.g);
        return eemo.k(this.g) ? iJ - marginEnd : ((iJ + this.g.getWidth()) + marginEnd) - this.a.getWidth();
    }

    private final int h() {
        FrameLayout frameLayout = this.j;
        int top = frameLayout.getTop() + (frameLayout.getHeight() / 2);
        SearchBar searchBar = this.g;
        int top2 = searchBar.getTop();
        for (ViewParent parent = searchBar.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            top2 += ((View) parent).getTop();
        }
        return (top2 + (this.g.getHeight() / 2)) - top;
    }

    private final int i(View view, View view2) {
        if (view != null) {
            return j(view) - j(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.g.getPaddingStart();
        int iJ = j(this.g);
        return eemo.k(this.g) ? (((iJ + this.g.getWidth()) + marginStart) - paddingStart) - this.a.getRight() : (iJ - marginStart) + paddingStart;
    }

    private final int j(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    private final Animator k(boolean z, View view) {
        TextView textView = this.g.E;
        if (TextUtils.isEmpty(textView.getText()) || z) {
            textView = this.g.D;
        }
        return m(z, view, j(textView) - (view.getLeft() + this.l.getLeft()), h());
    }

    private final void l(AnimatorSet animatorSet) {
        final ImageButton imageButtonB = eemj.b(this.k);
        if (imageButtonB == null) {
            return;
        }
        Drawable drawableA = kzs.a(imageButtonB.getDrawable());
        if (!this.a.p) {
            if (drawableA instanceof kw) {
                ((kw) drawableA).setProgress(1.0f);
            }
            if (drawableA instanceof eelg) {
                ((eelg) drawableA).a(1.0f);
                return;
            }
            return;
        }
        if (drawableA instanceof kw) {
            final kw kwVar = (kw) drawableA;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eerd
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    kwVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableA instanceof eelg) {
            final eelg eelgVar = (eelg) drawableA;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eerf
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    eelgVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
        SearchBar searchBar = this.g;
        if (searchBar == null || searchBar.e() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eerj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                imageButtonB.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat3);
    }

    private static final Animator m(boolean z, View view, int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(eels.b(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i2, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(eels.c(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(eely.a(z, eecd.b));
        return animatorSet;
    }

    public final AnimatorSet a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        l(animatorSet);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(eely.a(z, eecd.b));
        return animatorSet;
    }

    public final AnimatorSet b(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Toolbar toolbar = this.k;
        ImageButton imageButtonB = eemj.b(toolbar);
        if (imageButtonB != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i(eemj.b(this.g), imageButtonB), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(eels.b(imageButtonB));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(h(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(eels.c(imageButtonB));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuViewA = eemj.a(toolbar);
        if (actionMenuViewA != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(i(eemj.a(this.g), actionMenuViewA), 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(eels.b(actionMenuViewA));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(h(), 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(eels.c(actionMenuViewA));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(eely.a(z, eecd.b));
        return animatorSet;
    }

    public final AnimatorSet c(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f == null) {
            animatorSet.playTogether(a(z), b(z));
        }
        Animator[] animatorArr = new Animator[10];
        TimeInterpolator timeInterpolator = z ? eecd.a : eecd.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(true != z ? 250L : 300L);
        valueAnimatorOfFloat.setStartDelay(true != z ? 0L : 100L);
        valueAnimatorOfFloat.setInterpolator(eely.a(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(eels.a(this.h));
        animatorArr[0] = valueAnimatorOfFloat;
        long j = true != z ? 250L : 300L;
        eene eeneVar = this.e;
        Rect rectE = eeneVar.g;
        Rect rectD = eeneVar.h;
        if (rectE == null) {
            rectE = eemo.e(this.a);
        }
        if (rectD == null) {
            rectD = eemo.d(this.b, this.g);
        }
        final Rect rect = new Rect(rectD);
        final float fH = this.g.H();
        float[] fArr = this.b.b;
        float[] fArrI = eeneVar.i();
        final float[] fArr2 = {Math.max(fArr[0], fArrI[0]), Math.max(fArr[1], fArrI[1]), Math.max(fArr[2], fArrI[2]), Math.max(fArr[3], fArrI[3]), Math.max(fArr[4], fArrI[4]), Math.max(fArr[5], fArrI[5]), Math.max(fArr[6], fArrI[6]), Math.max(fArr[7], fArrI[7])};
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new eelx(rect), rectD, rectE);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eerc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float[] fArr3 = fArr2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = fArr3[0];
                TimeInterpolator timeInterpolator2 = eecd.a;
                float f2 = fH;
                float[] fArr4 = {((f - f2) * animatedFraction) + f2, ((fArr3[1] - f2) * animatedFraction) + f2, ((fArr3[2] - f2) * animatedFraction) + f2, ((fArr3[3] - f2) * animatedFraction) + f2, ((fArr3[4] - f2) * animatedFraction) + f2, ((fArr3[5] - f2) * animatedFraction) + f2, f2 + ((fArr3[6] - f2) * animatedFraction), f2 + (animatedFraction * (fArr3[7] - f2))};
                Rect rect2 = rect;
                this.a.b.a(rect2.left, rect2.top, rect2.right, rect2.bottom, fArr4);
            }
        });
        valueAnimatorOfObject.setDuration(j);
        TimeInterpolator timeInterpolator2 = eecd.b;
        valueAnimatorOfObject.setInterpolator(eely.a(z, timeInterpolator2));
        animatorArr[1] = valueAnimatorOfObject;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(true != z ? 42L : 50L);
        valueAnimatorOfFloat2.setStartDelay(true != z ? 0L : 250L);
        TimeInterpolator timeInterpolator3 = eecd.a;
        valueAnimatorOfFloat2.setInterpolator(eely.a(z, timeInterpolator3));
        valueAnimatorOfFloat2.addUpdateListener(eels.a(this.n));
        animatorArr[2] = valueAnimatorOfFloat2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(true != z ? 83L : 150L);
        valueAnimatorOfFloat3.setStartDelay(true != z ? 0L : 75L);
        valueAnimatorOfFloat3.setInterpolator(eely.a(z, timeInterpolator3));
        View view = this.o;
        TouchObserverFrameLayout touchObserverFrameLayout = this.p;
        valueAnimatorOfFloat3.addUpdateListener(eels.a(view, touchObserverFrameLayout));
        animatorArr2[0] = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat4.setDuration(j);
        valueAnimatorOfFloat4.setInterpolator(eely.a(z, timeInterpolator2));
        valueAnimatorOfFloat4.addUpdateListener(eels.c(view));
        animatorArr2[1] = valueAnimatorOfFloat4;
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(j);
        valueAnimatorOfFloat5.setInterpolator(eely.a(z, timeInterpolator2));
        valueAnimatorOfFloat5.addUpdateListener(new eels(new eelr() { // from class: eelo
            @Override // defpackage.eelr
            public final void a(ValueAnimator valueAnimator, View view2) {
                int i = eels.a;
                Float f = (Float) valueAnimator.getAnimatedValue();
                view2.setScaleX(f.floatValue());
                view2.setScaleY(f.floatValue());
            }
        }, touchObserverFrameLayout));
        animatorArr2[2] = valueAnimatorOfFloat5;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        View view2 = this.i;
        animatorArr[4] = m(z, view2, g(view2), h());
        Toolbar toolbar = this.c;
        animatorArr[5] = m(z, toolbar, g(toolbar), h());
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat6.setDuration(j);
        valueAnimatorOfFloat6.setInterpolator(eely.a(z, timeInterpolator2));
        if (this.a.q) {
            valueAnimatorOfFloat6.addUpdateListener(new eelh(eemj.a(toolbar), eemj.a(this.k)));
        }
        animatorArr[6] = valueAnimatorOfFloat6;
        EditText editText = this.d;
        animatorArr[7] = k(z, editText);
        animatorArr[8] = k(z, this.m);
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (this.g != null && !TextUtils.equals(editText.getText(), this.g.J())) {
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eerg
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    eerp eerpVar = this.a;
                    eerpVar.d.setAlpha(fFloatValue);
                    eerpVar.g.D.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet3.playTogether(valueAnimatorOfFloat7);
        }
        if (this.g != null && TextUtils.equals(editText.getText(), this.g.J())) {
            final Rect rect2 = new Rect(0, 0, editText.getWidth(), editText.getHeight());
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.g.D.getWidth(), editText.getWidth());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eerb
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    Rect rect3 = rect2;
                    rect3.right = iIntValue;
                    this.a.d.setClipBounds(rect3);
                }
            });
            animatorSet3.playTogether(valueAnimatorOfInt);
        }
        animatorSet3.setDuration(j);
        animatorSet3.setInterpolator(eely.a(z, timeInterpolator3));
        animatorArr[9] = animatorSet3;
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new eero(this, z));
        return animatorSet;
    }

    public final AnimatorSet d(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(eels.c(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        l(animatorSet);
        animatorSet.setInterpolator(eely.a(z, eecd.b));
        animatorSet.setDuration(true != z ? 300L : 350L);
        return animatorSet;
    }

    public final AnimatorSet e() {
        if (this.g != null) {
            SearchView searchView = this.a;
            if (searchView.m()) {
                searchView.d();
            }
            AnimatorSet animatorSetC = c(false);
            animatorSetC.addListener(new eerl(this));
            animatorSetC.start();
            return animatorSetC;
        }
        SearchView searchView2 = this.a;
        if (searchView2.m()) {
            searchView2.d();
        }
        AnimatorSet animatorSetD = d(false);
        animatorSetD.addListener(new eern(this));
        animatorSetD.start();
        return animatorSetD;
    }

    public final void f(float f) {
        ActionMenuView actionMenuViewA;
        this.n.setAlpha(f);
        this.o.setAlpha(f);
        this.p.setAlpha(f);
        if (!this.a.q || (actionMenuViewA = eemj.a(this.k)) == null) {
            return;
        }
        actionMenuViewA.setAlpha(f);
    }
}

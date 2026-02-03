package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohe {
    public final ogh a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final ValueAnimator m;
    public final ValueAnimator n;
    public boolean t;
    public boolean u;
    private final AnimatorSet w;
    private final AnimatorSet x;
    private final AnimatorSet y;
    private final AnimatorSet z;
    public final Runnable o = new Runnable() { // from class: ogn
        @Override // java.lang.Runnable
        public final void run() {
            this.a.l();
        }
    };
    private final Runnable A = new Runnable() { // from class: ogq
        @Override // java.lang.Runnable
        public final void run() {
            this.a.d();
        }
    };
    public final Runnable p = new Runnable() { // from class: ogr
        @Override // java.lang.Runnable
        public final void run() {
            this.a.f();
        }
    };
    private final Runnable B = new Runnable() { // from class: ogs
        @Override // java.lang.Runnable
        public final void run() {
            ohe oheVar = this.a;
            oheVar.l.start();
            oheVar.g(oheVar.p, 2000L);
        }
    };
    private final Runnable C = new Runnable() { // from class: ogt
        @Override // java.lang.Runnable
        public final void run() {
            this.a.e();
        }
    };
    public final View.OnLayoutChangeListener q = new View.OnLayoutChangeListener() { // from class: ogu
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ohe oheVar = this.a;
            ogh oghVar = oheVar.a;
            int width = (oghVar.getWidth() - oghVar.getPaddingLeft()) - oghVar.getPaddingRight();
            int height = (oghVar.getHeight() - oghVar.getPaddingBottom()) - oghVar.getPaddingTop();
            ViewGroup viewGroup = oheVar.c;
            int iB = ohe.b(viewGroup) - (viewGroup != null ? viewGroup.getPaddingLeft() + viewGroup.getPaddingRight() : 0);
            int iA = ohe.a(viewGroup) - (viewGroup != null ? viewGroup.getPaddingTop() + viewGroup.getPaddingBottom() : 0);
            int iMax = Math.max(iB, ohe.b(oheVar.i) + ohe.b(oheVar.k));
            int iA2 = ohe.a(oheVar.d);
            boolean z = width <= iMax || height <= iA + (iA2 + iA2);
            if (oheVar.t != z) {
                oheVar.t = z;
                view.post(new Runnable() { // from class: ogi
                    @Override // java.lang.Runnable
                    public final void run() throws Resources.NotFoundException {
                        ohe oheVar2 = oheVar;
                        ViewGroup viewGroup2 = oheVar2.e;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(true != oheVar2.t ? 4 : 0);
                        }
                        View view2 = oheVar2.j;
                        if (view2 != null) {
                            int dimensionPixelSize = oheVar2.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            if (marginLayoutParams != null) {
                                if (true == oheVar2.t) {
                                    dimensionPixelSize = 0;
                                }
                                marginLayoutParams.bottomMargin = dimensionPixelSize;
                                view2.setLayoutParams(marginLayoutParams);
                            }
                            if (view2 instanceof DefaultTimeBar) {
                                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                                if (oheVar2.t) {
                                    defaultTimeBar.c(true);
                                } else {
                                    int i9 = oheVar2.s;
                                    if (i9 == 1) {
                                        defaultTimeBar.c(false);
                                    } else if (i9 != 3) {
                                        if (defaultTimeBar.b.isStarted()) {
                                            defaultTimeBar.b.cancel();
                                        }
                                        defaultTimeBar.d = false;
                                        defaultTimeBar.c = 1.0f;
                                        defaultTimeBar.invalidate(defaultTimeBar.a);
                                    }
                                }
                            }
                        }
                        for (View view3 : oheVar2.r) {
                            view3.setVisibility((oheVar2.t && ohe.o(view3)) ? 4 : 0);
                        }
                    }
                });
            }
            int i9 = i3 - i;
            int i10 = i7 - i5;
            if (oheVar.t || i9 == i10) {
                return;
            }
            view.post(new Runnable() { // from class: ogm
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup2;
                    int i11;
                    ohe oheVar2 = oheVar;
                    ViewGroup viewGroup3 = oheVar2.f;
                    if (viewGroup3 == null || (viewGroup2 = oheVar2.g) == null) {
                        return;
                    }
                    ogh oghVar2 = oheVar2.a;
                    int width2 = (oghVar2.getWidth() - oghVar2.getPaddingLeft()) - oghVar2.getPaddingRight();
                    while (true) {
                        if (viewGroup2.getChildCount() <= 1) {
                            break;
                        }
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    View view2 = oheVar2.k;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    int iB2 = ohe.b(oheVar2.i);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        iB2 += ohe.b(viewGroup3.getChildAt(i12));
                    }
                    if (iB2 <= width2) {
                        ViewGroup viewGroup4 = oheVar2.h;
                        if (viewGroup4 == null || viewGroup4.getVisibility() != 0) {
                            return;
                        }
                        ValueAnimator valueAnimator = oheVar2.n;
                        if (valueAnimator.isStarted()) {
                            return;
                        }
                        oheVar2.m.cancel();
                        valueAnimator.start();
                        return;
                    }
                    if (view2 != null) {
                        view2.setVisibility(0);
                        iB2 += ohe.b(view2);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        View childAt2 = viewGroup3.getChildAt(i13);
                        iB2 -= ohe.b(childAt2);
                        arrayList.add(childAt2);
                        if (iB2 <= width2) {
                            break;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    viewGroup3.removeViews(0, arrayList.size());
                    for (i11 = 0; i11 < arrayList.size(); i11++) {
                        viewGroup2.addView((View) arrayList.get(i11), viewGroup2.getChildCount() - 1);
                    }
                }
            });
        }
    };
    public boolean v = true;
    public int s = 0;
    public final List r = new ArrayList();

    public ohe(ogh oghVar) throws Resources.NotFoundException {
        this.a = oghVar;
        this.b = oghVar.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) oghVar.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) oghVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) oghVar.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) oghVar.findViewById(R.id.exo_time);
        View viewFindViewById = oghVar.findViewById(R.id.exo_progress);
        this.j = viewFindViewById;
        this.f = (ViewGroup) oghVar.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) oghVar.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) oghVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = oghVar.findViewById(R.id.exo_overflow_show);
        this.k = viewFindViewById2;
        View viewFindViewById3 = oghVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: ogj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ohe oheVar = this.a;
                    oheVar.i();
                    if (view.getId() == R.id.exo_overflow_show) {
                        oheVar.m.start();
                    } else if (view.getId() == R.id.exo_overflow_hide) {
                        oheVar.n.start();
                    }
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: ogj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ohe oheVar = this.a;
                    oheVar.i();
                    if (view.getId() == R.id.exo_overflow_show) {
                        oheVar.m.start();
                    } else if (view.getId() == R.id.exo_overflow_hide) {
                        oheVar.n.start();
                    }
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ogk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ohe oheVar = this.a;
                View view = oheVar.b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = oheVar.c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = oheVar.e;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ogv(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ogl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ohe oheVar = this.a;
                View view = oheVar.b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = oheVar.c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = oheVar.e;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new ogw(this));
        Resources resources = oghVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ogx(this, oghVar));
        animatorSet.play(valueAnimatorOfFloat).with(p(0.0f, dimension, viewFindViewById)).with(p(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new ogy(this, oghVar));
        animatorSet2.play(p(dimension, dimension2, viewFindViewById)).with(p(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.x = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new ogz(this, oghVar));
        animatorSet3.play(valueAnimatorOfFloat).with(p(0.0f, dimension2, viewFindViewById)).with(p(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.y = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new oha(this));
        animatorSet4.play(valueAnimatorOfFloat2).with(p(dimension, 0.0f, viewFindViewById)).with(p(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.z = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new ohb(this));
        animatorSet5.play(valueAnimatorOfFloat2).with(p(dimension2, 0.0f, viewFindViewById)).with(p(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ogo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new ohc(this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.n = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ogp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new ohd(this));
    }

    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static final boolean o(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    private static ObjectAnimator p(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public final void c(float f) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f)));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final void d() {
        this.x.start();
    }

    public final void e() {
        k(2);
    }

    public final void f() {
        this.w.start();
    }

    public final void g(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }

    public final void h() {
        ogh oghVar = this.a;
        oghVar.removeCallbacks(this.C);
        oghVar.removeCallbacks(this.A);
        oghVar.removeCallbacks(this.B);
        oghVar.removeCallbacks(this.p);
    }

    public final void i() {
        if (this.s == 3) {
            return;
        }
        h();
        int i = this.a.J;
        if (i > 0) {
            if (!this.v) {
                g(this.C, i);
            } else if (this.s == 1) {
                g(this.p, 2000L);
            } else {
                g(this.B, i);
            }
        }
    }

    public final void j(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.r.remove(view);
            return;
        }
        if (this.t && o(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.r.add(view);
    }

    public final void k(int i) {
        int i2 = this.s;
        this.s = i;
        if (i == 2) {
            this.a.setVisibility(8);
        } else if (i2 == 2) {
            this.a.setVisibility(0);
            i2 = 2;
        }
        if (i2 != i) {
            ogh oghVar = this.a;
            Iterator it = oghVar.e.iterator();
            while (it.hasNext()) {
                ogg oggVar = (ogg) it.next();
                oghVar.getVisibility();
                oggVar.E();
            }
        }
    }

    public final void l() {
        if (!this.v) {
            k(0);
            i();
            return;
        }
        int i = this.s;
        if (i == 1) {
            this.y.start();
        } else if (i == 2) {
            this.z.start();
        } else if (i == 3) {
            this.u = true;
        } else if (i == 4) {
            return;
        }
        i();
    }

    public final boolean m(View view) {
        return view != null && this.r.contains(view);
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtli extends ViewGroup {
    public static final /* synthetic */ int J = 0;
    private static final int[] K = {R.attr.materialButtonOutlinedStyle};
    public boolean A;
    public boolean B;
    public boolean C;
    public dtle D;
    public Paint E;
    public int F;
    public final AccessibilityManager G;
    public final dtkr H;
    public Rect I;
    private final int[] L;
    private final Rect M;
    private final Rect N;
    private final lda O;
    private final lda P;
    private boolean Q;
    private Map R;
    private final View.OnAttachStateChangeListener S;
    private final ViewTreeObserver.OnGlobalLayoutListener T;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final dtlm e;
    public final dtlk f;
    public final dtkj g;
    public View h;
    public int i;
    public int j;
    public View k;
    public Drawable l;
    public float m;
    public boolean n;
    public boolean o;
    public ImageView p;
    public Animator q;
    public final dtll r;
    public dtlh s;
    public boolean t;
    public float u;
    public float v;
    public boolean w;
    public Interpolator x;
    public Interpolator y;
    public boolean z;

    public dtli(Context context, dtkr dtkrVar) {
        int i;
        super(context);
        this.L = new int[2];
        this.a = new Rect();
        this.M = new Rect();
        this.N = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.m = 1.0f;
        this.t = false;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = false;
        this.A = true;
        this.B = true;
        this.C = false;
        this.S = new dtkv(this);
        this.T = new dtkw(this);
        setId(R.id.featurehighlight_view);
        setWillNotDraw(false);
        dtlk dtlkVar = new dtlk(context);
        this.f = dtlkVar;
        dtlkVar.setCallback(this);
        dtlm dtlmVar = new dtlm(context);
        this.e = dtlmVar;
        dtlmVar.setCallback(this);
        this.r = new dtll(this);
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        lda ldaVar = new lda(context, new dtkx(this));
        this.O = ldaVar;
        ldaVar.a(false);
        lda ldaVar2 = new lda(getContext(), new dtky(this));
        this.P = ldaVar2;
        ldaVar2.a(false);
        this.H = dtkrVar;
        if (dtkrVar == dtkr.Legacy) {
            i = R.layout.text_content;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(K);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
            typedArrayObtainStyledAttributes.recycle();
            i = R.layout.gm_text_content;
            if (!zHasValue) {
                context = new aer(context, R.style.ThemeOverlay_GoogleMaterial_FeatureHighlight_Content);
            }
        }
        dtkj dtkjVar = (dtkj) LayoutInflater.from(context).inflate(i, (ViewGroup) this, false);
        dtkj dtkjVar2 = this.g;
        if (dtkjVar2 != null) {
            removeView(dtkjVar2.a());
        }
        dtkjVar.getClass();
        this.g = dtkjVar;
        addView(dtkjVar.a(), 0);
        h(new dtlg(this));
        setVisibility(8);
    }

    private final void s(Rect rect, View view) {
        int[] iArr = this.L;
        t(iArr, view);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }

    private final void t(int[] iArr, View view) {
        getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
    }

    private final void u(boolean z) {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            if (z) {
                this.R = new HashMap();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != this) {
                        this.R.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        int[] iArr = ley.a;
                        childAt.setImportantForAccessibility(4);
                    }
                }
                return;
            }
            Map map = this.R;
            if (map != null) {
                for (View view : map.keySet()) {
                    int iIntValue = ((Integer) this.R.get(view)).intValue();
                    int[] iArr2 = ley.a;
                    view.setImportantForAccessibility(iIntValue);
                }
                this.R = null;
            }
        }
    }

    private final boolean v() {
        return this.m != 1.0f;
    }

    public final Animator a() {
        Animator duration;
        Context context = getContext();
        dtlk dtlkVar = this.f;
        int iOrdinal = dtlkVar.g.ordinal();
        if (iOrdinal == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(dtlkVar, "scale", 1.0f, 1.1f).setDuration(500L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(dtlkVar, "scale", 1.1f, 1.0f).setDuration(500L);
            ObjectAnimator duration4 = ObjectAnimator.ofPropertyValuesHolder(dtlkVar, PropertyValuesHolder.ofFloat("pulseScale", 1.1f, 2.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 1.0f, 0.0f)).setDuration(500L);
            animatorSet.play(duration2).with(ObjectAnimator.ofFloat(dtlkVar, "pulseAlpha", 0.0f).setDuration(500L));
            animatorSet.play(duration3).with(duration4).after(duration2);
            duration = animatorSet;
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("No implementation for animation type.");
            }
            duration = ObjectAnimator.ofPropertyValuesHolder(dtlkVar, PropertyValuesHolder.ofFloat("scale", 0.0f, 2.0f), PropertyValuesHolder.ofInt("alpha", 255, 0)).setDuration(1000L);
        }
        duration.setInterpolator(dtcc.c);
        duration.setStartDelay(500L);
        duration.addListener(new dtbw(duration));
        duration.addListener(new dtlj(context));
        return duration;
    }

    public final Interpolator b(final Interpolator interpolator, final float f) {
        dtlm dtlmVar = this.e;
        final float fA = dtlmVar.a(this.N);
        final float f2 = dtlmVar.g;
        return new Interpolator() { // from class: dtks
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f3) {
                int i = dtli.J;
                float interpolation = interpolator.getInterpolation(f3);
                float f4 = ((1.0f - interpolation) * f) + interpolation;
                float f5 = f2;
                float f6 = fA;
                return dtlq.b(((f4 * f5) - f6) / (f5 - f6));
            }
        };
    }

    public final Interpolator c(Interpolator interpolator) {
        dtlm dtlmVar = this.e;
        return new dtkt(interpolator, dtlmVar.g, dtlmVar.a(this.N));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public final void d(int i) {
        if (this.t) {
            return;
        }
        this.s.a(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        dtle dtleVar = this.D;
        if (dtleVar != null) {
            AccessibilityManager accessibilityManager = dtleVar.a;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    dtli dtliVar = dtleVar.f;
                    dtkj dtkjVar = dtliVar.g;
                    int i = (int) x;
                    int i2 = (int) y;
                    dtleVar.p((dtkjVar.A() && dtliVar.b.contains(i, i2)) ? 1 : (dtkjVar.y() && dtliVar.c.contains(i, i2)) ? 2 : (dtkjVar.z() && dtliVar.d.contains(i, i2)) ? 3 : dtliVar.a.contains(i, i2) ? 4 : (dtliVar.o(x, y) && dtliVar.e.e(x, y)) ? -1 : 5);
                } else if (action == 10 && dtleVar.e != Integer.MIN_VALUE) {
                    dtleVar.p(Integer.MIN_VALUE);
                }
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e() {
        if (!this.t) {
            this.s.b();
        }
        View view = this.h;
        if (view != null) {
            view.performClick();
        }
    }

    public final void f(Runnable runnable) {
        if (this.t) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.g.a(), "alpha", 0.0f).setDuration(200L);
        Interpolator interpolator = dtcc.b;
        duration.setInterpolator(c(interpolator));
        dtlm dtlmVar = this.e;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dtlmVar, PropertyValuesHolder.ofFloat("scale", dtlmVar.getScale(), 1.125f), PropertyValuesHolder.ofInt("alpha", dtlmVar.getAlpha(), 0));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(interpolator);
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(200L).setDuration(200L);
        Animator duration3 = this.f.a().setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderWith = animatorSet.play(duration).with(duration2).with(duration3);
        if (q()) {
            builderWith.with(ObjectAnimator.ofFloat(this.p, "elevation", 0.0f).setDuration(200L));
        }
        animatorSet.addListener(new dtku(this, runnable));
        n(animatorSet);
    }

    public final void g(Runnable runnable) {
        if (this.t) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.g.a(), "alpha", 0.0f).setDuration(200L);
        Interpolator interpolator = dtcc.b;
        duration.setInterpolator(c(interpolator));
        Rect rect = this.a;
        dtlm dtlmVar = this.e;
        float fExactCenterX = rect.exactCenterX() - dtlmVar.h;
        float fExactCenterY = rect.exactCenterY() - dtlmVar.i;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dtlmVar, PropertyValuesHolder.ofFloat("scale", dtlmVar.getScale(), 0.0f), PropertyValuesHolder.ofFloat("translationX", dtlmVar.getTranslationX(), fExactCenterX), PropertyValuesHolder.ofFloat("translationY", dtlmVar.getTranslationY(), fExactCenterY), PropertyValuesHolder.ofInt("alpha", dtlmVar.getAlpha(), 0));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(interpolator);
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(200L).setDuration(200L);
        Animator duration3 = this.f.a().setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderWith = animatorSet.play(duration).with(duration2).with(duration3);
        if (q()) {
            builderWith.with(ObjectAnimator.ofFloat(this.p, "elevation", 0.0f).setDuration(200L));
        }
        animatorSet.addListener(new dtku(this, runnable));
        n(animatorSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h(dtlh dtlhVar) {
        this.g.l(dtlhVar);
        this.s = dtlhVar;
    }

    public final void i() {
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(this.F));
        }
    }

    public final void j(int i, int i2) {
        dtlk dtlkVar = this.f;
        dtlkVar.c(i);
        dtlkVar.d(i2);
    }

    public final void k(View view) {
        int[] iArr = ley.a;
        ecej.a(isAttachedToWindow(), "Must be attached to window before showing");
        this.h = view;
        dtle dtleVar = new dtle(this, view);
        this.D = dtleVar;
        ley.p(this, dtleVar);
        if (p()) {
            TextView textView = (TextView) view;
            this.j = textView.getCurrentTextColor();
            textView.setTextColor(this.i);
        }
        if (q()) {
            l();
        }
        if (getVisibility() == 8) {
            setVisibility(4);
        }
        view.addOnAttachStateChangeListener(this.S);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.T);
    }

    public final void l() {
        View view = this.h;
        if (view == null) {
            return;
        }
        this.o = view.isDrawingCacheEnabled();
        this.h.setDrawingCacheEnabled(true);
        ImageView imageView = new ImageView(getContext());
        this.p = imageView;
        imageView.setElevation(this.h.getElevation());
        this.p.setOutlineProvider(new dtlb(this));
        if (this.E != null) {
            i();
        }
        addView(this.p);
    }

    public final void m() {
        ecej.a(getParent() != null, "View must be attached to view hierarchy");
        setVisibility(0);
        this.t = false;
    }

    public final void n(Animator animator) {
        Animator animator2 = this.q;
        if (animator2 != null) {
            animator2.cancel();
        }
        if (animator != null) {
            this.q = animator;
            animator.start();
        }
    }

    public final boolean o(float f, float f2) {
        return this.M.contains(Math.round(f), Math.round(f2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        View view = this.h;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.S);
            this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this.T);
        }
        Animator animator = this.q;
        if (animator != null) {
            animator.removeAllListeners();
            this.q.cancel();
            this.q = null;
        }
        this.C = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.k != null) {
            canvas.clipRect(this.M);
        }
        this.e.draw(canvas);
        if (!this.z) {
            this.f.draw(canvas);
        }
        if (this.l != null) {
            Rect rect = this.a;
            canvas.translate(rect.exactCenterX() - (this.l.getBounds().width() / 2.0f), rect.exactCenterY() - (this.l.getBounds().height() / 2.0f));
            this.l.draw(canvas);
        } else {
            View view = this.h;
            if (view == null) {
                throw new IllegalStateException("Neither target view nor drawable was set");
            }
            if (q()) {
                view.invalidate();
                this.p.setImageBitmap(this.h.getDrawingCache());
            } else {
                ecej.a(true, "Target view must be set before draw");
                Rect rect2 = this.a;
                canvas.translate(rect2.left, rect2.top);
                if (v()) {
                    canvas.save();
                    float f = this.m;
                    canvas.scale(f, f);
                }
                Paint paint = this.E;
                if (paint != null) {
                    int iSaveLayer = canvas.saveLayer(null, paint, 31);
                    this.h.draw(canvas);
                    canvas.restoreToCount(iSaveLayer);
                } else {
                    this.h.draw(canvas);
                }
                if (v()) {
                    canvas.restore();
                }
            }
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int iF;
        ecej.a(this.h != null, "Target view must be set before layout");
        this.C = true;
        int[] iArr = this.L;
        t(iArr, this.h);
        int i6 = iArr[0];
        int i7 = iArr[1];
        int width = this.h.getWidth() + i6;
        int height = iArr[1] + this.h.getHeight();
        Rect rect = this.a;
        rect.set(i6, i7, width, height);
        Drawable drawable = this.l;
        if (drawable != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_min_tap_target_size) / 2;
            int iMax = Math.max(drawable.getBounds().height() / 2, dimensionPixelSize);
            int iMax2 = Math.max(drawable.getBounds().width() / 2, dimensionPixelSize);
            int iCenterX = rect.centerX();
            int iCenterY = rect.centerY();
            rect.set(iCenterX - iMax2, iCenterY - iMax, iCenterX + iMax2, iCenterY + iMax);
        }
        float f = this.m;
        float fWidth = rect.width();
        float f2 = f - 1.0f;
        float fHeight = rect.height();
        float f3 = (fWidth * f2) / 2.0f;
        rect.left = (int) (rect.left - f3);
        rect.right = (int) (rect.right + f3);
        float f4 = (fHeight * f2) / 2.0f;
        rect.top = (int) (rect.top - f4);
        rect.bottom = (int) (rect.bottom + f4);
        if (this.l == null && q()) {
            ecej.a(this.p != null, "Target view mock must be created before layout");
            this.p.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        View view = this.k;
        if (view != null) {
            s(this.M, view);
        } else {
            this.M.set(i, i2, i3, i4);
        }
        dtlm dtlmVar = this.e;
        Rect rect2 = this.M;
        dtlmVar.setBounds(rect2);
        if (!this.z) {
            this.f.setBounds(rect2);
        }
        dtll dtllVar = this.r;
        dtli dtliVar = dtllVar.d;
        View viewA = dtliVar.g.a();
        if (rect.isEmpty() || rect2.isEmpty()) {
            viewA.layout(0, 0, 0, 0);
        } else {
            int iCenterY2 = rect.centerY();
            int iCenterX2 = rect.centerX();
            if (!dtllVar.e) {
                dtlk dtlkVar = dtliVar.f;
                dtlkVar.e = rect.exactCenterX();
                dtlkVar.f = rect.exactCenterY();
                dtlkVar.d = Math.max(dtlkVar.a, (Math.max(rect.width(), rect.height()) / 2.0f) + dtlkVar.b);
                dtlkVar.invalidateSelf();
                Rect rect3 = dtllVar.b;
                float f5 = dtlkVar.d + dtlkVar.c;
                rect3.set(Math.round(dtlkVar.e - f5), Math.round(dtlkVar.f - f5), Math.round(dtlkVar.e + f5), Math.round(dtlkVar.f + f5));
            }
            int i8 = dtllVar.f;
            if (i8 != 48 && (i8 == 80 || iCenterY2 < rect2.centerY())) {
                int i9 = rect2.bottom;
                Rect rect4 = dtllVar.b;
                dtllVar.b(viewA, rect2.width(), i9 - rect4.bottom);
                int iA = dtllVar.a(viewA, rect2.left, rect2.right, viewA.getMeasuredWidth(), iCenterX2);
                int i10 = dtllVar.e ? rect.bottom + dtllVar.c : rect4.bottom;
                viewA.layout(iA, i10, viewA.getMeasuredWidth() + iA, viewA.getMeasuredHeight() + i10);
            } else {
                dtllVar.b(viewA, rect2.width(), (dtllVar.e ? rect.top : dtllVar.b.top) - rect2.top);
                int iA2 = dtllVar.a(viewA, rect2.left, rect2.right, viewA.getMeasuredWidth(), iCenterX2);
                int i11 = dtllVar.e ? rect.top - dtllVar.c : dtllVar.b.top;
                viewA.layout(iA2, i11 - viewA.getMeasuredHeight(), viewA.getMeasuredWidth() + iA2, i11);
            }
        }
        Rect rect5 = dtllVar.a;
        rect5.set(viewA.getLeft(), viewA.getTop(), viewA.getRight(), viewA.getBottom());
        dtlm dtlmVar2 = dtliVar.e;
        boolean z2 = dtllVar.e;
        dtlmVar2.b.set(rect);
        dtlmVar2.c.set(rect5);
        float fExactCenterX = rect.exactCenterX();
        float fExactCenterY = rect.exactCenterY();
        if (z2) {
            int iCenterY3 = rect.centerY();
            int iCenterY4 = rect2.centerY();
            int i12 = dtlmVar2.d;
            int i13 = i12 + i12;
            dtlmVar2.h = fExactCenterX / 2.0f;
            if (iCenterY3 < iCenterY4) {
                i5 = rect5.bottom;
                iF = dtlm.f(i5, fExactCenterX, i13);
                dtlmVar2.i = -iF;
            } else {
                int iHeight = rect2.height() - rect5.top;
                int iF2 = dtlm.f(iHeight, fExactCenterX, i13);
                dtlmVar2.i = rect2.height() + iF2;
                i5 = iHeight;
                iF = iF2;
            }
            dtlmVar2.g = i5 + iF + i13;
        } else {
            Rect bounds = dtlmVar2.getBounds();
            if (Math.min(fExactCenterY - bounds.top, bounds.bottom - fExactCenterY) < dtlmVar2.a) {
                dtlmVar2.h = fExactCenterX;
                dtlmVar2.i = fExactCenterY;
            } else {
                dtlmVar2.h = fExactCenterX <= bounds.exactCenterX() ? rect5.exactCenterX() + dtlmVar2.e : rect5.exactCenterX() - dtlmVar2.e;
                fExactCenterY = fExactCenterY <= bounds.exactCenterY() ? rect5.exactCenterY() + dtlmVar2.f : rect5.exactCenterY() - dtlmVar2.f;
                dtlmVar2.i = fExactCenterY;
            }
            dtlmVar2.g = dtlmVar2.d + Math.max(dtlm.g(dtlmVar2.h, fExactCenterY, rect), dtlm.g(dtlmVar2.h, dtlmVar2.i, rect5));
        }
        dtlmVar2.invalidateSelf();
        Rect rect6 = this.N;
        dtkj dtkjVar = this.g;
        s(rect6, dtkjVar.a());
        s(this.b, dtkjVar.d());
        s(this.c, dtkjVar.b());
        s(this.d, dtkjVar.c());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(View.MeasureSpec.getSize(i), i), resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Q = this.a.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            actionMasked = 0;
        }
        if (!this.Q || this.h == null) {
            this.O.b(motionEvent);
            if (actionMasked == 1 && this.w) {
                this.w = false;
                this.y = null;
                this.x = null;
                if (this.u > getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_to_dismiss_threshold)) {
                    d(2);
                } else {
                    Animator animator = this.q;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this.g.a(), "alpha", 1.0f).setDuration(150L);
                    duration.setInterpolator(b(dtcc.a, 1.0f - this.v));
                    Rect rect = this.a;
                    dtlm dtlmVar = this.e;
                    Animator duration2 = dtlmVar.b(rect.exactCenterX() - dtlmVar.h, rect.exactCenterY() - dtlmVar.i, 1.0f - this.v).setDuration(150L);
                    Animator duration3 = this.f.b(1.0f - this.v).setDuration(150L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    AnimatorSet.Builder builderWith = animatorSet.play(duration).with(duration2).with(duration3);
                    if (q()) {
                        builderWith.with(ObjectAnimator.ofFloat(this.p, "elevation", this.h.getElevation()).setDuration(150L));
                    }
                    animatorSet.addListener(new dtld(this));
                    n(animatorSet);
                }
                if (!this.t) {
                    this.s.c();
                }
            }
        } else {
            lda ldaVar = this.P;
            if (ldaVar != null) {
                ldaVar.b(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            this.h.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean p() {
        return this.i != 0 && (this.h instanceof TextView);
    }

    public final boolean q() {
        return this.n;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i == getVisibility()) {
            super.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i != 8 && i != 4) {
            if (i == 0) {
                sendAccessibilityEvent(32);
                u(true);
                return;
            }
            return;
        }
        u(false);
        int[] iArr = ley.a;
        Object parentForAccessibility = getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            ((View) parentForAccessibility).sendAccessibilityEvent(32);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.f || drawable == this.l;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}

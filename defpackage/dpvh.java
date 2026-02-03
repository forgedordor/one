package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvh implements dpvv {
    static final /* synthetic */ fdeh[] a;
    public final eony b;
    public final RendererContainer c;
    public final fdae d;
    public final dpum e;
    public final fdae f;
    public final fdae g;
    public boolean h = true;
    public final Duration i;
    public final int j;
    public final int k;
    public final int l;
    public final View.OnTouchListener m;
    public final View.OnTouchListener n;
    public Instant o;
    public float p;
    public float q;
    public boolean r;
    private final View s;
    private Animator t;
    private final ViewConfiguration u;
    private final int v;
    private final fctc w;
    private VelocityTracker x;
    private final fdcz y;

    static {
        fdbv fdbvVar = new fdbv(dpvh.class, "isAttached", "isAttached()Z", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    public dpvh(eony eonyVar, RendererContainer rendererContainer, fdae fdaeVar, dpum dpumVar, fdae fdaeVar2, fdae fdaeVar3, View view) {
        this.b = eonyVar;
        this.c = rendererContainer;
        this.d = fdaeVar;
        this.e = dpumVar;
        this.f = fdaeVar2;
        this.g = fdaeVar3;
        this.s = view;
        Duration durationOfMillis = Duration.ofMillis(ViewConfiguration.getLongPressTimeout());
        durationOfMillis.getClass();
        this.i = durationOfMillis;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(rendererContainer.getContext());
        this.u = viewConfiguration;
        int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = scaledMinimumFlingVelocity;
        this.v = scaledMinimumFlingVelocity * 4;
        this.k = viewConfiguration.getScaledMaximumFlingVelocity();
        this.l = viewConfiguration.getScaledTouchSlop();
        this.w = fctd.a(new fdae() { // from class: dpva
            @Override // defpackage.fdae
            public final Object invoke() {
                return Long.valueOf(this.a.c.getContext().getResources().getInteger(R.integer.short_animation_ms));
            }
        });
        this.m = new View.OnTouchListener() { // from class: dpvb
            /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
            /* JADX WARN: Type inference failed for: r10v2, types: [dpvw, java.lang.Object] */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
                /*
                    r8 = this;
                    r10.getClass()
                    dpvh r9 = r8.a
                    boolean r0 = r9.h
                    r1 = 0
                    if (r0 == 0) goto L9d
                    int r0 = r10.getActionMasked()
                    if (r0 == 0) goto L70
                    r2 = 2
                    if (r0 == r2) goto L14
                    return r1
                L14:
                    boolean r0 = r9.r
                    if (r0 != 0) goto L6f
                    float r0 = r10.getRawY()
                    float r2 = r9.p
                    float r0 = r0 - r2
                    int r2 = r9.l
                    int r0 = (int) r0
                    int r3 = java.lang.Math.abs(r0)
                    r4 = 1
                    if (r3 <= r2) goto L2b
                    r2 = r4
                    goto L2c
                L2b:
                    r2 = r1
                L2c:
                    if (r2 != 0) goto L5f
                    j$.time.Instant r3 = r9.o
                    r5 = 0
                    java.lang.String r6 = "dragStartInstant"
                    if (r3 != 0) goto L39
                    defpackage.fdbq.c(r6)
                    r3 = r5
                L39:
                    j$.time.Instant r7 = j$.time.Instant.EPOCH
                    boolean r3 = r3.isAfter(r7)
                    if (r3 == 0) goto L5f
                    eony r3 = r9.b
                    j$.time.Instant r3 = r3.a()
                    j$.time.Instant r7 = r9.o
                    if (r7 != 0) goto L4f
                    defpackage.fdbq.c(r6)
                    goto L50
                L4f:
                    r5 = r7
                L50:
                    j$.time.Duration r6 = r9.i
                    j$.time.Instant r5 = r5.plus(r6)
                    boolean r3 = r3.isAfter(r5)
                    if (r3 == 0) goto L5f
                    r9.r = r4
                    goto L6f
                L5f:
                    android.view.VelocityTracker r3 = r9.c()
                    r3.addMovement(r10)
                    if (r2 == 0) goto L6f
                    boolean r9 = r9.i(r0)
                    if (r9 == 0) goto L6f
                    return r4
                L6f:
                    return r1
                L70:
                    r9.r = r1
                    eony r0 = r9.b
                    j$.time.Instant r0 = r0.a()
                    r9.o = r0
                    float r0 = r10.getRawY()
                    r9.p = r0
                    float r0 = r10.getRawY()
                    r9.q = r0
                    android.view.VelocityTracker r0 = r9.c()
                    r0.addMovement(r10)
                    fdae r10 = r9.d
                    java.lang.Object r10 = r10.invoke()
                    if (r10 != 0) goto L96
                    return r1
                L96:
                    dpvp r10 = r10.c()
                    r10.a(r9)
                L9d:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dpvb.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
        this.n = new View.OnTouchListener() { // from class: dpvc
            /* JADX WARN: Type inference failed for: r2v20, types: [dpvw, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v6, types: [dpvw, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v12, types: [dpvw, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v9, types: [dpvw, java.lang.Object] */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                motionEvent.getClass();
                dpvh dpvhVar = this.a;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        dpvhVar.c().addMovement(motionEvent);
                        float rawY = motionEvent.getRawY() - dpvhVar.q;
                        if (!dpvhVar.h) {
                            return false;
                        }
                        int i = (int) rawY;
                        if (!dpvhVar.i(i)) {
                            ?? Invoke = dpvhVar.d.invoke();
                            if (Invoke == 0 || ((i <= 0 || Invoke.h()) && (i >= 0 || Invoke.g()))) {
                                return false;
                            }
                            Invoke.j(-i);
                        }
                        dpvhVar.q = motionEvent.getRawY();
                        return true;
                    }
                    if (actionMasked != 3) {
                        return false;
                    }
                }
                VelocityTracker velocityTrackerC = dpvhVar.c();
                velocityTrackerC.addMovement(motionEvent);
                velocityTrackerC.computeCurrentVelocity(1000, dpvhVar.k);
                int yVelocity = (int) velocityTrackerC.getYVelocity();
                float rawY2 = motionEvent.getRawY() - dpvhVar.p;
                if (Math.abs(yVelocity) > dpvhVar.j) {
                    int iIntValue = ((Number) dpvhVar.e.a.invoke()).intValue();
                    int iIntValue2 = ((Number) dpvhVar.f.invoke()).intValue();
                    int iF = fddu.f(((Number) dpvhVar.g.invoke()).intValue(), iIntValue2);
                    if (rawY2 >= 0.0f) {
                        fdae fdaeVar4 = dpvhVar.d;
                        ?? Invoke2 = fdaeVar4.invoke();
                        if (Invoke2 == 0 || Invoke2.a() != 0) {
                            ?? Invoke3 = fdaeVar4.invoke();
                            if (Invoke3 != 0) {
                                Invoke3.d(-yVelocity);
                            }
                        } else {
                            dpvhVar.d(iIntValue, iIntValue2, new DecelerateInterpolator());
                        }
                    } else if (iIntValue != iF) {
                        dpvhVar.d(iIntValue, iF, new DecelerateInterpolator());
                    }
                } else {
                    int iIntValue3 = ((Number) dpvhVar.e.a.invoke()).intValue();
                    int iIntValue4 = ((Number) dpvhVar.f.invoke()).intValue();
                    int iF2 = fddu.f(((Number) dpvhVar.g.invoke()).intValue(), iIntValue4);
                    if (iF2 - iIntValue3 < iIntValue3 - iIntValue4) {
                        iIntValue4 = iF2;
                    }
                    dpvhVar.d(iIntValue3, iIntValue4, new DecelerateInterpolator());
                }
                ?? Invoke4 = dpvhVar.d.invoke();
                if (Invoke4 != 0) {
                    Invoke4.e();
                }
                dpvhVar.e();
                return true;
            }
        };
        this.q = -1.0f;
        this.y = new dpve(false, this);
    }

    @Override // defpackage.dpvv
    public final void a(int i, float f) {
        if (this.h && i == 0) {
            float fAbs = Math.abs(f);
            int i2 = this.v;
            int iIntValue = ((Number) this.e.a.invoke()).intValue();
            int iIntValue2 = ((Number) this.f.invoke()).intValue();
            int iF = fddu.f(((Number) this.g.invoke()).intValue(), iIntValue2);
            if (fAbs >= i2) {
                if (f > 0.0f) {
                    iIntValue2 = iF;
                }
                d(iIntValue, iIntValue2, new DecelerateInterpolator());
            }
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [dpvw, java.lang.Object] */
    @Override // defpackage.dpvv
    public final void b(int i) {
        ?? Invoke = this.d.invoke();
        if (Invoke != 0) {
            h(Invoke);
        }
    }

    public final VelocityTracker c() {
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
        velocityTrackerObtain.clear();
        this.x = velocityTrackerObtain;
        velocityTrackerObtain.getClass();
        return velocityTrackerObtain;
    }

    public final void d(int i, int i2, Interpolator interpolator) {
        Animator animator = this.t;
        if (animator != null) {
            animator.cancel();
        }
        ((Number) this.f.invoke()).intValue();
        ((Number) this.g.invoke()).intValue();
        if (i != i2) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
            valueAnimatorOfInt.setDuration(((Number) this.w.a()).longValue());
            valueAnimatorOfInt.setInterpolator(interpolator);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dpuz
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator.getClass();
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    Integer num = (Integer) animatedValue;
                    num.intValue();
                    dpvh dpvhVar = this.a;
                    dpvhVar.e.b.invoke(num);
                    dpvhVar.d.invoke();
                }
            });
            valueAnimatorOfInt.addListener(new dpvd(this));
            valueAnimatorOfInt.start();
            this.t = valueAnimatorOfInt;
        }
    }

    public final void e() {
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.x = null;
        this.q = -1.0f;
    }

    public final void f(boolean z) {
        this.y.d(a[0], Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dpvw, java.lang.Object] */
    public final void g() {
        Object obj;
        ?? Invoke = this.d.invoke();
        if (Invoke != 0) {
            dpvp dpvpVarC = Invoke.c();
            CopyOnWriteArraySet copyOnWriteArraySet = dpvpVarC.b;
            if (copyOnWriteArraySet.remove(this) && copyOnWriteArraySet.isEmpty() && (obj = dpvpVarC.c) != null) {
                dpvpVarC.a.invoke(obj);
                dpvpVarC.c = null;
            }
        }
    }

    public final void h(dpvw dpvwVar) {
        int iA = dpvwVar.a();
        View viewB = dpvwVar.b();
        if (viewB != null) {
            View view = this.s;
            if (view == null) {
                view = viewB;
            }
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new dpvg(view, viewB, iA));
                return;
            } else {
                view.getWidth();
                viewB.setElevation(fddu.g(iA >> 3, view.getHeight()));
                return;
            }
        }
        View view2 = this.s;
        if (view2 != null) {
            if (view2.getWidth() <= 0 || view2.getHeight() <= 0) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(new dpvf(view2, iA));
                return;
            }
            view2.getWidth();
            view2.setTranslationY(-view2.getHeight());
            view2.setElevation(fddu.g(iA >> 3, r1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [dpvw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [dpvw, java.lang.Object] */
    public final boolean i(int i) {
        if (i > 0) {
            ?? Invoke = this.d.invoke();
            Integer numValueOf = Invoke != 0 ? Integer.valueOf(Invoke.a()) : null;
            if (numValueOf == null || numValueOf.intValue() != 0) {
                return false;
            }
            if (!Invoke.i(i)) {
                dpum dpumVar = this.e;
                int iIntValue = ((Number) dpumVar.a.invoke()).intValue();
                int iIntValue2 = ((Number) this.f.invoke()).intValue();
                if (iIntValue <= iIntValue2) {
                    return false;
                }
                dpumVar.b.invoke(Integer.valueOf(Math.max(iIntValue - i, iIntValue2)));
            }
            return true;
        }
        dpum dpumVar2 = this.e;
        int iIntValue3 = ((Number) dpumVar2.a.invoke()).intValue();
        int iIntValue4 = ((Number) this.g.invoke()).intValue();
        fdae fdaeVar = this.d;
        ?? Invoke2 = fdaeVar.invoke();
        if (Invoke2 != 0 && Invoke2.g()) {
            return false;
        }
        fdaeVar.invoke();
        if (iIntValue3 >= iIntValue4) {
            return false;
        }
        dpumVar2.b.invoke(Integer.valueOf(Math.min(iIntValue3 - i, iIntValue4)));
        if (fdaeVar.invoke() != null) {
            ((Number) this.f.invoke()).intValue();
        }
        return true;
    }
}

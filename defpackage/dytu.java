package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.common.LockableNestedScrollView;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import com.google.android.material.card.MaterialCardView;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dytu extends FrameLayout implements dyyh {
    private static final Property B = Property.of(View.class, Float.class, "alpha");
    private static final Property C = Property.of(eesc.class, Integer.class, "alpha");
    private static final Interpolator D = new PathInterpolator(0.54f, 0.01f, 0.61f, 0.99f);
    public static final String a = "dytu";
    public dyum A;
    private boolean E;
    private int F;
    private final boolean G;
    private final boolean H;
    private final float I;
    private final float J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final View P;
    private final ViewGroup Q;
    private final ViewGroup R;
    private final LockableNestedScrollView S;
    private final View T;
    private final OverScrollControlledNestedScrollView U;
    private final View V;
    private final View W;
    private final View aa;
    private final View ab;
    private final View ac;
    private final eesc ad;
    private final eesc ae;
    private final eesc af;
    private final ejwi ag;
    private final FrameLayout ah;
    private final eejp ai;
    private final TextView aj;
    private final Rect ak;
    private final boolean al;
    private ejwi am;
    private int an;
    public boolean b;
    public boolean c;
    public boolean d;
    public dytx e;
    public final dyrt f;
    public final View g;
    public final RecyclerView h;
    public final RecyclerView i;
    public final SelectedAccountView j;
    public final Button k;
    public final ViewGroup l;
    public final MaterialCardView m;
    public final ViewGroup n;
    public final abs o;
    public final TextView p;
    public Button q;
    public Button r;
    public dyre s;
    public dyre t;
    public Runnable u;
    public dyul v;
    public dyuj w;
    public ach x;
    public AnimatorSet y;
    public final dyay z;

    public dytu(Context context, boolean z, dyuu dyuuVar) {
        super(z ? dyuuVar.f(context) : new ContextThemeWrapper(context, dyuuVar.d()), null, 0);
        this.o = new dyth(this);
        this.ak = new Rect();
        this.am = ejud.a;
        this.an = 0;
        this.z = new dytq(this);
        setId(R.id.express_sign_in_layout_internal);
        this.G = z;
        if (!dyqx.c(getContext())) {
            throw new IllegalStateException("ExpressSignInLayout has to be used with a Google Material theme");
        }
        LayoutInflater.from(getContext()).inflate(R.layout.express_sign_in_layout, this);
        boolean zG = dyqv.g(getContext());
        this.al = zG;
        ejwi ejwiVarB = dyuuVar.b(getContext());
        this.ag = ejwiVarB;
        this.ai = new eejp(getContext());
        Context context2 = getContext();
        dyrn dyrnVar = new dyrn(dypw.c(context2, R.attr.ogContentContainerPaddingTop), dypw.c(context2, R.attr.ogContainerExternalHorizontalSpacing), dypw.c(context2, R.attr.ogContainerInternalAdditionalHorizontalSpacing), dypw.a(context2, R.attr.ogDialogCornerRadius), dypw.b(context2, R.attr.ogImportantBoxBackgroundColor), dypw.c(context2, R.attr.ogImportantBoxCornerRadius), dypw.c(context2, R.attr.ogImportantBoxMarginTop), dypw.c(context2, R.attr.ogDialogMarginBottom), dypw.c(context2, R.attr.ogLegalDisclaimerBottomPadding), dypw.c(context2, R.attr.ogLegalDisclaimerTopPadding), dypw.c(context2, R.attr.ogSelectedAccountViewMarginVertical));
        this.f = dyrnVar;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.N = getResources().getColor(true != zG ? R.color.og_elevation_shadow_color_dark : R.color.og_elevation_shadow_color_light);
        this.I = dyqx.a(displayMetrics, true != zG ? 5 : 8);
        float fA = dyqx.a(displayMetrics, true != zG ? 3 : 8);
        this.J = fA;
        this.K = dyqx.b(displayMetrics, 20);
        this.L = dyqx.b(displayMetrics, 8);
        this.M = dyqx.b(displayMetrics, 6);
        boolean zG2 = dyuuVar.g();
        this.H = zG2;
        this.g = findViewById(R.id.scrim_view);
        View viewFindViewById = findViewById(R.id.fake_scrim_view);
        this.P = viewFindViewById;
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account);
        this.j = selectedAccountView;
        this.m = (MaterialCardView) findViewById(R.id.important_box_card_view);
        selectedAccountView.l(150L);
        Interpolator interpolator = D;
        selectedAccountView.m(interpolator);
        this.h = (RecyclerView) findViewById(R.id.accounts_list);
        this.i = (RecyclerView) findViewById(R.id.account_management_actions_list);
        View viewFindViewById2 = findViewById(R.id.og_selected_account_to_account_management_divider);
        this.ac = viewFindViewById2;
        int iL = zG2 ? 0 : dybw.l(getContext()) + dyrnVar.c;
        this.O = iL;
        I(iL);
        this.k = (Button) findViewById(R.id.sign_in_button);
        this.q = (Button) findViewById(R.id.continue_as_button);
        this.r = (Button) findViewById(R.id.secondary_action_button);
        this.Q = (ViewGroup) findViewById(R.id.main_container);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_container);
        this.R = viewGroup;
        LockableNestedScrollView lockableNestedScrollView = (LockableNestedScrollView) findViewById(R.id.scrollable_container);
        this.S = lockableNestedScrollView;
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.footer_container);
        this.l = viewGroup2;
        this.T = findViewById(R.id.header_container);
        View viewFindViewById3 = findViewById(R.id.selected_account_container);
        this.V = viewFindViewById3;
        this.W = findViewById(R.id.selected_account_top_inset_spacing);
        this.aa = findViewById(R.id.accounts_content_container);
        this.n = (ViewGroup) findViewById(R.id.progress_container);
        TextView textView = (TextView) findViewById(R.id.choose_an_account_a11y);
        this.aj = textView;
        this.p = (TextView) findViewById(R.id.disclaimer_text);
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = (OverScrollControlledNestedScrollView) findViewById(R.id.og_account_management_container);
        this.U = overScrollControlledNestedScrollView;
        View viewFindViewById4 = findViewById(R.id.account_management_list_container);
        this.ab = viewFindViewById4;
        eesc eescVarC = C();
        eescVarC.O(fA);
        eescVarC.fx(D(dyrnVar.l(), true));
        if (!dyrnVar.l()) {
            eescVarC.Z();
        }
        this.ae = eescVarC;
        lockableNestedScrollView.setBackgroundDrawable(eescVarC);
        viewGroup.setLayoutTransition(x());
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById4.getParent();
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setAnimator(2, null);
        layoutTransition.setAnimator(3, ValueAnimator.ofInt(0));
        P(layoutTransition);
        viewGroup3.setLayoutTransition(layoutTransition);
        ((ViewGroup) viewFindViewById3).setLayoutTransition(x());
        eesc eescVarC2 = C();
        this.ad = eescVarC2;
        eescVarC2.fx(D(false, true));
        viewFindViewById3.setBackgroundDrawable(eescVarC2);
        if (ejwiVarB.g()) {
            eescVarC2.setAlpha(0);
            viewFindViewById2.setBackgroundColor(((Integer) ejwiVarB.c()).intValue());
        }
        eesc eescVarC3 = C();
        this.af = eescVarC3;
        eescVarC3.Z();
        viewGroup2.setBackgroundDrawable(eescVarC3);
        eescVarC2.R(fA);
        eescVarC3.R(fA);
        overScrollControlledNestedScrollView.g = new dysw(this);
        overScrollControlledNestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: dysx
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.r();
            }
        });
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.ah = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        viewFindViewById.setVisibility(true != z ? 8 : 0);
        findViewById(R.id.esi_custom_header_separator).setVisibility(true != zG2 ? 0 : 8);
        dxxt.a(textView);
        ley.r(textView, getResources().getString(R.string.og_account_picker_dialog_a11y));
        if (O()) {
            dyrg.a(this);
        }
        N(getResources().getConfiguration());
    }

    private static ObjectAnimator A(boolean z, View view, int i) {
        if (z) {
            ObjectAnimator duration = y(view).setDuration(150L);
            duration.addListener(new dytf(view));
            return duration;
        }
        ObjectAnimator duration2 = z(view).setDuration(150L);
        duration2.addListener(new dytg(view));
        return duration2;
    }

    private final View B() {
        return this.G ? this.P : this.g;
    }

    private final eesc C() {
        eesc eescVarF = eesc.F(getContext());
        eescVarF.aa();
        eescVarF.S(this.N);
        ejwi ejwiVar = this.ag;
        if (ejwiVar.g()) {
            eescVarF.P(ColorStateList.valueOf(((Integer) ejwiVar.c()).intValue()));
        }
        return eescVarF;
    }

    private final eesj D(boolean z, boolean z2) {
        eesh eeshVar = new eesh();
        if (z2) {
            float f = ((dyrn) this.f).d;
            eeshVar.j(f);
            eeshVar.k(f);
        }
        if (z) {
            dyrt dyrtVar = this.f;
            eeshVar.a(eesd.a(0));
            float f2 = ((dyrn) dyrtVar).d;
            eeshVar.b(f2);
            eeshVar.c(eesd.a(0));
            eeshVar.d(f2);
        }
        return new eesj(eeshVar);
    }

    private final void E() {
        this.m.setVisibility(8);
        this.k.setVisibility(0);
        this.q.setVisibility(8);
        K(false, false);
        k(false);
        Q();
        M(true);
    }

    private final void F() {
        this.m.setVisibility(0);
        this.k.setVisibility(8);
        this.q.setVisibility(0);
        K(this.b, true);
        Q();
        M(false);
    }

    private final void G(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        final eesc eescVar = this.ae;
        if (eescVar.x() > 0.0f) {
            ekfw ekfwVar = new ekfw();
            final eesc eescVar2 = this.ad;
            Object[] objArr = new Animator[2];
            int i = true != z ? 0 : 255;
            objArr[0] = ObjectAnimator.ofInt(eescVar2, (Property<eesc, Integer>) C, 255 - i, i).setDuration(150L);
            final MaterialCardView materialCardView = this.m;
            dyrt dyrtVar = this.f;
            float f = ((dyrn) dyrtVar).f;
            float f2 = true != z ? f : 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f - f2, f2);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dysn
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    String str = dytu.a;
                    materialCardView.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            objArr[1] = valueAnimatorOfFloat;
            ekfwVar.i(objArr);
            if (!dyrtVar.l()) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(true != z ? 1.0f : 0.0f);
                valueAnimatorOfFloat2.setDuration(100L);
                valueAnimatorOfFloat2.setStartDelay(true != z ? 0L : 50L);
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dysv
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        String str = dytu.a;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        eescVar.Q(fFloatValue);
                        eescVar2.Q(fFloatValue);
                    }
                });
                ekfwVar.h(valueAnimatorOfFloat2);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ekfwVar.g());
            animatorSet.addListener(new dyts(this, z));
            animatorSet.start();
        }
        if (((ViewGroup.MarginLayoutParams) this.Q.getLayoutParams()).topMargin == 0) {
            this.W.setVisibility(true != z ? 8 : 0);
            dyrg.b(this, z, this.al);
        }
        ViewGroup viewGroup = this.R;
        int i2 = true != z ? -2 : -1;
        viewGroup.getLayoutParams().height = i2;
        LockableNestedScrollView lockableNestedScrollView = this.S;
        lockableNestedScrollView.getLayoutParams().height = i2;
        lockableNestedScrollView.h = !z;
        View view = this.T;
        int i3 = true != z ? 0 : 8;
        view.setVisibility(i3);
        if (this.ag.g()) {
            this.ac.setVisibility(i3);
        }
        ((ViewGroup.MarginLayoutParams) this.m.getLayoutParams()).topMargin = z ? 0 : ((dyrn) this.f).g;
        I(z ? 0 : this.O);
        n(viewGroup, z ? 0 : ((dyrn) this.f).a);
    }

    private static void H(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i);
        view.setLayoutParams(marginLayoutParams);
    }

    private final void I(int i) {
        if (this.H) {
            return;
        }
        View view = this.ac;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        view.setLayoutParams(marginLayoutParams);
    }

    private final void J() {
        if (this.m.getVisibility() == 0) {
            E();
        } else {
            F();
        }
    }

    private final void K(boolean z, boolean z2) {
        this.aj.setVisibility(true != (dyrb.a(getContext()) && !z && z2) ? 8 : 0);
    }

    private final void L(float f, eesc eescVar, View view) {
        if (this.ab.getVisibility() == 8) {
            f = 0.0f;
        }
        float f2 = this.I;
        int[] iArr = ley.a;
        float f3 = f2 * f;
        len.j(view, f3);
        ejwi ejwiVar = this.ag;
        if (ejwiVar.g()) {
            eescVar.P(ColorStateList.valueOf(this.ai.a(((Integer) ejwiVar.c()).intValue(), f)));
        } else {
            eescVar.O(f3);
        }
    }

    private final void M(boolean z) {
        this.af.fx(D(this.f.l(), z));
    }

    private final void N(Configuration configuration) {
        ViewGroup viewGroup = this.Q;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (configuration == null || layoutParams == null) {
            return;
        }
        if (configuration.smallestScreenWidthDp >= 600) {
            layoutParams.width = dyqx.b(getResources().getDisplayMetrics(), 540);
        } else {
            layoutParams.width = -1;
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    private final boolean O() {
        return !this.f.l();
    }

    private static void P(LayoutTransition layoutTransition) {
        layoutTransition.setStartDelay(1, 0L);
    }

    private final void Q() {
        this.p.setVisibility(8);
        findViewById(R.id.disclaimer_separator).setVisibility(8);
        findViewById(R.id.footer_bottom_padding).setVisibility(0);
    }

    static exbg a() {
        exbf exbfVar = (exbf) exbg.a.createBuilder();
        exbfVar.copyOnWrite();
        exbg exbgVar = (exbg) exbfVar.instance;
        exbgVar.d = 9;
        exbgVar.b |= 2;
        exbfVar.copyOnWrite();
        exbg exbgVar2 = (exbg) exbfVar.instance;
        exbgVar2.f = 2;
        exbgVar2.b |= 32;
        exbfVar.copyOnWrite();
        exbg exbgVar3 = (exbg) exbfVar.instance;
        exbgVar3.e = 3;
        exbgVar3.b |= 8;
        return (exbg) exbfVar.build();
    }

    public static void m(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void n(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void o(RecyclerView recyclerView, vo voVar) {
        recyclerView.getContext();
        recyclerView.ao(new LinearLayoutManager());
        dyra.a(recyclerView, voVar);
    }

    private final int v() {
        ViewGroup viewGroup = this.l;
        viewGroup.measure(0, 0);
        m(this.aa, viewGroup.getMeasuredHeight());
        ViewGroup viewGroup2 = this.R;
        viewGroup2.measure(0, 0);
        return viewGroup2.getMeasuredHeight() + ((dyrn) this.f).h;
    }

    private static AnimatorSet w(Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }

    private static LayoutTransition x() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        Interpolator interpolator = D;
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.enableTransitionType(4);
        P(layoutTransition);
        return layoutTransition;
    }

    private static ObjectAnimator y(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) B, 0.0f, 1.0f);
    }

    private static ObjectAnimator z(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) B, 1.0f, 0.0f);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount == 0) {
            ejwl.m(view.getId() == R.id.express_sign_in_internal_view, "express_sign_in_internal_view must be added first");
            super.addView(view, -1, layoutParams);
        } else {
            ejwl.m(childCount == 1, "ExpressSignInLayoutInternal must contain a single content view.");
            FrameLayout frameLayout = this.ah;
            frameLayout.addView(view, 0, layoutParams);
            super.addView(frameLayout, 0, frameLayout.getLayoutParams());
        }
    }

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        dyybVar.b(this.j, 90572);
        dyybVar.b(B(), 90573);
        dyybVar.b(this.h, 90574);
        dyybVar.b(this.q, 90570);
        dyybVar.b(this.k, 90771);
        dyybVar.b(this.r, 90571);
    }

    public final void c() {
        dyuj dyujVar = this.w;
        if (dyujVar != null) {
            dyujVar.b().run();
        }
        d();
    }

    public final void d() {
        Runnable runnable = this.u;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(dybw dybwVar, dyrk dyrkVar) {
        boolean z = dybwVar.a() + dyrkVar.a() > 0 && this.d;
        SelectedAccountView selectedAccountView = this.j;
        selectedAccountView.n(z ? 1 : 3);
        selectedAccountView.setOnClickListener(z ? new View.OnClickListener() { // from class: dysp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dytu dytuVar = this.a;
                ((dyrq) dytuVar.e).e.f(new dsve(5), view);
                dytuVar.u(true != dytuVar.b ? 44 : 45);
                dytuVar.l(!dytuVar.b);
            }
        } : null);
        selectedAccountView.setClickable(z);
        if (z) {
            return;
        }
        l(false);
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        super.fitSystemWindows(rect);
        return O();
    }

    public final void g(dyud dyudVar, Object obj) {
        ecem.c();
        u(obj == null ? 31 : 52);
        u(38);
        ListenableFuture listenableFutureA = ((dyrs) dyudVar).a.a(ejwi.i(obj));
        ecem.c();
        AnimatorSet animatorSetW = w(new dytm(this));
        animatorSetW.playTogether(y(this.n), z(this.m), z(this.l));
        this.y = animatorSetW;
        animatorSetW.start();
        eork.r(listenableFutureA, new dytt(this), eoqg.a);
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        dyybVar.e(this.j);
        dyybVar.e(B());
        dyybVar.e(this.h);
        dyybVar.e(this.q);
        dyybVar.e(this.k);
        dyybVar.e(this.r);
    }

    public final void h(boolean z) {
        ecem.c();
        dytr dytrVar = new dytr(this);
        if (!z) {
            dytrVar.onAnimationStart(null);
            dytrVar.onAnimationEnd(null);
        } else {
            AnimatorSet animatorSetW = w(dytrVar);
            animatorSetW.playTogether(z(this.n), y(this.m), y(this.l));
            animatorSetW.start();
        }
    }

    final void i() {
        int[] iArr = ley.a;
        if (isAttachedToWindow()) {
            ((dyrq) this.e).e.f(new dsve(5), B());
        }
    }

    public final void j(View view) {
        u(11);
        ((dyrm) ((dyrq) this.e).f).d.onClick(view);
    }

    public final void k(boolean z) {
        this.b = z;
        this.ab.setVisibility(true != z ? 8 : 0);
        SelectedAccountView selectedAccountView = this.j;
        selectedAccountView.e(z);
        ((ViewGroup.MarginLayoutParams) selectedAccountView.getLayoutParams()).bottomMargin = z ? ((dyrn) this.f).k : 0;
        selectedAccountView.requestLayout();
        if (!this.H) {
            n(this.l, z ? this.L : 0);
        }
        View viewFindViewById = findViewById(R.id.disclaimer_separator);
        ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).topMargin = this.M;
        viewFindViewById.requestLayout();
        if (!this.G) {
            A(z, this.g, 150).start();
        }
        dytx dytxVar = this.e;
        K(z, (dytxVar == null || ((dyrq) dytxVar).b.b().isEmpty()) ? false : true);
        if (dyrb.a(getContext())) {
            G(z);
            this.ah.setVisibility(true != z ? 0 : 4);
        }
        if (z) {
            this.x.c().b(this.x, this.o);
            return;
        }
        this.o.f();
        G(false);
        this.h.aj(0);
    }

    public final void l(boolean z) {
        if (this.b != z) {
            k(z);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Rect rect = new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        if (O()) {
            this.ak.set(rect);
            ViewGroup viewGroup = this.Q;
            viewGroup.setPadding(rect.left, viewGroup.getPaddingTop(), rect.right, viewGroup.getPaddingBottom());
            FrameLayout frameLayout = this.ah;
            frameLayout.setPadding(rect.left, rect.top, rect.right, frameLayout.getPaddingBottom());
            this.W.getLayoutParams().height = rect.top;
            m(this.l, rect.bottom);
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ah.getLayoutParams().height = 0;
        N(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        dyre dyreVar = this.s;
        if (dyreVar != null) {
            dyreVar.b(this.l.getMeasuredWidth());
        }
        dyre dyreVar2 = this.t;
        if (dyreVar2 != null) {
            dyreVar2.b(this.l.getMeasuredWidth());
        }
        ViewGroup viewGroup = this.l;
        int measuredHeight = viewGroup.getVisibility() == 8 ? 0 : viewGroup.getMeasuredHeight();
        View view = this.aa;
        if (view.getPaddingBottom() != measuredHeight) {
            m(view, measuredHeight);
            super.onMeasure(i, i2);
        }
        if (this.b) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Q.getLayoutParams();
            int measuredHeight2 = this.R.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            Rect rect = this.ak;
            if (measuredHeight2 + rect.top + rect.bottom >= getHeight() && getHeight() > 0 && this.T.getVisibility() == 0) {
                G(true);
                super.onMeasure(i, i2);
            }
        }
        final FrameLayout frameLayout = this.ah;
        int[] iArr = ley.a;
        if (frameLayout.isAttachedToWindow()) {
            if (this.an == 0) {
                J();
                int iV = v();
                J();
                this.an = Math.max(iV, v());
            }
            int measuredHeight3 = this.R.getMeasuredHeight();
            if (!this.b && measuredHeight3 > this.an) {
                this.an = measuredHeight3;
            }
            int measuredHeight4 = getMeasuredHeight();
            int i3 = measuredHeight4 - this.an;
            if (!this.am.g() || (!this.b && (((Integer) this.am.c()).intValue() > i3 || measuredHeight4 != this.F))) {
                this.am = ejwi.j(Integer.valueOf(i3));
                frameLayout.getLayoutParams().height = i3;
                frameLayout.getClass();
                frameLayout.post(new Runnable() { // from class: dysr
                    @Override // java.lang.Runnable
                    public final void run() {
                        frameLayout.requestLayout();
                    }
                });
            }
            this.F = measuredHeight4;
        }
    }

    public final void p(View.OnClickListener onClickListener, ekgb ekgbVar) {
        this.c = true;
        this.s.a(ekgbVar);
        this.r.setOnClickListener(onClickListener);
        this.r.setVisibility(0);
    }

    public final void q(ekgb ekgbVar, Object obj) {
        if (ekgbVar.isEmpty()) {
            E();
            return;
        }
        if (obj != null) {
            this.j.k(obj);
            F();
            String strF = ((dyrm) ((dyrq) this.e).f).a.f(obj);
            dyre dyreVar = this.t;
            ejwi ejwiVarJ = ejwk.b(strF).trim().isEmpty() ? ejud.a : ejwi.j(strF);
            Context context = getContext();
            ekfw ekfwVar = new ekfw();
            if (ejwiVarJ.g()) {
                ekfwVar.h(context.getResources().getString(R.string.og_continue_as, ejwiVarJ.c()));
            }
            ekfwVar.h(context.getResources().getString(R.string.og_continue));
            dyreVar.a(ekfwVar.g());
        }
    }

    public final void r() {
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.U;
        float scrollY = overScrollControlledNestedScrollView.getScrollY();
        float f = this.K;
        L(Math.min(1.0f, scrollY / f), this.ad, this.V);
        float scrollY2 = overScrollControlledNestedScrollView.getScrollY();
        float measuredHeight = overScrollControlledNestedScrollView.getChildAt(0).getMeasuredHeight() - overScrollControlledNestedScrollView.getMeasuredHeight();
        L(scrollY2 >= measuredHeight ? 0.0f : Math.min((measuredHeight - scrollY2) / f, 1.0f), this.af, this.l);
    }

    public final void s(boolean z) {
        this.m.gQ(z ? 0 : ((dyrn) this.f).e);
        this.ab.setBackgroundColor(z ? ((dyrn) this.f).e : 0);
    }

    public final void t(boolean z) {
        H(this.m, z ? 0 : ((dyrn) this.f).b);
        H(this.ab, z ? ((dyrn) this.f).b : 0);
        SelectedAccountView selectedAccountView = this.j;
        dyrt dyrtVar = this.f;
        int i = ((dyrn) dyrtVar).c + (z ? ((dyrn) dyrtVar).b : 0);
        selectedAccountView.setPadding(i, selectedAccountView.getPaddingTop(), i, selectedAccountView.getPaddingBottom());
    }

    public final void u(int i) {
        exbf exbfVar = (exbf) a().toBuilder();
        exbfVar.copyOnWrite();
        exbg exbgVar = (exbg) exbfVar.instance;
        exbgVar.c = i - 1;
        exbgVar.b |= 1;
        exbg exbgVar2 = (exbg) exbfVar.build();
        dyrq dyrqVar = (dyrq) this.e;
        dyrqVar.d.a(dyrqVar.b.a(), exbgVar2);
    }
}

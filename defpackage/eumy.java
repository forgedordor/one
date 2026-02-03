package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eumy {
    final int B;
    final int C;
    boolean F;
    final Size G;
    Size H;
    Size I;
    boolean J;
    final Runnable K;
    final View.OnClickListener L;
    boolean M;
    boolean N;
    int O;
    final Context a;
    final View b;
    public final PopupWindow c;
    final int d;
    final int e;
    final ViewGroup f;
    final ViewGroup g;
    final eumw h;
    final ImageButton i;
    final Drawable j;
    final Drawable k;
    final AnimatedVectorDrawable l;
    final AnimatedVectorDrawable m;
    final eumx n;
    final Interpolator o;
    final Interpolator p;
    final Interpolator q;
    final Interpolator r;
    final AnimatorSet s;
    final AnimatorSet t;
    final AnimatorSet u;
    final AnimationSet v;
    final AnimationSet w;
    final Animation.AnimationListener x;
    final Rect y = new Rect();
    final Point z = new Point();
    final int[] A = new int[2];
    final Runnable D = new eumm(this);
    boolean E = true;

    public eumy(Context context, View view, Runnable runnable) throws Resources.NotFoundException {
        view.getClass();
        this.b = view;
        this.a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.floating_popup_container, (ViewGroup) null);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.setTag("floating_toolbar");
        viewGroup.setClipToOutline(true);
        this.f = viewGroup;
        this.K = runnable;
        eumn eumnVar = new eumn(this);
        this.L = eumnVar;
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOnClickListener(eumnVar);
        linearLayout.setSoundEffectsEnabled(false);
        PopupWindow popupWindow = new PopupWindow(linearLayout);
        popupWindow.setClippingEnabled(false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setWindowLayoutType(1002);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(viewGroup);
        this.c = popupWindow;
        this.d = view.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_horizontal_margin);
        this.e = view.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_vertical_margin);
        this.B = context.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_height);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_icon_text_spacing);
        this.C = dimensionPixelSize;
        this.o = new eumv();
        this.p = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_slow_in);
        this.q = AnimationUtils.loadInterpolator(context, android.R.interpolator.linear_out_slow_in);
        this.r = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_linear_in);
        Drawable drawable = context.getResources().getDrawable(R.drawable.ft_avd_tooverflow, context.getTheme());
        this.j = drawable;
        drawable.setAutoMirrored(true);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.ft_avd_toarrow, context.getTheme());
        this.k = drawable2;
        drawable2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getResources().getDrawable(R.drawable.ft_avd_toarrow_animation, context.getTheme());
        this.l = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getResources().getDrawable(R.drawable.ft_avd_tooverflow_animation, context.getTheme());
        this.m = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        ImageButton imageButton = (ImageButton) LayoutInflater.from(context).inflate(R.layout.floating_popup_overflow_button, (ViewGroup) null);
        imageButton.setImageDrawable(drawable2);
        imageButton.setOnClickListener(new eumi(this, imageButton));
        this.i = imageButton;
        this.G = b(imageButton);
        eumh eumhVar = new eumh(this, context);
        eumhVar.setTag("main_panel");
        this.g = eumhVar;
        this.n = new eumx(context, dimensionPixelSize);
        final eumw eumwVar = new eumw(this);
        eumwVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        eumwVar.setDivider(null);
        eumwVar.setDividerHeight(0);
        eumwVar.setAdapter((ListAdapter) new eumj(this, context));
        eumwVar.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: eumf
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                eunc euncVar = (eunc) eumwVar.getAdapter().getItem(i);
                euncVar.f();
                euncVar.f().a();
                eumy eumyVar = this.a;
                if (eumyVar.J) {
                    eumyVar.K.run();
                }
            }
        });
        eumwVar.setTag("main_overflow");
        this.h = eumwVar;
        euml eumlVar = new euml(this);
        this.x = eumlVar;
        AnimationSet animationSet = new AnimationSet(true);
        this.v = animationSet;
        animationSet.setAnimationListener(eumlVar);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.w = animationSet2;
        animationSet2.setAnimationListener(eumlVar);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.s = animatorSet;
        this.t = eumz.a(viewGroup, 150, new eumo(this));
        this.u = eumz.a(viewGroup, 0, new eump(this));
    }

    public static Size b(View view) {
        ejwl.l(view.getParent() == null);
        view.measure(0, 0);
        return new Size(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    static void j(View view, int i) {
        u(view, view.getLayoutParams().width, i);
    }

    public static void l(View view, Size size) {
        u(view, size.getWidth(), size.getHeight());
    }

    static void m(View view, int i) {
        u(view, i, view.getLayoutParams().height);
    }

    private static void u(View view, int i, int i2) {
        view.setMinimumWidth(i);
        view.setMinimumHeight(i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    final int a(int i) {
        int iMax = Math.max(2, i);
        eumw eumwVar = this.h;
        int iE = eonc.e(4, iMax, eumwVar.getCount());
        return (iE * this.B) + this.G.getHeight() + (iE < eumwVar.getCount() ? (int) (this.B * 0.5f) : 0);
    }

    final void c() {
        this.f.clearAnimation();
        this.g.animate().cancel();
        this.h.animate().cancel();
        this.l.stop();
        this.m.stop();
    }

    public final void d() {
        if (this.E) {
            return;
        }
        this.F = false;
        this.E = true;
        this.u.cancel();
        this.t.start();
    }

    public final void e() {
        if (s()) {
            this.F = true;
            this.u.start();
        }
    }

    final void f() {
        if (this.M) {
            ViewGroup viewGroup = this.g;
            ViewGroup viewGroup2 = this.f;
            viewGroup.setY(viewGroup2.getHeight() - this.I.getHeight());
            this.i.setY(viewGroup2.getHeight() - r0.getHeight());
            this.h.setY(viewGroup2.getHeight() - this.H.getHeight());
        }
    }

    final void g() {
        ViewGroup viewGroup = this.f;
        viewGroup.removeAllViews();
        if (p()) {
            viewGroup.addView(this.h);
        }
        viewGroup.addView(this.g);
        if (p()) {
            viewGroup.addView(this.i);
        }
        k();
        if (q()) {
            viewGroup.setAlpha(0.0f);
            viewGroup.post(this.D);
        }
    }

    final void h(Rect rect) {
        int height;
        i();
        PopupWindow popupWindow = this.c;
        int iCenterX = rect.centerX() - (popupWindow.getWidth() / 2);
        Rect rect2 = this.y;
        int iMin = Math.min(iCenterX, rect2.right - popupWindow.getWidth());
        int i = rect.top - rect2.top;
        int i2 = rect2.bottom - rect.bottom;
        int i3 = this.B;
        int i4 = this.e;
        int i5 = i4 + i4;
        int i6 = i3 + i5;
        if (p()) {
            int iA = a(2) + i5;
            int i7 = (rect2.bottom - rect.top) + i6;
            int i8 = (rect.bottom - rect2.top) + i6;
            if (i >= iA) {
                n(i - i5);
                height = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i >= i6 && i7 >= iA) {
                n(i7 - i5);
                height = rect.top - i6;
                this.M = false;
            } else if (i2 >= iA) {
                n(i2 - i5);
                height = rect.bottom;
                this.M = false;
            } else if (i2 < i6 || rect2.height() < iA) {
                n(rect2.height() - i5);
                height = rect2.top;
                this.M = false;
            } else {
                n(i8 - i5);
                height = (rect.bottom + i6) - popupWindow.getHeight();
                this.M = true;
            }
        } else {
            height = i >= i6 ? rect.top - i6 : i2 >= i6 ? rect.bottom : i2 >= i3 ? rect.bottom - i4 : Math.max(rect2.top, rect.top - i6);
        }
        View view = this.b;
        int[] iArr = this.A;
        view.getRootView().getLocationOnScreen(iArr);
        int i9 = iArr[0];
        int i10 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.z.set(Math.max(0, iMin - (i9 - iArr[0])), Math.max(0, height - (i10 - iArr[1])));
    }

    final void i() {
        this.b.getWindowVisibleDisplayFrame(this.y);
    }

    final void k() {
        ImageButton imageButton = this.i;
        imageButton.setEnabled(true);
        eumw eumwVar = this.h;
        eumwVar.awakenScrollBars();
        if (this.N) {
            Size size = this.H;
            ViewGroup viewGroup = this.f;
            l(viewGroup, size);
            ViewGroup viewGroup2 = this.g;
            viewGroup2.setAlpha(0.0f);
            viewGroup2.setVisibility(4);
            eumwVar.setAlpha(1.0f);
            eumwVar.setVisibility(0);
            imageButton.setImageDrawable(this.j);
            imageButton.setContentDescription(this.a.getString(R.string.floating_toolbar_close_overflow_description));
            if (q()) {
                viewGroup.setX(this.d);
                viewGroup2.setX(0.0f);
                imageButton.setX(size.getWidth() - this.G.getWidth());
                eumwVar.setX(0.0f);
            } else {
                viewGroup.setX((this.c.getWidth() - size.getWidth()) - this.d);
                viewGroup2.setX(-viewGroup.getX());
                imageButton.setX(0.0f);
                eumwVar.setX(0.0f);
            }
            if (this.M) {
                viewGroup.setY(this.e);
                viewGroup2.setY(size.getHeight() - viewGroup.getHeight());
                imageButton.setY(size.getHeight() - this.G.getHeight());
                eumwVar.setY(0.0f);
                return;
            }
            viewGroup.setY(this.e);
            viewGroup2.setY(0.0f);
            imageButton.setY(0.0f);
            eumwVar.setY(this.G.getHeight());
            return;
        }
        Size size2 = this.I;
        ViewGroup viewGroup3 = this.f;
        l(viewGroup3, size2);
        ViewGroup viewGroup4 = this.g;
        viewGroup4.setAlpha(1.0f);
        viewGroup4.setVisibility(0);
        eumwVar.setAlpha(0.0f);
        eumwVar.setVisibility(4);
        imageButton.setImageDrawable(this.k);
        imageButton.setContentDescription(this.a.getString(R.string.floating_toolbar_open_overflow_description));
        if (!p()) {
            viewGroup3.setX(this.d);
            viewGroup3.setY(this.e);
            viewGroup4.setX(0.0f);
            viewGroup4.setY(0.0f);
            return;
        }
        if (q()) {
            viewGroup3.setX(this.d);
            viewGroup4.setX(0.0f);
            imageButton.setX(0.0f);
            eumwVar.setX(0.0f);
        } else {
            viewGroup3.setX((this.c.getWidth() - size2.getWidth()) - this.d);
            viewGroup4.setX(0.0f);
            imageButton.setX(size2.getWidth() - this.G.getWidth());
            eumwVar.setX(size2.getWidth() - this.H.getWidth());
        }
        if (this.M) {
            viewGroup3.setY((this.e + this.H.getHeight()) - size2.getHeight());
            viewGroup4.setY(0.0f);
            imageButton.setY(0.0f);
            eumwVar.setY(size2.getHeight() - this.H.getHeight());
            return;
        }
        viewGroup3.setY(this.e);
        viewGroup4.setY(0.0f);
        imageButton.setY(0.0f);
        eumwVar.setY(this.G.getHeight());
    }

    final void n(int i) {
        if (p()) {
            int iA = a((i - this.G.getHeight()) / this.B);
            if (this.H.getHeight() != iA) {
                this.H = new Size(this.H.getWidth(), iA);
            }
            l(this.h, this.H);
            if (this.N) {
                ViewGroup viewGroup = this.f;
                l(viewGroup, this.H);
                if (this.M) {
                    float height = this.H.getHeight() - iA;
                    viewGroup.setY(viewGroup.getY() + height);
                    ImageButton imageButton = this.i;
                    imageButton.setY(imageButton.getY() - height);
                }
            } else {
                l(this.f, this.I);
            }
            o();
        }
    }

    final void o() {
        int iMax;
        Size size = this.I;
        int iMax2 = 0;
        if (size != null) {
            iMax2 = Math.max(0, size.getWidth());
            iMax = Math.max(0, this.I.getHeight());
        } else {
            iMax = 0;
        }
        Size size2 = this.H;
        if (size2 != null) {
            iMax2 = Math.max(iMax2, size2.getWidth());
            iMax = Math.max(iMax, this.H.getHeight());
        }
        PopupWindow popupWindow = this.c;
        int i = this.d;
        popupWindow.setWidth(iMax2 + i + i);
        int i2 = this.e;
        popupWindow.setHeight(iMax + i2 + i2);
        Size size3 = this.I;
        if (size3 == null || this.H == null) {
            return;
        }
        int width = size3.getWidth() - this.H.getWidth();
        int height = this.H.getHeight() - this.I.getHeight();
        this.O = (int) (Math.sqrt((width * width) + (height * height)) / this.f.getContext().getResources().getDisplayMetrics().density);
    }

    final boolean p() {
        return this.H != null;
    }

    final boolean q() {
        Context context = this.a;
        return (context.getApplicationInfo().flags & 4194304) == 4194304 && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    final boolean r() {
        AnimationSet animationSet = this.v;
        boolean z = animationSet.hasStarted() && !animationSet.hasEnded();
        AnimationSet animationSet2 = this.w;
        return z || (animationSet2.hasStarted() && !animationSet2.hasEnded());
    }

    public final boolean s() {
        return (this.E || this.F || !this.c.isShowing()) ? false : true;
    }

    final int t() {
        int i = this.O;
        return i < 150 ? Math.max(BasePaymentResult.ERROR_REQUEST_FAILED, 0) : i > 300 ? 300 : 250;
    }
}

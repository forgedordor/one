package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import com.google.android.setupdesign.GlifLayout;
import defpackage.efrl;
import defpackage.efsf;
import defpackage.efsj;
import defpackage.efss;
import defpackage.efsz;
import defpackage.efta;
import defpackage.eftc;
import defpackage.efte;
import defpackage.eftj;
import defpackage.eftm;
import defpackage.eftn;
import defpackage.efuc;
import defpackage.pru;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class GlifLayout extends efrl {
    public static final /* synthetic */ int g = 0;
    private static final efte h = new efte(GlifLayout.class);
    private ColorStateList i;
    private boolean j;
    private boolean k;
    private ViewTreeObserver.OnScrollChangedListener l;
    private ColorStateList m;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    public static final boolean s(ScrollView scrollView) {
        return scrollView != null && scrollView.canScrollVertically(1);
    }

    public static final boolean t(ScrollView scrollView) {
        View childAt;
        return (scrollView == null || (childAt = scrollView.getChildAt(0)) == null || childAt.getHeight() <= scrollView.getHeight()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(android.util.AttributeSet r10, int r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.GlifLayout.u(android.util.AttributeSet, int):void");
    }

    private final void v() {
        int defaultColor;
        if (g(R.id.suc_layout_status) != null) {
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                defaultColor = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.i;
                defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            ((efsz) i(efsz.class)).a(this.j ? new eftn(defaultColor) : new ColorDrawable(defaultColor));
        }
    }

    @Override // defpackage.efrl, com.google.android.setupcompat.internal.TemplateLayout
    protected View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            Context context = getContext();
            boolean zN = efsj.n(context);
            boolean zB = pru.a(context).b(efsj.e(context));
            h.c("isEmbeddedActivityOnePaneEnabled = " + zN + "; isActivityEmbedded = " + zB);
            if (zN && zB) {
                i = q() ? R.layout.sud_glif_expressive_embedded_template : R.layout.sud_glif_embedded_template;
            } else if (q()) {
                i = R.layout.sud_glif_expressive_template;
            } else {
                Context context2 = getContext();
                int i2 = eftc.a;
                i = (Build.VERSION.SDK_INT < 34 || !efsj.q(context2)) ? R.layout.sud_glif_template : R.layout.sud_glif_template_two_pane;
            }
        }
        return h(layoutInflater, R.style.SudThemeGlif_Light, i);
    }

    @Override // defpackage.efrl, com.google.android.setupcompat.internal.TemplateLayout
    protected ViewGroup b(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.b(i);
    }

    public final int l() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.sudFooterBackgroundColor, typedValue, true);
        return typedValue.data;
    }

    public final ScrollView m() {
        View viewG = g(R.id.sud_header_scroll_view);
        if (viewG instanceof ScrollView) {
            return (ScrollView) viewG;
        }
        return null;
    }

    public final ScrollView n() {
        View viewG = g(R.id.sud_scroll_view);
        if (viewG instanceof ScrollView) {
            return (ScrollView) viewG;
        }
        return null;
    }

    protected void o() {
        final ScrollView scrollViewN = n();
        if (scrollViewN != null) {
            scrollViewN.getViewTreeObserver().addOnScrollChangedListener(this.l);
        }
        final ScrollView scrollViewM = m();
        if (scrollViewM != null) {
            scrollViewM.getViewTreeObserver().addOnScrollChangedListener(this.l);
        }
        if (scrollViewN == null && scrollViewM == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: eftk
            @Override // java.lang.Runnable
            public final void run() {
                if (GlifLayout.t(scrollViewN) || GlifLayout.t(scrollViewM)) {
                    this.a.p(false);
                }
            }
        }, 100L);
    }

    @Override // defpackage.efrl, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        PersistableBundle persistableBundle;
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 29 && eftj.a(this.b.getIntent()) && efsj.r(getContext())) {
            efuc efucVar = (efuc) i(efuc.class);
            if (efucVar != null) {
                persistableBundle = new PersistableBundle();
                persistableBundle.putInt("BackButton_onClickCount", efucVar.c);
            } else {
                persistableBundle = PersistableBundle.EMPTY;
            }
            CustomEvent customEventB = CustomEvent.b(MetricKey.b("SetupDesignMetrics", this.b), persistableBundle);
            efsf.a(getContext(), customEventB);
            h.c("SetupDesignMetrics=".concat(CustomEvent.a(customEventB).toString()));
        }
        ScrollView scrollViewN = n();
        if (scrollViewN != null) {
            scrollViewN.getViewTreeObserver().removeOnScrollChangedListener(this.l);
        }
        ScrollView scrollViewM = m();
        if (scrollViewM != null) {
            scrollViewM.getViewTreeObserver().removeOnScrollChangedListener(this.l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onFinishInflate() {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.GlifLayout.onFinishInflate():void");
    }

    public final void p(boolean z) {
        LinearLayout linearLayout;
        efss efssVar = (efss) i(efss.class);
        efta eftaVar = (efta) i(efta.class);
        if (efssVar == null || (linearLayout = efssVar.g) == null) {
            return;
        }
        if (z) {
            linearLayout.setBackgroundColor(0);
            if (eftaVar != null) {
                eftaVar.a(0);
                return;
            }
            return;
        }
        linearLayout.setBackgroundColor(l());
        if (eftaVar != null) {
            eftaVar.a(l());
        }
    }

    protected final boolean q() {
        return efsj.r(getContext()) && Build.VERSION.SDK_INT >= 35;
    }

    public final boolean r() {
        if (this.k) {
            return true;
        }
        return e() && efsj.w(getContext());
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) throws Resources.NotFoundException {
        super(context, i, i2);
        this.j = true;
        this.k = false;
        this.l = new eftm(this);
        u(null, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.j = true;
        this.k = false;
        this.l = new eftm(this);
        u(attributeSet, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.j = true;
        this.k = false;
        this.l = new eftm(this);
        u(attributeSet, i);
    }
}

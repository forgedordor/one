package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.oa;
import defpackage.ob;
import defpackage.oc;
import defpackage.of;
import defpackage.oo;
import defpackage.or;
import defpackage.ps;
import defpackage.pt;
import defpackage.pu;
import defpackage.pv;
import defpackage.pw;
import defpackage.ud;
import defpackage.ue;
import defpackage.za;
import defpackage.zy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends ue implements ob, or {
    public oc a;
    public boolean b;
    public ps c;
    public oa d;
    public za e;
    private Context f;
    private int g;
    private oo h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final pv k() {
        pv pvVar = new pv();
        pvVar.gravity = 16;
        return pvVar;
    }

    public static final pv l(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return k();
        }
        pv pvVar = layoutParams instanceof pv ? new pv((pv) layoutParams) : new pv(layoutParams);
        if (pvVar.gravity <= 0) {
            pvVar.gravity = 16;
        }
        return pvVar;
    }

    @Override // defpackage.or
    public final void a(oc ocVar) {
        this.a = ocVar;
    }

    @Override // defpackage.ob
    public final boolean b(of ofVar) {
        return this.a.z(ofVar, 0);
    }

    @Override // defpackage.ue, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final pv generateLayoutParams(AttributeSet attributeSet) {
        return new pv(getContext(), attributeSet);
    }

    @Override // defpackage.ue, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pv;
    }

    public final Menu d() {
        if (this.a == null) {
            Context context = getContext();
            oc ocVar = new oc(context);
            this.a = ocVar;
            ocVar.p(new pw(this));
            ps psVar = new ps(context);
            this.c = psVar;
            psVar.s();
            ps psVar2 = this.c;
            oo puVar = this.h;
            if (puVar == null) {
                puVar = new pu();
            }
            psVar2.e = puVar;
            this.a.h(this.c, this.f);
            this.c.l(this);
        }
        return this.a;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final void e() {
        ps psVar = this.c;
        if (psVar != null) {
            psVar.q();
        }
    }

    public final void f(oo ooVar, oa oaVar) {
        this.h = ooVar;
        this.d = oaVar;
    }

    public final void g(int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ue, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ud generateDefaultLayoutParams() {
        return k();
    }

    public final void h(ps psVar) {
        this.c = psVar;
        psVar.l(this);
    }

    protected final boolean i(int i) {
        boolean zC = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof pt)) {
            zC = ((pt) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof pt)) ? zC : ((pt) childAt2).d() | zC;
    }

    public final boolean j() {
        ps psVar = this.c;
        return psVar != null && psVar.o();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ps psVar = this.c;
        if (psVar != null) {
            psVar.f(false);
            if (this.c.o()) {
                this.c.m();
                this.c.p();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // defpackage.ue, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int paddingLeft;
        if (!this.i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zA = zy.a(this);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = i6 / 2;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                pv pvVar = (pv) childAt.getLayoutParams();
                if (pvVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (i(i8)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + pvVar.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - pvVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + pvVar.leftMargin) + pvVar.rightMargin;
                    i(i8);
                    i10++;
                }
            }
            i8++;
        }
        if (childCount == 1) {
            if (i9 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i12 = i5 - (measuredHeight2 / 2);
                int i13 = (i7 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i13, i12, measuredWidth2 + i13, measuredHeight2 + i12);
                return;
            }
            childCount = 1;
        }
        int i14 = i10 - (i9 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                pv pvVar2 = (pv) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !pvVar2.a) {
                    int i16 = width2 - pvVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + pvVar2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            pv pvVar3 = (pv) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !pvVar3.a) {
                int i19 = paddingLeft2 + pvVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + pvVar3.rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // defpackage.ue, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.f = context;
        this.g = 0;
    }

    @Override // defpackage.ue, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ue, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ud generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    @Override // defpackage.ue, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }
}

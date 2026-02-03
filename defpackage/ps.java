package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ps extends np implements lcm {
    public pn h;
    public int i;
    po j;
    public pj k;
    pl l;
    final pp m;
    int n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private final SparseBooleanArray t;
    private pk u;

    public ps(Context context) {
        super(context);
        this.t = new SparseBooleanArray();
        this.m = new pp(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [oq] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.np
    public final View b(of ofVar, View view, ViewGroup viewGroup) {
        View actionView = ofVar.getActionView();
        if (actionView == null || ofVar.m()) {
            ActionMenuItemView actionMenuItemView = view instanceof oq ? (oq) view : (oq) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            actionMenuItemView.f(ofVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.b = (ActionMenuView) this.f;
            if (this.u == null) {
                this.u = new pk(this);
            }
            actionMenuItemView2.c = this.u;
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(true == ofVar.q ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof pv)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.np, defpackage.op
    public final void c(Context context, oc ocVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = ocVar;
        Resources resources = context.getResources();
        if (!this.p) {
            this.o = true;
        }
        this.q = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.i = mz.a(context);
        int measuredWidth = this.q;
        if (this.o) {
            if (this.h == null) {
                this.h = new pn(this, this.a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.h.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.h.getMeasuredWidth();
        } else {
            this.h = null;
        }
        this.r = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.np, defpackage.op
    public final void d(oc ocVar, boolean z) {
        q();
        oo ooVar = this.e;
        if (ooVar != null) {
            ooVar.a(ocVar, z);
        }
    }

    @Override // defpackage.op
    public final Parcelable dG() {
        pr prVar = new pr();
        prVar.a = this.n;
        return prVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    @Override // defpackage.np, defpackage.op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps.f(boolean):void");
    }

    @Override // defpackage.np, defpackage.op
    public final boolean g() {
        ArrayList arrayListF;
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        oc ocVar = this.c;
        View view = null;
        boolean z4 = false;
        if (ocVar != null) {
            arrayListF = ocVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i = this.i;
        int i2 = this.r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i3 = 0;
        boolean z5 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            of ofVar = (of) arrayListF.get(i3);
            if (ofVar.r()) {
                i4++;
            } else if (ofVar.q()) {
                i5++;
            } else {
                z5 = true;
            }
            if (this.s && ofVar.q) {
                i = 0;
            }
            i3++;
        }
        if (this.o && (z5 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            of ofVar2 = (of) arrayListF.get(i7);
            if (ofVar2.r()) {
                View viewB = b(ofVar2, view, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = ofVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                ofVar2.k(z);
                z2 = z4;
                z3 = z;
            } else if (ofVar2.q()) {
                int i10 = ofVar2.b;
                boolean z6 = sparseBooleanArray.get(i10);
                boolean z7 = ((i6 > 0 || z6) && i2 > 0) ? z : z4;
                if (z7) {
                    View viewB2 = b(ofVar2, view, viewGroup);
                    viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewB2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z7 = i2 + i8 > 0 ? z : false;
                }
                boolean z8 = z7;
                if (z8 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z6) {
                    sparseBooleanArray.put(i10, false);
                    int i11 = 0;
                    while (i11 < i7) {
                        of ofVar3 = (of) arrayListF.get(i11);
                        boolean z9 = z;
                        if (ofVar3.b == i10) {
                            if (ofVar3.o()) {
                                i6++;
                            }
                            ofVar3.k(false);
                        }
                        i11++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i6--;
                }
                ofVar2.k(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                ofVar2.k(z2);
            }
            i7++;
            z4 = z2;
            z = z3;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.np, defpackage.op
    public final boolean h(ox oxVar) {
        boolean z = false;
        if (oxVar.hasVisibleItems()) {
            ox oxVar2 = oxVar;
            while (true) {
                oc ocVar = oxVar2.l;
                if (ocVar == this.c) {
                    break;
                }
                oxVar2 = (ox) ocVar;
            }
            of ofVar = oxVar2.m;
            ViewGroup viewGroup = (ViewGroup) this.f;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof oq) && ((oq) childAt).a() == ofVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.n = oxVar.m.a;
                int size = oxVar.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    MenuItem item = oxVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                pj pjVar = new pj(this, this.b, oxVar, view);
                this.k = pjVar;
                pjVar.d(z);
                this.k.f();
                super.h(oxVar);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lcm
    public final void k(boolean z) {
        if (z) {
            super.h(null);
            return;
        }
        oc ocVar = this.c;
        if (ocVar != null) {
            ocVar.i(false);
        }
    }

    public final void l(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean m() {
        Object obj;
        pl plVar = this.l;
        if (plVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(plVar);
            this.l = null;
            return true;
        }
        po poVar = this.j;
        if (poVar == null) {
            return false;
        }
        poVar.b();
        return true;
    }

    @Override // defpackage.op
    public final void n(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof pr) && (i = ((pr) parcelable).a) > 0 && (menuItemFindItem = this.c.findItem(i)) != null) {
            h((ox) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean o() {
        po poVar = this.j;
        return poVar != null && poVar.h();
    }

    public final boolean p() {
        oc ocVar;
        if (!this.o || o() || (ocVar = this.c) == null || this.f == null || this.l != null || ocVar.e().isEmpty()) {
            return false;
        }
        this.l = new pl(this, new po(this, this.b, this.c, this.h));
        ((View) this.f).post(this.l);
        return true;
    }

    public final void q() {
        m();
        t();
    }

    public final void r() {
        this.s = true;
    }

    public final void s() {
        this.o = true;
        this.p = true;
    }

    public final void t() {
        pj pjVar = this.k;
        if (pjVar != null) {
            pjVar.b();
        }
    }
}

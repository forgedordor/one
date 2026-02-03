package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eenu extends ViewGroup implements or {
    public int A;
    public int B;
    public int C;
    public eesj D;
    public ColorStateList E;
    public eenx F;
    public eenr G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public final Rect L;
    private final View.OnClickListener N;
    private lcd O;
    private final SparseArray P;
    private ColorStateList Q;
    private final ColorStateList R;
    private int S;
    private MenuItem T;
    public final pnf b;
    public int c;
    public int d;
    public eens[] e;
    public int f;
    public int g;
    public int h;
    public ColorStateList i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public ColorStateList o;
    public int p;
    public final SparseArray q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;
    private static final int[] a = {R.attr.state_checked};
    private static final int[] M = {-16842910};

    public eenu(Context context) {
        super(context);
        this.P = new SparseArray();
        this.f = -1;
        this.g = -1;
        this.q = new SparseArray();
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.C = 49;
        this.J = 1;
        this.S = 0;
        this.T = null;
        this.K = 7;
        this.L = new Rect();
        this.R = i();
        if (isInEditMode()) {
            this.b = null;
        } else {
            pln plnVar = new pln();
            this.b = plnVar;
            plnVar.Q(0);
            plnVar.H(TextView.class);
            plnVar.K(eepx.a(getContext(), com.google.android.apps.messaging.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.apps.messaging.R.integer.material_motion_duration_long_1)));
            plnVar.L(eenh.a(getContext(), com.google.android.apps.messaging.R.attr.motionEasingStandard, eecd.b));
            plnVar.O(new eemf());
        }
        this.N = new eent(this);
        setImportantForAccessibility(1);
    }

    private final eenp j(int i, of ofVar, boolean z, boolean z2) throws Resources.NotFoundException {
        eedk eedkVar;
        this.F.b = true;
        ofVar.setCheckable(true);
        this.F.b = false;
        lcd lcdVar = this.O;
        eenp eenpVarB = lcdVar != null ? (eenp) lcdVar.a() : null;
        if (eenpVarB == null) {
            eenpVarB = b(getContext());
        }
        eenpVarB.G(z);
        eenpVarB.D(this.J);
        eenpVarB.v(this.Q);
        eenpVarB.u(this.h);
        eenpVarB.K(this.R);
        eenpVarB.J(this.j);
        eenpVarB.H(this.k);
        eenpVarB.s(this.l);
        eenpVarB.r(this.m);
        eenpVarB.I(this.n);
        eenpVarB.K(this.i);
        int i2 = this.r;
        if (i2 != -1) {
            eenpVarB.A(i2);
        }
        int i3 = this.s;
        if (i3 != -1) {
            eenpVarB.z(i3);
        }
        eenpVarB.F(this.H);
        eenpVarB.C(this.I);
        int i4 = this.t;
        if (i4 != -1) {
            eenpVarB.l(i4);
        }
        int i5 = this.u;
        if (i5 != -1) {
            eenpVarB.t(i5);
        }
        eenpVarB.o(this.w);
        eenpVarB.k(this.x);
        eenpVarB.j(this.y);
        eenpVarB.h(this.z);
        eenpVarB.m(this.A);
        eenpVarB.x(this.C);
        eenpVarB.n = this.L;
        eenpVarB.i(this.B);
        eenpVarB.d(d());
        eenpVarB.g(this.v);
        eenpVarB.w(this.p);
        eenpVarB.B(this.o);
        eenpVarB.E(this.c);
        eenpVarB.y(this.d);
        eenpVarB.m = z2;
        eenpVarB.N();
        eenpVarB.N();
        eenpVarB.f(ofVar);
        int i6 = ofVar.a;
        eenpVarB.setOnTouchListener((View.OnTouchListener) this.P.get(i6));
        eenpVarB.setOnClickListener(this.N);
        int i7 = this.f;
        if (i7 != 0 && i6 == i7) {
            this.g = i;
        }
        int id = eenpVarB.getId();
        if (id != -1 && (eedkVar = (eedk) this.q.get(id)) != null) {
            eenpVarB.p(eedkVar);
        }
        return eenpVarB;
    }

    @Override // defpackage.or
    public final void a(oc ocVar) {
        this.G = new eenr(ocVar);
    }

    protected abstract eenp b(Context context);

    public final int c() {
        return Math.min(this.K, this.G.c);
    }

    public final Drawable d() {
        if (this.D == null || this.E == null) {
            return null;
        }
        eesc eescVar = new eesc(this.D);
        eescVar.P(this.E);
        return eescVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() throws Resources.NotFoundException {
        eenp eenpVarJ;
        removeAllViews();
        eens[] eensVarArr = this.e;
        if (eensVarArr != null && this.O != null) {
            for (eens eensVar : eensVarArr) {
                if (eensVar instanceof eenp) {
                    eenp eenpVar = (eenp) eensVar;
                    this.O.b(eenpVar);
                    eenpVar.L(eenpVar.e);
                    eenpVar.f = null;
                    eenpVar.g = 0.0f;
                    eenpVar.a = false;
                }
            }
        }
        this.F.b = true;
        this.G.c();
        this.F.b = false;
        int i = this.G.b;
        if (i == 0) {
            this.f = 0;
            this.g = 0;
            this.e = null;
            this.O = null;
            return;
        }
        if (this.O == null || this.S != i) {
            this.S = i;
            this.O = new lcf(i);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.G.a(); i2++) {
            hashSet.add(Integer.valueOf(this.G.b(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.q;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i3++;
        }
        int iA = this.G.a();
        this.e = new eens[iA];
        boolean zH = h(this.c, c());
        int i4 = 0;
        int size = 0;
        for (int i5 = 0; i5 < iA; i5++) {
            MenuItem menuItemB = this.G.b(i5);
            boolean z = menuItemB instanceof eenj;
            if (z) {
                eenk eenkVar = new eenk(getContext());
                eenkVar.b();
                eenkVar.b();
                eenpVarJ = eenkVar;
            } else if (menuItemB.hasSubMenu()) {
                if (size > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                eeny eenyVar = new eeny(getContext());
                int i6 = this.m;
                if (i6 == 0) {
                    i6 = this.k;
                }
                TextView textView = eenyVar.a;
                textView.setTextAppearance(i6);
                ColorStateList colorStateList = eenyVar.c;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                ColorStateList colorStateList2 = this.i;
                eenyVar.c = colorStateList2;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
                eenyVar.b = true;
                eenyVar.b();
                eenyVar.f((of) menuItemB);
                size = menuItemB.getSubMenu().size();
                eenpVarJ = eenyVar;
            } else if (size > 0) {
                size--;
                eenpVarJ = j(i5, (of) menuItemB, zH, true);
            } else {
                of ofVar = (of) menuItemB;
                boolean z2 = i4 >= this.K;
                i4++;
                eenpVarJ = j(i5, ofVar, zH, z2);
            }
            if (!z && menuItemB.isCheckable() && this.g == -1) {
                this.g = i5;
            }
            this.e[i5] = eenpVarJ;
            addView(eenpVarJ);
        }
        int iMin = Math.min(iA - 1, this.g);
        this.g = iMin;
        f(this.e[iMin].a());
    }

    public final void f(MenuItem menuItem) {
        if (this.T == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.T;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.T.setChecked(false);
        }
        menuItem.setChecked(true);
        this.T = menuItem;
    }

    public final void g(ColorStateList colorStateList) {
        this.Q = colorStateList;
        eens[] eensVarArr = this.e;
        if (eensVarArr != null) {
            for (eens eensVar : eensVarArr) {
                if (eensVar instanceof eenp) {
                    ((eenp) eensVar).v(colorStateList);
                }
            }
        }
    }

    protected final boolean h(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    public final ColorStateList i() throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListD = kxj.d(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListD.getDefaultColor();
        int[] iArr = M;
        return new ColorStateList(new int[][]{iArr, a, EMPTY_STATE_SET}, new int[]{colorStateListD.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new lhg(accessibilityNodeInfo).u(lhe.a(1, c(), 1));
    }
}

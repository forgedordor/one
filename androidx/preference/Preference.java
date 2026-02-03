package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.oyw;
import defpackage.oyy;
import defpackage.oyz;
import defpackage.oza;
import defpackage.ozb;
import defpackage.ozc;
import defpackage.ozd;
import defpackage.ozt;
import defpackage.ozx;
import defpackage.ozy;
import defpackage.pac;
import defpackage.vo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public int A;
    public int B;
    public oyz C;
    public PreferenceGroup D;
    public ozd E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private List J;
    private boolean K;
    private ozc L;
    private final View.OnClickListener M;
    private CharSequence a;
    private Drawable b;
    private Bundle c;
    private boolean d;
    private boolean e;
    private String f;
    private Object g;
    private boolean h;
    private boolean i;
    public final Context j;
    public ozy k;
    public long l;
    public boolean m;
    public oza n;
    public ozb o;
    public int p;
    public CharSequence q;
    public int r;
    public String s;
    public Intent t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Preference(Context context) {
        this(context, null);
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    protected final void A() {
        oyz oyzVar = this.C;
        if (oyzVar != null) {
            oyzVar.b();
        }
    }

    public void B() {
        F();
    }

    public final void C(ozy ozyVar) {
        this.k = ozyVar;
        if (!this.m) {
            this.l = ozyVar.a();
        }
        if (V() && q().contains(this.s)) {
            h(null);
            return;
        }
        Object obj = this.g;
        if (obj != null) {
            h(obj);
        }
    }

    public void D() {
        P();
    }

    public void E() {
        Intent intent;
        ozx ozxVar;
        if (T() && this.e) {
            c();
            ozb ozbVar = this.o;
            if (ozbVar == null || !ozbVar.a(this)) {
                ozy ozyVar = this.k;
                if ((ozyVar == null || (ozxVar = ozyVar.c) == null || !ozxVar.aW(this)) && (intent = this.t) != null) {
                    this.j.startActivity(intent);
                }
            }
        }
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        Preference preferenceS = s(this.f);
        if (preferenceS != null) {
            if (preferenceS.J == null) {
                preferenceS.J = new ArrayList();
            }
            preferenceS.J.add(this);
            W(preferenceS.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f + "\" not found for preference \"" + this.s + "\" (title: \"" + ((Object) this.q) + "\"");
    }

    public void G(boolean z) {
        if (this.d != z) {
            this.d = z;
            z(j());
            d();
        }
    }

    public final void H(Drawable drawable) {
        if (this.b != drawable) {
            this.b = drawable;
            this.r = 0;
            d();
        }
    }

    public final void I(int i) {
        if (i != this.p) {
            this.p = i;
            A();
        }
    }

    public final void J(int i) {
        n(this.j.getString(i));
    }

    public final void K(ozd ozdVar) {
        this.E = ozdVar;
        d();
    }

    public final void L(int i) {
        M(this.j.getString(i));
    }

    public final void M(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.q)) {
            return;
        }
        this.q = charSequence;
        d();
    }

    public final void N(boolean z) {
        if (this.w != z) {
            this.w = z;
            oyz oyzVar = this.C;
            if (oyzVar != null) {
                ((ozt) oyzVar).b();
            }
        }
    }

    public final void O(SharedPreferences.Editor editor) {
        if (this.k.a) {
            return;
        }
        editor.apply();
    }

    public final void P() {
        Preference preferenceS;
        List list;
        String str = this.f;
        if (str == null || (preferenceS = s(str)) == null || (list = preferenceS.J) == null) {
            return;
        }
        list.remove(this);
    }

    public final boolean Q(Object obj) {
        oza ozaVar = this.n;
        return ozaVar == null || ozaVar.a(this, obj);
    }

    protected final boolean R(boolean z) {
        return !V() ? z : this.k.c().getBoolean(this.s, z);
    }

    public final boolean S() {
        return !TextUtils.isEmpty(this.s);
    }

    public boolean T() {
        return this.d && this.h && this.i;
    }

    public final boolean U() {
        ozy ozyVar;
        if (!this.w || (ozyVar = this.k) == null) {
            return false;
        }
        if (this == ozyVar.b) {
            return true;
        }
        PreferenceGroup preferenceGroup = this.D;
        if (preferenceGroup == null) {
            return false;
        }
        return preferenceGroup.U();
    }

    protected final boolean V() {
        return this.k != null && this.v && S();
    }

    public final void W(boolean z) {
        if (this.h == z) {
            this.h = !z;
            z(j());
            d();
        }
    }

    public final void X(boolean z) {
        if (this.i == z) {
            this.i = !z;
            z(j());
            d();
        }
    }

    protected final void Y(String str) {
        if (V() && !TextUtils.equals(str, u(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putString(this.s, str);
            O(editorB);
        }
    }

    public final void Z() {
        if (this.H) {
            this.H = false;
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.pab r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.a(pab):void");
    }

    public final void aa() {
        if (this.e) {
            this.e = false;
            d();
        }
    }

    public void b(View view) {
        E();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.p;
        int i2 = preference2.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference2.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.q.toString());
    }

    public void d() {
        int iIndexOf;
        Object obj = this.C;
        if (obj == null || (iIndexOf = ((ozt) obj).a.indexOf(this)) == -1) {
            return;
        }
        ((vo) obj).r(iIndexOf, this);
    }

    protected Parcelable e() {
        this.K = true;
        return oyy.EMPTY_STATE;
    }

    public long eT() {
        return this.l;
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    protected void g(Parcelable parcelable) {
        this.K = true;
        if (parcelable != oyy.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean j() {
        return !T();
    }

    public CharSequence m() {
        ozd ozdVar = this.E;
        return ozdVar != null ? ozdVar.a(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.E != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected final int p(int i) {
        return !V() ? i : this.k.c().getInt(this.s, i);
    }

    public final SharedPreferences q() {
        ozy ozyVar = this.k;
        if (ozyVar != null) {
            return ozyVar.c();
        }
        return null;
    }

    public final Bundle r() {
        if (this.c == null) {
            this.c = new Bundle();
        }
        return this.c;
    }

    protected final Preference s(String str) {
        ozy ozyVar = this.k;
        if (ozyVar == null) {
            return null;
        }
        return ozyVar.d(str);
    }

    public CharSequence t() {
        return this.q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceT = t();
        if (!TextUtils.isEmpty(charSequenceT)) {
            sb.append(charSequenceT);
            sb.append(' ');
        }
        CharSequence charSequenceM = m();
        if (!TextUtils.isEmpty(charSequenceM)) {
            sb.append(charSequenceM);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    protected final String u(String str) {
        return !V() ? str : this.k.c().getString(this.s, str);
    }

    public final Set v(Set set) {
        return !V() ? set : this.k.c().getStringSet(this.s, set);
    }

    final void w(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.D != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.D = preferenceGroup;
    }

    public void x(Bundle bundle) {
        Parcelable parcelable;
        if (!S() || (parcelable = bundle.getParcelable(this.s)) == null) {
            return;
        }
        this.K = false;
        g(parcelable);
        if (!this.K) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void y(Bundle bundle) {
        if (S()) {
            this.K = false;
            Parcelable parcelableE = e();
            if (!this.K) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableE != null) {
                bundle.putParcelable(this.s, parcelableE);
            }
        }
    }

    public void z(boolean z) {
        List list = this.J;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).W(z);
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kyz.b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = true;
        this.e = true;
        this.v = true;
        this.h = true;
        this.i = true;
        this.w = true;
        this.F = true;
        this.G = true;
        this.y = true;
        this.I = true;
        this.A = R.layout.preference;
        this.M = new oyw(this);
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pac.g, i, i2);
        this.r = kyz.d(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.s = kyz.g(typedArrayObtainStyledAttributes, 26, 6);
        this.q = kyz.f(typedArrayObtainStyledAttributes, 34, 4);
        this.a = kyz.f(typedArrayObtainStyledAttributes, 33, 7);
        this.p = kyz.k(typedArrayObtainStyledAttributes, 28, 8);
        this.u = kyz.g(typedArrayObtainStyledAttributes, 22, 13);
        this.A = kyz.d(typedArrayObtainStyledAttributes, 27, 3, R.layout.preference);
        this.B = kyz.d(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.d = kyz.h(typedArrayObtainStyledAttributes, 21, 2, true);
        this.e = kyz.h(typedArrayObtainStyledAttributes, 30, 5, true);
        this.v = kyz.h(typedArrayObtainStyledAttributes, 29, 1, true);
        this.f = kyz.g(typedArrayObtainStyledAttributes, 19, 10);
        this.F = kyz.h(typedArrayObtainStyledAttributes, 16, 16, this.e);
        this.G = kyz.h(typedArrayObtainStyledAttributes, 17, 17, this.e);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.g = f(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.g = f(typedArrayObtainStyledAttributes, 11);
        }
        this.I = kyz.h(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.x = zHasValue;
        if (zHasValue) {
            this.y = kyz.h(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.H = kyz.h(typedArrayObtainStyledAttributes, 24, 15, false);
        this.w = kyz.h(typedArrayObtainStyledAttributes, 25, 25, true);
        this.z = kyz.h(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected void c() {
    }

    protected void h(Object obj) {
    }
}

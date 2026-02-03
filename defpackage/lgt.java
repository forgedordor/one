package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgt {
    public static final lgt a;
    public final lgp b;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            a = lgo.e;
        } else if (Build.VERSION.SDK_INT >= 30) {
            a = lgm.d;
        } else {
            a = lgp.f;
        }
    }

    private lgt(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.b = new lgo(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.b = new lgn(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new lgm(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new lgl(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.b = new lgk(this, windowInsets);
        } else {
            this.b = new lgj(this, windowInsets);
        }
    }

    public static kzc i(kzc kzcVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, kzcVar.b - i);
        int iMax2 = Math.max(0, kzcVar.c - i2);
        int iMax3 = Math.max(0, kzcVar.d - i3);
        int iMax4 = Math.max(0, kzcVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? kzcVar : kzc.d(iMax, iMax2, iMax3, iMax4);
    }

    public static lgt o(WindowInsets windowInsets) {
        return p(windowInsets, null);
    }

    public static lgt p(WindowInsets windowInsets, View view) {
        lcg.i(windowInsets);
        lgt lgtVar = new lgt(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int[] iArr = ley.a;
            lgtVar.s(leo.a(view));
            lgtVar.q(view.getRootView());
            lgtVar.t(view.getWindowSystemUiVisibility());
        }
        return lgtVar;
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        lgp lgpVar = this.b;
        if (lgpVar instanceof lgi) {
            return ((lgi) lgpVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lgt) {
            return Objects.equals(this.b, ((lgt) obj).b);
        }
        return false;
    }

    public final kzc f(int i) {
        return this.b.a(i);
    }

    public final kzc g(int i) {
        return this.b.c(i);
    }

    @Deprecated
    public final kzc h() {
        return this.b.p();
    }

    public final int hashCode() {
        lgp lgpVar = this.b;
        if (lgpVar == null) {
            return 0;
        }
        return lgpVar.hashCode();
    }

    public final lcz j() {
        return this.b.u();
    }

    @Deprecated
    public final lgt k() {
        return this.b.v();
    }

    @Deprecated
    public final lgt l() {
        return this.b.q();
    }

    @Deprecated
    public final lgt m() {
        return this.b.r();
    }

    public final lgt n(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    final void q(View view) {
        this.b.f(view);
    }

    final void r(kzc[] kzcVarArr) {
        this.b.h(kzcVarArr);
    }

    final void s(lgt lgtVar) {
        this.b.j(lgtVar);
    }

    final void t(int i) {
        this.b.k(i);
    }

    public final boolean u() {
        return this.b.t();
    }

    public final boolean v(int i) {
        return this.b.n(i);
    }

    public lgt(lgt lgtVar) {
        if (lgtVar != null) {
            lgp lgpVar = lgtVar.b;
            if (Build.VERSION.SDK_INT >= 34 && (lgpVar instanceof lgo)) {
                this.b = new lgo(this, (lgo) lgpVar);
            } else if (Build.VERSION.SDK_INT >= 31 && (lgpVar instanceof lgn)) {
                this.b = new lgn(this, (lgn) lgpVar);
            } else if (Build.VERSION.SDK_INT >= 30 && (lgpVar instanceof lgm)) {
                this.b = new lgm(this, (lgm) lgpVar);
            } else if (Build.VERSION.SDK_INT >= 29 && (lgpVar instanceof lgl)) {
                this.b = new lgl(this, (lgl) lgpVar);
            } else if (Build.VERSION.SDK_INT >= 28 && (lgpVar instanceof lgk)) {
                this.b = new lgk(this, (lgk) lgpVar);
            } else if (lgpVar instanceof lgj) {
                this.b = new lgj(this, (lgj) lgpVar);
            } else if (lgpVar instanceof lgi) {
                this.b = new lgi(this, (lgi) lgpVar);
            } else {
                this.b = new lgp(this);
            }
            lgpVar.g(this);
            return;
        }
        this.b = new lgp(this);
    }
}

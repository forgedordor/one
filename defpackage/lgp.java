package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lgp {
    static final lgt f;
    final lgt g;

    static {
        f = (Build.VERSION.SDK_INT >= 34 ? new lgg() : Build.VERSION.SDK_INT >= 31 ? new lgf() : Build.VERSION.SDK_INT >= 30 ? new lge() : Build.VERSION.SDK_INT >= 29 ? new lgd() : new lgc()).a().k().l().m();
    }

    public lgp(lgt lgtVar) {
        this.g = lgtVar;
    }

    public kzc a(int i) {
        return kzc.a;
    }

    public kzc c(int i) {
        if ((i & 8) == 0) {
            return kzc.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public kzc d() {
        return kzc.a;
    }

    public lgt e(int i, int i2, int i3, int i4) {
        return f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgp)) {
            return false;
        }
        lgp lgpVar = (lgp) obj;
        return l() == lgpVar.l() && t() == lgpVar.t() && Objects.equals(d(), lgpVar.d()) && Objects.equals(p(), lgpVar.p()) && Objects.equals(u(), lgpVar.u());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(t()), d(), p(), u());
    }

    public boolean l() {
        return false;
    }

    public boolean n(int i) {
        return true;
    }

    public kzc p() {
        return kzc.a;
    }

    public lgt q() {
        return this.g;
    }

    public lgt r() {
        return this.g;
    }

    public boolean t() {
        return false;
    }

    public lcz u() {
        return null;
    }

    public lgt v() {
        return this.g;
    }

    public kzc w() {
        return d();
    }

    public kzc x() {
        return d();
    }

    public kzc y() {
        return d();
    }

    public void f(View view) {
    }

    public void g(lgt lgtVar) {
    }

    public void h(kzc[] kzcVarArr) {
    }

    public void i(kzc kzcVar) {
    }

    public void j(lgt lgtVar) {
    }

    public void k(int i) {
    }

    public void s(kzc kzcVar) {
    }
}

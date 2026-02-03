package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class xz extends vv {
    boolean k = true;

    public abstract boolean e(wv wvVar);

    public abstract boolean f(wv wvVar, wv wvVar2, int i, int i2, int i3, int i4);

    public abstract boolean g(wv wvVar, int i, int i2, int i3, int i4);

    public abstract void j(wv wvVar);

    @Override // defpackage.vv
    public final boolean n(wv wvVar, vu vuVar, vu vuVar2) {
        int i;
        int i2;
        return (vuVar == null || ((i = vuVar.a) == (i2 = vuVar2.a) && vuVar.b == vuVar2.b)) ? e(wvVar) : g(wvVar, i, vuVar.b, i2, vuVar2.b);
    }

    @Override // defpackage.vv
    public boolean o(wv wvVar, wv wvVar2, vu vuVar, vu vuVar2) {
        int i;
        int i2;
        int i3 = vuVar.a;
        int i4 = vuVar.b;
        if (wvVar2.A()) {
            int i5 = vuVar.a;
            i2 = vuVar.b;
            i = i5;
        } else {
            i = vuVar2.a;
            i2 = vuVar2.b;
        }
        return f(wvVar, wvVar2, i3, i4, i, i2);
    }

    @Override // defpackage.vv
    public final boolean p(wv wvVar, vu vuVar, vu vuVar2) {
        int i = vuVar.a;
        int i2 = vuVar.b;
        View view = wvVar.a;
        int left = vuVar2 == null ? view.getLeft() : vuVar2.a;
        int top = vuVar2 == null ? view.getTop() : vuVar2.b;
        if (wvVar.v() || (i == left && i2 == top)) {
            j(wvVar);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return g(wvVar, i, i2, left, top);
    }

    @Override // defpackage.vv
    public boolean q(wv wvVar, vu vuVar, vu vuVar2) {
        int i = vuVar.a;
        int i2 = vuVar2.a;
        if (i != i2 || vuVar.b != vuVar2.b) {
            return g(wvVar, i, vuVar.b, i2, vuVar2.b);
        }
        l(wvVar);
        return false;
    }

    @Override // defpackage.vv
    public boolean r(wv wvVar) {
        return !this.k || wvVar.t();
    }

    public final void u() {
        this.k = false;
    }
}

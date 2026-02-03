package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nd extends nb implements oa {
    public final oc a;
    private final Context b;
    private final ActionBarContextView c;
    private final na f;
    private WeakReference g;
    private boolean h;

    public nd(Context context, ActionBarContextView actionBarContextView, na naVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = naVar;
        oc ocVar = new oc(actionBarContextView.getContext());
        ocVar.D();
        this.a = ocVar;
        ocVar.b = this;
    }

    @Override // defpackage.oa
    public final void H(oc ocVar) {
        g();
        this.c.o();
    }

    @Override // defpackage.oa
    public final boolean L(oc ocVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.nb
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.nb
    public final MenuInflater b() {
        return new ni(this.c.getContext());
    }

    @Override // defpackage.nb
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.nb
    public final CharSequence d() {
        return this.c.h;
    }

    @Override // defpackage.nb
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.nb
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.nb
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.nb
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.nb
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.nb
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.nb
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.nb
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.nb
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.nb
    public final boolean n() {
        return this.c.j;
    }
}

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
public final class kr extends nb implements oa {
    public final oc a;
    public na b;
    final /* synthetic */ ks c;
    private final Context f;
    private WeakReference g;

    public kr(ks ksVar, Context context, na naVar) {
        this.c = ksVar;
        this.f = context;
        this.b = naVar;
        oc ocVar = new oc(context);
        ocVar.D();
        this.a = ocVar;
        ocVar.b = this;
    }

    @Override // defpackage.oa
    public final void H(oc ocVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.e.o();
    }

    @Override // defpackage.oa
    public final boolean L(oc ocVar, MenuItem menuItem) {
        na naVar = this.b;
        if (naVar != null) {
            return naVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.nb
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.nb
    public final MenuInflater b() {
        return new ni(this.f);
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
        return this.c.e.h;
    }

    @Override // defpackage.nb
    public final CharSequence e() {
        return this.c.e.g;
    }

    @Override // defpackage.nb
    public final void f() {
        ks ksVar = this.c;
        if (ksVar.g != this) {
            return;
        }
        if (ks.d(ksVar.l, ksVar.m, false)) {
            this.b.a(this);
        } else {
            ksVar.h = this;
            ksVar.i = this.b;
        }
        this.b = null;
        ksVar.a(false);
        ActionBarContextView actionBarContextView = ksVar.e;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        ksVar.b.k(ksVar.o);
        ksVar.g = null;
    }

    @Override // defpackage.nb
    public final void g() {
        if (this.c.g != this) {
            return;
        }
        oc ocVar = this.a;
        ocVar.s();
        try {
            this.b.d(this, ocVar);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.nb
    public final void h(View view) {
        this.c.e.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.nb
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.nb
    public final void j(CharSequence charSequence) {
        this.c.e.k(charSequence);
    }

    @Override // defpackage.nb
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.nb
    public final void l(CharSequence charSequence) {
        this.c.e.l(charSequence);
    }

    @Override // defpackage.nb
    public final void m(boolean z) {
        this.e = z;
        this.c.e.m(z);
    }

    @Override // defpackage.nb
    public final boolean n() {
        return this.c.e.j;
    }
}

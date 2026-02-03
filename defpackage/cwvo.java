package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cwvo extends ehno implements eyhy {
    private ContextWrapper b;
    private boolean c;
    private volatile eyhj d;
    private final Object e = new Object();
    private boolean ag = false;

    private final void f() {
        if (this.b == null) {
            this.b = new eyhq.a(super.z(), this);
            this.c = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return eygu.b(this, super.R());
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = b();
                }
            }
        }
        return this.d;
    }

    @Override // defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        f();
        e();
    }

    protected eyhj b() {
        throw null;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    protected final void e() {
        if (this.ag) {
            return;
        }
        this.ag = true;
        bb();
    }

    @Override // defpackage.ehno, defpackage.ea
    public void g(Context context) {
        super.g(context);
        f();
        e();
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.c) {
            return null;
        }
        f();
        return this.b;
    }
}

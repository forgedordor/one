package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cyln extends ehnp implements eyhy {
    private ContextWrapper a;
    private final Object ag = new Object();
    private boolean ah = false;
    private boolean d;
    private volatile eyhj e;

    private final void f() {
        if (this.a == null) {
            this.a = new eyhq.a(super.z(), this);
            this.d = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return eygu.b(this, super.R());
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.e == null) {
            synchronized (this.ag) {
                if (this.e == null) {
                    this.e = b();
                }
            }
        }
        return this.e;
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
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
        if (this.ah) {
            return;
        }
        this.ah = true;
        bb();
    }

    @Override // defpackage.ehnp, defpackage.ea
    public void g(Context context) {
        super.g(context);
        f();
        e();
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.d) {
            return null;
        }
        f();
        return this.a;
    }
}

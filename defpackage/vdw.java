package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.ehol;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vdw extends ehnp implements eyhy {
    private ContextWrapper a;
    private final Object ag = new Object();
    private boolean ah = false;
    private boolean d;
    private volatile ehok e;

    private final void a() {
        if (this.a == null) {
            this.a = new ehol.a(super.z(), this);
            this.d = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return ehng.a(this, super.R());
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
        a();
        f();
    }

    protected ehok b() {
        throw null;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ehok ba() {
        if (this.e == null) {
            synchronized (this.ag) {
                if (this.e == null) {
                    this.e = b();
                }
            }
        }
        return this.e;
    }

    protected final void f() {
        if (this.ah) {
            return;
        }
        this.ah = true;
        bb();
    }

    @Override // defpackage.ehnp, defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        f();
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.d) {
            return null;
        }
        a();
        return this.a;
    }
}

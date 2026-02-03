package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agjs extends aiif implements eyhy {
    private ContextWrapper aj;
    private boolean ak;
    private volatile eyhj al;
    private final Object an = new Object();
    private boolean ao = false;

    private final void bd() {
        if (this.aj == null) {
            this.aj = new eyhq.a(super.z(), this);
            this.ak = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return eygu.b(this, super.R());
    }

    @Override // defpackage.eyhy
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.al == null) {
            synchronized (this.an) {
                if (this.al == null) {
                    this.al = aZ();
                }
            }
        }
        return this.al;
    }

    protected eyhj aZ() {
        throw null;
    }

    @Override // defpackage.ecdm, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.aj;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        bd();
        bc();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    protected final void bc() {
        if (this.ao) {
            return;
        }
        this.ao = true;
        bb();
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        bd();
        bc();
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.ak) {
            return null;
        }
        bd();
        return this.aj;
    }
}

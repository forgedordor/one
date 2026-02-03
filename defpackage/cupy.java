package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cupy extends aiif implements eyhy {
    private ContextWrapper aj;
    private boolean ak;
    private volatile eyhj al;
    private final Object an = new Object();
    private boolean ao = false;

    private final void aY() {
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
    /* renamed from: aZ, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.al == null) {
            synchronized (this.an) {
                if (this.al == null) {
                    this.al = new eyhj(this);
                }
            }
        }
        return this.al;
    }

    @Override // defpackage.ecdm, defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.aj;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aY();
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
        ahkn ahknVar = ((ahib) bb()).a;
        ((culw) this).aj = (cqtj) ahknVar.b.gZ.b();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        aY();
        bc();
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterAO = aO();
        return layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.ak) {
            return null;
        }
        aY();
        return this.aj;
    }
}

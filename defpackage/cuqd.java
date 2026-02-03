package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cuqd extends aiif implements eyhy {
    private ContextWrapper aj;
    private boolean ak;
    private volatile eyhj al;
    private final Object an = new Object();
    private boolean ao = false;

    private final void bc() {
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
                    this.al = new eyhj(this);
                }
            }
        }
        return this.al;
    }

    protected final void aZ() {
        if (this.ao) {
            return;
        }
        this.ao = true;
        cupt cuptVar = (cupt) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        cuptVar.aj = (Optional) ahknVar.mC.b();
        cuptVar.ak = ahibVar.c.aW;
        cuptVar.al = Optional.of(ahknVar.X());
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
        bc();
        aZ();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        bc();
        aZ();
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
        bc();
        return this.aj;
    }
}

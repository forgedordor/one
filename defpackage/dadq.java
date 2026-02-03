package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dadq extends dafz implements eyhy {
    private ContextWrapper ag;
    private boolean ah;
    private volatile eyhj ai;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void bc() {
        if (this.ag == null) {
            this.ag = new eyhq.a(super.z(), this);
            this.ah = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return eygu.b(this, super.R());
    }

    @Override // defpackage.eyhy
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.ai == null) {
            synchronized (this.aj) {
                if (this.ai == null) {
                    this.ai = new eyhj(this);
                }
            }
        }
        return this.ai;
    }

    protected final void aW() {
        if (this.ak) {
            return;
        }
        this.ak = true;
        dady dadyVar = (dady) this;
        ahib ahibVar = (ahib) bb();
        ahnh ahnhVar = ahibVar.a.a;
        dadyVar.ag = (aijh) ahnhVar.Uk.b();
        dadyVar.ah = (avmp) ahnhVar.Jm.b();
        ahhk ahhkVar = ahibVar.c;
        dadyVar.ai = (dacu) ahhkVar.bq.b();
        dadyVar.aj = ahibVar.bF;
        dadyVar.ak = ahhkVar.n;
        dadyVar.al = ahnhVar.Qp;
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        bc();
        aW();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        bc();
        aW();
    }

    @Override // defpackage.dn, defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterGo = super.go(bundle);
        return layoutInflaterGo.cloneInContext(new eyhq.a(layoutInflaterGo, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.ah) {
            return null;
        }
        bc();
        return this.ag;
    }
}

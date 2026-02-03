package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cxte extends dn implements eyhy {
    private ContextWrapper ag;
    private boolean ah;
    private volatile eyhj ai;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void aX() {
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
        cxca cxcaVar = (cxca) this;
        ahib ahibVar = (ahib) bb();
        ahho ahhoVar = ahibVar.b;
        cxcaVar.ai = (cley) ahhoVar.cm.b();
        cxcaVar.aj = (cxcb) ahhoVar.bV.b();
        ahkn ahknVar = ahibVar.a;
        ahnh ahnhVar = ahknVar.a;
        cxcaVar.ak = (cmoq) ahnhVar.aiB.b();
        cxcaVar.ao = (axzo) ahhoVar.cp.b();
        cxcaVar.al = ahnhVar.Ci;
        cxcaVar.am = ahknVar.lk;
        cxcaVar.an = ahnhVar.RQ;
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
        aX();
        aW();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        aX();
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
        aX();
        return this.ag;
    }
}

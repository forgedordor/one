package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes5.dex */
class edao extends dn implements eyhy, eyhr {
    private ContextWrapper ag;
    private boolean ah;
    private volatile eyhj ai;
    private final Object aj = new Object();
    public boolean al = false;

    private final void aX() {
        if (this.ag == null) {
            this.ag = new eyhq.a(super.z(), this);
            this.ah = aY(X()) ? eygr.a(super.z()) : true;
        }
    }

    private static final boolean aY(Object obj) {
        if (obj instanceof eyhx) {
            return !(obj instanceof eyhr) || ((eyhr) obj).e();
        }
        return false;
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return !aY(X()) ? super.R() : eygu.b(this, super.R());
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
        if (aY(X()) && !this.al) {
            this.al = true;
            edag edagVar = (edag) this;
            ahib ahibVar = (ahib) bb();
            ahkn ahknVar = ahibVar.a;
            eksp ekspVar = dszz.a;
            edagVar.ag = new dtaq(ejwi.j(new dszx()));
            edagVar.ah = (ednl) ahibVar.c.bS.b();
            ahng ahngVar = ahknVar.b;
            edagVar.ai = (dsvh) ahngVar.jc.b();
            edagVar.aj = (dsvx) ahngVar.ja.b();
            edagVar.ak = (dswb) ahngVar.iZ.b();
        }
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

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.al;
    }

    @Override // defpackage.dn, defpackage.ea
    public void g(Context context) {
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

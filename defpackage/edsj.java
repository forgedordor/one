package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes5.dex */
class edsj extends dn implements eyhy, eyhr {
    private ContextWrapper ah;
    private boolean ai;
    private volatile eyhj aj;
    private final Object ak = new Object();
    public boolean ag = false;

    private final void aX() {
        if (this.ah == null) {
            this.ah = new eyhq.a(super.z(), this);
            this.ai = aY(X()) ? eygr.a(super.z()) : true;
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
        if (this.aj == null) {
            synchronized (this.ak) {
                if (this.aj == null) {
                    this.aj = new eyhj(this);
                }
            }
        }
        return this.aj;
    }

    protected final void aW() {
        if (aY(X()) && !this.ag) {
            this.ag = true;
            edso edsoVar = (edso) this;
            ahib ahibVar = (ahib) bb();
            edsoVar.ah = ahibVar.b();
            edsoVar.ai = ahibVar.a.b.cm();
            ahhk ahhkVar = ahibVar.c;
            edsoVar.aj = (eddy) ahhkVar.bR.b();
            edsoVar.ak = (eduu) ahhkVar.cT.b();
        }
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ah;
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
        return this.ag;
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
        if (super.z() == null && !this.ai) {
            return null;
        }
        aX();
        return this.ah;
    }
}

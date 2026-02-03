package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes5.dex */
class edpo extends ea implements eyhy, eyhr {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d = new Object();
    public boolean aj = false;

    private final void a() {
        if (this.a == null) {
            this.a = new eyhq.a(super.z(), this);
            this.b = b(X()) ? eygr.a(super.z()) : true;
        }
    }

    private static final boolean b(Object obj) {
        if (obj instanceof eyhx) {
            return !(obj instanceof eyhr) || ((eyhr) obj).e();
        }
        return false;
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return !b(X()) ? super.R() : eygu.b(this, super.R());
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        p();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.aj;
    }

    @Override // defpackage.eyhy
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new eyhj(this);
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        p();
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterAO = aO();
        return layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
    }

    protected final void p() {
        if (b(X()) && !this.aj) {
            this.aj = true;
            edpn edpnVar = (edpn) this;
            ahib ahibVar = (ahib) bb();
            edpnVar.a = ahibVar.b();
            ahng ahngVar = ahibVar.a.b;
            edpnVar.b = (dswb) ahngVar.iZ.b();
            ahhk ahhkVar = ahibVar.c;
            edpnVar.c = (edgv) ahhkVar.bC.b();
            edpnVar.d = ahngVar.nO;
            edpnVar.e = (edgp) ahhkVar.co.b();
        }
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }
}

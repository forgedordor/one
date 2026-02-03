package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnys extends dpxo implements eyhy {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d;
    private boolean e;

    dnys() {
        this.d = new Object();
        this.e = false;
    }

    private final void a() {
        if (this.a == null) {
            this.a = new eyhq.a(super.z(), this);
            this.b = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return eygu.b(this, super.R());
    }

    @Override // defpackage.eyhy
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
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

    protected final void aW() {
        if (this.e) {
            return;
        }
        this.e = true;
        dnyn dnynVar = (dnyn) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        dnynVar.aM = (eony) ahknVar.lp.b();
        dnynVar.aN = ahknVar.lo;
        dnynVar.aO = (fdjx) ahibVar.g.b();
        ahng ahngVar = ahknVar.b;
        dnynVar.aP = Optional.of(ahngVar.oZ);
        dnynVar.aQ = (Optional) ahibVar.n.b();
        dnynVar.b = (Context) ahknVar.t.b();
        ahnh ahnhVar = ahknVar.a;
        dnynVar.c = (dnvi) ahnhVar.IO.b();
        dnynVar.d = (dqav) ahibVar.bO.b();
        dnynVar.e = ahnhVar.mh();
        dnynVar.ag = new dnyx(ahibVar.bR, ahibVar.bU, ahibVar.n);
        dnynVar.ah = (fdjx) ahnhVar.m.b();
        dnynVar.ai = (dnuy) ahnhVar.aiT.b();
        dnynVar.aj = Optional.of((abvh) ahngVar.lk.b());
        dnynVar.ak = (Optional) ahibVar.bS.b();
        dnynVar.al = Optional.empty();
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
        aW();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.dpil, defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        aW();
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterAO = aO();
        return layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }

    public dnys(Integer num, dpxp dpxpVar) {
        super(num, dpxpVar);
        this.d = new Object();
        this.e = false;
    }
}

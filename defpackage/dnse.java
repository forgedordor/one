package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import defpackage.eyhq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnse extends dpxs implements eyhy {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d;
    private boolean e;

    public dnse(dpxp dpxpVar) {
        super(R.layout.gboard_emoji_screen_layout, dpxpVar);
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
        f();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
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

    protected final void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        dnro dnroVar = (dnro) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        dnroVar.aM = (eony) ahknVar.lp.b();
        dnroVar.aN = ahknVar.lo;
        dnroVar.aO = (fdjx) ahibVar.g.b();
        dnroVar.aP = Optional.of(ahknVar.jw);
        dnroVar.aQ = (Optional) ahibVar.n.b();
        ahng ahngVar = ahknVar.b;
        dnroVar.a = (dnkk) ahngVar.hm.b();
        dnroVar.b = ejwi.j(ahibVar.x());
        dnroVar.c = ahibVar.z();
        dnroVar.d = ahibVar.w();
        dnroVar.e = new dnsb(ahibVar.c.d, ahibVar.d, ahibVar.g, ahknVar.y, ahngVar.oX, ahibVar.bQ, ahibVar.n);
        dnroVar.ag = new dnrb((Context) ahknVar.t.b(), (eosd) ahknVar.p.b(), (eosd) ahknVar.y.b(), (dnrc) ahngVar.oY.b(), ahngVar.ce(), (dngc) ahknVar.lo.b());
    }

    @Override // defpackage.dpil, defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        f();
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
}

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
public abstract class dnqb extends dpxs implements eyhy {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d;
    private boolean e;

    public dnqb(dpxp dpxpVar) {
        super(R.layout.emoji_screen_layout, dpxpVar);
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
        bj();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: bi, reason: merged with bridge method [inline-methods] */
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

    protected final void bj() {
        if (this.e) {
            return;
        }
        this.e = true;
        dnpz dnpzVar = (dnpz) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        dnpzVar.aM = (eony) ahknVar.lp.b();
        dnpzVar.aN = ahknVar.lo;
        dnpzVar.aO = (fdjx) ahibVar.g.b();
        dnpzVar.aP = Optional.of(ahknVar.jw);
        dnpzVar.aQ = (Optional) ahibVar.n.b();
        ahng ahngVar = ahknVar.b;
        dnpzVar.a = (dnkh) ahngVar.hm.b();
        ahnh ahnhVar = ahknVar.a;
        dnpzVar.b = (fdjx) ahnhVar.m.b();
        ahhk ahhkVar = ahibVar.c;
        eyik eyikVar = ahhkVar.cM;
        dnpzVar.c = (dnth) eyikVar.b();
        dnpzVar.d = new dnqy((Activity) ahhkVar.d.b(), (fdjx) ahnhVar.m.b(), (dnky) ahngVar.hr.b(), (dngc) ahknVar.lo.b(), (fdjx) ahibVar.g.b(), (dnth) eyikVar.b());
        dnpzVar.e = new dnqz((dnky) ahngVar.hr.b(), (dngc) ahknVar.lo.b(), (dnth) eyikVar.b(), (fdjx) ahibVar.g.b());
        dnpzVar.ah = ejwi.j(ahibVar.x());
        dnpzVar.ai = ahibVar.z();
        dnpzVar.aj = ahibVar.v();
        dnpzVar.al = (dnky) ahngVar.hr.b();
    }

    @Override // defpackage.dpil, defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        bj();
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

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
public abstract class dozd extends docj implements eyhy {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d;
    private boolean e;

    public dozd(docs docsVar, dobm dobmVar) {
        super(R.string.sticker_search_hint, R.string.sticker_screen_no_result, docsVar, dobmVar);
        this.d = new Object();
        this.e = false;
    }

    private final void bm() {
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
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
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
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        bm();
        b();
    }

    protected final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        dpao dpaoVar = (dpao) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        dpaoVar.aM = (eony) ahknVar.lp.b();
        dpaoVar.aN = ahknVar.lo;
        dpaoVar.aO = (fdjx) ahibVar.g.b();
        ahng ahngVar = ahknVar.b;
        dpaoVar.aP = Optional.of(ahngVar.pe);
        dpaoVar.aQ = (Optional) ahibVar.n.b();
        ahnh ahnhVar = ahknVar.a;
        dpaoVar.aq = (fdjx) ahnhVar.m.b();
        dpaoVar.ar = ahibVar.B();
        eyik eyikVar = ahibVar.bO;
        dpaoVar.as = (dqav) eyikVar.b();
        dpaoVar.at = ahibVar.cd;
        dpaoVar.au = ahibVar.C();
        eyik eyikVar2 = ahibVar.g;
        eyik eyikVar3 = ahknVar.t;
        eyik eyikVar4 = ahibVar.ce;
        eyik eyikVar5 = ahngVar.pb;
        dpaoVar.av = new dodf(eyikVar2, eyikVar3, eyikVar5, eyikVar4);
        dpaoVar.aw = new dner(ahknVar.lq, ahnhVar.m, ahngVar.pf, ahknVar.lp, ahknVar.lo);
        dpaoVar.ax = Optional.empty();
        dpaoVar.ay = Optional.of(Boolean.valueOf(ahngVar.dg()));
        dpaoVar.ag = ahibVar.B();
        dpaoVar.aB = (fdjx) ahnhVar.m.b();
        dpaoVar.aC = (fdjx) ahnhVar.oQ.b();
        dpaoVar.aD = (dqav) eyikVar.b();
        dpaoVar.aE = new dpaw(ahibVar.bV);
        ebun ebunVar = (ebun) ahngVar.a.a.Vy.b();
        ebunVar.getClass();
        dpaoVar.aF = new doyn(ebunVar);
        dpaoVar.aG = (doam) eyikVar5.b();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.docj, defpackage.dpil, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        bm();
        b();
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
        bm();
        return this.a;
    }
}

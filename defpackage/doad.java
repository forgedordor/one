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
public abstract class doad extends docj implements eyhy {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d;
    private boolean e;

    public doad(docs docsVar, dobm dobmVar) {
        super(R.string.gif_search_hint, R.string.gif_screen_no_result, docsVar, dobmVar);
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
        q();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.docj, defpackage.dpil, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        a();
        q();
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterAO = aO();
        return layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
    }

    @Override // defpackage.eyhy
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
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

    protected final void q() {
        if (this.e) {
            return;
        }
        this.e = true;
        doaa doaaVar = (doaa) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        doaaVar.aM = (eony) ahknVar.lp.b();
        doaaVar.aN = ahknVar.lo;
        doaaVar.aO = (fdjx) ahibVar.g.b();
        ahng ahngVar = ahknVar.b;
        doaaVar.aP = Optional.of(ahngVar.pa);
        doaaVar.aQ = (Optional) ahibVar.n.b();
        ahnh ahnhVar = ahknVar.a;
        doaaVar.aq = (fdjx) ahnhVar.m.b();
        doaaVar.ar = ahibVar.B();
        eyik eyikVar = ahibVar.bO;
        doaaVar.as = (dqav) eyikVar.b();
        doaaVar.at = ahibVar.bW;
        doaaVar.au = ahibVar.C();
        eyik eyikVar2 = ahibVar.g;
        eyik eyikVar3 = ahknVar.t;
        eyik eyikVar4 = ahibVar.bX;
        eyik eyikVar5 = ahngVar.pb;
        doaaVar.av = new dodf(eyikVar2, eyikVar3, eyikVar5, eyikVar4);
        doaaVar.aw = new dner(ahknVar.lq, ahnhVar.m, ahngVar.pc, ahknVar.lp, ahknVar.lo);
        doaaVar.ax = Optional.empty();
        doaaVar.ay = Optional.of(Boolean.valueOf(ahngVar.dg()));
        doaaVar.b = new doai(ahknVar.lo);
        doaaVar.c = (dqav) eyikVar.b();
        doaaVar.e = (doam) eyikVar5.b();
        doaaVar.ag = (fdjx) ahnhVar.oQ.b();
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

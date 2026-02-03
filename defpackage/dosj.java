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
public abstract class dosj extends dpxo implements eyhy {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d;
    private boolean e;

    dosj() {
        this.d = new Object();
        this.e = false;
    }

    private final void e() {
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
        e();
        b();
    }

    protected final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        dota dotaVar = (dota) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        dotaVar.aM = (eony) ahknVar.lp.b();
        dotaVar.aN = ahknVar.lo;
        dotaVar.aO = (fdjx) ahibVar.g.b();
        dotaVar.aP = Optional.of(ahibVar.v);
        dotaVar.aQ = (Optional) ahibVar.n.b();
        dotaVar.ah = new dotv(ahibVar.bY, ahibVar.bZ);
        dotaVar.ai = new dott(ahibVar.s, ahibVar.n);
        ahhk ahhkVar = ahibVar.c;
        eyik eyikVar = ahhkVar.d;
        eyik eyikVar2 = ahibVar.g;
        ahnh ahnhVar = ahknVar.a;
        dotaVar.aj = new dovs(eyikVar, eyikVar2, ahnhVar.m, ahnhVar.oQ, ahhkVar.bu, ahibVar.n, ahibVar.cb, ahibVar.cc);
        dotaVar.ak = Optional.of(new dnux(ahibVar.bT, Optional.of((abvh) ahknVar.b.lk.b()), (Optional) ahibVar.bS.b()));
        dotaVar.al = Optional.of((dnuy) ahnhVar.aiT.b());
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.dpil, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        e();
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
        e();
        return this.a;
    }

    public dosj(Integer num, dpxp dpxpVar) {
        super(num, dpxpVar);
        this.d = new Object();
        this.e = false;
    }
}

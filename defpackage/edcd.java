package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes5.dex */
class edcd extends ea implements eyhy, eyhr {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d = new Object();
    public boolean av = false;

    private final void a() {
        if (this.a == null) {
            this.a = new eyhq.a(super.z(), this);
            this.b = p(X()) ? eygr.a(super.z()) : true;
        }
    }

    private static final boolean p(Object obj) {
        if (obj instanceof eyhx) {
            return !(obj instanceof eyhr) || ((eyhr) obj).e();
        }
        return false;
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return !p(X()) ? super.R() : eygu.b(this, super.R());
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

    @Override // defpackage.eyhy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.av;
    }

    protected final void f() {
        if (p(X()) && !this.av) {
            this.av = true;
            edby edbyVar = (edby) this;
            ahib ahibVar = (ahib) bb();
            edbyVar.a = ahibVar.b();
            ahhk ahhkVar = ahibVar.c;
            edbyVar.b = (lxo) ahhkVar.ci.b();
            edbyVar.au = ahhkVar.ab();
            ahng ahngVar = ahibVar.a.b;
            edbyVar.c = new edcc(ahngVar.iZ, ahngVar.ja, ahngVar.jc);
            edbyVar.d = (eduu) ahhkVar.cT.b();
            edbyVar.e = ahngVar.nO;
            edbyVar.ag = (edgv) ahhkVar.bC.b();
            edbyVar.ah = (edgp) ahhkVar.co.b();
            edbyVar.ai = (dswb) ahngVar.iZ.b();
            edbyVar.aj = (dsvx) ahngVar.ja.b();
            edbyVar.ak = (dsvh) ahngVar.jc.b();
        }
    }

    @Override // defpackage.ea
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

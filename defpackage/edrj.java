package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes5.dex */
class edrj extends ea implements eyhy, eyhr {
    private ContextWrapper b;
    private boolean c;
    private volatile eyhj d;
    private final Object e = new Object();
    public boolean a = false;

    private final void f() {
        if (this.b == null) {
            this.b = new eyhq.a(super.z(), this);
            this.c = p(X()) ? eygr.a(super.z()) : true;
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

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = new eyhj(this);
                }
            }
        }
        return this.d;
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        f();
        b();
    }

    protected final void b() {
        if (p(X()) && !this.a) {
            this.a = true;
            edry edryVar = (edry) this;
            ahib ahibVar = (ahib) bb();
            edryVar.b = ahibVar.b();
            ahhk ahhkVar = ahibVar.c;
            edryVar.c = (lxo) ahhkVar.ci.b();
            edryVar.d = (eduu) ahhkVar.cT.b();
            ahng ahngVar = ahibVar.a.b;
            edryVar.e = (dswb) ahngVar.iZ.b();
            edryVar.ag = (dsvh) ahngVar.jc.b();
            edryVar.ah = (eddy) ahhkVar.bR.b();
            eyik eyikVar = ahhkVar.bC;
            edryVar.ai = new edrz((edgv) eyikVar.b(), ahngVar.nO);
            edryVar.aj = (edgp) ahhkVar.co.b();
            edryVar.ak = (edgl) ahhkVar.cn.b();
            edryVar.al = (edgv) eyikVar.b();
            edryVar.am = (ejwi) ahhkVar.bz.b();
            edryVar.an = (ejwi) ahhkVar.bE.b();
            edryVar.aE = new edlm(ahhkVar.al(), ahhkVar.ak(), ahhkVar.am());
            edryVar.ao = (edgm) ahhkVar.cU.b();
            edryVar.ap = "group_profile_photo_picker";
            edryVar.aq = ahhkVar.an();
        }
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.a;
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        f();
        b();
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterAO = aO();
        return layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.c) {
            return null;
        }
        f();
        return this.b;
    }
}

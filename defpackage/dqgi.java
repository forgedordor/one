package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqgi extends dpxo implements eyhy {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d;
    private boolean e;

    dqgi() {
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
        dqhd dqhdVar = (dqhd) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        dqhdVar.aM = (eony) ahknVar.lp.b();
        dqhdVar.aN = ahknVar.lo;
        dqhdVar.aO = (fdjx) ahibVar.g.b();
        dqhdVar.aP = Optional.empty();
        dqhdVar.aQ = (Optional) ahibVar.n.b();
        ahhk ahhkVar = ahibVar.c;
        dqhdVar.b = (dnhb) ahhkVar.bi.b();
        dqhdVar.c = (AudioManager) ahknVar.ok.b();
        ahkn ahknVar2 = ahknVar.b.a;
        dqhdVar.d = new dqir(new dqbn((Context) ahknVar2.t.b(), (fdjx) ahknVar2.a.m.b()), (Activity) ahhkVar.d.b(), Optional.of(new dqie()));
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

    public dqgi(Integer num) {
        super(num);
        this.d = new Object();
        this.e = false;
    }
}

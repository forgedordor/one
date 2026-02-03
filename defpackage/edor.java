package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes5.dex */
class edor extends ea implements eyhy, eyhr {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d = new Object();
    public boolean e = false;

    private final void f() {
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
        f();
        b();
    }

    protected final void b() {
        if (p(X()) && !this.e) {
            this.e = true;
            edop edopVar = (edop) this;
            ahib ahibVar = (ahib) bb();
            edopVar.a = ahibVar.b();
            ahhk ahhkVar = ahibVar.c;
            eyik eyikVar = ahhkVar.cT;
            edopVar.b = (eduu) eyikVar.b();
            edopVar.c = (dswb) ahibVar.a.b.iZ.b();
            edopVar.d = new edet(ahibVar.cj, eyikVar, ahhkVar.bC, ahhkVar.co, ahibVar.ch);
        }
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.e;
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
        if (super.z() == null && !this.b) {
            return null;
        }
        f();
        return this.a;
    }
}

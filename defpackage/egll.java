package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes5.dex */
class egll extends ecdn implements eyhy {
    private ContextWrapper ah;
    private boolean ai;
    private volatile eyhj aj;
    private final Object ak = new Object();
    private boolean al = false;

    private final void aV() {
        if (this.ah == null) {
            this.ah = new eyhq.a(super.z(), this);
            this.ai = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return eygu.b(this, super.R());
    }

    protected eyhj aX() {
        throw null;
    }

    @Override // defpackage.eyhy
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.aj == null) {
            synchronized (this.ak) {
                if (this.aj == null) {
                    this.aj = aX();
                }
            }
        }
        return this.aj;
    }

    protected final void aZ() {
        if (this.al) {
            return;
        }
        this.al = true;
        bb();
    }

    @Override // defpackage.ecdn, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ah;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aV();
        aZ();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.dn, defpackage.ea
    public void g(Context context) {
        super.g(context);
        aV();
        aZ();
    }

    @Override // defpackage.dn, defpackage.ea
    public LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterGo = super.go(bundle);
        return layoutInflaterGo.cloneInContext(new eyhq.a(layoutInflaterGo, this));
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.ai) {
            return null;
        }
        aV();
        return this.ah;
    }
}

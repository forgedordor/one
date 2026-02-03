package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
class czsn extends ecdv implements eyhy {
    private ContextWrapper ag;
    private boolean ah;
    private volatile eyhj ai;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void aV() {
        if (this.ag == null) {
            this.ag = new eyhq.a(super.z(), this);
            this.ah = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return eygu.b(this, super.R());
    }

    protected eyhj aW() {
        throw null;
    }

    @Override // defpackage.eyhy
    /* renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.ai == null) {
            synchronized (this.aj) {
                if (this.ai == null) {
                    this.ai = aW();
                }
            }
        }
        return this.ai;
    }

    protected final void aY() {
        if (this.ak) {
            return;
        }
        this.ak = true;
        bb();
    }

    @Override // defpackage.ecdv, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aV();
        aY();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.dn, defpackage.ea
    public void g(Context context) {
        super.g(context);
        aV();
        aY();
    }

    @Override // defpackage.dn, defpackage.ea
    public LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterGo = super.go(bundle);
        return layoutInflaterGo.cloneInContext(new eyhq.a(layoutInflaterGo, this));
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.ah) {
            return null;
        }
        aV();
        return this.ag;
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes2.dex */
class adgq extends dosd {
    private ContextWrapper ar;
    private boolean as;
    private boolean at = false;

    private final void aW() {
        if (this.ar == null) {
            this.ar = new eyhq.a(super.z(), this);
            this.as = eygr.a(super.z());
        }
    }

    @Override // defpackage.dora
    protected final void aV() {
        if (this.at) {
            return;
        }
        this.at = true;
        ((dosd) ((adgr) this)).ap = ((ahib) bb()).d();
    }

    @Override // defpackage.dora, defpackage.ecdv, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ar;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aW();
        aV();
    }

    @Override // defpackage.dora, defpackage.dn, defpackage.ea
    public void g(Context context) {
        super.g(context);
        aW();
        aV();
    }

    @Override // defpackage.dora, defpackage.dn, defpackage.ea
    public LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterGo = super.go(bundle);
        return layoutInflaterGo.cloneInContext(new eyhq.a(layoutInflaterGo, this));
    }

    @Override // defpackage.dora, defpackage.ea
    public Context z() {
        if (super.z() == null && !this.as) {
            return null;
        }
        aW();
        return this.ar;
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uqz extends urv {
    private ContextWrapper a;
    private boolean b;
    private boolean c = false;

    private final void e() {
        if (this.a == null) {
            this.a = new eyhq.a(super.z(), this);
            this.b = eygr.a(super.z());
        }
    }

    @Override // defpackage.ura
    protected final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        bb();
    }

    @Override // defpackage.ura, defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e();
        a();
    }

    @Override // defpackage.ura, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        e();
        a();
    }

    @Override // defpackage.ura, defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterGo = super.go(bundle);
        return layoutInflaterGo.cloneInContext(new eyhq.a(layoutInflaterGo, this));
    }

    @Override // defpackage.ura, defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        e();
        return this.a;
    }
}

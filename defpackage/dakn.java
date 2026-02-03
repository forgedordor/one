package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.ui.vcard.VCardDetailFragment;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dakn extends ea implements eyhy {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d;
    private boolean e;

    public dakn() {
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
        f();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
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

    protected final void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        VCardDetailFragment vCardDetailFragment = (VCardDetailFragment) this;
        ahib ahibVar = (ahib) bb();
        vCardDetailFragment.e = ahibVar.f();
        ahkn ahknVar = ahibVar.a;
        vCardDetailFragment.ag = (avbr) ahknVar.b.hL.b();
        vCardDetailFragment.ah = (dakl) ahknVar.a.BK.b();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
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

    dakn(int i) {
        super(i);
        this.d = new Object();
        this.e = false;
    }
}

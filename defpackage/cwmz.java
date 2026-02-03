package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.ui.conversation.message.statuschangelist.MessageStatusListFragment;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwmz extends gu implements eyhy {
    private ContextWrapper ai;
    private boolean aj;
    private volatile eyhj ak;
    private final Object al = new Object();
    private boolean am = false;

    private final void b() {
        if (this.ai == null) {
            this.ai = new eyhq.a(super.z(), this);
            this.aj = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return eygu.b(this, super.R());
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ai;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b();
        f();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.ak == null) {
            synchronized (this.al) {
                if (this.ak == null) {
                    this.ak = new eyhj(this);
                }
            }
        }
        return this.ak;
    }

    protected final void f() {
        if (this.am) {
            return;
        }
        this.am = true;
        MessageStatusListFragment messageStatusListFragment = (MessageStatusListFragment) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        messageStatusListFragment.aj = (aiwu) ahknVar.kc.b();
        messageStatusListFragment.ak = (aiwq) ahknVar.nu.b();
        messageStatusListFragment.al = (axgc) ahibVar.bd.b();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        b();
        f();
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterAO = aO();
        return layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.aj) {
            return null;
        }
        b();
        return this.ai;
    }
}

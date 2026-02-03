package com.google.android.apps.messaging.joinvialink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.adkd;
import defpackage.adkj;
import defpackage.adkn;
import defpackage.ahhw;
import defpackage.ecem;
import defpackage.ehlc;
import defpackage.ehlf;
import defpackage.ehlg;
import defpackage.ehns;
import defpackage.ehnv;
import defpackage.ehnw;
import defpackage.ehnz;
import defpackage.ehof;
import defpackage.ehok;
import defpackage.ehol;
import defpackage.eidc;
import defpackage.eieu;
import defpackage.eifl;
import defpackage.eifp;
import defpackage.eiid;
import defpackage.eiik;
import defpackage.eiiy;
import defpackage.ejwl;
import defpackage.eyhx;
import defpackage.fcsu;
import defpackage.hxd;
import defpackage.lfq;
import defpackage.lvc;
import defpackage.lvn;
import defpackage.vwo;
import defpackage.vwp;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class JoinViaLinkFragment extends adkn implements ehlg, eyhx, ehlc, ehnw, eifl {
    private adkj a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public JoinViaLinkFragment() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return adkj.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            adkj adkjVarH = H();
            layoutInflater.getClass();
            ComposeView composeView = new ComposeView(((JoinViaLinkFragment) adkjVarH.a.b()).A(), null, 0, 6, null);
            composeView.a(new hxd(94664727, true, new adkd(adkjVarH)));
            eidc.q();
            return composeView;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adkj H() {
        adkj adkjVar = this.a;
        if (adkjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return adkjVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.adkn, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.c.b();
        try {
            aY();
            lfq.a(((JoinViaLinkFragment) H().a.b()).fg().getWindow(), true);
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ejwl.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.adkn
    protected final /* bridge */ /* synthetic */ ehok b() {
        return new ehof(this, true);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.adkn, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/joinvialink/JoinViaLinkFragment", 88, JoinViaLinkFragment.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/joinvialink/JoinViaLinkFragment", 93, JoinViaLinkFragment.class, "CreatePeer");
                        try {
                            this.a = new adkj(((ahhw) objBb).dv, ((ahhw) objBb).av);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarG.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } catch (Throwable th3) {
            try {
                eidc.q();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new ehol.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            fcsu fcsuVar = H().a;
            lfq.a(((JoinViaLinkFragment) fcsuVar.b()).fg().getWindow(), false);
            Intent intent = ((JoinViaLinkFragment) fcsuVar.b()).fg().getIntent();
            intent.getClass();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("mapi_conversation_id", ConversationId.class) : intent.getParcelableExtra("mapi_conversation_id");
            if (parcelableExtra == null) {
                throw new IllegalStateException("ConversationId is required to be passed to JoinViaLinkFragment");
            }
            ConversationId conversationId = (ConversationId) parcelableExtra;
            Bundle bundle2 = ((JoinViaLinkFragment) fcsuVar.b()).m;
            if (bundle2 != null) {
                bundle2.putParcelable("open_conversation2_arguments", new OpenConversation2Arguments(conversationId, null, null, true, false, false, null, 118, null));
                bundle2.putParcelable("mapi_conversation_id", conversationId);
                vwp.b(bundle2, vwo.a);
            }
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ag = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adkn, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

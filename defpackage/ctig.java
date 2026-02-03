package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel;
import defpackage.ehol;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctig extends ctiw implements ehlg, eyhx, ehlc, ehnw, eifl {
    private ctiu a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public ctig() {
        ecem.c();
    }

    public static ctig a(efwo efwoVar) {
        ctig ctigVar = new ctig();
        eyhj.e(ctigVar);
        ehok.b(ctigVar, efwoVar);
        return ctigVar;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return ctiu.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            ctiu ctiuVarH = H();
            layoutInflater.getClass();
            ComposeView composeView = new ComposeView(((ctig) ctiuVarH.b.b()).A(), null, 0, 6, null);
            composeView.setFitsSystemWindows(true);
            composeView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ctih
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.getClass();
                    windowInsets.getClass();
                    return windowInsets;
                }
            });
            composeView.a(new hxd(400788083, true, new ctio(ctiuVarH)));
            eidc.q();
            return composeView;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
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

    @Override // defpackage.ctiw, defpackage.ecdo, defpackage.ea
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
            lfq.a(((ctig) H().b.b()).fg().getWindow(), true);
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.c.b();
        try {
            bj();
            ((cudy) H().a().c.b()).b();
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

    @Override // defpackage.ehlg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ctiu H() {
        ctiu ctiuVar = this.a;
        if (ctiuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ctiuVar;
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

    @Override // defpackage.ctiw
    protected final /* bridge */ /* synthetic */ ehok e() {
        return new ehof(this, false);
    }

    @Override // defpackage.ctiw, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/startchat/StartChatFragment", 87, ctig.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/startchat/StartChatFragment", 92, ctig.class, "CreatePeer");
                        try {
                            eygg eyggVarA = eyie.a(((ahhw) objBb).by);
                            ahkn ahknVar = ((ahhw) objBb).a;
                            ahhe ahheVar = ((ahhw) objBb).d;
                            this.a = new ctiu(eyggVarA, ((ahhw) objBb).dA, ahheVar.H, ((ahhw) objBb).c.t, ahheVar.h, ahheVar.p, ((ahhw) objBb).av, ahheVar.K, ahknVar.b.je, ahheVar.t);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } finally {
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
            ctiu ctiuVarH = H();
            fcsu fcsuVar = ctiuVarH.b;
            lfq.a(((ctig) fcsuVar.b()).fg().getWindow(), false);
            if (((Optional) ctiuVarH.g.b()).isEmpty() || !((Boolean) ctiuVarH.k.a()).booleanValue()) {
                ((afzd) ctiuVarH.c.b()).a();
            }
            ctxx ctxxVar = (ctxx) ctiuVarH.d.b();
            if (bundle == null) {
                ctxxVar.b.e(ajfo.x);
            }
            Bundle bundle2 = ((ctig) fcsuVar.b()).m;
            SelfIdentityId selfIdentityId = bundle2 != null ? (SelfIdentityId) ih.a(bundle2, "self_identity_id", SelfIdentityId.class) : null;
            Bundle bundle3 = ((ctig) fcsuVar.b()).m;
            if (bundle3 != null && cueg.a(bundle3.getInt("selection_mode")).b() && selfIdentityId == null) {
                throw new IllegalStateException("Self-identity id is not provided.");
            }
            if (selfIdentityId == null) {
                StartChatViewModel startChatViewModelA = ctiuVarH.a();
                boolean zB = ctiuVarH.b();
                StartChatViewModel.a.p("onCreate with splitview: " + zB + "}");
                ((cuei) startChatViewModelA.e.b()).a = zB;
                ((cuec) startChatViewModelA.f.b()).b();
            } else {
                StartChatViewModel startChatViewModelA2 = ctiuVarH.a();
                boolean zB2 = ctiuVarH.b();
                StartChatViewModel.a.i().G("onCreate with splitview: %s and selfIdentityId: %s", zB2, selfIdentityId.b());
                ((cuei) startChatViewModelA2.e.b()).a = zB2;
                ((cuec) startChatViewModelA2.f.b()).c(selfIdentityId);
            }
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

    @Override // defpackage.ctiw, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

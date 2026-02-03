package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.ehol;
import java.util.Locale;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbaq extends dbae implements ehlg, eyhx, ehlc, ehnw, eifl {
    private dbaw a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public dbaq() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return dbaw.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            dbaw dbawVarH = H();
            layoutInflater.getClass();
            ehpl ehplVar = dbawVarH.e;
            fcsu fcsuVar = dbawVarH.g;
            ehpk.a(ehplVar.a(((dbap) fcsuVar.b()).a().i), new dbat(dbawVarH));
            ehpk.a(ehplVar.a(((dbap) fcsuVar.b()).a().j), new dbau(dbawVarH));
            View viewInflate = layoutInflater.inflate(R.layout.youtube_player_fragment, viewGroup, false);
            viewInflate.getClass();
            eidc.q();
            return viewInflate;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ea, defpackage.luv
    public final lyp T() {
        lys lysVar = new lys(super.T());
        lysVar.b(lwu.c, new Bundle());
        return lysVar;
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

    @Override // defpackage.dbae, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.ea
    public final void an(boolean z) throws JSONException {
        dbaw dbawVarH = H();
        if (((lvn) dbawVarH.d.P()).c.a(lvb.d)) {
            ((dbap) dbawVarH.g.b()).c(!z);
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

    @Override // defpackage.dbae
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

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final dbaw H() {
        dbaw dbawVar = this.a;
        if (dbawVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dbawVar;
    }

    @Override // defpackage.dbae, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/youtube/YouTubePlayerFragment", 91, dbaq.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/youtube/YouTubePlayerFragment", 96, dbaq.class, "CreatePeer");
                        try {
                            Activity activity = (Activity) ((ahhw) objBb).d.f.b();
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            fcyh fcyhVar = (fcyh) ((ahhw) objBb).ea.b();
                            fcyhVar.getClass();
                            ehpw ehpwVar = new ehpw(eaVar, fcyhVar);
                            eyik eyikVar = ((ahhw) objBb).a.a.m;
                            ahjr ahjrVar = ((ahhw) objBb).b;
                            this.a = new dbaw(activity, eaVar, ehpwVar, eyikVar, ahjrVar.oA, ahjrVar.pU);
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bl();
            dbaw dbawVarH = H();
            dbap dbapVar = (dbap) dbawVarH.g.b();
            dbax dbaxVar = dbapVar.b;
            if (dbaxVar != null) {
                dbapVar.b(dbaxVar);
            }
            final dbbp dbbpVarA = dbapVar.a();
            dbawVarH.c(new fdap() { // from class: dbas
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ViewGroup viewGroup = (ViewGroup) obj;
                    ekrg ekrgVar = dbaw.a;
                    viewGroup.getClass();
                    viewGroup.removeAllViews();
                    viewGroup.addView(dbbpVarA);
                    return fctx.a;
                }
            });
            dbapVar.b = dbawVarH;
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
    public final void m() {
        this.c.k();
        try {
            bm();
            dbaw dbawVarH = H();
            ((dbap) dbawVarH.g.b()).b(dbawVarH);
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

    @Override // defpackage.dbae, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ehol;
import java.util.Locale;
import tpx.a;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpq extends tsf implements ehlg, eyhx, ehlc, ehnw, eifl {
    private tpx aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private boolean ao;

    @Deprecated
    public tpq() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return tpx.class;
    }

    @Override // defpackage.ecdm, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View viewM = super.M(layoutInflater, viewGroup, bundle);
            eidc.q();
            return viewM;
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
        return this.al;
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

    @Override // defpackage.ecdm, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        eifp eifpVarJ = this.an.j();
        try {
            boolean zAM = super.aM(menuItem);
            eifpVarJ.close();
            return zAM;
        } catch (Throwable th) {
            try {
                eifpVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.an.h(i, i2);
        eidc.q();
    }

    @Override // defpackage.ehlg
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final tpx H() {
        tpx tpxVar = this.aj;
        if (tpxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return tpxVar;
    }

    @Override // defpackage.tsf
    protected final /* bridge */ /* synthetic */ ehok aZ() {
        return new ehof(this, true);
    }

    @Override // defpackage.ecdm, defpackage.ea
    public final void ae(Bundle bundle) {
        this.an.k();
        try {
            super.ae(bundle);
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.an.f();
        try {
            super.af(i, i2, intent);
            eifpVarF.close();
        } catch (Throwable th) {
            try {
                eifpVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tsf, defpackage.ecdm, defpackage.ea
    public final void ag(Activity activity) {
        this.an.k();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.an.b();
        try {
            super.ai();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void am() {
        this.an.k();
        try {
            super.am();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.an.b();
        try {
            super.ao();
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

    @Override // defpackage.aiif, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.an.k();
        try {
            super.ap(view, bundle);
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
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ejwl.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.ak == null) {
            this.ak = new ehnz(this, super.z());
        }
        return this.ak;
    }

    @Override // defpackage.eifl
    public final eiik bf() {
        return this.an.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.an.e(eiikVar, z);
    }

    @Override // defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.an.b = eiikVar;
    }

    @Override // defpackage.aiif
    protected final boolean bj() {
        return true;
    }

    @Override // defpackage.tsf, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragment", 99, tpq.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragment", 104, tpq.class, "CreatePeer");
                        try {
                            ahkn ahknVar = ((ahhw) objBb).a;
                            Bundle bundleA = ((ahhw) objBb).a();
                            ahng ahngVar = ahknVar.b;
                            evrr evrrVar = (evrr) ahngVar.gp.b();
                            ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            evsp evspVar = (evsp) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", evsp.a, evrrVar);
                            evspVar.getClass();
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            if (!(eaVar instanceof tpq)) {
                                throw new IllegalStateException(a.M(eaVar, tpx.class));
                            }
                            tpq tpqVar = (tpq) eaVar;
                            ahjr ahjrVar = ((ahhw) objBb).b;
                            efwo efwoVar = (efwo) ahjrVar.b.b();
                            eils eilsVar = (eils) ((ahhw) objBb).i.b();
                            tpi tpiVar = (tpi) ahjrVar.p.b();
                            ahnh ahnhVar = ahknVar.a;
                            eyik eyikVar = ahnhVar.Uk;
                            eyik eyikVar2 = ahjrVar.oU;
                            eigp eigpVar = (eigp) ahjrVar.ac.b();
                            ehac ehacVar = (ehac) ((ahhw) objBb).g.b();
                            this.aj = new tpx(evspVar, tpqVar, efwoVar, eilsVar, tpiVar, eyikVar, eyikVar2, eigpVar, ehacVar, ahnhVar.Qa, ahnhVar.PT, ((ahhw) objBb).f, ahngVar.R(), (aoot) ahnhVar.HL.b());
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.an, this.al));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lvj lvjVar = this.E;
            if (lvjVar instanceof eifl) {
                eics eicsVar = this.an;
                if (eicsVar.a == null) {
                    eicsVar.e(((eifl) lvjVar).bf(), true);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.aiif, defpackage.ozm
    public final void gh(Bundle bundle, String str) {
        super.gh(bundle, str);
        final tpx tpxVarH = H();
        tpq tpqVar = tpxVarH.d;
        tpqVar.f(R.xml.fi_account_preferences);
        tpqVar.e().ag();
        Preference preferenceA = tpqVar.a(tpqVar.Y(R.string.fi_account_login_pref_key));
        preferenceA.getClass();
        tpxVarH.q = preferenceA;
        tpxVarH.q.o = new eilr(tpxVarH.f, "FiSettingsFragmentPeer:clickDownloadOverWifiPreference", new ozb() { // from class: tpr
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                einf.f(new tsd(), tpxVarH.d);
                return false;
            }
        });
        if (tpxVarH.e.a() != -1) {
            appb appbVar = tpxVarH.o;
            if (!appbVar.a()) {
                tpxVarH.q.G(false);
            }
            ehac ehacVar = tpxVarH.j;
            final tpi tpiVar = tpxVarH.g;
            ehacVar.a(new egys(tpiVar.d, new eopk() { // from class: tpg
                @Override // defpackage.eopk
                public final eopy a(eopt eoptVar) {
                    return new eopy(tpiVar.c());
                }
            }, "FI_ACCOUNT_DATA_SERVICE"), tpxVarH.new a());
            if (!tpxVarH.p.a() && appbVar.a()) {
                tpxVarH.d();
            }
        }
        Preference preferenceA2 = tpqVar.a(tpqVar.Y(R.string.fi_account_learn_more_pref_key));
        preferenceA2.getClass();
        preferenceA2.N(true);
        preferenceA2.M(dajs.c(tpqVar.z(), tpxVarH.h, tpxVarH.i, R.string.fi_account_login_learn_more, null, null));
        preferenceA2.o = new ozb() { // from class: tps
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                tpx tpxVar = tpxVarH;
                ((aijh) tpxVar.h.b()).t(tpxVar.d.G(), (String) tpx.b.e());
                return true;
            }
        };
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void h(Bundle bundle) {
        this.an.k();
        try {
            super.h(bundle);
            tpx tpxVarH = H();
            ((egpr) tpxVarH.m.b()).j(tpxVarH.n);
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.an.b();
        try {
            super.i();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.an.a();
        try {
            super.j();
            this.ao = true;
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void k(Bundle bundle) {
        this.an.k();
        try {
            super.k(bundle);
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void l() {
        this.an.k();
        try {
            super.l();
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void m() {
        this.an.k();
        try {
            super.m();
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

    @Override // defpackage.tsf, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import cuwp.a;
import defpackage.eyhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvm extends cuqn implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cuwp ak;
    private Context al;
    private boolean ao;
    public final lvn aj = new lvn(this);
    private final eics an = new eics(this);

    @Deprecated
    public cuvm() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cuwp.class;
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
        return this.aj;
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

    @Override // defpackage.cuqn
    protected final /* synthetic */ eyhj aZ() {
        return new ehog(this);
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
            cuwp cuwpVarH = H();
            if (i == 1038 && i2 == -1) {
                cuwpVarH.i(ckbz.TOGGLE_STATE_ENABLED);
                cuwpVarH.h();
                ((cjzq) cuwpVarH.S.b()).l();
            }
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

    @Override // defpackage.cuqn, defpackage.ecdm, defpackage.ea
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
            cuwp cuwpVarH = H();
            SharedPreferences sharedPreferencesQ = cuwpVarH.s.e().q();
            sharedPreferencesQ.getClass();
            sharedPreferencesQ.unregisterOnSharedPreferenceChangeListener(cuwpVarH);
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
            cuwp cuwpVarH = H();
            if (((apwv) cuwpVarH.T.b()).a() || ((arwz) cuwpVarH.X.b()).a()) {
                if (!cuwpVarH.j()) {
                    SharedPreferences sharedPreferencesQ = cuwpVarH.s.e().q();
                    sharedPreferencesQ.getClass();
                    sharedPreferencesQ.registerOnSharedPreferenceChangeListener(cuwpVarH);
                }
            } else if (cuwpVarH.k(((chza) ((cqbm) cuwpVarH.w.b()).a()).d())) {
                SharedPreferences sharedPreferencesQ2 = cuwpVarH.s.e().q();
                sharedPreferencesQ2.getClass();
                sharedPreferencesQ2.registerOnSharedPreferenceChangeListener(cuwpVarH);
            }
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

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.al == null) {
            this.al = new ehnz(this, super.z());
        }
        return this.al;
    }

    @Override // defpackage.ehlg
    /* renamed from: be, reason: merged with bridge method [inline-methods] */
    public final cuwp H() {
        cuwp cuwpVar = this.ak;
        if (cuwpVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cuwpVar;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r51v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r51v1 */
    /* JADX WARN: Type inference failed for: r51v2, types: [eieu] */
    @Override // defpackage.cuqn, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ak == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2", 94, cuvm.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2", 99, cuvm.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            try {
                                if (!(eaVar instanceof cuvm)) {
                                    throw new IllegalStateException(a.M(eaVar, cuwp.class));
                                }
                                cuvm cuvmVar = (cuvm) eaVar;
                                ahkn ahknVar = ((ahib) objBb).a;
                                ahnh ahnhVar = ahknVar.a;
                                eyik eyikVar = ahnhVar.uu;
                                eyik eyikVar2 = ahnhVar.pR;
                                eyik eyikVar3 = ahnhVar.Ns;
                                eyik eyikVar4 = ahnhVar.Dt;
                                eyik eyikVar5 = ahnhVar.Uk;
                                ahho ahhoVar = ((ahib) objBb).b;
                                eyik eyikVar6 = ahhoVar.bA;
                                eyik eyikVar7 = ahnhVar.rY;
                                eyik eyikVar8 = ahnhVar.c;
                                eyik eyikVar9 = ((ahib) objBb).c.f;
                                eyik eyikVar10 = ((ahib) objBb).aw;
                                eyik eyikVar11 = ahknVar.aT;
                                eyik eyikVar12 = ahhoVar.ce;
                                eyik eyikVar13 = ((ahib) objBb).ax;
                                eyik eyikVar14 = ahnhVar.wc;
                                eyik eyikVar15 = ((ahib) objBb).k;
                                eyik eyikVar16 = ((ahib) objBb).f;
                                eyik eyikVar17 = ((ahib) objBb).ay;
                                eyik eyikVar18 = ((ahib) objBb).az;
                                eyik eyikVar19 = ahknVar.aI;
                                eyik eyikVar20 = ahknVar.ot;
                                eyik eyikVar21 = ((ahib) objBb).l;
                                eyik eyikVar22 = ahknVar.aQ;
                                eyik eyikVar23 = ahnhVar.Qa;
                                eyik eyikVar24 = ((ahib) objBb).aA;
                                eyik eyikVar25 = ((ahib) objBb).am;
                                eyik eyikVar26 = ahnhVar.HN;
                                eyik eyikVar27 = ahknVar.oY;
                                eyik eyikVar28 = ((ahib) objBb).aB;
                                ahng ahngVar = ahknVar.b;
                                this.ak = new cuwp(cuvmVar, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, eyikVar8, eyikVar9, eyikVar10, eyikVar11, eyikVar12, eyikVar13, eyikVar14, eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, eyikVar27, eyikVar28, ahngVar.jn, ahnhVar.PT, ahnhVar.ri, ahnhVar.HL, ahknVar.cD, ahnhVar.PN, ahnhVar.PU, ahngVar.x, ahnhVar.ZG, ahknVar.cI, ahnhVar.yq, ahnhVar.Uy, ahngVar.kK, ((ahib) objBb).aC, ahngVar.ov);
                                eieuVarG2.close();
                                this.Z.c(new ehns(this.an, this.aj));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    context.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            context = eieuVarG2;
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
        cuwp cuwpVarH = H();
        eg egVarG = cuwpVarH.s.G();
        if (egVarG == null || !((cukm) cuwpVarH.y.b()).c(egVarG)) {
            ((ehac) cuwpVarH.D.b()).a(((aurx) cuwpVarH.C.b()).e(), cuwpVarH.ad);
            cuwpVarH.P.c(bundle);
            cuwpVarH.Q.c(bundle);
            cuwpVarH.h = ((czqs) cuwpVarH.A.b()).a(emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST, 2);
            cuwpVarH.d();
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.an.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
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
            final cuwp cuwpVarH = H();
            fcsu fcsuVar = cuwpVarH.E;
            ((ehbb) fcsuVar.b()).g(R.id.rcs_default_on_consent_subscription_id, new czre((czrg) cuwpVarH.O.b()), new cuwq(cuwpVarH));
            ehbb ehbbVar = (ehbb) fcsuVar.b();
            cjzq cjzqVar = (cjzq) cuwpVarH.S.b();
            cuvm cuvmVar = cuwpVarH.s;
            ehbbVar.g(R.id.rcs_settings_subscription_id, cjzqVar.d(cuvmVar.aj), cuwpVarH.aa);
            fcsu fcsuVar2 = cuwpVarH.I;
            ((egpr) fcsuVar2.b()).j(cuwpVarH.ae);
            cuwpVarH.M = cuwpVarH.new a();
            ((egpr) fcsuVar2.b()).j(cuwpVarH.M);
            ((egpr) fcsuVar2.b()).j(cuwpVarH.ab);
            ((egpr) fcsuVar2.b()).j(cuwpVarH.ac);
            ((egpr) fcsuVar2.b()).j(cuwpVarH.af);
            cuwpVarH.ag = cuvmVar.O(new aeo(), new adi() { // from class: cuvy
                @Override // defpackage.adi
                public final void a(Object obj) {
                    if (((adh) obj).a == -1) {
                        cuwpVarH.c();
                    }
                }
            });
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
            cuwp cuwpVarH = H();
            cuwpVarH.P.a(bundle);
            cuwpVarH.Q.a(bundle);
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

    @Override // defpackage.cuqn, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;
import cunu.a;
import cunu.c;
import cunu.d;
import defpackage.ehol;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cumg extends cvbv implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cunu aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private boolean ao;

    @Deprecated
    public cumg() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cunu.class;
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

    @Override // defpackage.ozm, defpackage.ozx
    public final boolean aW(Preference preference) {
        cunu cunuVarH = H();
        if (!Objects.equals(preference.s, cunuVarH.R)) {
            return super.aW(preference);
        }
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
        String strF = cunuVarH.h.f(cunuVarH.R, null);
        if (strF == null) {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
        } else if (strF.length() == 0) {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", (Parcelable) null);
        } else {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Uri.parse(strF));
        }
        cunuVarH.f.startActivityForResult(intent, 1003);
        return true;
    }

    @Override // defpackage.ehlg
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final cunu H() {
        cunu cunuVar = this.aj;
        if (cunuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cunuVar;
    }

    @Override // defpackage.cvbv
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
            cunu cunuVarH = H();
            if (i == 1001) {
                ((ajhd) cunuVarH.j.b()).ac(null, cunuVarH.i.f());
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

    @Override // defpackage.cvbv, defpackage.ecdm, defpackage.ea
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
            cunu cunuVarH = H();
            cunuVarH.d();
            Optional optional = cunuVarH.U;
            if (optional == null || optional.isEmpty()) {
                cunu.a.p("smartsParentPreference was not found");
            } else if (!((crlk) cunuVarH.k.b()).e()) {
                cunuVarH.f.e().af((Preference) cunuVarH.U.get());
            }
            crqx crqxVar = (crqx) cunuVarH.l.b();
            if (crqxVar.f()) {
                ((PreferenceScreen) cunuVarH.V.get()).n(cunuVarH.f.Y(R.string.rich_cards_settings_enable_all_title));
            } else if (crqxVar.h()) {
                ((PreferenceScreen) cunuVarH.V.get()).n(cunuVarH.f.Y(R.string.rich_cards_settings_enable_link_preview_title));
            } else {
                ((PreferenceScreen) cunuVarH.V.get()).n(cunuVarH.f.Y(R.string.link_preview_enabled_pref_summary_off));
            }
            Optional optional2 = cunuVarH.t;
            optional2.isPresent();
            optional2.get();
            if (!craf.d) {
                Optional optional3 = cunuVarH.W;
                if (optional3 == null || optional3.isEmpty()) {
                    cunu.a.p("androidBubblePreference was not found");
                } else {
                    cunuVarH.f.e().af((Preference) cunuVarH.W.get());
                }
            }
            Optional optional4 = cunuVarH.X;
            if (optional4 == null || optional4.isEmpty()) {
                cunu.a.p("rcsPreference was not found");
            } else {
                ((PreferenceScreen) cunuVarH.X.get()).t = ((aijh) cunuVarH.g.b()).n(cunuVarH.f.e().j);
            }
            if (!((Boolean) crbf.D.e()).booleanValue()) {
                Optional optional5 = cunuVarH.Y;
                if (optional5 == null || optional5.isEmpty()) {
                    cunu.a.p("federatedLearningParentPreference was not found");
                } else {
                    cunuVarH.f.e().af((Preference) cunuVarH.Y.get());
                }
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r43v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r43v1 */
    /* JADX WARN: Type inference failed for: r43v2, types: [eieu] */
    @Override // defpackage.cvbv, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragment", 98, cumg.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragment", 103, cumg.class, "CreatePeer");
                        try {
                            ahjr ahjrVar = ((ahhw) objBb).b;
                            efwo efwoVar = (efwo) ahjrVar.b.b();
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            try {
                                if (!(eaVar instanceof cumg)) {
                                    throw new IllegalStateException(a.M(eaVar, cunu.class));
                                }
                                cumg cumgVar = (cumg) eaVar;
                                ahkn ahknVar = ((ahhw) objBb).a;
                                ahnh ahnhVar = ahknVar.a;
                                eyik eyikVar = ahnhVar.Uk;
                                crqv crqvVar = (crqv) ahknVar.aT.b();
                                cqzr cqzrVar = (cqzr) ahnhVar.pd.b();
                                eyik eyikVar2 = ahnhVar.yw;
                                crnf crnfVar = (crnf) ahnhVar.pg.b();
                                crmx crmxVar = (crmx) ahnhVar.pB.b();
                                eyik eyikVar3 = ahnhVar.BI;
                                eyik eyikVar4 = ahknVar.gF;
                                Optional optional = (Optional) ahknVar.mC.b();
                                cqjy cqjyVar = (cqjy) ahnhVar.Ci.b();
                                eyik eyikVar5 = ((ahhw) objBb).dC;
                                ehac ehacVar = (ehac) ((ahhw) objBb).g.b();
                                ehbb ehbbVar = (ehbb) ((ahhw) objBb).n.b();
                                egpr egprVar = (egpr) ((ahhw) objBb).f.b();
                                Optional optionalOf = Optional.of(ahknVar.cp());
                                Optional optionalOf2 = Optional.of(new cgbc());
                                eils eilsVar = (eils) ((ahhw) objBb).i.b();
                                crpp crppVar = (crpp) ahknVar.aU.b();
                                eyik eyikVar6 = ((ahhw) objBb).dD;
                                eyik eyikVar7 = ahjrVar.dx;
                                eyik eyikVar8 = ahnhVar.c;
                                Optional.of(eyie.a(((ahhw) objBb).dE));
                                Optional.of(((ahhw) objBb).h());
                                eygg eyggVarA = eyie.a(((ahhw) objBb).bd);
                                eyik eyikVar9 = ahnhVar.pG;
                                this.aj = new cunu(efwoVar, cumgVar, eyikVar, crqvVar, cqzrVar, eyikVar2, crnfVar, crmxVar, eyikVar3, eyikVar4, optional, cqjyVar, eyikVar5, ehacVar, ehbbVar, egprVar, optionalOf, optionalOf2, eilsVar, crppVar, eyikVar6, eyikVar7, eyikVar8, eyggVarA, eyikVar9, Optional.empty(), Optional.of(ahnhVar.r()), ahnhVar.rS(), ((ahhw) objBb).dF, ((ahhw) objBb).bZ, ahnhVar.zv, ahnhVar.qj, ((ahhw) objBb).bC, (Optional) ((ahhw) objBb).dG.b(), (Optional) ahknVar.cK.b(), ahknVar.b.ai());
                                eieuVarG2.close();
                                this.aj.ai = this;
                                this.Z.c(new ehns(this.an, this.al));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x00c2  */
    @Override // defpackage.aiif, defpackage.ozm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gh(android.os.Bundle r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cumg.gh(android.os.Bundle, java.lang.String):void");
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
        fcsu fcsuVar;
        this.an.k();
        try {
            super.h(bundle);
            final cunu cunuVarH = H();
            cunuVarH.s.ifPresent(new Consumer() { // from class: cumu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    egyi egyiVarA = ((clfl) obj).a();
                    egzr egzrVar = egzr.FEW_SECONDS;
                    cunu cunuVar = cunuVarH;
                    cunuVar.p.b(egyiVarA, egzrVar, cunuVar.new c());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cunuVarH.N = cunuVarH.new d();
            egpr egprVar = cunuVarH.r;
            egprVar.j(cunuVarH.N);
            cunuVarH.O = cunuVarH.new a();
            egprVar.j(cunuVarH.O);
            cunuVarH.af = cunuVarH.b(cunuVarH.f.Y(R.string.swipe_action_pref_key));
            if (!cunuVarH.af.isEmpty() && (fcsuVar = cunuVarH.G) != null) {
                cunuVarH.q.g(R.id.swipe_action_settings_summary_subscription_id, new cvbj((cvbm) fcsuVar.b()), new ehay() { // from class: cunj
                    @Override // defpackage.ehay
                    public final /* synthetic */ void a(Throwable th) {
                        ehax.a(th);
                    }

                    @Override // defpackage.ehay
                    public final void b(Object obj) {
                        Optional optional = (Optional) obj;
                        if (optional.isPresent()) {
                            cunu cunuVar = cunuVarH;
                            Preference preference = (Preference) cunuVar.af.get();
                            Context contextZ = cunuVar.f.z();
                            contextZ.getClass();
                            cvbc cvbcVar = (cvbc) optional.get();
                            cvbb cvbbVarB = cvbb.b(cvbcVar.c);
                            if (cvbbVarB == null) {
                                cvbbVarB = cvbb.ARCHIVE;
                            }
                            cvbb cvbbVarB2 = cvbb.b(cvbcVar.d);
                            if (cvbbVarB2 == null) {
                                cvbbVarB2 = cvbb.ARCHIVE;
                            }
                            String strA = cvbm.a(contextZ, cvbbVarB2);
                            String strA2 = cvbm.a(contextZ, cvbbVarB);
                            preference.n(contextZ.getString(R.string.swipe_actions_summary_right, strA) + "\n" + contextZ.getString(R.string.swipe_actions_summary_left, strA2));
                        }
                    }
                });
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
            H().e.a(bundle);
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
            cunu cunuVarH = H();
            cunuVarH.f.e().q().registerOnSharedPreferenceChangeListener(cunuVarH);
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
            cunu cunuVarH = H();
            cunuVarH.f.e().q().unregisterOnSharedPreferenceChangeListener(cunuVarH);
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

    @Override // defpackage.cvbv, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

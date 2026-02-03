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
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import cuyf.a;
import cuyf.b;
import cuyf.c;
import cuyf.d;
import defpackage.ehol;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxh extends cvcc implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cuyf aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private boolean ao;

    @Deprecated
    public cuxh() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cuyf.class;
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
    public final cuyf H() {
        cuyf cuyfVar = this.aj;
        if (cuyfVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cuyfVar;
    }

    @Override // defpackage.cvcc
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

    @Override // defpackage.cvcc, defpackage.ecdm, defpackage.ea
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
        H();
        return false;
    }

    @Override // defpackage.cvcc, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/appsettings/RichCardsSettingsFragment", 97, cuxh.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/appsettings/RichCardsSettingsFragment", 102, cuxh.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            if (!(eaVar instanceof cuxh)) {
                                throw new IllegalStateException(a.M(eaVar, cuyf.class));
                            }
                            this.aj = new cuyf((cuxh) eaVar, ((ahhw) objBb).dP, (efwo) ((ahhw) objBb).b.b.b(), ((ahhw) objBb).g, ((ahhw) objBb).f);
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
        final cuyf cuyfVarH = H();
        ozm ozmVar = cuyfVarH.e;
        ozmVar.b.f("bugle");
        ozmVar.f(R.xml.rich_cards_preferences);
        ozmVar.e().ag();
        cuyfVarH.g = Optional.ofNullable((TwoStatePreference) ozmVar.a(ozmVar.Y(R.string.link_preview_enabled_pref_key)));
        cuyfVarH.i = Optional.ofNullable((TwoStatePreference) ozmVar.a(ozmVar.Y(R.string.rich_cards_settings_enable_all_pref_key)));
        cuyfVarH.h = Optional.ofNullable((TwoStatePreference) ozmVar.a(ozmVar.Y(R.string.link_preview_wifi_only_pref_key)));
        ((TwoStatePreference) cuyfVarH.g.get()).N(false);
        ((TwoStatePreference) cuyfVarH.i.get()).N(false);
        ((TwoStatePreference) cuyfVarH.h.get()).N(false);
        ehac ehacVar = (ehac) cuyfVarH.j.b();
        final afhj afhjVar = (afhj) cuyfVarH.f.b();
        final efwo efwoVar = cuyfVarH.a;
        ehacVar.b(new egys(afhjVar.c, new eopk() { // from class: afgu
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                final afhj afhjVar2 = afhjVar;
                final eiju eijuVarA = afhjVar2.g.a(efwoVar);
                Callable callable = new Callable() { // from class: afgt
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(afhjVar2.e.f());
                    }
                };
                eosc eoscVar = afhjVar2.d;
                final eiju eijuVarG = eijx.g(callable, eoscVar);
                final eiju eijuVarG2 = eijx.g(new Callable() { // from class: afgy
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(afhjVar2.e.k());
                    }
                }, eoscVar);
                return new eopy(eijx.m(eijuVarA, eijuVarG, eijuVarG2).a(new Callable() { // from class: afgz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        afgl afglVar = new afgl();
                        afglVar.b(false);
                        afglVar.a(false);
                        afglVar.c(false);
                        afglVar.b(((Boolean) eork.q(eijuVarA)).booleanValue());
                        afglVar.a(((Boolean) eork.q(eijuVarG)).booleanValue());
                        afglVar.c(((Boolean) eork.q(eijuVarG2)).booleanValue());
                        if (afglVar.d == 7) {
                            return new afgm(afglVar.a, afglVar.b, afglVar.c);
                        }
                        StringBuilder sb = new StringBuilder();
                        if ((afglVar.d & 1) == 0) {
                            sb.append(" linkPreviewEnabled");
                        }
                        if ((afglVar.d & 2) == 0) {
                            sb.append(" allRichCardsEnabled");
                        }
                        if ((afglVar.d & 4) == 0) {
                            sb.append(" richCardsWifiOnly");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                }, afhjVar2.f));
            }
        }, "richcardsettings"), egzr.FEW_SECONDS, cuyfVarH.new a());
        cuyfVarH.g.ifPresent(new Consumer() { // from class: cuxj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final cuyf cuyfVar = cuyfVarH;
                ((TwoStatePreference) obj).n = new oza() { // from class: cuxn
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        final boolean zEquals = Boolean.TRUE.equals(obj2);
                        cuyf cuyfVar2 = cuyfVar;
                        egpr egprVar = (egpr) cuyfVar2.k.b();
                        final afhj afhjVar2 = (afhj) cuyfVar2.f.b();
                        eiju eijuVarF = eijx.f(new Runnable() { // from class: afgv
                            @Override // java.lang.Runnable
                            public final void run() {
                                afhj afhjVar3 = afhjVar2;
                                afhjVar3.a.g(afhjVar3.b.getString(R.string.link_preview_enabled_pref_key), zEquals);
                            }
                        }, afhjVar2.d);
                        ejvr ejvrVar = new ejvr() { // from class: afgw
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                afhjVar2.b();
                                return null;
                            }
                        };
                        eosc eoscVar = afhjVar2.f;
                        egprVar.h(egpq.b(eijuVarF.h(ejvrVar, eoscVar).i(new eooz() { // from class: afhg
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return !zEquals ? afhjVar2.a(false) : eijx.e(null);
                            }
                        }, eoscVar)), new egpo(Boolean.valueOf(zEquals)), cuyfVar2.b);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cuyfVarH.i.ifPresent(new Consumer() { // from class: cuxk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final cuyf cuyfVar = cuyfVarH;
                ((TwoStatePreference) obj).n = new oza() { // from class: cuxm
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        boolean zEquals = Boolean.TRUE.equals(obj2);
                        cuyf cuyfVar2 = cuyfVar;
                        ((egpr) cuyfVar2.k.b()).h(egpq.b(((afhj) cuyfVar2.f.b()).a(zEquals)), new egpo(Boolean.valueOf(zEquals)), cuyfVar2.c);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cuyfVarH.h.ifPresent(new Consumer() { // from class: cuxl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final cuyf cuyfVar = cuyfVarH;
                ((TwoStatePreference) obj).n = new oza() { // from class: cuxi
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        final boolean zEquals = Boolean.TRUE.equals(obj2);
                        cuyf cuyfVar2 = cuyfVar;
                        egpr egprVar = (egpr) cuyfVar2.k.b();
                        final afhj afhjVar2 = (afhj) cuyfVar2.f.b();
                        egprVar.h(egpq.b(eijx.f(new Runnable() { // from class: afhe
                            @Override // java.lang.Runnable
                            public final void run() {
                                afhj afhjVar3 = afhjVar2;
                                afhjVar3.a.g(afhjVar3.b.getString(R.string.link_preview_wifi_only_pref_key), zEquals);
                            }
                        }, afhjVar2.d).h(new ejvr() { // from class: afhf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                afhjVar2.b();
                                return null;
                            }
                        }, afhjVar2.f)), new egpo(Boolean.valueOf(zEquals)), cuyfVar2.d);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
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
            cuyf cuyfVarH = H();
            cuyfVarH.b = cuyfVarH.new c();
            fcsu fcsuVar = cuyfVarH.k;
            ((egpr) fcsuVar.b()).j(cuyfVarH.b);
            cuyfVarH.c = cuyfVarH.new b();
            ((egpr) fcsuVar.b()).j(cuyfVarH.c);
            cuyfVarH.d = cuyfVarH.new d();
            ((egpr) fcsuVar.b()).j(cuyfVarH.d);
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

    @Override // defpackage.cvcc, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

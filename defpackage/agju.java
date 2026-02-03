package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import defpackage.eyhq;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agju extends agjs implements ehlg, eyhx, ehlc, ehnw, eifl {
    private agkb aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private boolean ao;

    @Deprecated
    public agju() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return agkb.class;
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

    @Override // defpackage.agjs
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
            agkb agkbVarH = H();
            if (i == 1001 && i2 == -1) {
                agkbVarH.g.ac(agkbVarH.p, agkbVarH.i.f());
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

    @Override // defpackage.agjs, defpackage.ecdm, defpackage.ea
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

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.ak == null) {
            this.ak = new ehnz(this, super.z());
        }
        return this.ak;
    }

    @Override // defpackage.ehlg
    /* renamed from: be, reason: merged with bridge method [inline-methods] */
    public final agkb H() {
        agkb agkbVar = this.aj;
        if (agkbVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return agkbVar;
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

    @Override // defpackage.agjs, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/notifications/settings/NotificationSettingsFragment", 94, agju.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/notifications/settings/NotificationSettingsFragment", 99, agju.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof agju)) {
                                throw new IllegalStateException(a.M(eaVar, agkb.class));
                            }
                            agju agjuVar = (agju) eaVar;
                            ehac ehacVar = (ehac) ((ahib) objBb).k.b();
                            egpr egprVar = (egpr) ((ahib) objBb).l.b();
                            eils eilsVar = (eils) ((ahib) objBb).am.b();
                            ahkn ahknVar = ((ahib) objBb).a;
                            Optional optionalOf = Optional.of(ahknVar.cp());
                            ahnh ahnhVar = ahknVar.a;
                            this.aj = new agkb(agjuVar, ehacVar, egprVar, eilsVar, optionalOf, (ajhd) ahnhVar.yw.b(), (crac) ahknVar.cC.b(), (cqzr) ahnhVar.pd.b(), (crqx) ahknVar.gF.b(), ((ahib) objBb).ao);
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
        final agkb agkbVarH = H();
        agju agjuVar = agkbVarH.b;
        agjuVar.f(R.xml.notification_preferences);
        agkbVarH.o = agkbVarH.a(R.string.notifications_remind_action_pref_key);
        if (!agkbVarH.o.isEmpty()) {
            if (agkbVarH.f.isEmpty()) {
                agjuVar.e().af((Preference) agkbVarH.o.get());
            } else {
                ((TwoStatePreference) agkbVarH.o.get()).n = new eilq(agkbVarH.e, "Notification Action Setting Changed", new oza() { // from class: agjw
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj) {
                        final boolean zEquals = Boolean.TRUE.equals(obj);
                        agkb agkbVar = agkbVarH;
                        final clfl clflVar = (clfl) agkbVar.f.get();
                        ecjh ecjhVar = clflVar.a;
                        ejvr ejvrVar = new ejvr() { // from class: clfi
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                clfg clfgVar = (clfg) obj2;
                                clff clffVar = (clff) clfgVar.toBuilder();
                                if (!clfgVar.c) {
                                    clffVar.copyOnWrite();
                                    clfg clfgVar2 = (clfg) clffVar.instance;
                                    clfgVar2.b |= 1;
                                    clfgVar2.c = true;
                                }
                                boolean z = zEquals;
                                clffVar.copyOnWrite();
                                clfg clfgVar3 = (clfg) clffVar.instance;
                                clfgVar3.b |= 2;
                                clfgVar3.d = z;
                                return (clfg) clffVar.build();
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        agkbVar.d.h(egpq.b(eiju.g(ecjhVar.b(ejvrVar, eoqgVar)).h(new ejvr() { // from class: clfj
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                Void r4 = (Void) obj2;
                                clflVar.b.a(eijx.e(null), "reminder_settings_data_service");
                                return r4;
                            }
                        }, eoqgVar)), new egpo(Boolean.valueOf(zEquals)), agkbVar.m);
                        agkh agkhVar = (agkh) agkbVar.k.b();
                        int i = true != zEquals ? 3 : 2;
                        fcsu fcsuVar = agkhVar.a;
                        if (((ajjp) fcsuVar.b()).b()) {
                            auvw.m(agkhVar.d, null, new agkg(agkhVar, i, null), 3);
                            return false;
                        }
                        ((ajjp) fcsuVar.b()).a();
                        return false;
                    }
                });
            }
        }
        agkbVarH.a(R.string.notifications_system_settings_pref_key).ifPresent(new Consumer() { // from class: agjv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final agkb agkbVar = agkbVarH;
                ((Preference) obj).o = new eilr(agkbVar.e, "Notification Setting Clicked", new ozb() { // from class: agjx
                    @Override // defpackage.ozb
                    public final boolean a(Preference preference) throws Resources.NotFoundException {
                        agkb agkbVar2 = agkbVar;
                        Resources resourcesB = agkbVar2.b.B();
                        final String string = resourcesB.getString(R.string.notifications_enabled_pref_key);
                        final boolean z = resourcesB.getBoolean(R.bool.notifications_enabled_pref_default);
                        final crqx crqxVar = agkbVar2.j;
                        agkbVar2.d.h(egpq.b(eijx.g(new Callable() { // from class: crqw
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                crqv crqvVar = crqxVar.a;
                                String str2 = string;
                                if (crqvVar.q(str2, z)) {
                                    return null;
                                }
                                crqvVar.g(str2, true);
                                return null;
                            }
                        }, crqxVar.d)), new egpo(null), agkbVar2.n);
                        return true;
                    }
                });
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
            agkb agkbVarH = H();
            Optional optional = agkbVarH.f;
            optional.isPresent();
            agkbVarH.c.b(((clfl) optional.get()).a(), egzr.FEW_SECONDS, agkbVarH.l);
            egpr egprVar = agkbVarH.d;
            egprVar.j(agkbVarH.m);
            egprVar.j(agkbVarH.n);
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

    @Override // defpackage.agjs, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

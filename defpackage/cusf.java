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
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import defpackage.eyhq;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusf extends cuqi implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cust aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private boolean ao;

    @Deprecated
    public cusf() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cust.class;
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

    @Override // defpackage.cuqi
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

    @Override // defpackage.cuqi, defpackage.ecdm, defpackage.ea
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
    public final cust H() {
        cust custVar = this.aj;
        if (custVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return custVar;
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

    @Override // defpackage.cuqi, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/appsettings/NudgeSettingsFragment", 94, cusf.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/appsettings/NudgeSettingsFragment", 99, cusf.class, "CreatePeer");
                        try {
                            eyik eyikVar = ((ahib) objBb).av;
                            eyik eyikVar2 = ((ahib) objBb).k;
                            eyik eyikVar3 = ((ahib) objBb).l;
                            ahnh ahnhVar = ((ahib) objBb).a.a;
                            this.aj = new cust(eyikVar, eyikVar2, eyikVar3, ahnhVar.Se, ahnhVar.Uk);
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
        final cust custVarH = H();
        fcsu fcsuVar = custVarH.d;
        if (((Optional) fcsuVar.b()).isEmpty()) {
            return;
        }
        fcsu fcsuVar2 = custVarH.a;
        ((cusf) fcsuVar2.b()).b.f("bugle");
        ((cusf) fcsuVar2.b()).f(R.xml.nudge_preferences);
        ((cusf) fcsuVar2.b()).e().ag();
        custVarH.f = custVarH.a(R.string.nudge_reply_enabled_pref_key);
        custVarH.g = custVarH.a(R.string.birthday_nudge_enabled_pref_key);
        if (!cust.b()) {
            Optional optional = custVarH.g;
            final PreferenceScreen preferenceScreenE = ((cusf) fcsuVar2.b()).e();
            preferenceScreenE.getClass();
            optional.ifPresent(new Consumer() { // from class: cusi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE.af((SwitchPreferenceCompat) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            custVarH.g = Optional.empty();
        }
        custVarH.f.ifPresent(new Consumer() { // from class: cusj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                fcsu fcsuVar3 = custVarH.a;
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat.M(((cusf) fcsuVar3.b()).B().getString(R.string.nudge_enabled_pref_title));
                switchPreferenceCompat.n(((cusf) fcsuVar3.b()).B().getString(R.string.nudge_enabled_pref_summary));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((ehac) custVarH.b.b()).b(((crkx) ((Optional) fcsuVar.b()).get()).a(), egzr.FEW_SECONDS, custVarH.h);
        custVarH.f.ifPresent(new Consumer() { // from class: cusl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final cust custVar = custVarH;
                ((SwitchPreferenceCompat) obj).n = new oza() { // from class: cush
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        boolean zEquals = Boolean.TRUE.equals(obj2);
                        cust custVar2 = custVar;
                        ((egpr) custVar2.c.b()).h(egpq.b(((crkx) ((Optional) custVar2.d.b()).get()).d(zEquals)), new egpo(Boolean.valueOf(zEquals)), custVar2.i);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        custVarH.g.ifPresent(new Consumer() { // from class: cusm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final cust custVar = custVarH;
                ((SwitchPreferenceCompat) obj).n = new oza() { // from class: cusk
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        boolean zEquals = Boolean.TRUE.equals(obj2);
                        cust custVar2 = custVar;
                        ((egpr) custVar2.c.b()).h(egpq.b(((crkx) ((Optional) custVar2.d.b()).get()).c(zEquals)), new egpo(Boolean.valueOf(zEquals)), custVar2.j);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional optionalA = custVarH.a(R.string.nudge_learn_more_pref_key);
        if (optionalA.isEmpty()) {
            return;
        }
        ((Preference) optionalA.get()).o = new ozb() { // from class: cusg
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                cust custVar = custVarH;
                ((aijh) custVar.e.b()).t(((cusf) custVar.a.b()).fg(), (String) crbf.u.e());
                return true;
            }
        };
        Preference preference = (Preference) optionalA.get();
        String strY = ((cusf) fcsuVar2.b()).Y(R.string.nudge_learn_more_info_text);
        preference.M(dajs.g(((cusf) fcsuVar2.b()).fg(), strY, strY));
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
            cust custVarH = H();
            fcsu fcsuVar = custVarH.c;
            ((egpr) fcsuVar.b()).j(custVarH.i);
            if (cust.b()) {
                ((egpr) fcsuVar.b()).j(custVarH.j);
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

    @Override // defpackage.cuqi, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

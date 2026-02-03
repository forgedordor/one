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
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import defpackage.afds;
import defpackage.eyhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afdp extends afdi implements ehlg, eyhx, ehlc, ehnw, eifl {
    private afds aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private boolean ao;

    @Deprecated
    public afdp() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return afds.class;
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

    @Override // defpackage.afdi
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

    @Override // defpackage.afdi, defpackage.ecdm, defpackage.ea
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
    public final afds H() {
        afds afdsVar = this.aj;
        if (afdsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return afdsVar;
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

    @Override // defpackage.afdi, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/label/settings/MessageOrganizationSettingsFragment", 94, afdp.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/label/settings/MessageOrganizationSettingsFragment", 99, afdp.class, "CreatePeer");
                        try {
                            this.aj = new afds(((ahib) objBb).al, ((ahib) objBb).am, ((ahib) objBb).k, ((ahib) objBb).l, ((ahib) objBb).c.cK, ((ahib) objBb).a.b.jG);
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
        final afds afdsVarH = H();
        cpdt cpdtVar = afdsVarH.h;
        cpdtVar.c(bundle);
        fcsu fcsuVar = afdsVarH.b;
        ((afdp) fcsuVar.b()).f(R.xml.message_organization_preferences);
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) ((afdp) fcsuVar.b()).a(((afdp) fcsuVar.b()).Y(R.string.auto_delete_otps_key));
        switchPreferenceCompat.getClass();
        afdsVarH.i = switchPreferenceCompat;
        afdsVarH.j = new afds.a(afdsVarH.i, cpdtVar.b());
        afdsVarH.k = new afds.b(afdsVarH.i);
        if (((arqk) afdsVarH.g.b()).a()) {
            afdsVarH.i.M(((afdp) fcsuVar.b()).B().getQuantityString(R.plurals.auto_delete_otps_with_description, 24, 24));
            afdsVarH.i.n(((afdp) fcsuVar.b()).Y(R.string.auto_delete_otps_summary_with_description));
        }
        afdsVarH.i.G(false);
        afdsVarH.i.N(false);
        afdsVarH.i.n = new eilq((eils) afdsVarH.c.b(), "MessageOrganizationSettingsFragmentPeer:toggleOtpDeletionEnabled", new oza() { // from class: afdq
            @Override // defpackage.oza
            public final boolean a(Preference preference, Object obj) {
                boolean zEquals = Boolean.TRUE.equals(obj);
                afds afdsVar = afdsVarH;
                egpr egprVar = (egpr) afdsVar.e.b();
                final afdm afdmVar = (afdm) afdsVar.f.b();
                final eiju eijuVarA = afdmVar.e.a(zEquals);
                egprVar.h(egpq.b(eijuVarA.h(new ejvr() { // from class: afdl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        afdmVar.d.a(eijuVarA, "super_sort_settings");
                        return null;
                    }
                }, afdmVar.c)), new egpo(Boolean.valueOf(zEquals)), afdsVar.k);
                return false;
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
            afds afdsVarH = H();
            ((egpr) afdsVarH.e.b()).j(afdsVarH.k);
            ehac ehacVar = (ehac) afdsVarH.d.b();
            final afdm afdmVar = (afdm) afdsVarH.f.b();
            ehacVar.a(new egys(afdmVar.a, new eopk() { // from class: afdj
                @Override // defpackage.eopk
                public final eopy a(eopt eoptVar) {
                    afdm afdmVar2 = afdmVar;
                    return new eopy(afdmVar2.b.a().h(new ejvr() { // from class: afdk
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return new afdf(((Boolean) obj).booleanValue());
                        }
                    }, afdmVar2.c));
                }
            }, "super_sort_settings"), afdsVarH.j);
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
            H().h.a(bundle);
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

    @Override // defpackage.afdi, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

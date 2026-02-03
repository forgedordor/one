package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.AapmSwitchPreference;
import defpackage.eyhq;
import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvev extends cvdu implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cvfm aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private boolean ao;

    @Deprecated
    public cvev() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cvfm.class;
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

    @Override // defpackage.cvdu
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

    @Override // defpackage.cvdu, defpackage.ecdm, defpackage.ea
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
    public final cvfm H() {
        cvfm cvfmVar = this.aj;
        if (cvfmVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cvfmVar;
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

    @Override // defpackage.cvdu, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/appsettings/protectionandsafety/SpamProtectionPreferenceFragment", 94, cvev.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/appsettings/protectionandsafety/SpamProtectionPreferenceFragment", 99, cvev.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof cvev)) {
                                throw new IllegalStateException(a.M(eaVar, cvfm.class));
                            }
                            cvev cvevVar = (cvev) eaVar;
                            ehbb ehbbVar = (ehbb) ((ahib) objBb).f.b();
                            ahnh ahnhVar = ((ahib) objBb).a.a;
                            this.aj = new cvfm(cvevVar, ehbbVar, ahnhVar.BD, ahnhVar.BC, ahnhVar.Uk, ((ahib) objBb).b.bA, ((ahib) objBb).c.aW, (fdjx) ahnhVar.m.b());
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
        final cvfm cvfmVarH = H();
        cvev cvevVar = cvfmVarH.d;
        cvevVar.f(R.xml.spam_protection_preference);
        AapmSwitchPreference aapmSwitchPreferenceC = cvfmVarH.c();
        Preference preferenceA = cvfmVarH.a();
        Preference preferenceB = cvfmVarH.b();
        if (aapmSwitchPreferenceC == null || preferenceA == null || preferenceB == null) {
            return;
        }
        preferenceA.N(false);
        ehbb ehbbVar = cvfmVarH.e;
        ehbbVar.g(R.id.spam_protection_setting_state_registration_id, cvfmVarH.l, cvfmVarH.m);
        aapmSwitchPreferenceC.Z();
        aapmSwitchPreferenceC.n = new oza() { // from class: cvew
            @Override // defpackage.oza
            public final boolean a(Preference preference, Object obj) {
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                cvfm cvfmVar = cvfmVarH;
                auvw.m(cvfmVar.k, null, new cvfl(cvfmVar, obj, null), 3);
                return true;
            }
        };
        aapmSwitchPreferenceC.d = new fdae() { // from class: cvex
            @Override // defpackage.fdae
            public final Object invoke() {
                final cvfm cvfmVar = cvfmVarH;
                cvev cvevVar2 = cvfmVar.d;
                String strB = cpef.b(cvevVar2.Y(R.string.spam_protection_pref_disabled_dialog_body_link));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cvevVar2.Z(R.string.spam_protection_pref_disabled_dialog_body, strB));
                cpef.e(cvevVar2.A(), spannableStringBuilder, strB, new View.OnClickListener() { // from class: cvfa
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws IOException {
                        ((crxn) cvfmVar.g.b()).a();
                    }
                });
                eeji eejiVar = new eeji(cvevVar2.A());
                eejiVar.u(R.string.spam_protection_pref_disabled_dialog_title);
                eejiVar.l(spannableStringBuilder);
                eejiVar.r(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: cvfb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        cczi ccziVar = cvfm.a;
                    }
                });
                final iv ivVarCreate = eejiVar.create();
                ivVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cvfc
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        cczi ccziVar = cvfm.a;
                        TextView textView = (TextView) ivVarCreate.findViewById(android.R.id.message);
                        if (textView == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        eebt.b(textView);
                        eebt.c(textView);
                    }
                });
                ivVarCreate.show();
                return fctx.a;
            }
        };
        String strB = cpef.b(cvevVar.Y(R.string.spam_protection_aapm_summary_pref_link));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cvevVar.Z(R.string.spam_protection_aapm_summary_pref, strB));
        cpef.e(cvevVar.A(), spannableStringBuilder, strB, null);
        preferenceA.M(spannableStringBuilder);
        preferenceA.o = new ozb() { // from class: cvfd
            @Override // defpackage.ozb
            public final boolean a(Preference preference) throws IOException {
                ((crxn) cvfmVarH.g.b()).a();
                return true;
            }
        };
        cvfmVarH.d(preferenceB, ((crxn) cvfmVarH.g.b()).b());
        preferenceB.o = new ozb() { // from class: cvfe
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                String str2 = (String) cvfm.b.e();
                String str3 = (String) cvfm.a.e();
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                    return false;
                }
                cvfm cvfmVar = cvfmVarH;
                if (crtr.d()) {
                    ((aise) cvfmVar.j.b()).c(2, 3);
                }
                if (TextUtils.isEmpty(str2)) {
                    ((aijh) cvfmVar.h.b()).t(cvfmVar.d.G(), str3);
                    return true;
                }
                ((achu) cvfmVar.i.b()).d(cvfmVar.d.G(), str2);
                return true;
            }
        };
        ehbbVar.g(R.id.spam_protection_setting_aapm_registration_id, cvfmVarH.n, cvfmVarH.o);
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

    @Override // defpackage.cvdu, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

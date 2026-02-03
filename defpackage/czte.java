package defpackage;

import android.content.Context;
import android.text.Editable;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.manual.PhoneNumberInputV2Activity;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czte implements czts {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer");
    public static final cqce b = cqce.g("Bugle", "PhoneNumberInputBottomSheetFragmentPeer");
    private final String A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private final fcsu H;
    private final fcsu I;
    public final czsw d;
    public final String e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public ecww r;
    public cztn s;
    public final ejxr t;
    public adj u;
    public egps v;
    public egps w;
    public cztr z;
    public final AtomicReference c = new AtomicReference(Optional.empty());
    public final egps x = new egps<Void, Void>() { // from class: czte.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            czte.b.m("Successfully stored manually entered phone number to disk");
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            czte.b.o("Error while trying to save manually entered phone number to disk", th);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egps y = new egps<String, Void>() { // from class: czte.2
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ((ekrd) ((ekrd) czte.a.h()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer$2", "onSuccess", 250, "PhoneNumberInputBottomSheetFragmentPeer.java")).t("Successfully incremented daily retry counter for simId: %s", dhiz.SIM_ID.c((String) obj));
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            ((ekrd) ((ekrd) ((ekrd) czte.a.j()).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer$2", "onFailure", 257, "PhoneNumberInputBottomSheetFragmentPeer.java")).t("Failed to increment daily retry counter for simId: %s", dhiz.SIM_ID.c((String) obj));
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public czte(czsw czswVar, cztp cztpVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, final fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21) {
        this.d = czswVar;
        this.A = cztpVar.d;
        this.B = fcsuVar;
        this.f = fcsuVar2;
        this.C = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.D = fcsuVar7;
        this.E = fcsuVar8;
        this.j = fcsuVar9;
        this.F = fcsuVar10;
        this.k = fcsuVar11;
        this.t = ejxx.a(new ejxr() { // from class: czsy
            @Override // defpackage.ejxr
            public final Object get() {
                return ((czqs) fcsuVar12.b()).a(emfe.PROVISIONING_UI_TYPE_STREAMLINED_PHONE_NUMBER_INPUT, 4);
            }
        });
        this.G = fcsuVar13;
        this.l = fcsuVar14;
        this.n = fcsuVar15;
        this.m = fcsuVar16;
        this.H = fcsuVar17;
        this.o = fcsuVar18;
        this.p = fcsuVar19;
        this.q = fcsuVar20;
        this.I = fcsuVar21;
        if ((cztpVar.b & 1) == 0) {
            throw new IllegalArgumentException("PhoneNumberInputBottomSheetFragment does not have simId");
        }
        this.e = cztpVar.c;
    }

    final Button a() {
        return (Button) this.d.N().findViewById(R.id.continue_button);
    }

    final EditText b() {
        return (EditText) this.d.N().findViewById(R.id.country_code_text);
    }

    final EditText c() {
        return (EditText) this.d.N().findViewById(R.id.phone_number_text);
    }

    public final alqm d() {
        Editable text = c().getText();
        final ecww ecwwVar = this.r;
        return (text == null || ecwwVar == null) ? ((alrj) this.H.b()).f() : ((alrj) this.H.b()).c(text.toString(), new ejxr() { // from class: czta
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(ecwwVar.c);
            }
        });
    }

    public final cztn e() {
        if (this.r != null) {
            this.s = new cztn(this, this.r.c);
        } else {
            this.s = new cztn(this);
        }
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ecww f() {
        /*
            r4 = this;
            ecww r0 = r4.r
            if (r0 != 0) goto La8
            fcsu r0 = r4.f
            java.lang.Object r0 = r0.b()
            crqv r0 = (defpackage.crqv) r0
            java.lang.String r1 = "manual_msisdn_entered_country_code"
            byte[] r0 = r0.r(r1)
            r1 = 0
            if (r0 == 0) goto L26
            ecww r2 = defpackage.ecww.a     // Catch: defpackage.evtj -> L1e
            evsn r0 = defpackage.evsn.parseFrom(r2, r0)     // Catch: defpackage.evtj -> L1e
            ecww r0 = (defpackage.ecww) r0     // Catch: defpackage.evtj -> L1e
            goto L27
        L1e:
            r0 = move-exception
            cqce r2 = defpackage.czte.b
            java.lang.String r3 = "Not able to parse country code from SharedPrefs"
            r2.s(r3, r0)
        L26:
            r0 = r1
        L27:
            if (r0 != 0) goto La8
            czsw r0 = r4.d
            eg r2 = r0.fg()
            java.lang.String r3 = "phone"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L45
            java.lang.String r2 = r2.getSimCountryIso()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L45
            r1 = r2
            goto L61
        L45:
            android.content.Context r0 = r0.A()
            java.util.Locale r0 = defpackage.craf.c(r0)
            if (r0 != 0) goto L50
            goto L61
        L50:
            java.lang.String r0 = r0.getCountry()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L5b
            goto L61
        L5b:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toUpperCase(r1)
        L61:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L6a
            ecww r0 = defpackage.ecww.a
            return r0
        L6a:
            java.lang.String r0 = defpackage.ejuf.d(r1)
            fcsu r1 = r4.B
            java.lang.Object r1 = r1.b()
            crmx r1 = (defpackage.crmx) r1
            crnc r1 = r1.c(r0)
            boolean r2 = r1.b()
            if (r2 != 0) goto La6
            ecww r2 = defpackage.ecww.a
            evsf r2 = r2.createBuilder()
            ecwv r2 = (defpackage.ecwv) r2
            int r1 = r1.a
            r2.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r3 = r2.instance
            ecww r3 = (defpackage.ecww) r3
            r3.d = r1
            r2.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r2.instance
            ecww r1 = (defpackage.ecww) r1
            r0.getClass()
            r1.c = r0
            evsn r0 = r2.build()
            ecww r0 = (defpackage.ecww) r0
            return r0
        La6:
            ecww r0 = defpackage.ecww.a
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czte.f():ecww");
    }

    public final String g() {
        Editable text = c().getText();
        ecww ecwwVar = this.r;
        return (text == null || ecwwVar == null) ? "" : ((crmx) this.B.b()).v(text.toString(), ecwwVar.c);
    }

    public final String h() {
        cczv cczvVar = alvx.a;
        return ((Boolean) new alvk().get()).booleanValue() ? ejwk.b(d().p(true)) : g();
    }

    public final void i(int i) {
        if (o()) {
            czsw czswVar = this.d;
            czswVar.fg().setResult(i);
            czswVar.fg().finish();
        }
    }

    public final void j() {
        ecww ecwwVar = this.r;
        if (ecwwVar == null || ecww.a.equals(ecwwVar)) {
            return;
        }
        b().setText(this.d.fg().getString(R.string.registration_country_code_format, new Object[]{ecwwVar.c, String.valueOf(ecwwVar.d)}));
    }

    public final void k(emfc emfcVar) {
        cjya cjyaVar = (cjya) this.I.b();
        emfe emfeVar = emfe.PROVISIONING_UI_TYPE_STREAMLINED_PHONE_NUMBER_INPUT;
        int iR = r();
        emet emetVar = (emet) emeu.a.createBuilder();
        boolean zQ = q();
        emetVar.copyOnWrite();
        emeu emeuVar = (emeu) emetVar.instance;
        emeuVar.b |= 1;
        emeuVar.c = zQ;
        boolean zP = p();
        emetVar.copyOnWrite();
        emeu emeuVar2 = (emeu) emetVar.instance;
        emeuVar2.b |= 4;
        emeuVar2.d = zP;
        cjyaVar.i(emfeVar, emfcVar, iR, (emeu) emetVar.build(), ((Integer) ((Optional) this.c.get()).orElse(-1)).intValue(), this.e);
    }

    public final void l() {
        czsw czswVar = this.d;
        if (!((AccessibilityManager) czswVar.fg().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            Context contextZ = czswVar.z();
            if (dakm.a(contextZ) > contextZ.getResources().getDimensionPixelSize(R.dimen.extra_small_screen_width_dp)) {
                EditText editTextC = c();
                ((daoe) this.D.b()).f(editTextC.getContext(), editTextC);
                return;
            }
        }
        m(b());
        m(c());
    }

    public final void m(EditText editText) {
        ((daoe) this.D.b()).e(editText.getContext(), editText);
    }

    @Override // defpackage.czts
    public final boolean n() {
        return this.d.aF();
    }

    public final boolean o() {
        try {
            return this.d.fg() instanceof PhoneNumberInputV2Activity;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final boolean p() {
        if (!o() && dfpi.w().equals("phone_number_ui_variant_promo_bottomsheet")) {
            return false;
        }
        fcsu fcsuVar = this.E;
        ((cpdm) fcsuVar.b()).f();
        Optional optionalB = ((cpdm) fcsuVar.b()).b();
        return ((cpdm) fcsuVar.b()).f() && optionalB.isPresent() && ((cogw) this.F.b()).f().toEpochMilli() - ((Date) optionalB.get()).getTime() > Duration.ofDays((long) ((Integer) dfpi.t().a.u.a()).intValue()).toMillis();
    }

    public final boolean q() {
        return ((Boolean) dfpi.t().a.O.a()).booleanValue() || ((crny) this.C.b()).a() >= 2;
    }

    public final int r() {
        return cjrz.b(Integer.parseInt(this.A));
    }

    public final void s(int i) {
        fcsu fcsuVar = this.G;
        cjrw cjrwVarB = ((cjsd) fcsuVar.b()).b(r(), i);
        cjsa cjsaVar = o() ? cjsa.INPUT_FULLSCREEN : cjsa.INPUT_BOTTOMSHEET;
        cjrwVarB.copyOnWrite();
        cjsb cjsbVar = (cjsb) cjrwVarB.instance;
        cjsb cjsbVar2 = cjsb.a;
        cjsbVar.h = cjsaVar.a();
        cjsbVar.b |= 64;
        boolean zQ = q();
        cjrwVarB.copyOnWrite();
        cjsb cjsbVar3 = (cjsb) cjrwVarB.instance;
        cjsbVar3.b |= 8;
        cjsbVar3.f = zQ;
        boolean zP = p();
        cjrwVarB.copyOnWrite();
        cjsb cjsbVar4 = (cjsb) cjrwVarB.instance;
        cjsbVar4.b |= 32;
        cjsbVar4.g = zP;
        cjsb cjsbVarBuild = cjrwVarB.build();
        ((egpr) this.k.b()).h(egpq.b(((cjsd) fcsuVar.b()).a(this.e, cjsbVarBuild)), egpo.a(cjsbVarBuild), this.v);
    }

    /* compiled from: PG */
    final class a implements egzv<Integer> {
        public a() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            czte.b.s("GetRepromptCountCallback exception", th);
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            Integer num = (Integer) obj;
            czte czteVar = czte.this;
            if (((Optional) czteVar.c.getAndSet(Optional.of(Integer.valueOf(czteVar.r() == 3 ? num.intValue() + 1 : num.intValue())))).isEmpty() && czteVar.d.aI()) {
                czteVar.k(emfc.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_SEEN);
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    }
}

package defpackage;

import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afds {
    public static final cqce a = cqce.g("BugleMessageOrg", "MessageOrganizationSettingsFragmentPeer");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final cpdt h;
    public SwitchPreferenceCompat i;
    public a j;
    public b k;

    public afds(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        final cczi ccziVar = agnl.a;
        ccziVar.getClass();
        this.h = new cpdt("enableOtpAutoDeleteFlag", new fdae() { // from class: afdr
            @Override // defpackage.fdae
            public final Object invoke() {
                return (Boolean) ccziVar.e();
            }
        });
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
    }

    /* compiled from: PG */
    final class a implements egzv<afdo> {
        private final SwitchPreferenceCompat a;
        private final boolean b;

        public a(SwitchPreferenceCompat switchPreferenceCompat, boolean z) {
            this.a = switchPreferenceCompat;
            this.b = z;
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cqbd cqbdVarE = afds.a.e();
            cqbdVarE.v("Error fetching message organization settings data");
            cqbdVarE.s(th);
            if (!this.b) {
                this.a.N(false);
                return;
            }
            SwitchPreferenceCompat switchPreferenceCompat = this.a;
            switchPreferenceCompat.G(false);
            switchPreferenceCompat.N(true);
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            afdo afdoVar = (afdo) obj;
            cqbd cqbdVarD = afds.a.d();
            cqbdVarD.v("Fetching message organization settings");
            cqbdVarD.B("Otp auto-delete enabled", afdoVar.a());
            cqbdVarD.r();
            if (!this.b) {
                this.a.N(false);
                return;
            }
            SwitchPreferenceCompat switchPreferenceCompat = this.a;
            switchPreferenceCompat.k(afdoVar.a());
            switchPreferenceCompat.N(true);
            switchPreferenceCompat.G(true);
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    }

    /* compiled from: PG */
    final class b implements egps<Boolean, Void> {
        private final SwitchPreferenceCompat a;

        public b(SwitchPreferenceCompat switchPreferenceCompat) {
            this.a = switchPreferenceCompat;
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            cqbd cqbdVarE = afds.a.e();
            cqbdVarE.v("Error enabling otp auto-delete");
            cqbdVarE.s(th);
            this.a.k(!((Boolean) obj).booleanValue());
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }
}

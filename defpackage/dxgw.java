package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxgw extends dxgy {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    private final String j;

    public dxgw(String str, String str2, String str3, long j, String str4, String str5, boolean z, int i, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.j = str4;
        this.e = str5;
        this.f = z;
        this.g = i;
        this.h = z2;
        this.i = z3;
    }

    @Override // defpackage.dxgy
    public final int a() {
        return this.g;
    }

    @Override // defpackage.dxgy
    public final long b() {
        return this.d;
    }

    @Override // defpackage.dxgy
    public final String c() {
        return this.e;
    }

    @Override // defpackage.dxgy
    public final String d() {
        return this.a;
    }

    @Override // defpackage.dxgy
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxgy) {
            dxgy dxgyVar = (dxgy) obj;
            if (this.a.equals(dxgyVar.d())) {
                dxgyVar.n();
                String str3 = this.b;
                if (str3 != null ? str3.equals(dxgyVar.f()) : dxgyVar.f() == null) {
                    dxgyVar.r();
                    dxgyVar.o();
                    dxgyVar.u();
                    if (this.c.equals(dxgyVar.e()) && this.d == dxgyVar.b() && ((str = this.j) != null ? str.equals(dxgyVar.g()) : dxgyVar.g() == null) && ((str2 = this.e) != null ? str2.equals(dxgyVar.c()) : dxgyVar.c() == null)) {
                        dxgyVar.m();
                        dxgyVar.l();
                        dxgyVar.s();
                        if (this.f == dxgyVar.j()) {
                            dxgyVar.q();
                            dxgyVar.p();
                            dxgyVar.t();
                            if (this.g == dxgyVar.a() && this.h == dxgyVar.h() && this.i == dxgyVar.i()) {
                                dxgyVar.k();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dxgy
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dxgy
    public final String g() {
        return this.j;
    }

    @Override // defpackage.dxgy
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((((((((iHashCode * (-721379959)) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ 1) * 583896283) ^ this.c.hashCode()) * 1000003) ^ ((int) this.d)) * 1000003;
        String str2 = this.j;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        return ((((((((((((((((iHashCode3 ^ (str3 != null ? str3.hashCode() : 0)) * 583896283) ^ 1237) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ 1237) * (-721379959)) ^ 1237) * 1000003) ^ this.g) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    @Override // defpackage.dxgy
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.dxgy
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        return "GnpConfig{clientId=" + this.a + ", selectionTokens=null, gcmSenderProjectId=" + this.b + ", defaultEnvironment=PRODUCTION, systemTrayNotificationConfig=null, inAppNotificationConfig=null, deviceName=" + this.c + ", registrationStalenessTimeMs=" + this.d + ", scheduledTaskService=" + this.j + ", apiKey=" + this.e + ", jobSchedulerAllowedIDsRange=null, firebaseOptions=null, disableEntrypoints=false, useDefaultFirebaseApp=" + this.f + ", useFirebaseReceiver=false, timeToLiveDays=null, enableEndToEndEncryption=false, periodRegistrationIntervalDays=" + this.g + ", enableGrowthKitIfExists=" + this.h + ", enableInAppPushFlow=" + this.i + ", allowedFromEmbargoedCountries=false}";
    }

    @Override // defpackage.dxgy
    public final void k() {
    }

    @Override // defpackage.dxgy
    public final void l() {
    }

    @Override // defpackage.dxgy
    public final void m() {
    }

    @Override // defpackage.dxgy
    public final void n() {
    }

    @Override // defpackage.dxgy
    public final void o() {
    }

    @Override // defpackage.dxgy
    public final void p() {
    }

    @Override // defpackage.dxgy
    public final void q() {
    }

    @Override // defpackage.dxgy
    public final void r() {
    }

    @Override // defpackage.dxgy
    public final void s() {
    }

    @Override // defpackage.dxgy
    public final void t() {
    }

    @Override // defpackage.dxgy
    public final void u() {
    }
}

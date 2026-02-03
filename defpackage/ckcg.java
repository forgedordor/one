package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckcg {
    public final boolean a;
    public final dggn b;
    public final int c;
    public final String d;
    public final String e;
    public final enwr f;
    public final int g;
    public final int h;
    public final evvp i;
    public final Optional j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final int v;
    private final boolean w;

    public ckcg(boolean z, dggn dggnVar, int i, String str, String str2, enwr enwrVar, int i2, int i3, evvp evvpVar, Optional optional, boolean z2, boolean z3, int i4, String str3, boolean z4, boolean z5, String str4, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5) {
        dggnVar.getClass();
        evvpVar.getClass();
        if (i4 != 0) {
            str3.getClass();
            str4.getClass();
            if (i5 != 0) {
                this.a = z;
                this.b = dggnVar;
                this.c = i;
                this.d = str;
                this.e = str2;
                this.f = enwrVar;
                this.g = i2;
                this.h = i3;
                this.i = evvpVar;
                this.j = optional;
                this.k = z2;
                this.w = z3;
                this.u = i4;
                this.l = str3;
                this.m = z4;
                this.n = z5;
                this.o = str4;
                this.p = z6;
                this.q = z7;
                this.r = z8;
                this.s = z9;
                this.t = z10;
                this.v = i5;
                return;
            }
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckcg)) {
            return false;
        }
        ckcg ckcgVar = (ckcg) obj;
        return this.a == ckcgVar.a && fdbq.f(this.b, ckcgVar.b) && this.c == ckcgVar.c && fdbq.f(this.d, ckcgVar.d) && fdbq.f(this.e, ckcgVar.e) && this.f == ckcgVar.f && this.g == ckcgVar.g && this.h == ckcgVar.h && fdbq.f(this.i, ckcgVar.i) && fdbq.f(this.j, ckcgVar.j) && this.k == ckcgVar.k && this.w == ckcgVar.w && this.u == ckcgVar.u && fdbq.f(this.l, ckcgVar.l) && this.m == ckcgVar.m && this.n == ckcgVar.n && fdbq.f(this.o, ckcgVar.o) && this.p == ckcgVar.p && this.q == ckcgVar.q && this.r == ckcgVar.r && this.s == ckcgVar.s && this.t == ckcgVar.t && this.v == ckcgVar.v;
    }

    public final int hashCode() {
        int iA = (((((((((((((((((ckcf.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
        String str = this.l;
        int iA2 = (((((((iA * 31) + ckcf.a(this.k)) * 31) + ckcf.a(this.w)) * 31) + this.u) * 31) + str.hashCode();
        String str2 = this.o;
        int iA3 = (((((iA2 * 31) + ckcf.a(this.m)) * 31) + ckcf.a(this.n)) * 31) + str2.hashCode();
        boolean z = this.t;
        boolean z2 = this.s;
        boolean z3 = this.r;
        return (((((((((((iA3 * 31) + ckcf.a(this.p)) * 31) + ckcf.a(this.q)) * 31) + ckcf.a(z3)) * 31) + ckcf.a(z2)) * 31) + ckcf.a(z)) * 31) + this.v;
    }

    public final String toString() {
        return "RcsSettingsSimInfo(rcsEnabled=" + this.a + ", rcsProvisioningId=" + this.b + ", simSlot=" + this.c + ", carrierName=" + this.d + ", rcsMsisdn=" + this.e + ", rcsAvailability=" + this.f + ", subId=" + this.g + ", retryCount=" + this.h + ", lastRetryTimestamp=" + this.i + ", phoneNumberRecord=" + this.j + ", allowManualPhoneNumberInput=" + this.k + ", isDefaultCall=" + this.w + ", rcsTosType=" + ((Object) Integer.toString(this.u - 2)) + ", tosLinkUrl=" + this.l + ", legalFyiFlowEnabled=" + this.m + ", showEnabledByCarrierInSettings=" + this.n + ", tosPrivacyPolicyUrl=" + this.o + ", roamingEnabled=" + this.p + ", cellularConnectivity=" + this.q + ", shouldShowFiMultiSyncHelpArticle=" + this.r + ", isMarketFreezeSim=" + this.s + ", readyToSendAndReceiveRcs=" + this.t + ", upiEnabledState=" + ((Object) Integer.toString(this.v - 2)) + ")";
    }
}

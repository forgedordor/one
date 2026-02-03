package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckci {
    public final boolean a;
    public final dggn b;
    public final int c;
    public final String d;
    public final String e;
    public final ckbw f;
    public final boolean g;
    public final boolean h;

    public ckci(boolean z, dggn dggnVar, int i, String str, String str2, ckbw ckbwVar, boolean z2, boolean z3) {
        dggnVar.getClass();
        str2.getClass();
        ckbwVar.getClass();
        this.a = z;
        this.b = dggnVar;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = ckbwVar;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckci)) {
            return false;
        }
        ckci ckciVar = (ckci) obj;
        return this.a == ckciVar.a && fdbq.f(this.b, ckciVar.b) && this.c == ckciVar.c && fdbq.f(this.d, ckciVar.d) && fdbq.f(this.e, ckciVar.e) && this.f == ckciVar.f && this.g == ckciVar.g && this.h == ckciVar.h;
    }

    public final int hashCode() {
        return (((((((((((((ckch.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + ckch.a(this.g)) * 31) + ckch.a(this.h);
    }

    public final String toString() {
        return "RcsSettingsSimInfoV2(rcsEnabled=" + this.a + ", rcsProvisioningId=" + this.b + ", simSlot=" + this.c + ", carrierName=" + this.d + ", rcsMsisdn=" + this.e + ", rcsSettingsCode=" + this.f + ", rcsConsentNeededForSim=" + this.g + ", canShowGoogleTosDialog=" + this.h + ")";
    }
}

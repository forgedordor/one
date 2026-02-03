package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aylt extends ayly {
    public final fhaz a;
    public final basd b;
    public final febt c;
    public final evvp d;
    public final int e;
    public final int f;
    public final int g;

    public aylt(fhaz fhazVar, basd basdVar, int i, int i2, int i3, febt febtVar, evvp evvpVar) {
        this.a = fhazVar;
        this.b = basdVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.c = febtVar;
        this.d = evvpVar;
    }

    @Override // defpackage.ayly
    public final basd a() {
        return this.b;
    }

    @Override // defpackage.ayly
    public final evvp b() {
        return this.d;
    }

    @Override // defpackage.ayly
    public final febt c() {
        return this.c;
    }

    @Override // defpackage.ayly
    public final fhaz d() {
        return this.a;
    }

    @Override // defpackage.ayly
    public final int e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        febt febtVar;
        evvp evvpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayly) {
            ayly aylyVar = (ayly) obj;
            fhaz fhazVar = this.a;
            if (fhazVar != null ? fhazVar.equals(aylyVar.d()) : aylyVar.d() == null) {
                basd basdVar = this.b;
                if (basdVar != null ? basdVar.equals(aylyVar.a()) : aylyVar.a() == null) {
                    if (this.e == aylyVar.f() && this.f == aylyVar.g() && this.g == aylyVar.e() && ((febtVar = this.c) != null ? febtVar.equals(aylyVar.c()) : aylyVar.c() == null) && ((evvpVar = this.d) != null ? evvpVar.equals(aylyVar.b()) : aylyVar.b() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ayly
    public final int f() {
        return this.e;
    }

    @Override // defpackage.ayly
    public final int g() {
        return this.f;
    }

    public final int hashCode() {
        fhaz fhazVar = this.a;
        int iHashCode = fhazVar == null ? 0 : fhazVar.hashCode();
        basd basdVar = this.b;
        int iHashCode2 = basdVar == null ? 0 : basdVar.hashCode();
        int i = iHashCode ^ 1000003;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        febt febtVar = this.c;
        int iHashCode3 = ((((((((((i * 1000003) ^ iHashCode2) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ (febtVar == null ? 0 : febtVar.hashCode())) * 1000003;
        evvp evvpVar = this.d;
        return iHashCode3 ^ (evvpVar != null ? evvpVar.hashCode() : 0);
    }

    public final String toString() {
        int i = this.g;
        evvp evvpVar = this.d;
        febt febtVar = this.c;
        int i2 = this.f - 2;
        basd basdVar = this.b;
        return "XslParams{traceId=" + String.valueOf(this.a) + ", rcsMessageId=" + String.valueOf(basdVar) + ", type=" + Integer.toString(this.e - 2) + ", xslNode=" + Integer.toString(i2) + ", xslInsideNode=" + Integer.toString(i - 2) + ", bugleSendingInternalStatus=" + String.valueOf(febtVar) + ", timestamp=" + String.valueOf(evvpVar) + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwny extends dwre {
    public final long a;
    public final ekgb b;

    public dwny(long j, ekgb ekgbVar) {
        this.a = j;
        this.b = ekgbVar;
    }

    @Override // defpackage.dwre
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dwre
    public final ekgb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwre) {
            dwre dwreVar = (dwre) obj;
            if (this.a == dwreVar.a() && ekjz.h(this.b, dwreVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RegistrationProperties{lastCapabilitiesReportTimeMs=" + this.a + ", lastReportedCapabilities=" + this.b.toString() + "}";
    }
}

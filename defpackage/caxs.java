package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxs extends cbog {
    public final String a;
    public final String b;
    public final Duration c;
    public final String d;
    public final eora e;
    public final cazx f;

    public caxs(String str, String str2, Duration duration, String str3, eora eoraVar, cazx cazxVar) {
        this.a = str;
        this.b = str2;
        this.c = duration;
        this.d = str3;
        this.e = eoraVar;
        this.f = cazxVar;
    }

    @Override // defpackage.cbog
    public final cazx a() {
        return this.f;
    }

    @Override // defpackage.cbog
    public final eora b() {
        return this.e;
    }

    @Override // defpackage.cbog
    public final Duration c() {
        return this.c;
    }

    @Override // defpackage.cbog
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cbog
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbog) {
            cbog cbogVar = (cbog) obj;
            String str = this.a;
            if (str != null ? str.equals(cbogVar.f()) : cbogVar.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(cbogVar.e()) : cbogVar.e() == null) {
                    Duration duration = this.c;
                    if (duration != null ? duration.equals(cbogVar.c()) : cbogVar.c() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(cbogVar.d()) : cbogVar.d() == null) {
                            eora eoraVar = this.e;
                            if (eoraVar != null ? eoraVar.equals(cbogVar.b()) : cbogVar.b() == null) {
                                cazx cazxVar = this.f;
                                if (cazxVar != null ? cazxVar.equals(cbogVar.a()) : cbogVar.a() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cbog
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        Duration duration = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (duration == null ? 0 : duration.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        eora eoraVar = this.e;
        int iHashCode5 = (iHashCode4 ^ (eoraVar == null ? 0 : eoraVar.hashCode())) * 1000003;
        cazx cazxVar = this.f;
        return iHashCode5 ^ (cazxVar != null ? cazxVar.hashCode() : 0);
    }

    public final String toString() {
        cazx cazxVar = this.f;
        eora eoraVar = this.e;
        return "WorkRequestExtras{subQueue=" + this.a + ", deduplicationTag=" + this.b + ", initialDelay=" + String.valueOf(this.c) + ", cancellationTag=" + this.d + ", callback=" + String.valueOf(eoraVar) + ", workQueueCallback=" + String.valueOf(cazxVar) + "}";
    }
}

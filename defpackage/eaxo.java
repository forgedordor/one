package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eaxo extends eayy {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public eaxo(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // defpackage.eayy
    public final long a() {
        return this.a;
    }

    @Override // defpackage.eayy
    public final long b() {
        return this.c;
    }

    @Override // defpackage.eayy
    public final long c() {
        return this.b;
    }

    @Override // defpackage.eayy
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayy) {
            eayy eayyVar = (eayy) obj;
            if (this.a == eayyVar.a() && this.b == eayyVar.c() && this.c == eayyVar.b() && this.d == eayyVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.c;
        long j4 = j3 ^ (j3 >>> 32);
        long j5 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((((i ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ ((int) j4)) * 1000003);
    }

    public final String toString() {
        return "ReportId{customerId=" + this.a + ", projectId=" + this.b + ", metricId=" + this.c + ", reportId=" + this.d + "}";
    }
}

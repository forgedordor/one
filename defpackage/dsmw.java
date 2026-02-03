package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsmw extends dsmy {
    public final int a;
    public final int b;
    public final String c;
    public final long d;

    public dsmw(int i, int i2, String str, long j) {
        this.a = i;
        this.b = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.c = str;
        this.d = j;
    }

    @Override // defpackage.dsmy
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dsmy
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dsmy
    public final long c() {
        return this.d;
    }

    @Override // defpackage.dsmy
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsmy) {
            dsmy dsmyVar = (dsmy) obj;
            dsmyVar.e();
            if (this.a == dsmyVar.b() && this.b == dsmyVar.a() && this.c.equals(dsmyVar.d()) && this.d == dsmyVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a ^ (-721379959)) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ClearcutEventRecord{account=null, logSource=" + this.a + ", eventCode=" + this.b + ", packageName=" + this.c + ", timestampMs=" + this.d + "}";
    }

    @Override // defpackage.dsmy
    public final void e() {
    }
}

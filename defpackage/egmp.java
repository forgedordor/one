package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egmp extends egmt {
    public final evuh a;
    public final int b;
    public final long c;
    public final int d;

    public egmp(evuh evuhVar, int i, long j, int i2) {
        this.a = evuhVar;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // defpackage.egmt
    public final int a() {
        return this.b;
    }

    @Override // defpackage.egmt
    public final long b() {
        return this.c;
    }

    @Override // defpackage.egmt
    public final evuh c() {
        return this.a;
    }

    @Override // defpackage.egmt
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egmt) {
            egmt egmtVar = (egmt) obj;
            if (this.a.equals(egmtVar.c()) && this.b == egmtVar.a()) {
                egmtVar.e();
                if (this.c == egmtVar.b() && this.d == egmtVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        return (((((iHashCode * 1000003) ^ this.b) * (-721379959)) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "KeyValueCacheConfig{valueDefaultInstance=" + this.a.toString() + ", maxSizeBytes=" + this.b + ", maxEntryCount=0, filterAfterWriteMs=" + this.c + ", storage=" + ehvi.a(this.d) + "}";
    }

    @Override // defpackage.egmt
    public final void e() {
    }
}

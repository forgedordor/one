package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class byfw extends bypb {
    private final Optional a;
    private final boolean b;
    private final long c;
    private final int d;
    private final int e;

    public byfw(Optional optional, boolean z, int i, int i2, long j) {
        this.a = optional;
        this.b = z;
        this.e = i;
        this.d = i2;
        this.c = j;
    }

    @Override // defpackage.bypb
    public final long a() {
        return this.c;
    }

    @Override // defpackage.bypb
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.bypb
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.bypb
    public final int d() {
        return this.d;
    }

    @Override // defpackage.bypb
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bypb) {
            bypb bypbVar = (bypb) obj;
            if (this.a.equals(bypbVar.b()) && this.b == bypbVar.c() && this.e == bypbVar.e() && this.d == bypbVar.d() && this.c == bypbVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.d) * 1000003;
        long j = this.c;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.e;
        String string = this.a.toString();
        String str = i != 4 ? i != 5 ? i != 6 ? "MERGED_BY_PERSISTENCE_ID" : "RESTORED_AS_NEW_ROW" : "MERGED_BY_CONTENT" : "MERGED_BY_CMS_ID";
        int i2 = this.d;
        String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "XMS" : "RCS" : "PERSISTENCE_ID" : "CMS_ID" : "TOMBSTONE" : "UNKNOWN";
        return "CmsDeduplicationResult{duplicateBindData=" + string + ", foundDup=" + this.b + ", restoreOutcomeType=" + str + ", deduplicationType=" + str2 + ", deduplicateStartTimeMs=" + this.c + "}";
    }
}

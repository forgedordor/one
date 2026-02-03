package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobv {
    public final cnyz a;
    public final evqs b;
    public final cnyz c;

    public cobv(cnyz cnyzVar, evqs evqsVar, cnyz cnyzVar2) {
        cnyzVar.getClass();
        this.a = cnyzVar;
        this.b = evqsVar;
        this.c = cnyzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cobv)) {
            return false;
        }
        cobv cobvVar = (cobv) obj;
        return fdbq.f(this.a, cobvVar.a) && fdbq.f(this.b, cobvVar.b) && fdbq.f(this.c, cobvVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        cnyz cnyzVar = this.c;
        return (iHashCode * 31) + (cnyzVar == null ? 0 : cnyzVar.hashCode());
    }

    public final String toString() {
        return "MergeDetails(originalRequest=" + this.a + ", mergedRequestSyncId=" + this.b + ", updatedRequest=" + this.c + ")";
    }

    public /* synthetic */ cobv(cnyz cnyzVar, evqs evqsVar) {
        this(cnyzVar, evqsVar, null);
    }
}

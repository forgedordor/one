package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobx {
    public final Collection a;
    public final Collection b;
    public final enqq c;
    public final int d;

    public cobx(Collection collection, int i, Collection collection2, enqq enqqVar) {
        this.a = collection;
        this.d = i;
        this.b = collection2;
        this.c = enqqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cobx)) {
            return false;
        }
        cobx cobxVar = (cobx) obj;
        return fdbq.f(this.a, cobxVar.a) && this.d == cobxVar.d && fdbq.f(this.b, cobxVar.b) && this.c == cobxVar.c;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.d) * 31) + this.b.hashCode();
        enqq enqqVar = this.c;
        return (iHashCode * 31) + (enqqVar == null ? 0 : enqqVar.hashCode());
    }

    public final String toString() {
        return "NewRequestMergeResult(updatedQueue=" + this.a + ", mergeCase=" + ((Object) Integer.toString(this.d - 1)) + ", mergeDetails=" + this.b + ", newFullSyncReason=" + this.c + ")";
    }

    public /* synthetic */ cobx(Collection collection, int i, Collection collection2) {
        this(collection, i, collection2, null);
    }
}

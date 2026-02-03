package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cocx {
    public final cnyz a;
    public final Collection b;
    public final cnyz c;

    public cocx(cnyz cnyzVar, Collection collection, cnyz cnyzVar2) {
        cnyzVar.getClass();
        collection.getClass();
        this.a = cnyzVar;
        this.b = collection;
        this.c = cnyzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cocx)) {
            return false;
        }
        cocx cocxVar = (cocx) obj;
        return fdbq.f(this.a, cocxVar.a) && fdbq.f(this.b, cocxVar.b) && fdbq.f(this.c, cocxVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        cnyz cnyzVar = this.c;
        return (iHashCode * 31) + (cnyzVar == null ? 0 : cnyzVar.hashCode());
    }

    public final String toString() {
        return "PartialSyncAndSpotSyncs(updatedPartialSync=" + this.a + ", mergedSpotSyncs=" + this.b + ", updatedSpotSync=" + this.c + ")";
    }
}

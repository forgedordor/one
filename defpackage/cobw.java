package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobw {
    public final Collection a;
    public final cnyk b;
    public final Set c;

    public cobw(Collection collection, cnyk cnykVar, Set set) {
        this.a = collection;
        this.b = cnykVar;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cobw)) {
            return false;
        }
        cobw cobwVar = (cobw) obj;
        return fdbq.f(this.a, cobwVar.a) && fdbq.f(this.b, cobwVar.b) && fdbq.f(this.c, cobwVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ActiveSyncMergeResult(updatedQueue=" + this.a + ", updatedActiveSync=" + this.b + ", mergeDetails=" + this.c + ")";
    }
}

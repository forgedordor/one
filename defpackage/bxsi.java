package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxsi {
    public final String a;
    public final Collection b;

    public bxsi(String str, Collection collection) {
        this.a = str;
        this.b = collection;
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!fdbq.f(((bxtl) it.next()).a(), this.a)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxsi)) {
            return false;
        }
        bxsi bxsiVar = (bxsi) obj;
        return fdbq.f(this.a, bxsiVar.a) && fdbq.f(this.b, bxsiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AppSearchIndexablesToUpdate(namespace=" + this.a + ", indexables=" + this.b + ")";
    }
}

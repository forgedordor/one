package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxsh {
    public final String a;
    public final Collection b;

    public bxsh(String str, Collection collection) {
        this.a = str;
        this.b = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxsh)) {
            return false;
        }
        bxsh bxshVar = (bxsh) obj;
        return fdbq.f(this.a, bxshVar.a) && fdbq.f(this.b, bxshVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AppSearchIndexablesToRemove(namespace=" + this.a + ", ids=" + this.b + ")";
    }
}

package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aneb implements ajly {
    public final ajly a;
    public final long b;

    public aneb(ajly ajlyVar, long j) {
        this.a = ajlyVar;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ajly ajlyVar = (ajly) obj;
        ajlyVar.getClass();
        if (ajlyVar instanceof aneb) {
            return this.a.compareTo(((aneb) ajlyVar).a);
        }
        throw new InvalidParameterException("wrong PagingKey type, excepted a VersionedPagingKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aneb)) {
            return false;
        }
        aneb anebVar = (aneb) obj;
        return fdbq.f(this.a, anebVar.a) && this.b == anebVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "VersionedPagingKey(innerKey=" + this.a + ", version=" + this.b + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakr implements cakt {
    public final String a;

    public cakr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cakr) && fdbq.f(this.a, ((cakr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RestoreNextPage(nextPaginationToken=" + this.a + ")";
    }
}

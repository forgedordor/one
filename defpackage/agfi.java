package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agfi implements afzx {
    public final String a;

    public agfi(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agfi) && fdbq.f(this.a, ((agfi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RetrievePendingActivityResult(key=" + this.a + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cccv {
    public final String a;

    public cccv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cccv) && fdbq.f(this.a, ((cccv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KdsUrl(hostAndPort=" + this.a + ")";
    }
}

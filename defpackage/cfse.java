package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfse {
    public final String a;

    public cfse(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfse) && fdbq.f(this.a, ((cfse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChannelConfiguration(url=" + this.a + ")";
    }
}

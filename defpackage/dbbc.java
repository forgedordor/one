package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbc {
    private final String a;

    public dbbc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbbc) && fdbq.f(this.a, ((dbbc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InvalidParameter(videoId=" + this.a + ")";
    }
}

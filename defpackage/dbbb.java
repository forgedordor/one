package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbb {
    private final String a;

    public dbbb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbbb) && fdbq.f(this.a, ((dbbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Html5Error(videoId=" + this.a + ")";
    }
}

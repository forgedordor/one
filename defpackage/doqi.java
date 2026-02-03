package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doqi {
    public final String a;

    public doqi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doqi) && fdbq.f(this.a, ((doqi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestId(value=" + this.a + ")";
    }
}

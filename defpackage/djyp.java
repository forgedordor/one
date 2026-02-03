package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyp implements djyu {
    public final String a;

    public djyp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djyp) && fdbq.f(this.a, ((djyp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InlineHeader(text=" + this.a + ")";
    }
}

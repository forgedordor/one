package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhyv {
    public final int a;

    public dhyv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhyv) && this.a == ((dhyv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Verdict(policyViolation=");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? "SUSPICIOUS" : "NONE" : "UNKNOWN"));
        sb.append(")");
        return sb.toString();
    }
}

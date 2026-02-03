package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzj implements xzk {
    public final String a;

    public xzj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzj) && fdbq.f(this.a, ((xzj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(reply=" + this.a + ")";
    }
}

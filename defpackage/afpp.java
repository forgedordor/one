package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afpp implements afpr {
    public final String a;

    public afpp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afpp) && fdbq.f(this.a, ((afpp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Disabled(reason=" + this.a + ")";
    }
}

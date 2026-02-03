package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afsx implements afta {
    public final String a;

    public afsx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afsx) && fdbq.f(this.a, ((afsx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Header(value=" + this.a + ")";
    }
}

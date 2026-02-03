package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aofe {
    public final int a;

    public aofe(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aofe) && this.a == ((aofe) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Valid(index=" + this.a + ")";
    }
}

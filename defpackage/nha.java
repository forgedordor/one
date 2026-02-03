package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nha {
    public final long a;
    public final long b;

    public nha(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nha)) {
            return false;
        }
        nha nhaVar = (nha) obj;
        return this.a == nhaVar.a && this.b == nhaVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}

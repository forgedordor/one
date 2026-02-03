package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwq {
    public int a;

    public hwq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwq) && this.a == ((hwq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }

    public /* synthetic */ hwq(byte[] bArr) {
        this.a = 0;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlpr implements dlps {
    private final dlow a;

    public dlpr() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlpr) && fdbq.f(this.a, ((dlpr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ManualTrigger(flags=" + this.a + ")";
    }

    public /* synthetic */ dlpr(byte[] bArr) {
        this.a = new dlow(null);
    }
}

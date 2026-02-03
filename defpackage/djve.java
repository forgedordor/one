package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djve implements djvm {
    private final fdae a;

    public djve() {
        this(null);
    }

    @Override // defpackage.dlhu
    public final fdae a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djve) && fdbq.f(this.a, ((djve) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(onClick=" + this.a + ")";
    }

    public /* synthetic */ djve(byte[] bArr) {
        this.a = new fdae() { // from class: djvd
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        };
    }
}

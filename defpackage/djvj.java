package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvj implements djvm {
    private final fdae a;

    public djvj() {
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
        return (obj instanceof djvj) && fdbq.f(this.a, ((djvj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(onClick=" + this.a + ")";
    }

    public /* synthetic */ djvj(byte[] bArr) {
        this.a = new fdae() { // from class: djvi
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        };
    }
}

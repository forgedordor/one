package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edjr extends edjt {
    private final long a;

    public edjr(long j) {
        this.a = j;
    }

    @Override // defpackage.edjt, defpackage.edkw
    public final long a() {
        return this.a;
    }

    @Override // defpackage.edkw
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edkw) {
            edkw edkwVar = (edkw) obj;
            if (edkwVar.b() == 1 && this.a == edkwVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ImageIdOrUri{imageId=" + this.a + "}";
    }
}

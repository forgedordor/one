package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgu {
    public final int a;
    public final int b;

    public awgu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awgu)) {
            return false;
        }
        awgu awguVar = (awgu) obj;
        return this.a == awguVar.a && this.b == awguVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "InMemoryCacheConfig(sizeLimit=" + this.a + ", evictLevel=" + this.b + ")";
    }

    public /* synthetic */ awgu(int i) {
        this(i, 40);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smv extends smx {
    private final int a;

    public smv(int i) {
        this.a = i;
    }

    @Override // defpackage.smx
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof smx) && this.a == ((smx) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "TokenInfo{tokenCount=" + this.a + "}";
    }
}

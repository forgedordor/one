package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cquy extends cquo {
    private final int a;
    private final int b;

    public cquy(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cquo
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cquo
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cquo) {
            cquo cquoVar = (cquo) obj;
            if (this.a == cquoVar.b() && this.b == cquoVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "PlaybackError{type=" + this.a + ", code=" + this.b + "}";
    }
}

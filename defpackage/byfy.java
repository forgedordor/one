package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class byfy extends byqg {
    public final int a;
    public final int b;
    public final int c;

    public byfy(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.byqg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.byqg
    public final int b() {
        return this.a;
    }

    @Override // defpackage.byqg
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byqg) {
            byqg byqgVar = (byqg) obj;
            if (this.a == byqgVar.b() && this.b == byqgVar.a() && this.c == byqgVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "KeySchedulingResult{lastScheduledType=" + this.a + ", lastScheduledIndex=" + this.b + ", remainingQuota=" + this.c + "}";
    }
}

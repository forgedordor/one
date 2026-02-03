package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatb extends aauy {
    private final int a;
    private final int b;

    public aatb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.aauy
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aauy
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aauy) {
            aauy aauyVar = (aauy) obj;
            if (this.a == aauyVar.b() && this.b == aauyVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "UpdateActionBarEvent{selectedCount=" + this.a + ", messageCount=" + this.b + "}";
    }
}

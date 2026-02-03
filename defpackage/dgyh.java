package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgyh extends dgzx {
    private final int a;
    private final int b;

    public dgyh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dgzx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dgzx
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgzx) {
            dgzx dgzxVar = (dgzx) obj;
            if (this.a == dgzxVar.a() && this.b == dgzxVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "InstantMessagingTech{messagingTech=" + this.a + ", messagingMethod=" + dgzw.a(this.b) + "}";
    }
}

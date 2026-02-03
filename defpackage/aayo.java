package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayo extends aayt {
    public final int a;
    public final int b;

    public aayo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.aayt
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aayt
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aayt) {
            aayt aaytVar = (aayt) obj;
            if (this.a == aaytVar.b() && this.b == aaytVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "DeleteConversationDialogInfo{title=" + this.a + ", body=" + this.b + "}";
    }
}

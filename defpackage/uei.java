package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uei extends uet {
    public final int a;
    public final int b;

    public uei(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.uet
    public final int a() {
        return this.a;
    }

    @Override // defpackage.uet
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uet) {
            uet uetVar = (uet) obj;
            if (this.b == uetVar.b() && this.a == uetVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        int i = this.b;
        return "BadgesDifference{differenceType=" + (i != 1 ? i != 2 ? i != 3 ? "DELETION" : "CHANGE" : "INSERTION" : "NO_CHANGE") + ", differencePosition=" + this.a + "}";
    }
}

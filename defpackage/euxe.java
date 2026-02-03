package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class euxe extends euxo {
    public final int a;
    public final int b;

    public euxe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.euxo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.euxo
    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euxo) {
            euxo euxoVar = (euxo) obj;
            if (this.a == euxoVar.a() && this.b == euxoVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "MPImageProperties{imageFormat=" + this.a + ", storageType=" + this.b + "}";
    }
}

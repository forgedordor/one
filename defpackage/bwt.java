package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwt extends bxq {
    private final bxo a;
    private final int b;

    public bwt(bxo bxoVar, int i) {
        if (bxoVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.a = bxoVar;
        this.b = i;
    }

    @Override // defpackage.bxq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bxq
    public final bxo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxq) {
            bxq bxqVar = (bxq) obj;
            if (this.a.equals(bxqVar.b()) && this.b == bxqVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "QualityRatio{quality=" + this.a + ", aspectRatio=" + this.b + "}";
    }
}

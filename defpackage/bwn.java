package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwn extends bxb {
    public final bxo a;
    public final int b;

    public bwn(bxo bxoVar, int i) {
        if (bxoVar == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.a = bxoVar;
        this.b = i;
    }

    @Override // defpackage.bxb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bxb
    public final bxo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxb) {
            bxb bxbVar = (bxb) obj;
            if (this.a.equals(bxbVar.b()) && this.b == bxbVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "RuleStrategy{fallbackQuality=" + this.a + ", fallbackRule=" + this.b + "}";
    }
}

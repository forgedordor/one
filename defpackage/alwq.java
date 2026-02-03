package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alwq extends amei {
    private final boolean b;
    private final ekgb c;

    public alwq(boolean z, ekgb ekgbVar) {
        this.b = z;
        if (ekgbVar == null) {
            throw new NullPointerException("Null readByList");
        }
        this.c = ekgbVar;
    }

    @Override // defpackage.amei, defpackage.ajmw
    public final ekgb a() {
        return this.c;
    }

    @Override // defpackage.amei, defpackage.ajmw
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amei) {
            amei ameiVar = (amei) obj;
            if (this.b == ameiVar.b() && ekjz.h(this.c, ameiVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "DefaultReadReport{isReadByAll=" + this.b + ", readByList=" + this.c.toString() + "}";
    }
}

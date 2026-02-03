package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmk extends ejmo {
    public final String a;
    private final ekgb b;
    private final float c;
    private final String d;
    private final ezal e;

    public ejmk(String str, ekgb ekgbVar, float f, String str2, ezal ezalVar) {
        this.a = str;
        this.b = ekgbVar;
        this.c = f;
        this.d = str2;
        this.e = ezalVar;
    }

    @Override // defpackage.ejmo
    public final float a() {
        return this.c;
    }

    @Override // defpackage.ejmo
    public final ekgb b() {
        return this.b;
    }

    @Override // defpackage.ejmo
    public final ezal c() {
        return this.e;
    }

    @Override // defpackage.ejmo
    public final String d() {
        return this.a;
    }

    @Override // defpackage.ejmo
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejmo) {
            ejmo ejmoVar = (ejmo) obj;
            if (this.a.equals(ejmoVar.d()) && ekjz.h(this.b, ejmoVar.b()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(ejmoVar.a()) && this.d.equals(ejmoVar.e()) && this.e.equals(ejmoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        ezal ezalVar = this.e;
        return "Interpretation{intent=" + this.a + ", entities=" + this.b.toString() + ", score=" + this.c + ", textPrediction=" + this.d + ", source=" + ezalVar.toString() + "}";
    }
}

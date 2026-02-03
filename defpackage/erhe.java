package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhe extends erhh {
    public final int a;
    public final int b;
    public final erhd c;
    public final erhc d;

    public erhe(int i, int i2, erhd erhdVar, erhc erhcVar) {
        this.a = i;
        this.b = i2;
        this.c = erhdVar;
        this.d = erhcVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.c != erhd.d;
    }

    public final int b() {
        erhd erhdVar = this.c;
        if (erhdVar == erhd.d) {
            return this.b;
        }
        if (erhdVar == erhd.a || erhdVar == erhd.b || erhdVar == erhd.c) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof erhe)) {
            return false;
        }
        erhe erheVar = (erhe) obj;
        return erheVar.a == this.a && erheVar.b() == b() && erheVar.c == this.c && erheVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(erhe.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        erhc erhcVar = this.d;
        return "HMAC Parameters (variant: " + String.valueOf(this.c) + ", hashType: " + String.valueOf(erhcVar) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}

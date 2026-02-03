package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equb extends eqtf {
    public final int a;
    public final int b;
    public final int c = 16;
    public final equa d;

    public equb(int i, int i2, equa equaVar) {
        this.a = i;
        this.b = i2;
        this.d = equaVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.d != equa.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof equb)) {
            return false;
        }
        equb equbVar = (equb) obj;
        if (equbVar.a == this.a && equbVar.b == this.b) {
            int i = equbVar.c;
            if (equbVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(equb.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.d) + ", " + this.b + "-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}

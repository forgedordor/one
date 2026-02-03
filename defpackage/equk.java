package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equk extends eqtf {
    public final int a;
    public final int b = 12;
    public final int c = 16;
    public final equj d;

    public equk(int i, equj equjVar) {
        this.a = i;
        this.d = equjVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.d != equj.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof equk)) {
            return false;
        }
        equk equkVar = (equk) obj;
        if (equkVar.a == this.a) {
            int i = equkVar.b;
            int i2 = equkVar.c;
            if (equkVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(equk.class, Integer.valueOf(this.a), 12, 16, this.d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.d) + ", 12-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}

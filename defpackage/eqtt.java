package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtt extends eqtf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final eqts e;
    public final eqtr f;

    public eqtt(int i, int i2, int i3, int i4, eqts eqtsVar, eqtr eqtrVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = eqtsVar;
        this.f = eqtrVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.e != eqts.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eqtt)) {
            return false;
        }
        eqtt eqttVar = (eqtt) obj;
        return eqttVar.a == this.a && eqttVar.b == this.b && eqttVar.c == this.c && eqttVar.d == this.d && eqttVar.e == this.e && eqttVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(eqtt.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        eqtr eqtrVar = this.f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.e) + ", hashType: " + String.valueOf(eqtrVar) + ", " + this.c + "-byte IV, and " + this.d + "-byte tags, and " + this.a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }
}

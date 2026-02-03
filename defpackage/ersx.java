package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersx extends erto {
    public final ersw a;
    private final Integer b;
    private final Integer c;
    private final Integer d;

    public ersx(Integer num, Integer num2, ersw erswVar, Integer num3) {
        this.b = num;
        this.c = num2;
        this.a = erswVar;
        this.d = num3;
    }

    public final int b() {
        return this.d.intValue();
    }

    public final int c() {
        return this.c.intValue();
    }

    public final int d() {
        return this.b.intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ersx)) {
            return false;
        }
        ersx ersxVar = (ersx) obj;
        return ersxVar.d() == d() && ersxVar.c() == c() && ersxVar.a == this.a && ersxVar.b() == b();
    }

    public final int hashCode() {
        return Objects.hash(ersx.class, this.b, this.c, this.a, this.d);
    }

    public final String toString() {
        return "AesGcmHkdfStreaming Parameters (IKM size: " + this.b + ", " + this.c + "-byte AES GCM key, " + String.valueOf(this.a) + " for HKDF " + this.d + "-byte ciphertexts)";
    }
}

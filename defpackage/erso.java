package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erso extends erto {
    public final ersn a;
    public final ersn b;
    private final Integer c;
    private final Integer d;
    private final Integer e;
    private final Integer f;

    public erso(Integer num, Integer num2, ersn ersnVar, ersn ersnVar2, Integer num3, Integer num4) {
        this.c = num;
        this.d = num2;
        this.a = ersnVar;
        this.b = ersnVar2;
        this.e = num3;
        this.f = num4;
    }

    public final int b() {
        return this.f.intValue();
    }

    public final int c() {
        return this.d.intValue();
    }

    public final int d() {
        return this.e.intValue();
    }

    public final int e() {
        return this.c.intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof erso)) {
            return false;
        }
        erso ersoVar = (erso) obj;
        return ersoVar.e() == e() && ersoVar.c() == c() && ersoVar.a == this.a && ersoVar.b == this.b && ersoVar.d() == d() && ersoVar.b() == b();
    }

    public final int hashCode() {
        return Objects.hash(erso.class, this.c, this.d, this.a, this.b, this.e, this.f);
    }

    public final String toString() {
        ersn ersnVar = this.a;
        return "AesCtrHmacStreaming Parameters (IKM size: " + this.c + ", " + this.d + "-byte AES key, " + String.valueOf(ersnVar) + " for HKDF, " + String.valueOf(ersnVar) + " for HMAC, " + this.e + "-byte tags, " + this.f + "-byte ciphertexts)";
    }
}

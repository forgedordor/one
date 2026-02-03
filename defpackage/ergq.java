package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergq extends erhh {
    public final int a;
    public final int b;
    public final ergp c;

    public ergq(int i, int i2, ergp ergpVar) {
        this.a = i;
        this.b = i2;
        this.c = ergpVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.c != ergp.d;
    }

    public final int b() {
        ergp ergpVar = this.c;
        if (ergpVar == ergp.d) {
            return this.b;
        }
        if (ergpVar == ergp.a || ergpVar == ergp.b || ergpVar == ergp.c) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ergq)) {
            return false;
        }
        ergq ergqVar = (ergq) obj;
        return ergqVar.a == this.a && ergqVar.b() == b() && ergqVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(ergq.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.c) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}

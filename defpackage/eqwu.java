package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwu extends eqtf {
    public final eqwt a;

    public eqwu(eqwt eqwtVar) {
        this.a = eqwtVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.a != eqwt.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eqwu) && ((eqwu) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(eqwu.class, this.a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a.d + ")";
    }
}

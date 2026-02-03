package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eroq extends erqt {
    public final erop a;

    public eroq(erop eropVar) {
        this.a = eropVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.a != erop.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eroq) && ((eroq) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(eroq.class, this.a);
    }

    public final String toString() {
        return "Ed25519 Parameters (variant: " + this.a.e + ")";
    }
}

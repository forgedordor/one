package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eras extends erbr {
    public final eraq a;
    public final erap b;
    public final eran c;
    public final erar d;

    public eras(eraq eraqVar, erap erapVar, eran eranVar, erar erarVar) {
        this.a = eraqVar;
        this.b = erapVar;
        this.c = eranVar;
        this.d = erarVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.d != erar.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eras)) {
            return false;
        }
        eras erasVar = (eras) obj;
        return this.a == erasVar.a && this.b == erasVar.b && this.c == erasVar.c && this.d == erasVar.d;
    }

    public final int hashCode() {
        return Objects.hash(eras.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        return "HPKE Parameters (Variant: " + this.d.d + ", KemId: " + this.a.toString() + ", KdfId: " + this.b.toString() + ", AeadId: " + this.c.toString() + ")";
    }
}

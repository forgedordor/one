package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvj extends eqtf {
    public final String a;
    public final eqvi b;

    public eqvj(String str, eqvi eqviVar) {
        this.a = str;
        this.b = eqviVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.b != eqvi.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eqvj)) {
            return false;
        }
        eqvj eqvjVar = (eqvj) obj;
        return eqvjVar.a.equals(this.a) && eqvjVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(eqvj.class, this.a, this.b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.a + ", variant: " + this.b.c + ")";
    }
}

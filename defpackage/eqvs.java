package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvs extends eqtf {
    public final eqvr a;
    public final String b;
    public final eqtf c;
    private final eqvq d;

    public eqvs(eqvr eqvrVar, String str, eqvq eqvqVar, eqtf eqtfVar) {
        this.a = eqvrVar;
        this.b = str;
        this.d = eqvqVar;
        this.c = eqtfVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.a != eqvr.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eqvs)) {
            return false;
        }
        eqvs eqvsVar = (eqvs) obj;
        return eqvsVar.d.equals(this.d) && eqvsVar.c.equals(this.c) && eqvsVar.b.equals(this.b) && eqvsVar.a.equals(this.a);
    }

    public final int hashCode() {
        return Objects.hash(eqvs.class, this.b, this.d, this.c, this.a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + this.d.g + ", dekParametersForNewKeys: " + this.c.toString() + ", variant: " + this.a.c + ")";
    }
}

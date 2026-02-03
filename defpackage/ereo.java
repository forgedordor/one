package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ereo extends eqst {
    public final erfw a;

    public ereo(erfw erfwVar) {
        this.a = erfwVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        ermy ermyVarB = ermy.b(this.a.b.d);
        if (ermyVarB == null) {
            ermyVarB = ermy.UNRECOGNIZED;
        }
        return ermyVarB != ermy.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ereo)) {
            return false;
        }
        erfw erfwVar = ((ereo) obj).a;
        ermh ermhVar = this.a.b;
        ermy ermyVarB = ermy.b(ermhVar.d);
        if (ermyVarB == null) {
            ermyVarB = ermy.UNRECOGNIZED;
        }
        ermh ermhVar2 = erfwVar.b;
        ermy ermyVarB2 = ermy.b(ermhVar2.d);
        if (ermyVarB2 == null) {
            ermyVarB2 = ermy.UNRECOGNIZED;
        }
        return ermyVarB.equals(ermyVarB2) && ermhVar.b.equals(ermhVar2.b) && ermhVar.c.equals(ermhVar2.c);
    }

    public final int hashCode() {
        erfw erfwVar = this.a;
        return Objects.hash(erfwVar.b, erfwVar.a);
    }

    public final String toString() {
        ermh ermhVar = this.a.b;
        String str = ermhVar.b;
        ermy ermyVarB = ermy.b(ermhVar.d);
        if (ermyVarB == null) {
            ermyVarB = ermy.UNRECOGNIZED;
        }
        int iOrdinal = ermyVarB.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}

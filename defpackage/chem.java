package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chem {
    public final efnd a;
    public final aubt b;
    public final auhf c;

    public chem(efnd efndVar, aubt aubtVar, auhf auhfVar) {
        this.a = efndVar;
        this.b = aubtVar;
        this.c = auhfVar;
    }

    public static /* synthetic */ chem a(chem chemVar, efnd efndVar, aubt aubtVar, auhf auhfVar, int i) {
        if ((i & 1) != 0) {
            efndVar = chemVar.a;
        }
        if ((i & 2) != 0) {
            aubtVar = chemVar.b;
        }
        if ((i & 4) != 0) {
            auhfVar = chemVar.c;
        }
        return new chem(efndVar, aubtVar, auhfVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chem)) {
            return false;
        }
        chem chemVar = (chem) obj;
        return fdbq.f(this.a, chemVar.a) && fdbq.f(this.b, chemVar.b) && fdbq.f(this.c, chemVar.c);
    }

    public final int hashCode() {
        efnd efndVar = this.a;
        int iHashCode = efndVar == null ? 0 : efndVar.hashCode();
        aubt aubtVar = this.b;
        int iHashCode2 = aubtVar == null ? 0 : aubtVar.hashCode();
        int i = iHashCode * 31;
        auhf auhfVar = this.c;
        return ((i + iHashCode2) * 31) + (auhfVar != null ? auhfVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChatApiData(serializedContent=" + this.a + ", chatMessageContent=" + this.b + ", opaqueData=" + this.c + ")";
    }
}

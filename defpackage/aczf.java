package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczf {
    public final ekgp a;
    public final Integer b;
    public final aoio c;
    private final Integer d = null;

    public aczf(ekgp ekgpVar, Integer num, aoio aoioVar) {
        this.a = ekgpVar;
        this.b = num;
        this.c = aoioVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aczf)) {
            return false;
        }
        aczf aczfVar = (aczf) obj;
        Integer num = aczfVar.d;
        return fdbq.f(null, null) && fdbq.f(this.a, aczfVar.a) && fdbq.f(this.b, aczfVar.b) && this.c == aczfVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        aoio aoioVar = this.c;
        return iHashCode2 + (aoioVar != null ? aoioVar.hashCode() : 0);
    }

    public final String toString() {
        return "ConversationListItemViewAsyncData(testField=null, typingIndicatorData=" + this.a + ", groupUpgradeCounter=" + this.b + ", rcsAvailability=" + this.c + ")";
    }
}

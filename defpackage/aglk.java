package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglk {
    public final ekhx a;
    public final ekhx b;

    public aglk(ekhx ekhxVar, ekhx ekhxVar2) {
        this.a = ekhxVar;
        this.b = ekhxVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aglk)) {
            return false;
        }
        aglk aglkVar = (aglk) obj;
        return fdbq.f(this.a, aglkVar.a) && fdbq.f(this.b, aglkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ProcessedConversationIds(insertedIds=" + this.a + ", handledIds=" + this.b + ")";
    }
}

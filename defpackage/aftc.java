package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aftc {
    public final String a;
    public final djyu b;

    public aftc(String str, djyu djyuVar) {
        this.a = str;
        this.b = djyuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aftc)) {
            return false;
        }
        aftc aftcVar = (aftc) obj;
        return fdbq.f(this.a, aftcVar.a) && fdbq.f(this.b, aftcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationEntry(id=" + this.a + ", itemUiData=" + this.b + ")";
    }
}

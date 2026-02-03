package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbfo {
    public final ekgb a;
    public final ekgb b;

    public bbfo(ekgb ekgbVar, ekgb ekgbVar2) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbfo)) {
            return false;
        }
        bbfo bbfoVar = (bbfo) obj;
        return fdbq.f(this.a, bbfoVar.a) && fdbq.f(this.b, bbfoVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationParticipantsByProximity(localConversationParticipants=" + this.a + ", nonLocalConversationParticipants=" + this.b + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amss {
    public final amlm a;
    public final ajts b;

    public amss(amlm amlmVar, ajts ajtsVar) {
        amlmVar.getClass();
        ajtsVar.getClass();
        this.a = amlmVar;
        this.b = ajtsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amss)) {
            return false;
        }
        amss amssVar = (amss) obj;
        return fdbq.f(this.a, amssVar.a) && fdbq.f(this.b, amssVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationDataCache(cachedConstraints=" + this.a + ", cachedConversationProperties=" + this.b + ")";
    }
}

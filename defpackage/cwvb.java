package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvb extends cwvf {
    private final ekgb a;
    private final elka b;

    public cwvb(ekgb ekgbVar, elka elkaVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null conversationIds");
        }
        this.a = ekgbVar;
        if (elkaVar == null) {
            throw new NullPointerException("Null origin");
        }
        this.b = elkaVar;
    }

    @Override // defpackage.cwvf
    public final ekgb a() {
        return this.a;
    }

    @Override // defpackage.cwvf
    public final elka b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwvf) {
            cwvf cwvfVar = (cwvf) obj;
            if (ekjz.h(this.a, cwvfVar.a()) && this.b.equals(cwvfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        elka elkaVar = this.b;
        return "ConversationArchiveEvent{conversationIds=" + this.a.toString() + ", origin=" + elkaVar.toString() + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adai extends adam {
    private final ekhx a;
    private final boolean b;

    public adai(ekhx ekhxVar, boolean z) {
        if (ekhxVar == null) {
            throw new NullPointerException("Null changedViewParts");
        }
        this.a = ekhxVar;
        this.b = z;
    }

    @Override // defpackage.adam
    public final ekhx a() {
        return this.a;
    }

    @Override // defpackage.adam
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adam) {
            adam adamVar = (adam) obj;
            if (this.a.equals(adamVar.a()) && this.b == adamVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationListChangePayload{changedViewParts=" + this.a.toString() + ", shouldRecalculate=" + this.b + "}";
    }
}

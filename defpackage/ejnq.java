package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejnq extends ejnr {
    public final ekgb a;
    public final int b;
    public final int c;

    public ejnq(ekgb ekgbVar, int i, int i2) {
        this.a = ekgbVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ejnr
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ejnr
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ejnr
    public final ekgb c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejnr) {
            ejnr ejnrVar = (ejnr) obj;
            if (ekjz.h(this.a, ejnrVar.c()) && this.b == ejnrVar.b() && this.c == ejnrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "ConversationStarterProviderParsedConfig{conversationStarters=" + this.a.toString() + ", maxSuggestionItems=" + this.b + ", maxStickerItems=" + this.c + "}";
    }
}

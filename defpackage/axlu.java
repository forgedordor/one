package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axlu extends aydb {
    private final bojh a;
    private final boolean b;

    public axlu(bojh bojhVar, boolean z) {
        if (bojhVar == null) {
            throw new NullPointerException("Null conversation");
        }
        this.a = bojhVar;
        this.b = z;
    }

    @Override // defpackage.aydb
    public final bojh a() {
        return this.a;
    }

    @Override // defpackage.aydb
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aydb) {
            aydb aydbVar = (aydb) obj;
            if (this.a.equals(aydbVar.a()) && this.b == aydbVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationMatchResult{conversation=" + this.a.toString() + ", isNewConversation=" + this.b + "}";
    }
}

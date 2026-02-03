package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciah extends cick {
    public final cpeb a;
    public final baqv b;

    public ciah(cpeb cpebVar, baqv baqvVar) {
        this.a = cpebVar;
        this.b = baqvVar;
    }

    @Override // defpackage.cick
    public final baqv a() {
        return this.b;
    }

    @Override // defpackage.cick
    public final cpeb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cick) {
            cick cickVar = (cick) obj;
            if (this.a.equals(cickVar.b()) && this.b.equals(cickVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        baqv baqvVar = this.b;
        return "GetOrCreateConversationIdAndThreadIdForOneToOneResult{conversationIdAndThreadId=" + this.a.toString() + ", createConversationResult=" + baqvVar.toString() + "}";
    }
}

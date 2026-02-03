package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciag extends cicj {
    public final Optional a;
    public final boolean b;

    public ciag(Optional optional, boolean z) {
        this.a = optional;
        this.b = z;
    }

    @Override // defpackage.cicj
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.cicj
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cicj) {
            cicj cicjVar = (cicj) obj;
            if (this.a.equals(cicjVar.a()) && this.b == cicjVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationIdAndThreadIdAndConversationCreationMetadata{conversationIdAndThreadId=" + String.valueOf(this.a) + ", conversationExistsByThreadId=" + this.b + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awev extends awfg {
    public final emuh a;
    private final emuw b;

    public awev(emuh emuhVar, emuw emuwVar) {
        if (emuhVar == null) {
            throw new NullPointerException("Null conversationInfo");
        }
        this.a = emuhVar;
        if (emuwVar == null) {
            throw new NullPointerException("Null conversationInfoForAnonymousLogger");
        }
        this.b = emuwVar;
    }

    @Override // defpackage.awfg
    public final emuh a() {
        return this.a;
    }

    @Override // defpackage.awfg
    public final emuw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awfg) {
            awfg awfgVar = (awfg) obj;
            if (this.a.equals(awfgVar.a()) && this.b.equals(awfgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        emuw emuwVar = this.b;
        return "AnonymizedConversation{conversationInfo=" + this.a.toString() + ", conversationInfoForAnonymousLogger=" + emuwVar.toString() + "}";
    }
}

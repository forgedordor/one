package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aujl extends aujk {
    public final String a;
    public final aubq c;

    public aujl(String str, aubq aubqVar) {
        this.a = str;
        this.c = aubqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aujl)) {
            return false;
        }
        aujl aujlVar = (aujl) obj;
        return fdbq.f(this.a, aujlVar.a) && fdbq.f(this.c, aujlVar.c);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RecreateGroupData(conversationId=" + this.a + ", selfChatEndpoint=" + this.c + ")";
    }
}

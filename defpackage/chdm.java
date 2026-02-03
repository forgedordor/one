package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chdm extends chdq {
    public final aufh a;

    public chdm(aufh aufhVar) {
        aufhVar.getClass();
        this.a = aufhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chdm) && fdbq.f(this.a, ((chdm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IncomingChatApiRequest(incomingChatMessageRequest=" + this.a + ")";
    }
}

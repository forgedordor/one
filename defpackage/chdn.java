package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chdn extends chdq {
    public final ezjj a;

    public chdn(ezjj ezjjVar) {
        this.a = ezjjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chdn) && fdbq.f(this.a, ((chdn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IncomingInboxMessage(inboxMessage=" + this.a + ")";
    }
}

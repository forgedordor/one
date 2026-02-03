package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzl {
    public final dkzp a;
    public final fdae b;

    public dkzl(dkzp dkzpVar, fdae fdaeVar) {
        dkzpVar.getClass();
        this.a = dkzpVar;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkzl)) {
            return false;
        }
        dkzl dkzlVar = (dkzl) obj;
        return fdbq.f(this.a, dkzlVar.a) && fdbq.f(this.b, dkzlVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fdae fdaeVar = this.b;
        return iHashCode + (fdaeVar == null ? 0 : fdaeVar.hashCode());
    }

    public final String toString() {
        return "MessageReplySnippetUiData(replyContent=" + this.a + ", onClick=" + this.b + ")";
    }
}

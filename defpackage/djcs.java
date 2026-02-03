package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcs implements djcw {
    public final dkzp a;
    public final fdae b;
    public final fdae c;

    public djcs(dkzp dkzpVar, fdae fdaeVar, fdae fdaeVar2) {
        dkzpVar.getClass();
        this.a = dkzpVar;
        this.b = fdaeVar;
        this.c = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djcs)) {
            return false;
        }
        djcs djcsVar = (djcs) obj;
        return fdbq.f(this.a, djcsVar.a) && fdbq.f(this.b, djcsVar.b) && fdbq.f(this.c, djcsVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftReplyUiData(replyContent=" + this.a + ", onDismiss=" + this.b + ", onDisplayed=" + this.c + ")";
    }
}

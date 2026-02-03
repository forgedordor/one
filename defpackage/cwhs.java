package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhs {
    public final cvzs a;
    public final cwjf b;
    public final cvxk c;
    public final cvvy d;
    public final cvwp e;
    public final cvwx f;
    public final fdpl g;
    public final cwfq h;
    public final cwem i;
    public final cwhr j;
    private final cwjp k;

    public cwhs(cwjp cwjpVar, cvzs cvzsVar, cwjf cwjfVar, cvxk cvxkVar, cvvy cvvyVar, cvwp cvwpVar, cvwx cvwxVar, fdpl fdplVar, cwfq cwfqVar, cwem cwemVar, cwhr cwhrVar) {
        cwjpVar.getClass();
        cvzsVar.getClass();
        cvvyVar.getClass();
        cvwxVar.getClass();
        this.k = cwjpVar;
        this.a = cvzsVar;
        this.b = cwjfVar;
        this.c = cvxkVar;
        this.d = cvvyVar;
        this.e = cvwpVar;
        this.f = cvwxVar;
        this.g = fdplVar;
        this.h = cwfqVar;
        this.i = cwemVar;
        this.j = cwhrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwhs)) {
            return false;
        }
        cwhs cwhsVar = (cwhs) obj;
        return fdbq.f(this.k, cwhsVar.k) && fdbq.f(this.a, cwhsVar.a) && fdbq.f(this.b, cwhsVar.b) && fdbq.f(this.c, cwhsVar.c) && fdbq.f(this.d, cwhsVar.d) && fdbq.f(this.e, cwhsVar.e) && fdbq.f(this.f, cwhsVar.f) && fdbq.f(this.g, cwhsVar.g) && fdbq.f(this.h, cwhsVar.h) && fdbq.f(this.i, cwhsVar.i) && fdbq.f(this.j, cwhsVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.k.hashCode() * 31) + this.a.hashCode();
        cwjf cwjfVar = this.b;
        int iHashCode2 = ((iHashCode * 31) + (cwjfVar == null ? 0 : cwjfVar.hashCode())) * 31;
        cvxk cvxkVar = this.c;
        int iHashCode3 = (((iHashCode2 + (cvxkVar == null ? 0 : cvxkVar.hashCode())) * 31) + this.d.hashCode()) * 31;
        cvwp cvwpVar = this.e;
        int iHashCode4 = (((((iHashCode3 + (cvwpVar == null ? 0 : cvwpVar.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        cwfq cwfqVar = this.h;
        int iHashCode5 = (iHashCode4 + (cwfqVar == null ? 0 : cwfqVar.hashCode())) * 31;
        cwem cwemVar = this.i;
        return ((iHashCode5 + (cwemVar != null ? cwemVar.hashCode() : 0)) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "ConversationDetailsUiData(topbar=" + this.k + ", header=" + this.a + ", search=" + this.b + ", encryption=" + this.c + ", actions=" + this.d + ", activeSimUiData=" + this.e + ", descriptionItems=" + this.f + ", groupMembers=" + this.g + ", photoSelector=" + this.h + ", miniConversationDetailsUiData=" + this.i + ", flags=" + this.j + ")";
    }
}

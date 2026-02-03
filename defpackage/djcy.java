package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcy {
    public final djcv a;
    public final djcq b;
    public final djcw c;
    public final djew d;
    public final djcr e;
    public final djdy f;
    public final djcx g;

    public djcy(djcv djcvVar, djcq djcqVar, djcw djcwVar, djew djewVar, djcr djcrVar, djdy djdyVar, djcx djcxVar) {
        djcvVar.getClass();
        djewVar.getClass();
        this.a = djcvVar;
        this.b = djcqVar;
        this.c = djcwVar;
        this.d = djewVar;
        this.e = djcrVar;
        this.f = djdyVar;
        this.g = djcxVar;
    }

    public final boolean a() {
        return this.a.b.length() > 0 || !this.b.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djcy)) {
            return false;
        }
        djcy djcyVar = (djcy) obj;
        return fdbq.f(this.a, djcyVar.a) && fdbq.f(this.b, djcyVar.b) && fdbq.f(this.c, djcyVar.c) && fdbq.f(this.d, djcyVar.d) && fdbq.f(this.e, djcyVar.e) && fdbq.f(this.f, djcyVar.f) && fdbq.f(this.g, djcyVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        djcw djcwVar = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (djcwVar == null ? 0 : djcwVar.hashCode())) * 31) + this.d.hashCode()) * 31;
        djcr djcrVar = this.e;
        int iHashCode3 = (iHashCode2 + (djcrVar == null ? 0 : djcrVar.hashCode())) * 31;
        djdy djdyVar = this.f;
        return ((iHashCode3 + (djdyVar != null ? djdyVar.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftUiData(text=" + this.a + ", attachments=" + this.b + ", topUiData=" + this.c + ", sendButton=" + this.d + ", info=" + this.e + ", mentionSuggestions=" + this.f + ", flags=" + this.g + ")";
    }

    public /* synthetic */ djcy(djcv djcvVar, djcq djcqVar, djcw djcwVar, djew djewVar, djcx djcxVar, int i) {
        this(djcvVar, djcqVar, (i & 4) != 0 ? null : djcwVar, djewVar, null, null, djcxVar);
    }
}

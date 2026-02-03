package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvzs {
    public final cwba a;
    public final cwbj b;
    public final cwav c;
    public final dihq d;
    public final fdae e;
    public final boolean f;
    public final cvzr g;

    public cvzs(cwba cwbaVar, cwbj cwbjVar, cwav cwavVar, dihq dihqVar, fdae fdaeVar, boolean z, cvzr cvzrVar) {
        cwbaVar.getClass();
        cwbjVar.getClass();
        cwavVar.getClass();
        this.a = cwbaVar;
        this.b = cwbjVar;
        this.c = cwavVar;
        this.d = dihqVar;
        this.e = fdaeVar;
        this.f = z;
        this.g = cvzrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvzs)) {
            return false;
        }
        cvzs cvzsVar = (cvzs) obj;
        return fdbq.f(this.a, cvzsVar.a) && fdbq.f(this.b, cvzsVar.b) && fdbq.f(this.c, cvzsVar.c) && fdbq.f(this.d, cvzsVar.d) && fdbq.f(this.e, cvzsVar.e) && this.f == cvzsVar.f && fdbq.f(this.g, cvzsVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dihq dihqVar = this.d;
        int iHashCode2 = ((iHashCode * 31) + (dihqVar == null ? 0 : dihqVar.hashCode())) * 31;
        fdae fdaeVar = this.e;
        return ((((iHashCode2 + (fdaeVar != null ? fdaeVar.hashCode() : 0)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "HeaderUiData(avatarUiData=" + this.a + ", titleUiData=" + this.b + ", actionButtons=" + this.c + ", goBackAction=" + this.d + ", onAvatarEditClick=" + this.e + ", avatarUpdateInProgress=" + this.f + ", flags=" + this.g + ")";
    }
}

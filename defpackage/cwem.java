package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwem implements dktt {
    public final cwcv a;
    public final cwbx b;
    public final cwen c;
    public final long d;
    public final fdae e;
    public final cwfq f;
    public final int g;
    private final fdae h;

    public cwem(cwcv cwcvVar, cwbx cwbxVar, cwen cwenVar, long j, int i, fdae fdaeVar, fdae fdaeVar2, cwfq cwfqVar) {
        cwenVar.getClass();
        this.a = cwcvVar;
        this.b = cwbxVar;
        this.c = cwenVar;
        this.d = j;
        this.g = i;
        this.h = fdaeVar;
        this.e = fdaeVar2;
        this.f = cwfqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwem)) {
            return false;
        }
        cwem cwemVar = (cwem) obj;
        return fdbq.f(this.a, cwemVar.a) && fdbq.f(this.b, cwemVar.b) && this.c == cwemVar.c && kjb.f(this.d, cwemVar.d) && this.g == cwemVar.g && fdbq.f(this.h, cwemVar.h) && fdbq.f(this.e, cwemVar.e) && fdbq.f(this.f, cwemVar.f);
    }

    public final int hashCode() {
        cwcv cwcvVar = this.a;
        int iHashCode = cwcvVar == null ? 0 : cwcvVar.hashCode();
        cwbx cwbxVar = this.b;
        int iHashCode2 = (((((((((((iHashCode * 31) + (cwbxVar == null ? 0 : cwbxVar.hashCode())) * 31) + this.c.hashCode()) * 31) + kja.a(this.d)) * 31) + this.g) * 31) + this.h.hashCode()) * 31) + this.e.hashCode();
        cwfq cwfqVar = this.f;
        return (iHashCode2 * 31) + (cwfqVar != null ? cwfqVar.hashCode() : 0);
    }

    public final String toString() {
        return "MiniConversationDetailsUiData(avatarUiData=" + this.a + ", actionsUiData=" + this.b + ", visibilityState=" + this.c + ", parentAvatarPositionData=" + kjb.e(this.d) + ", callerSource=" + ((Object) cwcz.a(this.g)) + ", onOpen=" + this.h + ", onDismiss=" + this.e + ", photoSelector=" + this.f + ")";
    }
}

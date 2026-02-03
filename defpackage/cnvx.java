package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvx {
    public final bvdk a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final int e;
    public final long f;

    public cnvx(bvdk bvdkVar, boolean z, boolean z2, String str, int i, long j) {
        bvdkVar.getClass();
        this.a = bvdkVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = i;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnvx)) {
            return false;
        }
        cnvx cnvxVar = (cnvx) obj;
        return this.a == cnvxVar.a && this.b == cnvxVar.b && this.c == cnvxVar.c && fdbq.f(this.d, cnvxVar.d) && this.e == cnvxVar.e && this.f == cnvxVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.d;
        int iA = (((((((iHashCode + cnvw.a(this.b)) * 31) + cnvw.a(this.c)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e) * 31;
        long j = this.f;
        return iA + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ConversationCustomization(archiveStatus=" + this.a + ", isMuted=" + this.b + ", noVibrate=" + this.c + ", notificationSoundUri=" + this.d + ", joinStatus=" + this.e + ", rcsSessionId=" + this.f + ")";
    }
}

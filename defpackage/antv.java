package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class antv {
    private final String a;
    private final String b;
    private final evvp c;

    public antv(String str, String str2, evvp evvpVar) {
        this.a = str;
        this.b = str2;
        this.c = evvpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof antv)) {
            return false;
        }
        antv antvVar = (antv) obj;
        return fdbq.f(this.a, antvVar.a) && fdbq.f(this.b, antvVar.b) && fdbq.f(this.c, antvVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        evvp evvpVar = this.c;
        return iHashCode2 + (evvpVar != null ? evvpVar.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileSendingMetadata(profileAccessToken=" + this.a + ", personId=" + this.b + ", profileLastUpdatedServerTimestamp=" + this.c + ")";
    }
}

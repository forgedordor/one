package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bacy {
    public final boolean a;
    public final bacx b;

    public bacy(boolean z, bacx bacxVar) {
        this.a = z;
        this.b = bacxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bacy)) {
            return false;
        }
        bacy bacyVar = (bacy) obj;
        return this.a == bacyVar.a && fdbq.f(this.b, bacyVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RemoteParticipantsSearchResult(hasSelfAmongRemoteParticipants=" + this.a + ", remoteParticipants=" + this.b + ")";
    }
}

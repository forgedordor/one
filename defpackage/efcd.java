package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efcd extends efel {
    private final boolean a;

    public efcd(boolean z) {
        this.a = z;
    }

    @Override // defpackage.efel
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof efel) && this.a == ((efel) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "GroupRemoteCapabilities{supportsSubjectManagement=" + this.a + "}";
    }
}

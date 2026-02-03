package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgot extends dgqf {
    private final String a;
    private final dgid b;

    public dgot(String str, dgid dgidVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        this.b = dgidVar;
    }

    @Override // defpackage.dgqf
    public final dgid a() {
        return this.b;
    }

    @Override // defpackage.dgqf
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgqf) {
            dgqf dgqfVar = (dgqf) obj;
            if (this.a.equals(dgqfVar.b()) && this.b.equals(dgqfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AvailabilityUpdate{simId=" + this.a + ", rcsAvailability=" + this.b.toString() + "}";
    }
}

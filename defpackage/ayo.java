package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayo extends azi {
    private final azh a;
    private final int b;

    public ayo(int i, azh azhVar) {
        this.b = i;
        this.a = azhVar;
    }

    @Override // defpackage.azi
    public final azh a() {
        return this.a;
    }

    @Override // defpackage.azi
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        azh azhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof azi) {
            azi aziVar = (azi) obj;
            if (this.b == aziVar.b() && ((azhVar = this.a) != null ? azhVar.equals(aziVar.a()) : aziVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        azh azhVar = this.a;
        return (azhVar == null ? 0 : azhVar.hashCode()) ^ ((this.b ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN"));
        sb.append(", error=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}

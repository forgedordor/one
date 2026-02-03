package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozu {
    public final dgiq a;
    public final int b;

    public cozu(dgiq dgiqVar, int i) {
        this.a = dgiqVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cozu)) {
            return false;
        }
        cozu cozuVar = (cozu) obj;
        return fdbq.f(this.a, cozuVar.a) && dggr.b(this.b, cozuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "RegistrationInfo(configuration=" + this.a + ", subscriptionId=" + dggr.a(this.b) + ")";
    }
}

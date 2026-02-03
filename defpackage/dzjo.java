package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzjo extends dzju {
    public final boolean a;
    private final ekgb b;

    public dzjo(boolean z, ekgb ekgbVar) {
        this.a = z;
        if (ekgbVar == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.dzju
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.dzju
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzju) {
            dzju dzjuVar = (dzju) obj;
            if (this.a == dzjuVar.b() && ekjz.h(this.b, dzjuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }
}

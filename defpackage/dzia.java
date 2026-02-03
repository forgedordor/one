package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzia extends dzih {
    public final feia a;
    public final ekgb b;

    public dzia(feia feiaVar, ekgb ekgbVar) {
        if (feiaVar == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = feiaVar;
        if (ekgbVar == null) {
            throw new NullPointerException("Null nativeDebugLogs");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.dzih
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.dzih
    public final feia b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzih) {
            dzih dzihVar = (dzih) obj;
            if (this.a.equals(dzihVar.b()) && ekjz.h(this.b, dzihVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.b;
        return "Snapshot{debugLogs=" + this.a.toString() + ", nativeDebugLogs=" + ekgbVar.toString() + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eaxj extends eayn {
    private final ejsu a;
    private final ekgb b;

    public eaxj(ejsu ejsuVar, ekgb ekgbVar) {
        this.a = ejsuVar;
        if (ekgbVar == null) {
            throw new NullPointerException("Null eventRecords");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.eayn
    public final ejsu a() {
        return this.a;
    }

    @Override // defpackage.eayn
    public final ekgb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayn) {
            eayn eaynVar = (eayn) obj;
            if (this.a.equals(eaynVar.a()) && ekjz.h(this.b, eaynVar.b())) {
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
        return "EventData{systemProfile=" + this.a.toString() + ", eventRecords=" + ekgbVar.toString() + "}";
    }
}

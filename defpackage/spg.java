package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spg extends spl {
    private final ekgb a;
    private final shu b;

    public spg(ekgb ekgbVar, shu shuVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null suggestions");
        }
        this.a = ekgbVar;
        this.b = shuVar;
    }

    @Override // defpackage.spl
    public final shu a() {
        return this.b;
    }

    @Override // defpackage.spl
    public final ekgb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        shu shuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof spl) {
            spl splVar = (spl) obj;
            if (ekjz.h(this.a, splVar.b()) && ((shuVar = this.b) != null ? shuVar.equals(splVar.a()) : splVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        shu shuVar = this.b;
        return (iHashCode * 1000003) ^ (shuVar == null ? 0 : shuVar.hashCode());
    }

    public final String toString() {
        shu shuVar = this.b;
        return "SmartReplyResult{suggestions=" + this.a.toString() + ", inferenceEventTraceResult=" + String.valueOf(shuVar) + "}";
    }
}

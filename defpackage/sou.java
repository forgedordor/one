package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sou extends soz {
    private final ekgb a;
    private final shu b;

    public sou(ekgb ekgbVar, shu shuVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null results");
        }
        this.a = ekgbVar;
        this.b = shuVar;
    }

    @Override // defpackage.soz
    public final shu a() {
        return this.b;
    }

    @Override // defpackage.soz
    public final ekgb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        shu shuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof soz) {
            soz sozVar = (soz) obj;
            if (ekjz.h(this.a, sozVar.b()) && ((shuVar = this.b) != null ? shuVar.equals(sozVar.a()) : sozVar.a() == null)) {
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
        return "MagicRewriteResult{results=" + this.a.toString() + ", inferenceEventTraceResult=" + String.valueOf(shuVar) + "}";
    }
}

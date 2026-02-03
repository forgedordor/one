package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwni extends dwqc {
    private final ekgb b;
    private final ekgb c;

    public dwni(ekgb ekgbVar, ekgb ekgbVar2) {
        this.b = ekgbVar;
        this.c = ekgbVar2;
    }

    @Override // defpackage.dwqc
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.dwqc
    public final ekgb b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwqc) {
            dwqc dwqcVar = (dwqc) obj;
            if (ekjz.h(this.b, dwqcVar.a()) && ekjz.h(this.c, dwqcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.c;
        return "DecorationTransitionAction{decorationIdsToAdd=" + String.valueOf(this.b) + ", decorationIdsToRemove=" + String.valueOf(ekgbVar) + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bygb extends byvs {
    public final ekgb a;
    public final ekgb b;

    public bygb(ekgb ekgbVar, ekgb ekgbVar2) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
    }

    @Override // defpackage.byvs
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.byvs
    public final ekgb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byvs) {
            byvs byvsVar = (byvs) obj;
            if (ekjz.h(this.a, byvsVar.b()) && ekjz.h(this.b, byvsVar.a())) {
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
        return "DataReadyToBulkInsert{partAndAssociatedMessageList=" + this.a.toString() + ", linkPreviewList=" + ekgbVar.toString() + "}";
    }
}

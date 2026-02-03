package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdvq extends cdya {
    private final ekgb a;
    private final ekgb b;

    public cdvq(ekgb ekgbVar, ekgb ekgbVar2) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
    }

    @Override // defpackage.cdya
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.cdya
    public final ekgb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdya) {
            cdya cdyaVar = (cdya) obj;
            if (ekjz.h(this.a, cdyaVar.b()) && ekjz.h(this.b, cdyaVar.a())) {
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
        return "MessagesToDeleteContainer{nonCloudSyncMessagesToDelete=" + this.a.toString() + ", cloudSyncMessagesToDelete=" + ekgbVar.toString() + "}";
    }
}

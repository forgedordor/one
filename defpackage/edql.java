package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edql extends edrb {
    private final edra a;
    private final boolean b;
    private final ekgb c;

    public edql(edra edraVar, boolean z, ekgb ekgbVar) {
        this.a = edraVar;
        this.b = z;
        this.c = ekgbVar;
    }

    @Override // defpackage.edrb
    public final edra a() {
        return this.a;
    }

    @Override // defpackage.edrb
    public final ekgb b() {
        return this.c;
    }

    @Override // defpackage.edrb
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edrb) {
            edrb edrbVar = (edrb) obj;
            if (this.a.equals(edrbVar.a()) && this.b == edrbVar.c() && ekjz.h(this.c, edrbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.c;
        return "GooglePhotosSection{content=" + this.a.toString() + ", hasMore=" + this.b + ", eventLogs=" + ekgbVar.toString() + "}";
    }
}
